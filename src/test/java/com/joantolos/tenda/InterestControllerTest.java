package com.joantolos.tenda;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class InterestControllerTest {

    private final InterestController interestController = new InterestController();
    private final BasicComponent mouse = new BasicComponent("Mouse", "This is a mouse", 50, 55);
    private final Member client = new Member("47342344T", "John Doe", 33, 1983);

    @Test
    public void shouldGetAvailableComponentsForClient() {
        client.addInterest(mouse);

        List<Component> availableComponents = interestController.showAvailableComponents(client);
        Assert.assertNull(availableComponents.stream().filter(component -> component.getName().equals("Mouse")).findFirst().orElse(null));
        Assert.assertEquals(5, availableComponents.size());
    }

    @Test
    public void shouldAddNewComponentInterest() {
        Assert.assertEquals("Interest successfully registered", interestController.addNewInterest(client, mouse));
        Assert.assertEquals("Mouse", client.getInterests().get(0).getComponent().getName());
    }

}
