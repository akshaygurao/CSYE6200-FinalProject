package edu.neu.csye6200.pojo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

public class SwingControlDemo {

	private JFrame m_mainFrame;
	private JLabel m_headerLabel;
	private JLabel m_statusLabel;
	private JPanel m_controlPanel;
	private JButton m_recvButton;
	private JButton m_sendButton;
	private JTextField m_hostField;
	private JTextField m_portField;
	private JTextArea m_sendViewTextArea;
	private JTextArea m_recvViewTextArea;
	JTextField m_portTField = new JTextField("6066");
	String m_recvData = null;

	public SwingControlDemo() {
		prepareGUI();
	}
	
	private void prepareGUI() {
		m_mainFrame = new JFrame("Java Swing Examples");
		m_mainFrame.setSize(2000, 800);
//		m_mainFrame.setSize(400, 400);
		m_mainFrame.setLayout(new GridLayout(3, 1));
		m_mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		m_headerLabel = new JLabel("", JLabel.CENTER);
		m_statusLabel = new JLabel("", JLabel.CENTER);

		m_statusLabel.setSize(350, 100);

		m_controlPanel = new JPanel();
		m_controlPanel.setLayout(new FlowLayout());	// initial layout can be changed

		m_mainFrame.add(m_headerLabel);
		m_mainFrame.add(m_controlPanel);
		m_mainFrame.add(m_statusLabel);
		m_mainFrame.setVisible(true);
	}


	public void udpDemo() {
		m_headerLabel.setText("Control in action: UDP Demo");

		m_hostField = new JTextField("localhost");
		m_portField = new JTextField(new Integer(UDPRecv.DEFAULT_PORT).toString());
		m_sendButton = new JButton("SEND");
		m_recvButton = new JButton("RECEIVE");
		m_sendViewTextArea = new JTextArea("", 5, 40);
		m_recvViewTextArea = new JTextArea("", 5, 40);

		JScrollPane sendScrollPane = new JScrollPane(m_sendViewTextArea);
		JScrollPane recvScrollPane = new JScrollPane(m_recvViewTextArea);
		m_sendViewTextArea.setText(
				"Click RECEUVE button FIRST (to enable receiver), THEN Type text in here and click SEND to transmit text.");
		m_recvViewTextArea
				.setText("Click RECEIVE button FIRST to enable receiver and receive text (in UPPERCASE) here.");

		// add action listeners for Buttons
		// add action listener for Receive button using traditional anonymous inner class
		m_recvButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				m_recvViewTextArea.setText("RECEIVER ENABLED ON PORT: " + Integer.parseInt(m_portField.getText()));
				UDPRecv obj = new UDPRecv(new TextAreaUpdaterTask<JComponent>(m_recvViewTextArea), Integer.parseInt(m_portField.getText()));
//				m_recvViewTextArea.setText("RECEIVER ENABLED ON PORT: " + UDPRecv.DEFAULT_PORT);
//				UDPRecv obj = new UDPRecv(new TextAreaUpdaterTask<JComponent>(m_recvViewTextArea));
				// UDPRecv obj = new UDPRecv();
				// obj.recv(4445);
				Thread t = new Thread(obj);
				t.start();
			}
		});
		// add action listener for Send button using Lambda
		m_sendButton.addActionListener(e -> {
			String host = m_hostField.getText();
//			int port = new Integer(m_portField.getText());
			int port = Integer.parseInt(m_portField.getText());	// return int
//			int port = Integer.valueOf(m_portField.getText());	// returns Integer
			UDPSend obj = new UDPSend();
			obj.send("localhost", port, m_sendViewTextArea.getText().toUpperCase());
//			obj.send("localhost", 4445, m_sendViewTextArea.getText().toUpperCase());
			// obj.send("localhost", 4445, "UDPSend calling you!");
		});
//		// Define the panel to hold the buttons
//		JPanel panel = new JPanel();
//		panel.setLayout(new FlowLayout());
//		panel.add(m_sendButton);
//		panel.add(m_recvButton);
//		panel.add(sendScrollPane);
//		panel.add(recvScrollPane);

		// change to a more suitable layout
		m_controlPanel.setLayout(new GridLayout(3,2));	// GridLayout(rows, columns) 
		m_controlPanel.add(m_hostField);
		m_controlPanel.add(m_portField);
		m_controlPanel.add(m_sendButton);
		m_controlPanel.add(m_recvButton);
		m_controlPanel.add(sendScrollPane);
		m_controlPanel.add(recvScrollPane);
		//		m_controlPanel.add(panel);
		m_mainFrame.setVisible(true);
	}
    
    public static void demo() {
		SwingControlDemo obj = new SwingControlDemo();
		
		obj.udpDemo();	// demo EITHER UDP OR TCP but not both

	}
}
