
public class Artikel {

	private String name;
	private int artikelnummer;
	private int anzahl;
	private double preis;

	public Artikel(String name, int artikelnummer, int anzahl, double preis) {
		this.name = name;
		this.artikelnummer = artikelnummer;
		this.anzahl = anzahl;
		this.preis = preis;
	}

	public String getName() {
		return name;
	}

	public int getArtikelnummer() {
		return artikelnummer;
	}

	public int getAnzahl() {
		return anzahl;
	}

	public double getPreis() {
		return preis;
	}

	public double getTotalValue() {
		return anzahl * preis;
	}
}
