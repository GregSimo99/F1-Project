package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;

import com.ergast.mrd._1.MRDataType;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.Icon;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

public class StandingWin extends JFrame {

	private JPanel contentPane;
	private JLabel LogoLabel;
	private JLabel LogoRight;
	private JLabel LogoUnder;
	private JLabel LogoUpper;
	private JLabel LogoLeft;
	private JLabel lblAnno;
	private JComboBox<String> comboAnno;
	private Calendar now;
	private JLabel lblRound;
	private JComboBox<String> comboRound;
	private JCheckBox chkbxRound;
	private JButton btnSubmit;
	private JCheckBox constructChkbox;

	/* -------- FINESTRA DA UTLIZZARE PER LA RICERCA DEGLI STANDINGS  -------- */
	
	
	public StandingWin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(252, 252, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		BufferedImage immagine;
		
		//---------IMMAGINI---------------
		
		try {
			immagine = ImageIO.read(new File("src/immagini/F1Logo.jpg"));
			LogoLabel = new JLabel(new ImageIcon(immagine.getScaledInstance(178, 53, 1)));
			LogoLabel.setBounds(10, 11, 178, 53);
			contentPane.add(LogoLabel);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//--------IMMAGINI---------------
		
		LogoRight=new JLabel();
		LogoRight.setText("F1 HISTORICAL DB");
		LogoRight.setHorizontalAlignment(SwingConstants.CENTER);
		LogoRight.setFont(new Font("Century Gothic", LogoRight.getFont().getStyle() | Font.BOLD, LogoRight.getFont().getSize() + 54));
		LogoRight.setBackground(new Color(255, 255, 255));
		LogoRight.setForeground(new Color(255, 22, 25));
		LogoRight.setOpaque(true);
		LogoRight.setBounds(177, 11, 617, 53);
		contentPane.add(LogoRight);
		
		LogoUnder = new JLabel();
		LogoUnder.setOpaque(true);
		LogoUnder.setForeground(new Color(165, 42, 42));
		LogoUnder.setBackground(Color.WHITE);
		LogoUnder.setBounds(0, 64, 794, 15);
		contentPane.add(LogoUnder);
		
		LogoUpper = new JLabel();
		LogoUpper.setOpaque(true);
		LogoUpper.setForeground(new Color(165, 42, 42));
		LogoUpper.setBackground(Color.WHITE);
		LogoUpper.setBounds(0, 0, 794, 15);
		contentPane.add(LogoUpper);
		
		LogoLeft = new JLabel();
		LogoLeft.setOpaque(true);
		LogoLeft.setForeground(new Color(165, 42, 42));
		LogoLeft.setBackground(Color.WHITE);
		LogoLeft.setBounds(0, 11, 19, 53);
		contentPane.add(LogoLeft);
		
		lblAnno = new JLabel("ANNO STAGIONE");
		lblAnno.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnno.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblAnno.setBounds(72, 156, 178, 27);
		contentPane.add(lblAnno);
		
		comboAnno = new JComboBox<String>();
		comboAnno.setBounds(620, 156, 101, 27);
		now = Calendar.getInstance();
		comboAnno.addItem("Seleziona");
		for(int i=1950;i<now.get(Calendar.YEAR)+1;i++) {
			comboAnno.addItem(""+i);
		}
		contentPane.add(comboAnno);
		
		
		
		lblRound = new JLabel("ROUND");
		lblRound.setHorizontalAlignment(SwingConstants.CENTER);
		lblRound.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblRound.setBounds(72, 213, 178, 27);
		contentPane.add(lblRound);
		
		comboRound = new JComboBox<String>();
		comboRound.setBounds(620, 213, 101, 27);
		comboRound.addItem("Seleziona");
		contentPane.add(comboRound);
		comboRound.setVisible(false);
		
		chkbxRound = new JCheckBox("Attiva");
		chkbxRound.setFont(new Font("Century Gothic", Font.BOLD, 16));
		chkbxRound.setBackground(new Color(252,252,255));
		chkbxRound.setBounds(267, 213, 97, 27);
		contentPane.add(chkbxRound);
		
		btnSubmit = new JButton("SUBMIT");
		btnSubmit.setBounds(333, 325, 128, 41);
		contentPane.add(btnSubmit);
		
		constructChkbox = new JCheckBox("Costruttori");
		constructChkbox.setFont(new Font("Century Gothic", Font.BOLD, 16));
		constructChkbox.setBounds(376, 213, 121, 27);
		constructChkbox.setBackground(new Color(252,252,255));
		contentPane.add(constructChkbox);
	
		
		
		centreWindow(this);
		this.setVisible(true);
		this.setResizable(false);
		
	}
	
	public JCheckBox getConstructChkbox() {
		return constructChkbox;
	}

	//255 22 25
	//METODI
	public static void centreWindow(StandingWin frame) {
	    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
	    frame.setLocation(x, y);
	}
	
	public void impostaComboRound(int r) {
		comboRound.removeAll();
		for (int i = 1; i <= r; i++) {
			comboRound.addItem(""+i);
		}
	}
	
	public String getRound() {
		String s="";
		s="/"+(comboRound.getSelectedIndex()+1);
		return s;
	}
	//GETTER AND SETTER
	
	public JComboBox<String> getComboAnno() {
		return comboAnno;
	}

	public JCheckBox getChkbxRound() {
		return chkbxRound;
	}

	public JComboBox<String> getComboRound() {
		return comboRound;
	}

	public JButton getBtnSubmit() {
		return btnSubmit;
	}
}
