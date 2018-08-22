/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.gui;

import edu.neu.csye6200.TemperatureController;

/**
 *
 * @author Nishith Shetty
 */
public class Application extends javax.swing.JFrame {

	private static Application app = new Application();
    /**
     * Creates new form NewJFrame
     */
    private Application() {
        initComponents();
    }

    public static Application getInstance() {
    	return app;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        thermostatPanel = new javax.swing.JPanel();
        bedroomTemperature = new javax.swing.JLabel();
        livingRoomTemperature = new javax.swing.JLabel();
        lobbyTemperature = new javax.swing.JLabel();
        bedroomLabel = new javax.swing.JLabel();
        livingRoomLabel = new javax.swing.JLabel();
        lobbyLabel = new javax.swing.JLabel();
        startEvents = new javax.swing.JButton();
        monitorPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        startClient = new javax.swing.JButton();
        startServer = new javax.swing.JButton();
        host = new javax.swing.JTextField();
        port = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bedroomTemperature.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        bedroomTemperature.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bedroomTemperature.setText("05");
        bedroomTemperature.setText("04");
        bedroomTemperature.setToolTipText("");

        livingRoomTemperature.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        livingRoomTemperature.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        livingRoomTemperature.setText("00");
        livingRoomTemperature.setToolTipText("");

        lobbyTemperature.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lobbyTemperature.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lobbyTemperature.setText("00");
        lobbyTemperature.setToolTipText("");

        bedroomLabel.setText("Bedroom");

        livingRoomLabel.setText("Living room");

        lobbyLabel.setText("Lobby");

        startEvents.setText("Start");

        javax.swing.GroupLayout thermostatPanelLayout = new javax.swing.GroupLayout(thermostatPanel);
        thermostatPanel.setLayout(thermostatPanelLayout);
        thermostatPanelLayout.setHorizontalGroup(
            thermostatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thermostatPanelLayout.createSequentialGroup()
                .addGroup(thermostatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(thermostatPanelLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(bedroomTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, thermostatPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bedroomLabel)
                        .addGap(31, 31, 31)))
                .addGroup(thermostatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(thermostatPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(livingRoomTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lobbyTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(thermostatPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(thermostatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startEvents)
                            .addComponent(livingRoomLabel))
                        .addGap(79, 79, 79)
                        .addComponent(lobbyLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        thermostatPanelLayout.setVerticalGroup(
            thermostatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, thermostatPanelLayout.createSequentialGroup()
                .addComponent(startEvents)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(thermostatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bedroomLabel)
                    .addComponent(livingRoomLabel)
                    .addComponent(lobbyLabel))
                .addGap(18, 18, 18)
                .addGroup(thermostatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bedroomTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(livingRoomTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lobbyTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout monitorPanelLayout = new javax.swing.GroupLayout(monitorPanel);
        monitorPanel.setLayout(monitorPanelLayout);
        monitorPanelLayout.setHorizontalGroup(
            monitorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monitorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        monitorPanelLayout.setVerticalGroup(
            monitorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monitorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        startClient.setText("Send");

        startServer.setText("Recieve");

        host.setText("localhost");
        host.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostActionPerformed(evt);
            }
        });

        port.setText("4995");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thermostatPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(monitorPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(host, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(startClient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startServer)
                .addGap(18, 18, 18)
                .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(thermostatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startClient)
                    .addComponent(startServer)
                    .addComponent(host, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(monitorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    public javax.swing.JLabel getBedroomTemperature() {
		return bedroomTemperature;
	}

	public void setBedroomTemperature(String t) {
		System.out.println("Y");
//		bedroomTemperature.setText(t);
        bedroomTemperature.setText("02");

	}

	public javax.swing.JTextArea getjTextArea2() {
		return jTextArea2;
	}

	public void setjTextArea2(String t) {
		this.jTextArea2 = jTextArea2;
	}

	public javax.swing.JLabel getLivingRoomTemperature() {
		return livingRoomTemperature;
	}

	public void setLivingRoomTemperature(String t) {
		livingRoomTemperature.setText(t);
	}

	public javax.swing.JLabel getLobbyTemperature() {
		return lobbyTemperature;
	}

	public void setLobbyTemperature(String t) {
		lobbyTemperature.setText(t);
	}

	private void hostActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    /**
     * @param args the command line arguments
     */
    public void demo() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Application().setVisible(true);
            }
        });
        
        Application app = Application.getInstance();
		app.setBedroomTemperature("05");

        
        startEvents.addActionListener(e -> {
        	System.out.println("Y");
        	TemperatureController.demo();
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel bedroomLabel;
    private javax.swing.JLabel bedroomTemperature;
    private javax.swing.JTextField host;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel livingRoomLabel;
    private javax.swing.JLabel livingRoomTemperature;
    private javax.swing.JLabel lobbyLabel;
    private javax.swing.JLabel lobbyTemperature;
    private javax.swing.JPanel monitorPanel;
    private javax.swing.JTextField port;
    private javax.swing.JButton startClient;
    private javax.swing.JButton startEvents;
    private javax.swing.JButton startServer;
    private javax.swing.JPanel thermostatPanel;
    // End of variables declaration                   
}