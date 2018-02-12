package Model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;

import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;

import com.ergast.mrd._1.MRDataType;

import View.StandingWin;
import View.resultsTableWind;

public class Gestione {
	private resultsTableWind f;

	public Gestione(resultsTableWind f) {
		this.f = f;
	}
	
	public void stampaTabella(MRDataType rootDB,Integer anno,String round) {
		int tot=rootDB.getTotal().intValue();
		int temp=tot;
		if(tot>30)
			tot=30;
		DefaultTableModel mod=new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Pos", "Pilota", "Costruttore", "Nazionalità", "Punti", "Vitorie"
				}
			);
		for (int i = 0; i < tot; i++) {
			mod.addRow(new String[] {""+(i+1),
					rootDB.getStandingsTable().getStandingsList().get(0).getDriverStanding().get(i).getDriver().getGivenName()
					+" "+rootDB.getStandingsTable().getStandingsList().get(0).getDriverStanding().get(i).getDriver().getFamilyName(),
					rootDB.getStandingsTable().getStandingsList().get(0).getDriverStanding().get(i).getConstructor().get(0).getName(),
					rootDB.getStandingsTable().getStandingsList().get(0).getDriverStanding().get(i).getDriver().getNationality(),
					""+rootDB.getStandingsTable().getStandingsList().get(0).getDriverStanding().get(i).getPoints(),
					""+rootDB.getStandingsTable().getStandingsList().get(0).getDriverStanding().get(i).getWins()
					});
		}
		if(temp>30) {
			try {
			URL xmlFile;
			xmlFile = new URL("https://ergast.com/api/f1/"+(""+anno)+
					round+"/driverStandings?limit=30&offset=30");
			JAXBContext jaxbContext = JAXBContext.newInstance(MRDataType.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			JAXBElement rootElement = (JAXBElement) jaxbUnmarshaller.unmarshal(xmlFile);
			MRDataType rootDBtemp = (MRDataType) rootElement.getValue();
			System.out.println(rootDBtemp.getStandingsTable().getStandingsList().get(0).getDriverStanding().size());
			for (int i =0; i <  temp-tot; i++) {
				mod.addRow(new String[] {""+(i+31),
						rootDBtemp.getStandingsTable().getStandingsList().get(0).getDriverStanding().get(i).getDriver().getGivenName()
						+" "+rootDBtemp.getStandingsTable().getStandingsList().get(0).getDriverStanding().get(i).getDriver().getFamilyName(),
						rootDBtemp.getStandingsTable().getStandingsList().get(0).getDriverStanding().get(i).getConstructor().get(0).getName(),
						rootDBtemp.getStandingsTable().getStandingsList().get(0).getDriverStanding().get(i).getDriver().getNationality(),
						""+rootDBtemp.getStandingsTable().getStandingsList().get(0).getDriverStanding().get(i).getPoints(),
						""+rootDBtemp.getStandingsTable().getStandingsList().get(0).getDriverStanding().get(i).getWins()
						});
			}
			}catch (Exception e) {
			}
	
		}
		f.getTable().setModel(mod);
		
	}
	
}