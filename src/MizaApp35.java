// Avtor: Maja Pesrl
// uvozimo paket za delo s pripomočki
// vključimo paket za delo s tabelami
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MizaApp35 extends JFrame implements ActionListener {
	
	private JTextField v1, v2, v3, v4, v5; 
	private MizaModelTable modelTabele;
	
	
	
	// deklariramo konstruzktor
	public MizaApp35() {
		// glavno okno prgrama
		JFrame okno = new JFrame("Miza");
		
		// določimo lastnsoti
		okno.setSize(1400, 400);
		okno.setVisible(true);
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// površina z elementi
		JPanel povrsina = new JPanel(new BorderLayout());
		
		// dodamo površino na okno
		okno.add(povrsina);
		
		// površina na vrhu
		JPanel povrsinaVrh = new JPanel();
		
		// dodamo površino na vrhu
		povrsina.add(povrsinaVrh, BorderLayout.NORTH);
		
		// napis inicializiramo lastnosti objekta
		// besedilo dodamo na površino/napis
		JLabel napis = new JLabel("Povrsina:");
		povrsinaVrh.add(napis);
		v1 = new JTextField("", 16);
		povrsinaVrh.add(v1);
		JLabel napis2 = new JLabel("Visina:");
		povrsinaVrh.add(napis2);
		v2 = new JTextField("", 16);
		povrsinaVrh.add(v2);		
		JLabel napis3 = new JLabel("Teza:");
		povrsinaVrh.add(napis3);
		v3 = new JTextField("", 16);
		povrsinaVrh.add(v3);
		JLabel napis4 = new JLabel("Vrsta:");
		povrsinaVrh.add(napis4);
		v4 = new JTextField("", 16);
		povrsinaVrh.add(v4);
		JLabel napis5 = new JLabel("Uporaba:");
		povrsinaVrh.add(napis5);
		v5 = new JTextField("", 16);
		povrsinaVrh.add(v5);
		
		// dodamo gumb 
		JButton gumb = new JButton("Dodaj mizo!");
		// gumbu doadamo poslušalec dogodkov
		gumb.addActionListener(this);		
		// gumb dodamo na zgornjo površino
		povrsinaVrh.add(gumb);				
	
		// dodamo model tabele
		modelTabele = new MizaModelTable();		
		// dodamo tabelo z modelom
		JTable tabela = new JTable(modelTabele);
		povrsina.add(tabela, BorderLayout.CENTER);		
		
		okno.invalidate();
		okno.validate();
		okno.repaint();
	}
	
	public void actionPerformed(ActionEvent e) {
		int povrsina = Integer.parseInt(v1.getText());
		int visina = Integer.parseInt(v2.getText());
		int teza = Integer.parseInt(v3.getText());
		String vrsta = v4.getText();
		String uporaba = v5.getText();
		Miza m = new Miza(povrsina, visina, teza, vrsta);
		m.setUporaba(uporaba);
		System.out.println("Uporaba mize: " + m.getUporaba());
		modelTabele.dodajMizo(m);		
	}
	
	public static void main(String[] args) {
		new MizaApp35();
	}
	
}

