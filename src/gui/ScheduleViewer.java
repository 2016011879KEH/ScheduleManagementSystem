package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.ScheduleManager;
import schedule.ScheduleInput;

public class ScheduleViewer extends JPanel{
	
	WindowFrame frame;
	ScheduleManager scheduleManager;
	
	public ScheduleViewer(WindowFrame frame, ScheduleManager scheduleManager) {
		this.frame = frame;
		this.scheduleManager = scheduleManager;
		
		System.out.println("***" + scheduleManager.size() +"***");
		
		DefaultTableModel model = new DefaultTableModel();

		model.addColumn("Name");
		model.addColumn("Date");
		model.addColumn("Location");
		model.addColumn("Object");
		model.addColumn("Priority");
		
		for (int i=0; i<scheduleManager.size(); i++) {
			Vector row = new Vector();
			ScheduleInput si = scheduleManager.get(i);
			row.add(si.getName());
			row.add(si.getDate());
			row.add(si.getLocation());
			row.add(si.getObject());
			row.add(si.getPrior());
			model.addRow(row);
		}

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

        this.add(sp);
	}
}
