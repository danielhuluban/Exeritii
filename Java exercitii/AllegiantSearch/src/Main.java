import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {



	public static void main(String[] args) {
  List<DateIntrare> dateList = new ArrayList<DateIntrare>();
  DateIntrare unu = new DateIntrare();
  unu.type = "Flight Only";
  unu.departureCity = "Belligham";
  unu.destinationCity = "Las Vegas";
  unu.dapartureDate = "03/15/2013";
  unu.returnDate = "03/25/2013";
  unu.adults = "2";
  unu.children = "1";
  unu.car = "Compact Car";
  dateList.add(unu);
  
  DateIntrare doi = new DateIntrare();
  doi.type = "Flight + Hotel";
  doi.departureCity = "Las Vegas";
  doi.destinationCity = "Belligham";
  doi.dapartureDate = "04/15/2013";
  doi.returnDate = "04/30/2013";
  doi.adults = "1";
  doi.children = "3";
  doi.car = "Full Size";
  dateList.add(doi);
  
  DateIntrare trei = new DateIntrare();
  trei.type = "Flight + Hotel + Car";
  trei.departureCity = "Los Angeles";
  trei.destinationCity = "Honolulu";
  trei.dapartureDate = "05/10/2013";
  trei.returnDate = "05/20/2013";
  trei.adults = "2";
  trei.children = "2";
  trei.car = "Full Size";
  dateList.add(trei);
  
  DateIntrare patru = new DateIntrare();
  patru.type = "Flight + Car";
  patru.departureCity = "Bellingham";
  patru.destinationCity = "Maui";
  patru.dapartureDate = "05/14/2013";
  patru.returnDate = "05/24/2013";
  patru.adults = "5";
  patru.children = "4";
  patru.car = "Full Size";
  dateList.add(patru);

    int nrZbor = dateList.size();

	Random randomNumber=new Random();
	int nrAlesAleatoriu = randomNumber.nextInt(nrZbor);

	DateIntrare zborAles = dateList.get(nrAlesAleatoriu); 
	System.out.println("Zborul ales este:" + "  " + zborAles.type + " => " + zborAles.departureCity + " - " + zborAles.destinationCity + " => " 
			 + zborAles.dapartureDate + " - " + zborAles.returnDate + " => " +  "numar adulti: " + zborAles.adults + " => " + "numar children: " + zborAles.children + " => " + "car type: " + zborAles.car);

 }
	
}
	
