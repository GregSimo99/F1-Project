package Model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JComboBox;

import Control.AppendObjectOutputStream;
import View.Finestra;
import View.Finestra2;

public class Gestione {
	private Finestra finestra;
	
	private File f, fApp;
	
	private FileOutputStream fo;
	private ObjectOutputStream fout;
	
	private FileInputStream fi;
	private ObjectInputStream fin;
	
	public Gestione(Finestra finestra){
		this.finestra=finestra;
		f= new File("Citt�.dat");
	}
	
	public void apertura(){
		if(f.exists()==false){
			try {
				fo=new FileOutputStream(f);
				fout=new ObjectOutputStream(fo);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else{
			try {
				fo=new FileOutputStream(f,true);
				fout=new AppendObjectOutputStream(fo);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void inserisci(Citt� c){
		try {
			fout.writeObject(c);
			fo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void aggiornaCombobox(){
		if(f.exists()){
			finestra.getComboBox().removeAllItems();
			try{
				fi=new FileInputStream(f);
				fin= new ObjectInputStream(fi);
				finestra.getComboBox().addItem("Selezionare citt�");
				while(true){
					try{
						Citt� c=(Citt�)fin.readObject();
						finestra.getComboBox().addItem(c);
					} catch (Exception e){
						break;
					}
				}
				fi.close();
			} catch (Exception e){
				e.printStackTrace();
			}
		}
	}
}