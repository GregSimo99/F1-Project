package Main;

import Control.Controller;
import Model.Gestione;
import View.Finestra;
import View.Finestra2;

public class Main {

	public static void main(String[] args) {
		Finestra f=new Finestra();
		f.setVisible(true);
		Finestra2 f2=new Finestra2();
		f2.setVisible(false);
		Controller c=new Controller(f,f2);
		
	
	}

}
