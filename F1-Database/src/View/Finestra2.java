package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Finestra2 extends JFrame {

	private JPanel contentPane;
	private JLabel lblMeteo;
	private JLabel lblCitt;
	private JLabel lblIcona;
	private JLabel lblTempo;
	private JLabel lblTemperatura;
	private JLabel label;
	private JLabel label_1;
	private JLabel lblTemperaturaMax;
	private JLabel label_2;
	private JLabel lblTemperaturaMin;
	private JLabel label_3;
	private JLabel lblUmidit;
	private JLabel label_4;
	private JLabel lblPressioneAtm;
	private JLabel label_5;
	private JLabel lblVento;
	private JLabel label_6;
	private JLabel lblNuvole;
	private JLabel label_7;
	private JButton btnOk;
	private JButton btnAggiorna;
	private JButton btnCambiaCitt;

	public Finestra2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblMeteo = new JLabel("METEO");
		lblMeteo.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblMeteo.setBounds(293, 11, 114, 37);
		contentPane.add(lblMeteo);
		
		lblCitt = new JLabel("");
		lblCitt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCitt.setBounds(494, 83, 133, 23);
		contentPane.add(lblCitt);
		
		lblIcona = new JLabel("");
		lblIcona.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIcona.setBounds(451, 132, 202, 204);
		contentPane.add(lblIcona);
		
		lblTempo = new JLabel("Tempo");
		lblTempo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTempo.setBounds(40, 83, 46, 14);
		contentPane.add(lblTempo);
		
		lblTemperatura = new JLabel("Temperatura");
		lblTemperatura.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTemperatura.setBounds(40, 116, 94, 14);
		contentPane.add(lblTemperatura);
		
		label = new JLabel("");
		label.setBounds(191, 83, 133, 14);
		contentPane.add(label);
		
		label_1 = new JLabel("");
		label_1.setBounds(191, 116, 73, 14);
		contentPane.add(label_1);
		
		lblTemperaturaMax = new JLabel("Temperatura MAX");
		lblTemperaturaMax.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTemperaturaMax.setBounds(40, 150, 114, 14);
		contentPane.add(lblTemperaturaMax);
		
		label_2 = new JLabel("");
		label_2.setBounds(191, 150, 73, 14);
		contentPane.add(label_2);
		
		lblTemperaturaMin = new JLabel("Temperatura MIN");
		lblTemperaturaMin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTemperaturaMin.setBounds(40, 181, 114, 14);
		contentPane.add(lblTemperaturaMin);
		
		label_3 = new JLabel("");
		label_3.setBounds(191, 181, 73, 14);
		contentPane.add(label_3);
		
		lblUmidit = new JLabel("Umidit\u00E0");
		lblUmidit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUmidit.setBounds(40, 213, 73, 14);
		contentPane.add(lblUmidit);
		
		label_4 = new JLabel("");
		label_4.setBounds(191, 213, 61, 14);
		contentPane.add(label_4);
		
		lblPressioneAtm = new JLabel("Pressione atm");
		lblPressioneAtm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPressioneAtm.setBounds(40, 245, 94, 14);
		contentPane.add(lblPressioneAtm);
		
		label_5 = new JLabel("");
		label_5.setBounds(191, 245, 73, 14);
		contentPane.add(label_5);
		
		lblVento = new JLabel("Vento");
		lblVento.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblVento.setBounds(40, 277, 46, 14);
		contentPane.add(lblVento);
		
		label_6 = new JLabel("");
		label_6.setBounds(191, 277, 167, 14);
		contentPane.add(label_6);
		
		lblNuvole = new JLabel("Nuvole");
		lblNuvole.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNuvole.setBounds(40, 309, 61, 14);
		contentPane.add(lblNuvole);
		
		label_7 = new JLabel("");
		label_7.setBounds(191, 310, 87, 14);
		contentPane.add(label_7);
		
		btnOk = new JButton("Ok");
		btnOk.setBounds(105, 384, 104, 23);
		contentPane.add(btnOk);
		
		btnAggiorna = new JButton("Aggiorna");
		btnAggiorna.setBounds(293, 384, 103, 23);
		contentPane.add(btnAggiorna);
		
		btnCambiaCitt = new JButton("Cambia citt\u00E0");
		btnCambiaCitt.setBounds(495, 384, 114, 23);
		contentPane.add(btnCambiaCitt);
	}

	public JLabel getLblCitt() {
		return lblCitt;
	}

	public JLabel getLblIcona() {
		return lblIcona;
	}

	public JLabel getLabel() {
		return label;
	}

	public JLabel getLabel_1() {
		return label_1;
	}

	public JButton getBtnOk() {
		return btnOk;
	}

	public JButton getBtnAggiorna() {
		return btnAggiorna;
	}

	public JButton getBtnCambiaCitt() {
		return btnCambiaCitt;
	}

	public JLabel getLabel_2() {
		return label_2;
	}

	public JLabel getLabel_7() {
		return label_7;
	}

	public JLabel getLabel_3() {
		return label_3;
	}

	public JLabel getLabel_4() {
		return label_4;
	}

	public JLabel getLabel_5() {
		return label_5;
	}

	public JLabel getLabel_6() {
		return label_6;
	}
}
