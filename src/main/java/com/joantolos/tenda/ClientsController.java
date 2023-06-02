package com.joantolos.tenda;

public class ClientsController {

    private static final String WELCOME_TO_SHOP_MESSAGE_ID = "123";

    public Client newClient(String dni, String name) {
        Client c = new Client(dni, name);
        Translations t = Translations.getInstance();
        view.setMessage(t.getTranslation(WELCOME_TO_SHOP_MESSAGE_ID));
        return c;
    }
}
