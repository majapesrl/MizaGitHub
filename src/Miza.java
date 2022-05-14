//Avtor: Maja Pesrl

// deklariramo javni razred Miza
public class Miza implements Uporaba {
	
	// Deklariramo lastnosti lastnosti
	private int povrsina; // površina v m2
	private int visina; // v cm
	private int teza; // teža v kg
	private String vrsta; // vrsta: jedilna, pisarniška, delovna, itd.
	
	private String uporaba = "neznano";
	
	// Konstruktor
	public Miza(int povrsina, int visina, int teza, String vrsta) {
		
		// inicializiramo lastnosti
		this.povrsina = povrsina;
		this.visina = visina;
		this.teza = teza;
		this.vrsta = vrsta;
	}
	// kliče podrazred uporaba
	@Override // implementira metodo iz podrazreda
	public String getUporaba() {
		return uporaba;
	}
	// kliče podrazred uporaba
	@Override // implementira metodo iz podrazreda
	public void setUporaba(String uporaba) {
		this.uporaba = uporaba;
	}
	
	public boolean imaPredalnike(boolean imaPredalnike) throws Exception {
		if(imaPredalnike) {
			if(povrsina > 1) throw new Exception("Miza ni dovolj velika!");
			return true;
		}else {
			throw new Exception("Nima predalov");
		}		
	}
	// Deklariramo metodo za ugotavljanje Velikosti mize
	public boolean jeVelika() {
		if(povrsina >= 2) return true;
		else return false;
	}
	// Deklariramo metodo za ugotavljanje Višine mize
	public boolean jeVisoka() {
		if(visina > 100) return true;
		else return false;
	}
	// Deklariramo metodo za ugotavljanje Teže mize
	public boolean jeTezka() {
		if(teza > 10) return true;
		else return false;
	}
	// Deklariramo metodo za ugotavljanje Površine mize
	public void setPovrsina(int povrsina) {
		this.povrsina = povrsina;
	}
	// inicializiramo določimo višino mize
	public void setVisina(int visina) {
		this.visina = visina;
	}
	// inicializiramo določimo težo mize
	public void setTeza(int teza) {
		this.teza = teza;
	}	
	// inicializiramo določimo vrsto mize
	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}
	// getter izpiše vrne Površino
	public int getPovrsina() {
		return this.povrsina;
	}
	// getter izpiše vrne Višino
	public int getVisina() {
		return this.visina;
	}
	// getter izpiše vrne Težo
	public int getTeza() {
		return this.teza;
	}
	// getter izpiše vrne Vrsto
	public String getVrsta() {
		return this.vrsta;
	}		
	
}