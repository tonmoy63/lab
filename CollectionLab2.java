package Lab9;
import java.util.HashSet;
import java.util.Iterator;
public class CollectionLab2 {
    HashSet<String> H1 = new HashSet<>();
	public HashSet<String> saveCountryNames(String CountryName) {
		H1.add(CountryName);
		return H1;
	}
	public String getCountry(String CountryName) {
		Iterator<String> it = H1.iterator();
		
		while (it.hasNext()) {
			if (it.next().equals(CountryName))
				return CountryName;
		}	
		return null;
	}

public static void main(String[] args) {
	CollectionLab2 countries = new CollectionLab2();//creatin
	countries.saveCountryNames("India");
	countries.saveCountryNames("USA");
	System.out.println("India: " + countries.getCountry("India"));
	System.out.println("Japan: " + countries.getCountry("Japan"));		
}

}