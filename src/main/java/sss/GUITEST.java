package sss;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;



public class GUITEST{
	private JFrame frame;
	private JTextField input;
	private JTextArea Clientget;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUITEST window = new GUITEST();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }

    public GUITEST(){
        frame = new JFrame();
		frame.setTitle("SSS Client");
		frame.setBounds(100, 100, 400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		BoxLayout bl = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);

		frame.getContentPane().setLayout(bl);

		JPanel panel_service_1 = new JPanel();
		frame.getContentPane().add(panel_service_1);
		panel_service_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lbinput = new JLabel("Data :");
		panel_service_1.add(lbinput);

        input = new JTextField();
		panel_service_1.add(input);
		input.setColumns(11);

        final JComboBox comboOperation = new JComboBox();
		comboOperation.setModel(new DefaultComboBoxModel(new String[] {"movement_server","camera_server","message","voice"}));
		panel_service_1.add(comboOperation);

        JButton Send = new JButton("Send");
        Send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int index = comboOperation.getSelectedIndex();
				
				if (index == 0) {//movement
                    byte[] image = input.getText().getBytes();
                    try {
                        allClient.Movingdetected(image);
                    } catch (IOException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    Clientget.append("Done");
                }
				if (index == 1) {
                    String id = input.getText();
                    try {
                        allClient.stream(id);
                    } catch (IOException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    Clientget.append("Done");
                 }
				if (index == 2) {
                    String mess = input.getText();
                    try {
                        allClient.sendmessage(mess);
                    } catch (IOException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    Clientget.append("Done");
                 }
                if (index == 3) {
                    byte[] voice = input.getText().getBytes();
                    try {
                        allClient.sendvoice(voice);
                    } catch (IOException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    Clientget.append("Done");
                 }

			}
		});
        panel_service_1.add(Send);

        Clientget = new JTextArea(5, 30);
		Clientget.setLineWrap(true);
		Clientget.setWrapStyleWord(true);
		JScrollPane scrollPane2 = new JScrollPane(Clientget);
		panel_service_1.add(scrollPane2);
    }
}