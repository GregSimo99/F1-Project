package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;


import Model.Città;
import Model.Gestione;
import View.Finestra;
import View.Finestra2;

public class Controller implements ActionListener{
	private Finestra f;
	private Finestra2 f2;
	private Gestione g;
	private Città c;

	public Controller(Finestra f, Finestra2 f2, Gestione g) {
		this.f = f;
		this.f2=f2;
		this.g=g;
		g.aggiornaCombobox();
		f.getBtnVai().addActionListener(this);
		f2.getBtnAggiorna().addActionListener(this);
		f2.getBtnCambiaCitt().addActionListener(this);
		f2.getBtnOk().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource()==f.getBtnVai()){
				try {
					URL xmlFile;
					if (!f.getTextField().getText().isEmpty()) {
						xmlFile = new URL("http://api.openweathermap.org/data/2.5/weather?q=" + f.getTextField().getText() + "&mode=xml&appid=bcd53aa523a9a8fb0d93116f52dddc98");
					}
					else {
						xmlFile = new URL("http://api.openweathermap.org/data/2.5/weather?q=" + f.getComboBox().getSelectedItem().toString() + "&mode=xml&appid=bcd53aa523a9a8fb0d93116f52dddc98");
						c= new Città(f.getComboBox().getSelectedItem().toString());
					}
					/*JAXBContext jaxbContext = JAXBContext.newInstance(Current.class);
					Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
					Current current = (Current) jaxbUnmarshaller.unmarshal(xmlFile);*/
					
					if (!f.getTextField().getText().isEmpty()) {
						c= new Città(f.getTextField().getText());
					
						g.aggiornaCombobox();
					}
					
					f2.setVisible(true);
					f.setVisible(false);
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(f, "Città non trovata", "ERRORE", 0);
					f.getTextField().setText("");
				}
		}
		
		
	}
}
