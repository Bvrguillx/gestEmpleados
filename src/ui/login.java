package ui;

import java.awt.*;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;

public class login {

	//
	// ATRIBUTOS
	//
	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private boolean succeeded;

	//
	// LAUNCH THE APP
	//

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//
	// CREATE THE APP
	//

	public login() {
		initialize();
	}

	//
	// INITIALIZE THE CONTENTS OF THE FRAME
	//

	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 330, 284);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		//
		// LABELS
		//

		// USERNAME LABEL
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(51, 78, 59, 14);
		frame.getContentPane().add(lblUsername);
		// PASSWORD LABEL
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(51, 124, 59, 14);
		frame.getContentPane().add(lblPassword);
		// WELCOME LABEL
		JLabel lblWelcomeTo = new JLabel("Welcome To");
		lblWelcomeTo.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 11));
		lblWelcomeTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeTo.setVerticalAlignment(SwingConstants.TOP);
		lblWelcomeTo.setBounds(10, 6, 295, 14);
		frame.getContentPane().add(lblWelcomeTo);
		// WELCOME-2 LABEL
		JLabel lblBvrguillxTrvpbxga = new JLabel("BVRGUILLX & TRVPBXGA & COMPANY");
		lblBvrguillxTrvpbxga.setVerticalAlignment(SwingConstants.TOP);
		lblBvrguillxTrvpbxga.setHorizontalAlignment(SwingConstants.CENTER);
		lblBvrguillxTrvpbxga.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 11));
		lblBvrguillxTrvpbxga.setBounds(10, 31, 295, 14);
		frame.getContentPane().add(lblBvrguillxTrvpbxga);
		// AUX LABEL
		JLabel label = new JLabel("");
		label.setBounds(38, 149, 241, 32);
		frame.getContentPane().add(label);

		//
		// TEXT FIELDS
		//

		// USERNAME TEXT FIELD
		textField = new JTextField();
		textField.setBounds(120, 73, 116, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		// PASSWORD TEXT FIELD
		passwordField = new JPasswordField();
		passwordField.setBounds(120, 121, 116, 25);
		frame.getContentPane().add(passwordField);

		//
		// BUTTONS
		//

		// LOGIN BUTTON
		JButton login = new JButton("LOGIN");
		login.setBounds(38, 182, 104, 48);
		frame.getContentPane().add(login);
		login.setIcon(new ImageIcon(login.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (loginmodel.authentication(getUsername(), getPassword())) {
					succeeded = true;
					frame.dispose();
					gestion g = new gestion();
					g.frmBvrguillxTrvpbxga.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(frame, "Invalid USERNAME or PASSWORD", "Login",
							JOptionPane.ERROR_MESSAGE);
					textField.setText("");
					passwordField.setText("");
					succeeded = false;
				}
			}
		});

		// CANCEL BUTTON
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setIcon(new ImageIcon(login.class.getResource("/com/sun/java/swing/plaf/windows/icons/Error.gif")));
		btnCancel.setBounds(163, 182, 116, 48);
		frame.getContentPane().add(btnCancel);
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});

	}

	//
	// GETTERS AND SETTERS
	//

	public String getUsername() {
		return textField.getText().trim();
	}

	public String getPassword() {
		return new String(passwordField.getPassword());
	}

	public boolean isSucceeded() {
		return succeeded;
	}

}
