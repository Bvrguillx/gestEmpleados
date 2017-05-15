package ui_error;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import models.employee;

public class gestionCodOrden {

	//
	// ATRIBUTOS
	//

	protected JFrame frmBvrguillxTrvpbxga;
	protected JTextField nombreField;
	protected JTextField seniorityField;
	protected ButtonGroup bg;
	protected JLabel nameLabel;
	protected JLabel passLabel;
	protected JLabel sniorityLabel;
	protected JLabel tituloLabel;
	protected JLabel nombreLabel;
	protected JRadioButton radioMen;
	protected JRadioButton radioWomen;
	protected ArrayList<employee> list = new ArrayList<>();
	protected JLabel lblEmployees;
	protected JToggleButton tglbtnNewToggleButton;
	protected JSlider slider;
	protected JLabel sueldoLabel;
	protected JTextField comentsField;
	protected JLabel comentsLabel;
	protected JLabel positionLabel;
	protected String[] values = new String[] { "Supreme Boss", "Marketing Manager", "Bussines Consultant",
			"Personal Analist" };
	private JTextField txtEmployeeSurname;
	protected int indice;

	//
	// LAUNCH THE APP
	//

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gestionCodOrden window = new gestionCodOrden();
					window.frmBvrguillxTrvpbxga.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//
	// CREATE THE APP
	//
	public gestionCodOrden() {
		initialize();
	}

	//
	// INITIALIZE THE CONTENTS OF THE FRAME
	//

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frmBvrguillxTrvpbxga = new JFrame();
		frmBvrguillxTrvpbxga.setResizable(false);
		frmBvrguillxTrvpbxga.setTitle("Bvrguillx & Trvpbxga Enterprise");
		frmBvrguillxTrvpbxga.setBounds(100, 100, 946, 611);
		frmBvrguillxTrvpbxga.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBvrguillxTrvpbxga.getContentPane().setLayout(null);
		
		////////////
		// LABELS //
		////////////
		
		//
		// NOMBRE LABEL
		//
		JLabel nombreLabel = new JLabel("Name");
		nombreLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		nombreLabel.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 14));
		nombreLabel.setBounds(79, 77, 46, 14);
		frmBvrguillxTrvpbxga.getContentPane().add(nombreLabel);
		//
		// TITULO LABEL
		//
		JLabel tituloLabel = new JLabel("Bvrguillx & Trvpbxga ENTERPRISE - Create Mode");
		tituloLabel.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 16));
		tituloLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tituloLabel.setBounds(10, 11, 396, 46);
		frmBvrguillxTrvpbxga.getContentPane().add(tituloLabel);
		//
		// APELLIDO LABEL
		//
		JLabel passLabel = new JLabel("Surname");
		passLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		passLabel.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 14));
		passLabel.setBounds(39, 129, 86, 14);
		frmBvrguillxTrvpbxga.getContentPane().add(passLabel);
		//
		// ANTIGUEDAD LABEL
		//
		JLabel lblSeniority = new JLabel("Seniority");
		lblSeniority.setBounds(145, 301, -104, -37);
		frmBvrguillxTrvpbxga.getContentPane().add(lblSeniority);
		//
		// ANTIGUEDAD LABEL 2
		//
		JLabel sniorityLabel = new JLabel("Seniority");
		sniorityLabel.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 14));
		sniorityLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		sniorityLabel.setBounds(51, 271, 74, 14);
		frmBvrguillxTrvpbxga.getContentPane().add(sniorityLabel);
		//
		// EMPLEADOS LABEL - MODO LEER
		//
		JLabel lblEmployees = new JLabel("EMPLOYEES");
		lblEmployees.setEnabled(false);
		lblEmployees.setVisible(false);
		lblEmployees.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployees.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 16));
		lblEmployees.setBounds(596, 11, 178, 60);
		frmBvrguillxTrvpbxga.getContentPane().add(lblEmployees);
		//
		// COMENTARIOS LABEL
		//
		JLabel comentsLabel = new JLabel("Comments");
		comentsLabel.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 14));
		comentsLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		comentsLabel.setBounds(431, 375, 85, 21);
		frmBvrguillxTrvpbxga.getContentPane().add(comentsLabel);
		//
		// PUESTO EN LA EMPRESA LABEL
		//
		JLabel positionLabel = new JLabel("Position");
		positionLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		positionLabel.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 14));
		positionLabel.setBounds(39, 349, 86, 14);
		frmBvrguillxTrvpbxga.getContentPane().add(positionLabel);
		
		/////////////
		// BUTTONS //
		/////////////
		
		//
		// RADIO BUTTON HOMMBRE
		//
		JRadioButton radioMen = new JRadioButton("Men");
		if (radioMen.isSelected()) {
			radioMen.setText("Men");
		}
		radioMen.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 14));
		radioMen.setBounds(92, 196, 74, 23);
		frmBvrguillxTrvpbxga.getContentPane().add(radioMen);
		//
		// RADIO BUTTON MUJER
		//
		JRadioButton radioWomen = new JRadioButton("Women");
		if (radioWomen.isSelected()) {
			radioWomen.setText("Women");
		}
		radioWomen.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 14));
		radioWomen.setBounds(236, 196, 109, 23);
		frmBvrguillxTrvpbxga.getContentPane().add(radioWomen);
		//
		// GRUPO DE BOTONES = HOMBRE + MUJER
		// 
		bg = new ButtonGroup();
		bg.add(radioWomen);
		bg.add(radioMen);
		//
		// CREATE BUTTON
		//
		JButton btnCreate = new JButton("CREATE");
		btnCreate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				list.add(new employee(nombreField.getText(), txtEmployeeSurname.getText(), radioMen.isSelected(),
						values[2].indexOf(""), seniorityField.getText(), tglbtnNewToggleButton.isSelected(),
						slider.getValue(), comentsField.getText()));
			}
		});
		btnCreate.setIcon(new ImageIcon(gestionCodOrden.class.getResource("/com/sun/javafx/scene/web/skin/Cut_16x16_JFX.png")));
		btnCreate.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 14));
		btnCreate.setBounds(51, 447, 161, 74);
		frmBvrguillxTrvpbxga.getContentPane().add(btnCreate);
		//
		// EXIT BUTTON
		//
		JButton btnExit = new JButton("EXIT");
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnExit.setIcon(new ImageIcon(gestionCodOrden.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		btnExit.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 14));
		btnExit.setBounds(245, 447, 161, 74);
		frmBvrguillxTrvpbxga.getContentPane().add(btnExit);
		//
		// BACK BUTTON
		//
		JButton btnAtras = new JButton("");
		btnAtras.setVisible(false);
		btnAtras.setEnabled(false);
		btnAtras.setIcon(new ImageIcon(gestionCodOrden.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		btnAtras.setBounds(526, 11, 60, 60);
		frmBvrguillxTrvpbxga.getContentPane().add(btnAtras);
		//
		// FORWARD BUTTON
		//
		JButton btnAlante = new JButton("");
		btnAlante.setEnabled(false);
		btnAlante.setVisible(false);
		btnAlante.setIcon(new ImageIcon(gestionCodOrden.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		btnAlante.setBounds(784, 11, 60, 60);
		frmBvrguillxTrvpbxga.getContentPane().add(btnAlante);
		//
		// TOGGLE BUTTON HOLIDAYS
		//
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Employee on Holidays");
		tglbtnNewToggleButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (tglbtnNewToggleButton.isSelected()) {
					tglbtnNewToggleButton.setText("Employee is Working");
					tglbtnNewToggleButton.setIcon(new ImageIcon(
							gestionCodOrden.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-error.png")));
				} else {
					tglbtnNewToggleButton.setText("Employee on Holidays");
					tglbtnNewToggleButton.setIcon(new ImageIcon(gestionCodOrden.class
							.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-warning.png")));
				}
			}
		});
		tglbtnNewToggleButton.setIcon(new ImageIcon(
				gestionCodOrden.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-warning.png")));
		tglbtnNewToggleButton.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 16));
		tglbtnNewToggleButton.setBounds(526, 126, 318, 60);
		frmBvrguillxTrvpbxga.getContentPane().add(tglbtnNewToggleButton);
		//
		// SLIDER SUELDO
		//
		JSlider slider = new JSlider();
		slider.setMaximum(10000);
		slider.setPaintTicks(true);
		slider.setBounds(526, 204, 318, 60);
		frmBvrguillxTrvpbxga.getContentPane().add(slider);
		
		/////////////////
		// TEXT FIELDS //
		/////////////////
		
		//
		// NOMBRE TEXT FIELD
		//		
		nombreField = new JTextField();
		nombreField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				nombreField.setText("");
			}
		});
		nombreField.setHorizontalAlignment(SwingConstants.CENTER);
		nombreField.setText("Employee Name");
		nombreField.setBounds(155, 75, 190, 21);
		frmBvrguillxTrvpbxga.getContentPane().add(nombreField);
		nombreField.setColumns(10);
		//
		// ANTIGUEDAD TEXT FIELD
		//
		seniorityField = new JTextField();
		seniorityField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				seniorityField.setText("");
			}
		});
		seniorityField.setHorizontalAlignment(SwingConstants.CENTER);
		seniorityField.setText("DD/MM/YY");
		seniorityField.setBounds(155, 269, 190, 20);
		frmBvrguillxTrvpbxga.getContentPane().add(seniorityField);
		seniorityField.setColumns(10);
		//
		// COMENTS TEXT FIELD
		//
		comentsField = new JTextField();
		comentsField.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 14));
		comentsField.setBounds(526, 372, 318, 149);
		frmBvrguillxTrvpbxga.getContentPane().add(comentsField);
		comentsField.setColumns(10);
		//
		// APELLIDO TEXT FIELD
		//
		txtEmployeeSurname = new JTextField();
		txtEmployeeSurname.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtEmployeeSurname.setText("");
			}
		});
		txtEmployeeSurname.setHorizontalAlignment(SwingConstants.CENTER);
		txtEmployeeSurname.setText("Employee Surname");
		txtEmployeeSurname.setBounds(155, 127, 190, 20);
		frmBvrguillxTrvpbxga.getContentPane().add(txtEmployeeSurname);
		txtEmployeeSurname.setColumns(10);
		
		///////////
		// LISTA //
		///////////

		//
		// LISTA
		//
		JList lista = new JList();
		lista.setModel(new AbstractListModel() {
			private static final long serialVersionUID = 1L;

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		lista.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 14));
		lista.setBounds(155, 349, 190, 74);
		frmBvrguillxTrvpbxga.getContentPane().add(lista);

		////////////
		// SLIDER //
		////////////
		
		//
		// SLIDER VALORES
		// 
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int sueldo = slider.getValue();
				if (sueldo < 3000) {
					sueldoLabel.setBackground(Color.GREEN);
				} else if (sueldo < 5000) {
					sueldoLabel.setBackground(Color.YELLOW);
				} else if (sueldo < 8000) {
					sueldoLabel.setBackground(Color.ORANGE);
				} else {
					sueldoLabel.setBackground(Color.RED);
				}

				sueldoLabel.setText(slider.getValue() + " $ per Month");
			}
		});

		/////////////
		// MENUSES //
		/////////////
		
		//
		// BARRA MENU
		//
		JMenuBar menuBar = new JMenuBar();
		frmBvrguillxTrvpbxga.setJMenuBar(menuBar);
		//
		// MODOS MENU
		//
		JMenu mnMode = new JMenu("Mode");
		menuBar.add(mnMode);
		// 
		// MODO CREADOR
		//
		JMenuItem mntmCreateMode = new JMenuItem("Create Mode");
		mntmCreateMode.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btnAtras.setEnabled(false);
				btnAtras.setVisible(false);
				btnAlante.setEnabled(false);
				btnAlante.setVisible(false);
				lblEmployees.setVisible(false);
				lblEmployees.setEnabled(false);
				tituloLabel.setText("Bvrguillx & Trvpbxga ENTERPRISE - Create Mode");
				nombreField.setEnabled(true);
				nombreLabel.setEnabled(true);
				txtEmployeeSurname.setEnabled(true);
				passLabel.setEnabled(true);
				sniorityLabel.setEnabled(true);
				seniorityField.setEnabled(true);
				radioMen.setEnabled(true);
				radioWomen.setEnabled(true);
				btnCreate.setEnabled(true);
				tglbtnNewToggleButton.setEnabled(true);
				slider.setEnabled(true);
				sueldoLabel.setEnabled(true);
				comentsLabel.setEnabled(true);
				comentsField.setEnabled(true);
				positionLabel.setEnabled(true);
				lista.setEnabled(true);
			}
		});
		mnMode.add(mntmCreateMode);
		//
		// MODO LECTURA
		//
		JMenuItem mntmReadMode = new JMenuItem("Read Mode");
		mntmReadMode.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				btnAtras.setEnabled(true);
				btnAtras.setVisible(true);
				btnAlante.setEnabled(true);
				btnAlante.setVisible(true);
				lblEmployees.setVisible(true);
				lblEmployees.setEnabled(true);
				tituloLabel.setText("Bvrguillx & Trvpbxga ENTERPRISE - Read Mode");
				nombreField.setEnabled(false);
				nombreLabel.setEnabled(false);
				txtEmployeeSurname.setEnabled(false);
				passLabel.setEnabled(false);
				sniorityLabel.setEnabled(false);
				seniorityField.setEnabled(false);
				radioMen.setEnabled(false);
				radioWomen.setEnabled(false);
				btnCreate.setEnabled(false);
				tglbtnNewToggleButton.setEnabled(false);
				slider.setEnabled(false);
				sueldoLabel.setEnabled(false);
				comentsLabel.setEnabled(false);
				comentsField.setEnabled(false);
				positionLabel.setEnabled(false);
				lista.setEnabled(false);
			}
		});
		mnMode.add(mntmReadMode);
		//
		// MENU AYUDA
		//
		JMenu mnHelp = new JMenu("Help!");
		menuBar.add(mnHelp);
		//
		// ITEM CERRAR AYUDA
		//
		JMenuItem mntmGetMeOut = new JMenuItem("Get me out of here!");
		mntmGetMeOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});
		mnHelp.add(mntmGetMeOut);
	}
}