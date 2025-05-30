
import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class Fitness_Tracker_App extends JFrame {
    private JTextField stepsField;
    private JTextField distanceField;
    private JButton trackButton;
    private JLabel resultLabel;

    public Fitness_Tracker_App() {
        setTitle("Health and Fitness Tracker");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);

        stepsField = new JTextField(10);
        distanceField = new JTextField(10);
        trackButton = new JButton("Track Activity");
        resultLabel = new JLabel();

        trackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int steps = Integer.parseInt(stepsField.getText());
                double distance = Double.parseDouble(distanceField.getText());

                // Perform calculations to estimate calories burned
                double caloriesBurned = calculateCaloriesBurned(steps, distance);

                // Display the results to the user
                resultLabel.setText("Calories Burned: " + caloriesBurned);
            }
        });

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        inputPanel.add(new JLabel("Steps taken:"));
        inputPanel.add(stepsField);
        inputPanel.add(new JLabel("Distance (km):"));
        inputPanel.add(distanceField);
        inputPanel.add(new JLabel());
        inputPanel.add(trackButton);

        JPanel resultPanel = new JPanel();
        resultPanel.add(resultLabel);

        add(inputPanel, BorderLayout.CENTER);
        add(resultPanel, BorderLayout.SOUTH);
    }

    // Method to calculate estimated calories burned
    private double calculateCaloriesBurned(int steps, double distance) {
        // Simplified calculation; you can implement a more accurate formula
        double caloriesPerStep = 0.04; // Sample value, modify accordingly
        double caloriesPerDistance = 0.1; // Sample value, modify accordingly

        return (steps * caloriesPerStep) + (distance * caloriesPerDistance);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Fitness_Tracker_App().setVisible(true);
            }
        });
    }
}