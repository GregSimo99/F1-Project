package Main;

import Control.Controller;
import Model.Gestione;
import View.StandingWin;
import View.Finestra2;

public class Main {

	public static void main(String[] args) {
		StandingWin f=new StandingWin();
		f.setVisible(true);
		Finestra2 f2=new Finestra2();
		f2.setVisible(false);
		Gestione g=new Gestione(f2);
		Controller c=new Controller(f,f2,g);
		
	
	}

}
