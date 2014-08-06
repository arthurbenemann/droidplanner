package org.droidplanner.desktop.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import org.droidplanner.core.drone.Drone;

public class Menu extends JMenuBar implements ActionListener {
	private static final long serialVersionUID = 3070514693880578004L;

	private static final String LOAD_MISSION = "Load Mission";
	private static final String LOAD_PARAMETERS = "Load Parameters";
	private static final String OPEN_SETTINGS = "Open Settings";
	
	private Drone drone;

	

	public Menu(Drone drone) {
		super();
		this.drone = drone;
		JMenu droneMenu = new JMenu("Drone");
		JMenuItem loadMission = new JMenuItem(LOAD_MISSION);
		JMenuItem loadParameters = new JMenuItem(LOAD_PARAMETERS);
		JMenuItem openSettings = new JMenuItem(OPEN_SETTINGS);

		loadMission.addActionListener(this);
		loadParameters.addActionListener(this);
		openSettings.addActionListener(this);

		droneMenu.add(loadMission);
		droneMenu.add(loadParameters);
		droneMenu.add(openSettings);
		add(droneMenu);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equalsIgnoreCase(LOAD_MISSION)) {
			drone.waypointManager.getWaypoints();
		} else if (e.getActionCommand().equalsIgnoreCase(LOAD_PARAMETERS)) {
			drone.parameters.getAllParameters();
		} else if (e.getActionCommand().equalsIgnoreCase(OPEN_SETTINGS)) {
			JDialog settingsDialog = new SettingsDialog();
			settingsDialog.setVisible(true);
		}
	}

}
