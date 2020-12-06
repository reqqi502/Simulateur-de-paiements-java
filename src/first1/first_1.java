package first1;
import java.util.Scanner;

public class first_1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("******************* Bonjouuur *******************");
		System.out.println("entré votre nom est votre prenom ? ...");
		String nam = s.nextLine();
		System.out.println("votre nom est votre prénom est :" + nam);
		System.out.println("entré le nombre d'heur qui tu as travaillé ?");
		int heure = s.nextInt();
		if(heure<=60) {
			System.out.println("entrer le tarif");
			double tarif=s.nextInt();
			if(heure>=40) {
				double tarifExtra=tarif+tarif*0.5;
				System.out.println(" votre indemnisation est : "+tarifExtra+"MAD");
			}
		}
		else if(heure>60){
			System.out.println(" informations erronés!!");
		}
			  
		}
	
		}
 
 

