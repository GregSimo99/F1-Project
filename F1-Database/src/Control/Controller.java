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

	public Controller(Finestra f/*, Finestra2 f2, Gestione g*/) {
		this.f = f;
		this.f2=f2;
		this.g=g;
		f.getComboAnno().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==f.getComboAnno()){
			System.out.println("Flag");
			try {
				URL xmlFile;
				xmlFile = new URL("https://ergast.com/api/f1/"+ Integer.parseInt((String)f.getComboAnno().getSelectedItem())+"/circuits");
				JAXBContext jaxbContext = JAXBContext.newInstance(MRDataType.class);
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				JAXBElement rootElement = (JAXBElement) jaxbUnmarshaller.unmarshal(xmlFile);
				MRDataType rootDB = (MRDataType) rootElement.getValue();
				//System.out.println(rootDB.getTotal());
				f.impostaComboRound(rootDB.getTotal().intValue());
			
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		
		
	}
}
