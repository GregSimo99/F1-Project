package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;

import com.ergast.mrd._1.*;

import Model.*;
import Model.Gestione;
import View.Finestra;
import View.Finestra2;

public class Controller implements ActionListener{
	private Finestra f;
	private Finestra2 f2;
	private Gestione g;

	public Controller(Finestra f, Finestra2 f2, Gestione g) {
		this.f = f;
		this.f2=f2;
		this.g=g;
	
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
					xmlFile = new URL("https://ergast.com/api/f1/2017/2/driverStandings");
					JAXBContext jaxbContext = JAXBContext.newInstance(MRDataType.class);
					Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
					JAXBElement rootElement = (JAXBElement) jaxbUnmarshaller.unmarshal(xmlFile);
					MRDataType rootDB = (MRDataType) rootElement.getValue();
					

					
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		
		
	}
}
