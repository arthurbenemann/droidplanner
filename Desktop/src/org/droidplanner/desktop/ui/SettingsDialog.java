package org.droidplanner.desktop.ui;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class SettingsDialog extends JDialog {
	
	private JPanel contentPane;

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SettingsDialog dialog = new SettingsDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SettingsDialog() {
		setBounds(100, 100, 600, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		/**
		 * Editing
		 * 
		 */
		
		JLabel lblDroneStup = new JLabel("DRONE SETUP");

		JSplitPane splitPane = new JSplitPane();

		JSplitPane splitPane_1 = new JSplitPane();

		JSplitPane splitPane_2 = new JSplitPane();

		JSeparator separator_1 = new JSeparator();
		
		JLabel lblSettings = new JLabel("APP SETTINGS");
		
		JSplitPane splitPane_3 = new JSplitPane();
		
		JSplitPane splitPane_4 = new JSplitPane();
		
		JSplitPane splitPane_5 = new JSplitPane();
		
		JSplitPane splitPane_6 = new JSplitPane();
		
		JSplitPane splitPane_7 = new JSplitPane();
		
		JSeparator separator = new JSeparator();
		
		JLabel lblUsageStatistics = new JLabel("USAGE STATISTICS");
		
		JSplitPane splitPane_8 = new JSplitPane();
		
		JSeparator separator_2 = new JSeparator();
		
		JLabel lblAbout = new JLabel("ABOUT");
		
		JSplitPane splitPane_9 = new JSplitPane();
		
		JSplitPane splitPane_10 = new JSplitPane();
		
		JSplitPane splitPane_11 = new JSplitPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDroneStup)
						.addComponent(splitPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(splitPane_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(splitPane_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSettings)
						.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 540, GroupLayout.PREFERRED_SIZE)
						.addComponent(splitPane_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(splitPane_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(splitPane_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(splitPane_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(splitPane_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(separator, GroupLayout.PREFERRED_SIZE, 540, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblUsageStatistics)
						.addComponent(splitPane_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 540, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAbout)
						.addComponent(splitPane_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(splitPane_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(splitPane_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(37, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblDroneStup)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(splitPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(splitPane_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(splitPane_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(lblSettings)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(splitPane_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(splitPane_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(splitPane_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(splitPane_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(splitPane_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblUsageStatistics)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(splitPane_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblAbout)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(splitPane_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(splitPane_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(splitPane_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(462, Short.MAX_VALUE))
		);
		
		JLabel lblStorageFolder = new JLabel("Storage Folder");
		splitPane_11.setRightComponent(lblStorageFolder);
		
		JLabel lblMavlinkVersion = new JLabel("MAVLink Version");
		splitPane_10.setRightComponent(lblMavlinkVersion);
		
		JLabel lblVersion = new JLabel("Version");
		splitPane_9.setRightComponent(lblVersion);
		
		JRadioButton rdbtnSendUsageStatistics = new JRadioButton("Send Usage statistics");
		rdbtnSendUsageStatistics.setHorizontalAlignment(SwingConstants.LEFT);
		splitPane_8.setRightComponent(rdbtnSendUsageStatistics);
		
		JLabel lblConnectionPreferences = new JLabel("Connection Preferences");
		splitPane_7.setRightComponent(lblConnectionPreferences);
		
		JLabel lblAdvanced = new JLabel("Advanced");
		splitPane_6.setRightComponent(lblAdvanced);
		
		JLabel lblUserInterface = new JLabel("User Interface");
		splitPane_5.setRightComponent(lblUserInterface);
		
		JLabel lblMavlink = new JLabel("MAVLink");
		splitPane_4.setRightComponent(lblMavlink);
		
		JLabel lblTelemetryConnectionType = new JLabel("Telemetry Connection Type");
		splitPane_3.setRightComponent(lblTelemetryConnectionType);

		JLabel lblParameters = new JLabel("Parameters");
		splitPane_2.setRightComponent(lblParameters);

		JLabel lblChecklist = new JLabel("Checklist");
		splitPane_1.setRightComponent(lblChecklist);

		JLabel lblRadio = new JLabel("Radio");
		splitPane.setRightComponent(lblRadio);
		contentPane.setLayout(gl_contentPane);



	}

}
