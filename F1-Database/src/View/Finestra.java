package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Finestra extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnVai;
	private JLabel lblCittaRecenti;
	private JComboBox comboBox;

	public Finestra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 290, 242);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMeteo = new JLabel("METEO");
		lblMeteo.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblMeteo.setBounds(101, 11, 116, 24);
		contentPane.add(lblMeteo);
		
		JLabel lblCitta = new JLabel("Citt\u00E0");
		lblCitta.setBounds(34, 63, 46, 14);
		contentPane.add(lblCitta);
		
		textField = new JTextField();
		textField.setBounds(125, 60, 125, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnVai = new JButton("Vai");
		btnVai.setBounds(101, 155, 89, 23);
		contentPane.add(btnVai);
		
		lblCittaRecenti = new JLabel("Citt\u00E0 recenti");
		lblCittaRecenti.setBounds(34, 110, 94, 14);
		contentPane.add(lblCittaRecenti);
		
		comboBox = new JComboBox();
		comboBox.setBounds(125, 107, 125, 20);
		contentPane.add(comboBox);
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JButton getBtnVai() {
		return btnVai;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public void setBtnVai(JButton btnVai) {
		this.btnVai = btnVai;
	}
}
