package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;


public class ScheduleAdder extends JPanel{

	WindowFrame frame;

	public ScheduleAdder(WindowFrame frame) {
		this.frame = frame;

		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());


		JLabel labelName = new JLabel("Name: ",JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);

		JLabel labelDate = new JLabel("Date: ",JLabel.TRAILING);
		JTextField fieldDate = new JTextField(10);
		labelDate.setLabelFor(fieldDate);
		panel.add(labelDate);
		panel.add(fieldDate);

		JLabel labelLocation = new JLabel("Location: ",JLabel.TRAILING);
		JTextField fieldLocation = new JTextField(10);
		labelLocation.setLabelFor(fieldLocation);
		panel.add(labelLocation);
		panel.add(fieldLocation);

		JLabel labelObject = new JLabel("Object: ",JLabel.TRAILING);
		JTextField fieldObject = new JTextField(10);
		labelObject.setLabelFor(fieldObject);
		panel.add(labelObject);
		panel.add(fieldObject);

		JLabel labelPriority = new JLabel("Priority: ",JLabel.TRAILING);
		JTextField fieldPriority = new JTextField(10);
		labelPriority.setLabelFor(fieldPriority);
		panel.add(labelPriority);
		panel.add(fieldPriority);

		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));

		SpringUtilities.makeCompactGrid(panel,6,2,6,6,6,6);

		this.add(panel);
		this.setVisible(true);
	}
}