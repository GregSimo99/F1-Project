package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class resultsTableWind extends JFrame {

	private DefaultTableModel modDrivers;
	private DefaultTableModel modConstr;
	
	private JPanel contentPane;
	private JTable table;
	private JLabel LogoLabel;
	private JLabel LogoRight;
	private JLabel LogoUnder;
	private JLabel LogoUpper;
	private JLabel LogoLeft;
	private JLabel lblAnno;

	public resultsTableWind() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(252,252,255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(61, 119, 661, 335);
		contentPane.add(scrollPane);
		
		table = new JTable();
		modDrivers=new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Pos", "Pilota", "Costruttore", "Nazionalità", "Punti", "Vitorie"
				}
			);
		modConstr=new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Pos", "Costruttore", "Nazionalità", "Punti", "Vitorie"
				}
			);
		table.setModel(modDrivers);
		scrollPane.setViewportView(table);	
		
		
		
		
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
	}

	public JTable getTable() {
		return table;
	}
	
	public void impostaColonne() {
		table.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
		table.getColumnModel().getColumn(0).setPreferredWidth(31);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(2).setPreferredWidth(150);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.getColumnModel().getColumn(4).setPreferredWidth(90);
		table.getColumnModel().getColumn(5).setPreferredWidth(90);
	}
	
}
