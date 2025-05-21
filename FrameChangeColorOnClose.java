import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FrameChangeColorOnClose extends JFrame
{
    public FrameChangeColorOnClose() {
// Set the title of the frame
        setTitle("Frame Color Change Example");
// Set the default size of the frame
        setSize(400, 300);
// Set the frame's initial background color
        getContentPane().setBackground(Color.WHITE);
// Specify that the frame is visible
        setVisible(true);
// Set default close operation to "do nothing"
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
// Add a Window Listener to handle close operation
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
// Change the background color when close operation is attempted
                getContentPane().setBackground(Color.RED);
            }
        });
    }
    public static void main(String[] args) {
// Create a frame instance
        new FrameChangeColorOnClose();
    }
}