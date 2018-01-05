//import java.util.Scanner;

public class Shoptest {

	public static void main(String[] args) {

		Shop shop = new Shop("Supermarkt", 2);
		
		shop.neuerArtikel(new Artikel("Hammer", 1, 3, 14.99));
		shop.neuerArtikel(new Artikel("Bohrmaschine", 2, 3, 14.99));


		shop.verkaufeArtikel("Hammer", 2);
		shop.auffuellenArtikel("Hammer", 9);
		shop.druckeInventar(2, 10, "Hammer");
		
	}
}
