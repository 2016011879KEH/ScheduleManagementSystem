package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame{
	
	MenuSelection menuselection;
	ScheduleAdder scheduleadder;
	ScheduleViewer scheduleviewer;

	public WindowFrame() {
		this.menuselection = new MenuSelection(this);
		this.scheduleadder = new ScheduleAdder(this);
		this.scheduleviewer = new ScheduleViewer(this);
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setupPanel(menuselection);
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public ScheduleAdder getScheduleadder() {
		return scheduleadder;
	}

	public void setScheduleadder(ScheduleAdder scheduleadder) {
		this.scheduleadder = scheduleadder;
	}

	public ScheduleViewer getScheduleviewer() {
		return scheduleviewer;
	}

	public void setScheduleviewer(ScheduleViewer scheduleviewer) {
		this.scheduleviewer = scheduleviewer;
	}
}
