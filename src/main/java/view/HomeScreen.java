package main.java.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class HomeScreen extends JPanel {
    private JTextArea groceryListTextArea;
    private JButton createListButton;

    public HomeScreen() {
        initializeComponents();
        createLayout();
    }

    private void initializeComponents() {
        groceryListTextArea = new JTextArea(10, 30);
        createListButton = new JButton("Create Grocery List");

        // Add action listener to the create list button
        createListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add logic to transition to the CreateListScreen
                // For simplicity, let's just print a message for now
                System.out.println("Transition to CreateListScreen");
            }
        });
    }

    private void createLayout() {
        setLayout(new BorderLayout());

        JPanel textAreaPanel = new JPanel(new BorderLayout());
        textAreaPanel.add(new JScrollPane(groceryListTextArea), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(createListButton);

        add(textAreaPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
}

