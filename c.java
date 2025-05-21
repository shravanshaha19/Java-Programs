import java.awt.*;
import javax.swing.*;
public class c {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Java");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Create a label and set font, foreground, and background colors
        Label label = new Label("Hello Java", Label.CENTER);
        label.setFont(new Font("Georgia", Font.BOLD, 24));
        label.setForeground(Color.RED);
        label.setBackground(Color.BLUE);
// Add label to frame and set visibility
        frame.add(label);
        frame.setVisible(true);
    }
}