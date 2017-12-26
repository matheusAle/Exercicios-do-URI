
import java.util.Scanner;
public class ex1049 {
	static String filo;
	static String classe;
	static String familia;
	static String especime;

	static String reinoAnimale (){
		switch(filo){
			case "vertebrado": 
				switch(classe){
					case "ave":
						switch(familia){
							case "carnivoro":
								return "aguia"; 
							case "onivoro":
								return "pomba";
						}
					case "mamifero":
						switch(familia){
							case "onivoro":
								return "homem";
							case "herbivoro":
								return "vaca";
						} 
				}
			case "invertebrado":
				switch (classe){
					case "inseto":
						switch (familia){
							case "hematofago":
								return "pulga";
							case "herbivoro":
								return "lagarta";
						}
					case "anelideo":
						switch (familia){
							case "hematofago":
								return "sanguessuga";
							case "onivoro":
								return "minhoca";
						}
				}
		}
		return "";
	}

	public static void main (String []args){
		
		Scanner entrada = new Scanner(System.in);
		
		filo = entrada.nextLine();
		classe = entrada.nextLine();
		familia = entrada.nextLine();

		System.out.printf("%s\n", especime = reinoAnimale());

	}
}