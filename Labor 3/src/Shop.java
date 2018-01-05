public class Shop {

	private String name;
	private int artikelnummer;
	private int anzahl;
	private double preis;
	private Artikel[] lager;
	private String shopname;

	
	
	public Shop(String shopname, int lagergroesse) {
		this.shopname = shopname;
		this.lager = new Artikel[lagergroesse];
	}
	
	public String toString(){
		return shopname +  name;
	}
	public int getArtikelnummer(){
		return artikelnummer;
	}
	
	public String getName(){
		return name;
	}
	
	public String getShopname(){
		return shopname;
	}
	
	public int getLagergroesse(){
		return lager.length;		
	}

	public void neuerArtikel(Artikel artikel) {
		for (int i = 0; i < lager.length; i++) {
			if (lager[i] == null) {
				lager[i] = artikel;
				return;
			} else
				System.out.println("Lager voll");
		}
	}

	public void verkaufeArtikel(String name, int anzahl) {
		
		for (int i = 0; i < lager.length; i++) {
			
			System.out.println(lager.length);
			System.out.println(name);
			System.out.println(lager[i]);

			if (lager[i].equals(name)) {
				if (anzahl <= lager[i].getAnzahl()) {
					anzahl -= anzahl;
					
				} else
					System.out.println("Nicht so viele Artikel vorrätig");
				return;
			} else
				System.out.println("Artikel existiert nicht");
		}
					
	}

	public void auffuellenArtikel(String name, int anzahl) {
		for (int i = 0; i < lager.length; i++) {
		if (name == lager[i].getName()) {
			anzahl += anzahl;
		} else
			System.out.println("Der aufzufuellende Artikel existiert nicht");
	}}

	public String druckeInventar(int anzahl, double preis, String artikelname) {
		return "Artikel: " + artikelname + "Anzahl: " + anzahl + "Preis: " + preis;
	}
}
