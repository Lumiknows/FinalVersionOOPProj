import javax.swing.*;
import menu.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LogIn();
        });
    }
}