package com.joantolos.tenda;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class ClientTest {

    @Test
    public void shouldGetInterestsForDate() {
        Member memberClient = new Member("123", "John Doe", 13, 2023);

        Component mouse = new Component("mouse", "This is a mouse", 50, 55);
        Component keyboard = new Component("keyboard", "This is a regular USB keyboard", 50, 30);
        Component display = new Component("display", "This is a big computer dispolay", 150, 20);

        memberClient.addInterest(mouse);
        memberClient.addInterest(keyboard);
        memberClient.addInterest(display);

        List<String> interestedPerDate = memberClient.interestedComponentsPerDate(new Date());
        Assert.assertEquals("mouse", interestedPerDate.get(0));
        Assert.assertEquals("keyboard", interestedPerDate.get(1));
        Assert.assertEquals("display", interestedPerDate.get(2));
    }

}
