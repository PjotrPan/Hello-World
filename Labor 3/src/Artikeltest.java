public class Artikeltest {

	public static void main(String[] args) {

		Artikel eins = new Artikel("Hammer", 1, 3, 14.99);
		Artikel zwei = new Artikel("Bohrmaschine", 2, 5, 99.99);
		Artikel drei = new Artikel("Schraubenzieher", 3, 20, 9.99);
		Artikel vier = new Artikel("Säge", 4, 2, 199.99);
		Artikel fünf = new Artikel("Feile", 5, 10, 25);

		System.out.println(eins.getName() + ", mit der Artikelnummer: " + eins.getArtikelnummer());
		System.out.println("Anzahl: " + eins.getAnzahl() + ", zum Preis von je: " + eins.getPreis());
		System.out.println("Gesamtwert des Artikels: " + eins.getTotalValue());
		System.out.println(" ");
		
		System.out.println(zwei.getName() + ", mit der Artikelnummer: " + zwei.getArtikelnummer());
		System.out.println("Anzahl: " + zwei.getAnzahl() + ", zum Preis von je: " + zwei.getPreis());
		System.out.println("Gesamtwert des Artikels: " + zwei.getTotalValue());
		System.out.println(" ");
		
	}

}
