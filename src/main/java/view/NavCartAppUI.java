package main.java.view;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class NavCartAppUI extends JFrame {
  private CardLayout cardLayout;
  private JPanel cardPanel;

  public NavCartAppUI() {
      cardLayout = new CardLayout();
      cardPanel = new JPanel(cardLayout);

      // Initialize and add different screens to cardPanel
      cardPanel.add(new LoginScreen(), "login");
      cardPanel.add(new HomeScreen(), "home");
      // cardPanel.add(new CreateListScreen(), "createList");
      // cardPanel.add(new ShoppingMapView(), "shoppingMap");
      // cardPanel.add(new SummaryScreen(), "summary");

      setLayout(new BorderLayout());
      add(cardPanel, BorderLayout.CENTER);

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(600, 400);
      setLocationRelativeTo(null);
      setVisible(true);

      showScreen("home");  // Set the initial screen
  }

  public void showScreen(String screenName) {
      cardLayout.show(cardPanel, screenName);
  }

  
}
