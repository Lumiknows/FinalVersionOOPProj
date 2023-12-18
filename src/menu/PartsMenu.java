package menu;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;
import displays.*;

public class PartsMenu extends JFrame implements ActionListener {
    private JComboBox<String> partComboBox;
    private JButton searchButton, nextButton, prevButton, backButton, logOutButton;
    private JLabel partLabel, partImageLabel, specs;
    private Map<String, String[]> partImageMap;
    private String[] currentImagePaths;
    private int currentIndex;

    PartsMenu() {
        super("Ebike Parts & Accessories Picker");
        
        JPanel leftPanel = new JPanel();
        leftPanel.setPreferredSize(new Dimension(200, 100));
        leftPanel.setBackground(new Color(0, 0, 0));
        leftPanel.setBorder(new LineBorder(Color.BLACK, 3));

        UIManager.put("Button.font", new Font("Monospaced", Font.BOLD, 13));
        UIManager.put("Label.font", new Font("Monospaced", Font.BOLD, 15));
        UIManager.put("ComboBox.font", new Font("Monospaced", Font.BOLD, 13));

        setLayout(new BorderLayout());
        partLabel = new JLabel("Select part: ");
        partLabel.setForeground(new Color(255, 255, 255)); 
        partLabel.setBounds(100, 30, 200, 30);

        String[] partOptions = {
            "Batteries", "Charger", "Tires", "Controllers", "Connectors",
            "Cycle Analysts", "DC-DC Converters", "Ebrakes", "Freewheels and Cassettes",
            "Lights", "Hub Motors", "Solar", "Spokes",
            "Throttles", "Torque Arms", "Rims"
        };

        specs = new JLabel();
        specs.setVerticalAlignment(JLabel.NORTH);
        specs.setPreferredSize(new Dimension(200, 100));
        specs.setBorder(new LineBorder(Color.BLACK, 3));
        specs.setForeground(new Color(255,255,255));
        specs.setOpaque(true);
        specs.setBackground(new Color(0, 0, 0));

        partComboBox = new JComboBox<>(partOptions);
        partComboBox.setPrototypeDisplayValue("Freewheels and Cassettes"); // To make the ComboBox even
        partComboBox.setBounds(50, 50, 90, 20); 

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

        partImageLabel = new JLabel();
        partImageLabel.setBackground(new Color(218, 212, 181));
        partImageLabel.setBorder(new LineBorder(Color.BLACK, 3));
        partImageLabel.setBounds(100, 150, 500, 500);

        partImageMap = new HashMap<>();
        initializeImageMaps();

        leftPanel.setLayout(null);
        partLabel.setBounds(50, 30, 200, 30);
        partComboBox.setBounds(8, 60, 190, 25);
        searchButton.setBounds(60, 90, 80, 22);
        nextButton.setBounds(12, 120, 80, 22);
        prevButton.setBounds(110, 120, 80, 22);
        backButton.setBounds(12, 580, 80, 30);
        logOutButton.setBounds(110, 580, 80, 30);

        leftPanel.add(partLabel);
        leftPanel.add(partComboBox);
        leftPanel.add(searchButton);
        leftPanel.add(nextButton);
        leftPanel.add(prevButton);
        leftPanel.add(backButton);
        leftPanel.add(logOutButton);

        this.add(specs, BorderLayout.EAST);
        this.add(leftPanel, BorderLayout.WEST);
        this.add(partImageLabel, BorderLayout.CENTER);
        this.setSize(1200, 660);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    private void initializeImageMaps() {
        partImageMap = InitializeImages.initializePartImageMap();
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == searchButton) {
            String selectedPart = (String) partComboBox.getSelectedItem();
            displayPartImages(selectedPart); 
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
        currentImagePaths = partImageMap.get(selectedPart);

        if (currentImagePaths != null && currentImagePaths.length > 0) {
            currentIndex = 0;
            showImageAtIndex(selectedPart, currentIndex, 500, 500);
        }
    }

    private void showNextImage() {
        if (currentImagePaths != null && currentIndex < currentImagePaths.length - 1) {
            currentIndex++;
            System.out.println("Next Image: " + currentImagePaths[currentIndex]);
            showImageAtIndex((String) partComboBox.getSelectedItem(), currentIndex, 500, 500);
        } else if (currentIndex == 3) {
            currentIndex = -1;
        }
    }

    private void showPreviousImage() {
        if (currentImagePaths != null && currentIndex > 0) {
            currentIndex--;
            System.out.println("Previous Image: " + currentImagePaths[currentIndex]);
            showImageAtIndex((String) partComboBox.getSelectedItem(), currentIndex, 500, 500);
        } else if (currentIndex == 0) {
            currentIndex = 4;
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
                partImageLabel.setIcon(scaledIcon);
    
                partImageLabel.setIcon(new ImageIcon(scaledImage));
                partImageLabel.setHorizontalAlignment(JLabel.CENTER);
                partImageLabel.setVerticalAlignment(JLabel.CENTER);
    
                partImageLabel.setBackground(new Color(255, 255, 255));
                partImageLabel.setBorder(new LineBorder(Color.BLACK, 3));
                partImageLabel.setOpaque(true);

    
                System.out.println("Setting Image for Index: " + index);
    
                displaySpecs(selectedPart, index);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void displaySpecs(String selectedPart, int index) {
        String[] partSpecs = getSpecs(selectedPart, index);

        if (partSpecs != null) {
            StringBuilder specsText = new StringBuilder();

            for (String spec : partSpecs) {
                specsText.append(spec).append("<br>");
            }

            specs.setText("<html>" + specsText.toString() + "</html>");
        }
    }
    private String[] getSpecs(String selectedPart, int index) {
        return PartSpecs.getSpecs(selectedPart, index);
    }
}
