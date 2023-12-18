package menu;

import javax.swing.*;
import javax.swing.border.*;

import displays.InitializeImages;
import displays.AccSpecs;

import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

public class AccessoryMenu extends JFrame implements ActionListener {
    private JComboBox<String> accessoryComboBox;
    private JButton searchButton, nextButton, prevButton, backButton, logOutButton;
    private JLabel accessoryLabel, accessoryImageLabel, specs;
    private Map<String, String[]> accessoryImageMap;
    private String[] currentImagePaths;
    private int currentIndex;

    AccessoryMenu() {
        super ("Ebike Parts & Accessories Picker");

        JPanel leftPanel = new JPanel();
        leftPanel.setPreferredSize(new Dimension(200, 100));
        leftPanel.setBackground(new Color(0, 0, 0));
        leftPanel.setBorder(new LineBorder(Color.BLACK, 3));

        UIManager.put("Button.font", new Font("Monospaced", Font.BOLD, 13));
        UIManager.put("Label.font", new Font("Monospaced", Font.BOLD, 15));
        UIManager.put("ComboBox.font", new Font("Monospaced", Font.BOLD, 13));

        setLayout(new BorderLayout());
        accessoryLabel = new JLabel("Select accessory: ");
        accessoryLabel.setForeground(new Color(255, 255, 255));
        accessoryLabel.setBounds(100, 90, 200, 30);

        String accessories[] = {
            "Helmet", "Locks", "Side Mirrors", "Bicycle Light", "Fenders", "Kickstands",
            "Phone mounts", "Speedometers", "Repair kits"     
        };

        specs = new JLabel();
        specs.setVerticalAlignment(JLabel.NORTH);
        specs.setPreferredSize(new Dimension(200, 100));
        specs.setBorder(new LineBorder(Color.BLACK, 3));
        specs.setForeground(new Color(255, 255, 255));
        specs.setOpaque(true);
        specs.setBackground(new Color(0, 0, 0));

        accessoryComboBox = new JComboBox<>(accessories);
        accessoryComboBox.setPrototypeDisplayValue("Freewheels and Cassettes");
        accessoryComboBox.setBounds(100, 60, 200, 30);

        searchButton = new JButton("Search");
        searchButton.setBackground(new Color(204, 153, 102)); // Light Brown button color
        searchButton.setPreferredSize(new Dimension(50, 20));
        searchButton.setBounds(320, 60, 80, 30);
        searchButton.setBorder(new LineBorder(Color.BLACK));
        searchButton.addActionListener(this);

        nextButton = new JButton("Next");
        nextButton.setBackground(new Color(204, 153, 102)); // Light Brown button color
        nextButton.setPreferredSize(new Dimension(50, 20));
        nextButton.setBounds(320, 60, 80, 30);
        nextButton.setBorder(new LineBorder(Color.BLACK));
        nextButton.addActionListener(this);

        prevButton = new JButton("Previous");
        prevButton.setBackground(new Color(204, 153, 102)); // Light Brown button color
        prevButton.setPreferredSize(new Dimension(60, 20));
        prevButton.setBounds(520, 60, 100, 30);
        prevButton.setBorder(new LineBorder(Color.BLACK));
        prevButton.addActionListener(this);

        backButton = new JButton("Back");
        backButton.setBackground(new Color(204, 153, 102));
        backButton.setPreferredSize(new Dimension(80, 30));
        backButton.setBounds(700, 60, 80, 30);
        backButton.setBorder(new LineBorder(Color.BLACK));
        backButton.addActionListener(this);

        logOutButton = new JButton("Log out");
        logOutButton.setBackground(new Color(204, 153, 102));
        logOutButton.setPreferredSize(new Dimension(80, 30));
        logOutButton.setBounds(700, 60, 80, 30);
        logOutButton.setBorder(new LineBorder(Color.BLACK));
        logOutButton.addActionListener(this);
        
        accessoryImageLabel = new JLabel();
        accessoryImageLabel.setBackground(new Color(218, 212, 181));
        accessoryImageLabel.setBorder(new LineBorder(Color.BLACK, 3));
        accessoryImageLabel.setBounds(100, 150, 500, 500);

        accessoryImageMap = new HashMap<>();
        initializeImageMaps();

        leftPanel.setLayout(null);
        accessoryLabel.setBounds(30, 30, 200, 30);
        accessoryComboBox.setBounds(8, 60, 190, 25);
        searchButton.setBounds(60, 90, 80, 22);
        nextButton.setBounds(12, 120, 80, 22);
        prevButton.setBounds(110, 120, 80, 22);
        backButton.setBounds(12, 580, 80, 30);
        logOutButton.setBounds(110, 580, 80, 30);

        leftPanel.add(accessoryLabel);
        leftPanel.add(accessoryComboBox);
        leftPanel.add(searchButton);
        leftPanel.add(nextButton);
        leftPanel.add(prevButton);
        leftPanel.add(backButton);
        leftPanel.add(logOutButton);

        this.add(specs, BorderLayout.EAST);
        this.add(leftPanel, BorderLayout.WEST);
        this.add(accessoryImageLabel, BorderLayout.CENTER);
        this.setSize(1200, 660);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void initializeImageMaps() {
        accessoryImageMap = InitializeImages.initializeAccessoryImageMap();
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == searchButton) {
            String selectedAccessory = (String) accessoryComboBox.getSelectedItem();
            displayPartImages(selectedAccessory); 
            System.out.println("Successfully Performed Part" + e.getActionCommand());
        } else if (e.getSource() == nextButton) {
            showNextImage();
        } else if (e.getSource() == prevButton) {
            showPreviousImage();
        } else if (e.getSource() == backButton) {
            new Option();
            dispose();
        } else if (e.getSource() == logOutButton) {
            new LogIn();
            dispose();
        }
    }
    private void displayPartImages(String selectedPart) {
        currentImagePaths = accessoryImageMap.get(selectedPart);

        if (currentImagePaths != null && currentImagePaths.length > 0) {
            currentIndex = 0;
            showImageAtIndex(selectedPart, currentIndex, 500, 500);
        }
    }

    private void showNextImage() {
        if (currentImagePaths != null && currentIndex < currentImagePaths.length - 1) {
            currentIndex++;
            System.out.println("Next Image: " + currentImagePaths[currentIndex]);
            showImageAtIndex((String) accessoryComboBox.getSelectedItem(), currentIndex, 500, 500);
        } else if (currentIndex == 2) {
            currentIndex = -1;
        }
    }

    private void showPreviousImage() {
        if (currentImagePaths != null && currentIndex > 0) {
            currentIndex--;
            System.out.println("Previous Image: " + currentImagePaths[currentIndex]);
            showImageAtIndex((String) accessoryComboBox.getSelectedItem(), currentIndex, 500, 500);
        } else if (currentIndex == 0) {
            currentIndex = 3;
        }
    }

    private void showImageAtIndex(String selectedPart, int index, int maxWidth, int maxHeight) {
        try {
            if (currentImagePaths != null && index >= 0 && index < currentImagePaths.length) {
                System.out.println("Current Index: " + index);
                ImageIcon originalIcon = new ImageIcon(currentImagePaths[index]);
                Image originalImage = originalIcon.getImage();
                Image scaledImage = originalImage.getScaledInstance(maxWidth, maxHeight, Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(scaledImage);
                accessoryImageLabel.setIcon(scaledIcon);
    
                accessoryImageLabel.setIcon(new ImageIcon(scaledImage));
                accessoryImageLabel.setHorizontalAlignment(JLabel.CENTER);
                accessoryImageLabel.setVerticalAlignment(JLabel.CENTER);
    
                accessoryImageLabel.setBackground(new Color(255, 255, 255));
                accessoryImageLabel.setBorder(new LineBorder(Color.BLACK, 3));
                accessoryImageLabel.setOpaque(true);

    
                System.out.println("Setting Image for Index: " + index);
    
                displaySpecs(selectedPart, index);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void displaySpecs(String selectedAccessory, int index) {
        String[] accSpecs = getSpecs(selectedAccessory, index);

        if (accSpecs != null) {
            StringBuilder specsText = new StringBuilder();

            for (String spec : accSpecs) {
                specsText.append(spec).append("<br>");
            }

            specs.setText("<html>" + specsText.toString() + "</html>");
        }
    }
    private String[] getSpecs(String selectedAccessory, int index) {
        return AccSpecs.getSpecs(selectedAccessory, index);
    }
}
