package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
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

public class Finestra extends JFrame {

	private JPanel contentPane;
	private JLabel LogoLabel;
	private JLabel LogoRight;
	private JLabel LogoUnder;
	private JLabel LogoUpper;
	private JLabel LogoLeft;
	private JLabel lblAnno;
	private JComboBox<String> comboBox;
	private Calendar now;
	private JLabel label;
	private JComboBox<String> comboBox_1;

	/* -------- FINESTRA DA UTLIZZARE PER LA RICERCA DEGLI STANDINGS  -------- */
	
	
	public Finestra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(252, 252, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		BufferedImage immagine;
		
		//---------
		
		try {
			immagine = ImageIO.read(new File("src/immagini/F1Logo.jpg"));
			LogoLabel = new JLabel(new ImageIcon(immagine.getScaledInstance(178, 53, 1)));
			LogoLabel.setBounds(10, 11, 178, 53);
			contentPane.add(LogoLabel);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//--------
		
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
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(620, 156, 101, 27);
		now = Calendar.getInstance();
		for(int i=1950;i<now.get(Calendar.YEAR)+1;i++) {
			comboBox.addItem(""+i);
		}
		contentPane.add(comboBox);
		
		label = new JLabel("ANNO STAGIONE");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Century Gothic", Font.BOLD, 20));
		label.setBounds(72, 213, 178, 27);
		contentPane.add(label);
		
		comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(620, 213, 101, 27);
		contentPane.add(comboBox_1);
		
		
		
		centreWindow(this);
		this.setVisible(true);
		this.setResizable(false);
		
	}
	
	//255 22 25
	
	public static void centreWindow(Finestra frame) {
	    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
	    frame.setLocation(x, y);
	}
}
