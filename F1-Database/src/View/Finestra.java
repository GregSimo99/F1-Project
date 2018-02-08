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

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Finestra extends JFrame {

	private JPanel contentPane;
	private JLabel logoLabel;

	public Finestra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		logoLabel = new JLabel("New label");
		logoLabel.setBounds(50, 10, 50, 50);
		contentPane.add(logoLabel);
		BufferedImage icon = new Bu("imgDir/Formula_1_2017_logo.jpg");
		logoLabel.setIcon(icon.);
		centreWindow(this);
		this.setVisible(true);
		
	}
	
	public static void centreWindow(Finestra frame) {
	    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
	    frame.setLocation(x, y);
	}
}
