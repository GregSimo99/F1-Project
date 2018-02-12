package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Finestra2 extends JFrame {

	private DefaultTableModel mod;
	private JPanel contentPane;
	private JTable table;

	public Finestra2() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 697, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 40, 661, 335);
		contentPane.add(scrollPane);
		
		table = new JTable();
		mod=new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Pos", "Pilota", "Costruttore", "Nazionalità", "Punti", "Vitorie"
				}
			);
		table.setModel(mod);
		scrollPane.setViewportView(table);
		
	}

	public JTable getTable() {
		return table;
	}
	
	
}
