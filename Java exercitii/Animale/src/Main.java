import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class Main {

	public static void main(String[] args) {
		
	List<Animal> listaAnimale = new ArrayList<Animal>();
	Animal pisi = new Animal();
	pisi.nume="ham";
	pisi.rasa="CB";
	pisi.hrana="carnivor";
	listaAnimale.add(pisi);
	
	Animal catel = new Animal();
	catel.nume = "dog";
	catel.hrana = "carnivor";
	listaAnimale.add(catel);
	
	Animal porc = new Animal();
	porc.nume = "pig";
	porc.hrana = "omnivor";
	listaAnimale.add(porc); 
	
	boolean esteCarnivor=false;
	int nrAnimale=listaAnimale.size();
	Random randomNumber=new Random();
	int nrAlesAleatoriu = randomNumber.nextInt(nrAnimale);
	
	Animal animalAles=listaAnimale.get(nrAlesAleatoriu);
	System.out.println("Animal Ales: " + animalAles.nume + "  " + animalAles.rasa);
	
/*	for (Animal animal : listaAnimale) {
		if (animal.hrana == "Carnivor") {
			esteCarnivor=true;
			System.out.println("Da, acest animal este carnivor: " + animal.nume + "  " + animal.rasa);
			
		}
	}
	if (esteCarnivor == false) {
		System.out.println("Faild => in sistem nu este nici un animal carnivor");

	}*/

	}
	
	}


