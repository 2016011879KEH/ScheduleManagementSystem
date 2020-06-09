package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ScheduleViewer extends JPanel{
	
	WindowFrame frame;

	public ScheduleViewer(WindowFrame frame) {
		this.frame = frame;
		DefaultTableModel model = new DefaultTableModel();

		model.addColumn("Name");
		model.addColumn("Date");
		model.addColumn("Location");
		model.addColumn("Object");
		model.addColumn("Priority");

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

        this.add(sp);
	}
}
