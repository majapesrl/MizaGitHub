// Avtor: Maja Pesrl

// vključimo paket za delo s tabelami
import javax.swing.table.*;

// uvozimo paket za delo s pripomočki
import java.util.*;

// razred ki razširja TableModel
public class MizaModelTable extends DefaultTableModel {
	
	// Seznam miz
	private ArrayList<Miza> miza;
	
	// Konstruktor
	public MizaModelTable() {
		super();	
		
		// inicializiramo seznam miz
		miza = new ArrayList<Miza>();
		
		// dodamo stolpce v tabelo
		addColumn("Povrsina");
		addColumn("Visina");
		addColumn("Teza");
		addColumn("Vrsta");
	}
	
	// metoda za dodajanje vrstic
	public void dodajMizo(Miza m) {
		
		// doda mizo na seznam
		miza.add(m);	
		
		// pripravi vrstico za vnos v tabelo
		Object[] vrstica = new Object[] {m.getPovrsina(), m.getVisina(), m.getTeza(), m.getVrsta()};
		
		// doda vrednosti v tabelo
		addRow(vrstica);
	}
	
	
}