import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener, MouseMotionListener {
    TextField textField;
    public MouseEventDemo() {
// Create a Frame
        super("Mouse Event Demo");
// Create a TextField to display the mouse position
        textField = new TextField();
        textField.setBounds(50, 50, 200, 30);
        textField.setEditable(false);
// Add the TextField to the Frame
        add(textField);
// Set the layout to null so we can use absolute positioning
        setLayout(null);
// Add MouseListener and MouseMotionListener to the Frame
        addMouseListener(this);
        addMouseMotionListener(this);
// Set Frame properties
        setSize(400, 400);
        setVisible(true);
// Close the window when clicking on the close button
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    // Implement methods for MouseListener
    @Override
    public void mouseClicked(MouseEvent e) {
// Get the X and Y position of the mouse click
        int x = e.getX();
        int y = e.getY();
// Display the mouse click position in the TextField
        textField.setText("Mouse Clicked at X: " + x + ", Y: " + y);
    }
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    // Implement methods for MouseMotionListener
    @Override
    public void mouseMoved(MouseEvent e) {
// Get the X and Y position of the mouse movement
        int x = e.getX();
        int y = e.getY();
// Display the mouse movement position in the TextField
        textField.setText("Mouse Moved at X: " + x + ", Y: " + y);
    }
    @Override
    public void mouseDragged(MouseEvent e) {}
    public static void main(String[] args) {

        new MouseEventDemo();
    }
}
