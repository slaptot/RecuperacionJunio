package javaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AltaTaller {

	private JFrame frame;
	private JTextField textFieldId;
	private JTextField textFieldNumeroMecanicos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaTaller window = new AltaTaller();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AltaTaller() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Creaci\u00F3n Taller");
		lblTitulo.setBounds(10, 23, 46, 14);
		frame.getContentPane().add(lblTitulo);
		
		JLabel lblIdTaller = new JLabel("ID Taller");
		lblIdTaller.setBounds(10, 100, 46, 14);
		frame.getContentPane().add(lblIdTaller);
		
		textFieldId = new JTextField();
		textFieldId.setBounds(123, 97, 86, 20);
		frame.getContentPane().add(textFieldId);
		textFieldId.setColumns(10);
		
		JLabel lblNumeroMecanicos = new JLabel("Numero Mec\u00E1nicos");
		lblNumeroMecanicos.setBounds(10, 154, 46, 14);
		frame.getContentPane().add(lblNumeroMecanicos);
		
		textFieldNumeroMecanicos = new JTextField();
		textFieldNumeroMecanicos.setBounds(123, 151, 86, 20);
		frame.getContentPane().add(textFieldNumeroMecanicos);
		textFieldNumeroMecanicos.setColumns(10);
		
		JLabel lblTrabajadoresMecanicos = new JLabel("");
		lblTrabajadoresMecanicos.setBounds(10, 210, 46, 14);
		frame.getContentPane().add(lblTrabajadoresMecanicos);
	}
}
