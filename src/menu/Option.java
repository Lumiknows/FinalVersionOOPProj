package menu;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Option extends JFrame implements ActionListener {
    private JButton parts, accs, backButton;

    Option() {
        super("Welcome to Ebike Parts & Accessories Picker");

        ImageIcon backgroundImage = new ImageIcon("C:/Users/playb/OneDrive/Documents/PROJECT_OOP/Ebike/lib/misc/logo.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);

        UIManager.put("Button.font", new Font("Monospaced", Font.BOLD, 20));
        UIManager.put("Label.font", new Font("Monospaced", Font.BOLD, 20));

        setLayout(new GridBagLayout());

        parts = new JButton("Parts");
        parts.setPreferredSize(new Dimension(130, 40));
        parts.setBorder(new LineBorder(Color.BLACK, 4));
        parts.setBackground(new Color(225, 225, 225)); // white color
        parts.addActionListener(this);

        accs = new JButton("Accessories");
        accs.setPreferredSize(new Dimension(150, 40));
        accs.setBorder(new LineBorder(Color.BLACK, 4));
        accs.setBackground(new Color(225, 225, 225)); // white color
        accs.addActionListener(this);

        backButton = new JButton("Back");
        backButton.setPreferredSize(new Dimension(130, 40));
        backButton.setBorder(new LineBorder(Color.BLACK, 4));
        backButton.setBackground(new Color(225, 225, 225)); // white color
        backButton.addActionListener(this);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setOpaque(false);
        buttonPanel.add(parts);
        buttonPanel.add(accs);
        buttonPanel.add(backButton);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        backgroundLabel.setLayout(new GridBagLayout());
        backgroundLabel.add(buttonPanel);

        this.add(backgroundLabel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200, 660);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == parts) {
            new PartsMenu();
            dispose();
        } else if (e.getSource() == accs) {
            new AccessoryMenu();
            dispose();
        } else if (e.getSource() == backButton){
            new LogIn();
            dispose();
        }
    }
}
