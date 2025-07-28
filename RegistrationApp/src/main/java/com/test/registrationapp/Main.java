package com.test.registrationapp;

import com.test.registrationapp.ui.RegistrationFrame;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new RegistrationFrame().setVisible(true);
        });
    }
}
