package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
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
import View.StandingWin;
import View.resultsTableWind;

public class Controller implements ActionListener,WindowListener{
	private StandingWin f;
	private resultsTableWind f2;
	private Gestione g;

	public Controller(StandingWin f, resultsTableWind f2, Gestione g) {
		this.f = f;
		this.f2=f2;
		this.g=g;
		f.getComboAnno().addActionListener(this);
		f.getChkbxRound().addActionListener(this);
		f.getBtnSubmit().addActionListener(this);
		f.getComboRound().addActionListener(this);
		f2.addWindowListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==f.getComboAnno() && f.getComboAnno().getSelectedIndex()!=0){
			f.getErr1().setVisible(false);
			f.getErr2().setVisible(false);
			f.getErr3().setVisible(false);
			f.getComboRound().removeAllItems();	
			f.getComboRound().addItem("Seleziona");
			try {
				URL xmlFile;
				xmlFile = new URL("https://ergast.com/api/f1/"+ Integer.parseInt((String)f.getComboAnno().getSelectedItem())+"/circuits");
				JAXBContext jaxbContext = JAXBContext.newInstance(MRDataType.class);
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				JAXBElement rootElement = (JAXBElement) jaxbUnmarshaller.unmarshal(xmlFile);
				MRDataType rootDB = (MRDataType) rootElement.getValue();
				f.impostaComboRound(rootDB.getTotal().intValue());
				f.getChkbxRound().setVisible(true);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		if (e.getSource()==f.getChkbxRound()){
			if(f.getChkbxRound().isSelected())
				f.getComboRound().setVisible(true);
			else 
				f.getComboRound().setVisible(false);
			
		}
		if(e.getSource()==f.getComboRound()) {
			f.getErr1().setVisible(false);
			f.getErr2().setVisible(false);
			f.getErr3().setVisible(false);
		}
			
			
		//PULSANTE SUBMIT
		if (e.getSource()==f.getBtnSubmit()){
			try {
				URL xmlFile;
				if(f.getChkbxRound().isSelected()  && f.getComboAnno().getSelectedIndex()!=0 && f.getComboAnno().getSelectedIndex()!=0 &&  f.getComboRound().getSelectedIndex()!=0 && f.getConstructChkbox().isSelected()==false) { //Round attivi
					xmlFile = new URL("https://ergast.com/api/f1/"+Integer.parseInt((String)f.getComboAnno().getSelectedItem())+f.getRound()+"/driverStandings");
					JAXBContext jaxbContext = JAXBContext.newInstance(MRDataType.class);
					Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
					JAXBElement rootElement = (JAXBElement) jaxbUnmarshaller.unmarshal(xmlFile);
					MRDataType rootDB = (MRDataType) rootElement.getValue();
					f2.getLblSeasonCfr().setText((String)f.getComboAnno().getSelectedItem());
					f2.getLblRoundCfr().setText((String)f.getComboRound().getSelectedItem());
					g.stampaTabella(rootDB,Integer.parseInt((String)f.getComboAnno().getSelectedItem()),f.getRound());
					f2.impostaColonne();
					f2.setVisible(true);
				}
				else {
					if(f.getChkbxRound().isSelected()==false  && f.getComboAnno().getSelectedIndex()!=0 && f.getConstructChkbox().isSelected()==false) { // Round non attivi, costruttori non attivi
						xmlFile = new URL("https://ergast.com/api/f1/"+Integer.parseInt((String)f.getComboAnno().getSelectedItem())+"/driverStandings");
						JAXBContext jaxbContext = JAXBContext.newInstance(MRDataType.class);
						Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
						JAXBElement rootElement = (JAXBElement) jaxbUnmarshaller.unmarshal(xmlFile);
						MRDataType rootDB = (MRDataType) rootElement.getValue();
						f2.getLblSeasonCfr().setText((String)f.getComboAnno().getSelectedItem());
						g.stampaTabella(rootDB,Integer.parseInt((String)f.getComboAnno().getSelectedItem()),f.getRound());						
						f2.impostaColonne();
						f2.setVisible(true);
					}
					else {
						if(f.getChkbxRound().isSelected()==false && f.getConstructChkbox().isSelected() && f.getComboAnno().getSelectedIndex()!=0) {  //Round non attivi, costruttori attivi
							xmlFile = new URL("https://ergast.com/api/f1/"+Integer.parseInt((String)f.getComboAnno().getSelectedItem())+"/constructorStandings");
							JAXBContext jaxbContext = JAXBContext.newInstance(MRDataType.class);
							Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
							JAXBElement rootElement = (JAXBElement) jaxbUnmarshaller.unmarshal(xmlFile);
							MRDataType rootDB = (MRDataType) rootElement.getValue();
							f2.getLblSeasonCfr().setText((String)f.getComboAnno().getSelectedItem());
							g.stampaTabella(rootDB,Integer.parseInt((String)f.getComboAnno().getSelectedItem()),f.getRound());
							f2.setVisible(true);
						}
						else { 
							if(f.getComboAnno().getSelectedIndex()!=0 &&  f.getComboRound().getSelectedIndex()!=0) {
								xmlFile = new URL("https://ergast.com/api/f1/"+Integer.parseInt((String)f.getComboAnno().getSelectedItem())+
										f.getRound()+"/constructorStandings"); //Round attivi, costruttori attivi
								JAXBContext jaxbContext = JAXBContext.newInstance(MRDataType.class);
								Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
								JAXBElement rootElement = (JAXBElement) jaxbUnmarshaller.unmarshal(xmlFile);
								MRDataType rootDB = (MRDataType) rootElement.getValue();
								f2.getLblSeasonCfr().setText((String)f.getComboAnno().getSelectedItem());
								f2.getLblRoundCfr().setText((String)f.getComboRound().getSelectedItem());
								g.stampaTabella(rootDB,Integer.parseInt((String)f.getComboAnno().getSelectedItem()),f.getRound());
								f2.setVisible(true);
							}
							else {
								f.getErr1().setVisible(true);
								f.getErr2().setVisible(true);
								f.getErr3().setVisible(true);
							}
						}
					}
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		
	}

	@Override
	public void windowActivated(WindowEvent e) {

		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		e.getWindow().dispose();
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
