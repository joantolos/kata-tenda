package com.joantolos.tenda;

public class UnRegisteredUser implements Observer {

    private String email;

    public UnRegisteredUser(String email) {
        this.email = email;
    }

    public void sendNotificationEmail(String componentName) {
        // Lògica per enviar el correu electrònic a l'adreça de correu especificada
        sendMail(email, "El component " + componentName + " ja està disponible. Compra'l aviat!");
    }

    private void sendMail(String email, String s) {

    }

}
