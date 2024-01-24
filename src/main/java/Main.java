package main.java;

import javax.swing.SwingUtilities;

import main.java.view.NavCartAppUI;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NavCartAppUI appUI = new NavCartAppUI();
            // AppController appController = new AppController(appUI);
            // appUI.setController(appController);
            appUI.showScreen("login");
        });
    }
}
