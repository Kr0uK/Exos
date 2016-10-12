package exos;

import java.util.Scanner;

public class Exos {
	
	
	

	static Scanner sc = new Scanner(System.in);
	int i = 0;
	static String exo = "";

	private static void choixExo() {
		try {
			System.out.println("Veuillez entrer le num�ro de l'exercice :");
			exo = sc.nextLine();

			switch (exo) {
			case "1":
				exercice1();
				break;
			case "2":
				exercice2();
				break;
			case "3":
				exercice3();
				break;
			case "4":
				exercice4();
				break;
			case "5":
				exercice5();
				break;
			case "6":
				exercice6();
				break;
			case "7":
				exercice7();
				break;
			case "8":
				exercice8();
				break;
			case "9":
				exercice9();
				break;
			case "10":
				exercice10();
				break;
			case "11":
				exercice11();
				break;
			case "quitter":
			case "Q":
			case "exit":
				System.exit(0);

				choixExo();
				break;

			default:
				System.out.println("Veuillez rentrer un num�ro valide (1-11)");

				choixExo();
				break;
			}
		} finally {

			if (sc != null) {
				sc.close();

			}

		}
	}

	public static void main(String[] args) {
		choixExo();
	}
	/*
	 * 11. Triangle de Pascal
	 * 
	 */

	private static void exercice11() {

		try {
			choixExo();
		} finally {

			if (sc != null) {
				sc.close();

			}

		}
	}
	/*
	 * 10. Ecrivez un algorithme qui demande un nombre entier � l�utilisateur.
	 * L�ordinateur affiche ensuite le message "Ce nombre est pair" ou
	 * "Ce nombre est impair" selon le cas.
	 * 
	 */

	private static void exercice10() {
		try {
			choixExo();
		} finally {

			if (sc != null) {
				sc.close();

			}

		}
	}
	/*
	 * 9. Une am�lioration (relative) du principe pr�c�dent consiste � op�rer
	 * avec un d�calage non de 1, mais d�un nombre quelconque de lettres. Ainsi,
	 * par exemple, si l�on choisit un d�calage de 12, les A deviennent des M,
	 * les B des N, etc. R�alisez un algorithme sur le m�me principe que le
	 * pr�c�dent, mais qui demande en plus quel est le d�calage � utiliser.
	 * Votre sens proverbial de l'�l�gance vous interdira bien s�r une s�rie de
	 * vingt-six "Si...Alors"
	 * 
	 */

	private static void exercice9() {
		try {
			choixExo();
		} finally {

			if (sc != null) {
				sc.close();

			}

		}
	}
	/*
	 * 8. Un des plus anciens syst�mes de cryptographie (ais�ment d�chiffrable)
	 * consiste � d�caler les lettres d�un message pour le rendre illisible.
	 * Ainsi, les A deviennent des B, les B des C, etc. Ecrivez un algorithme
	 * qui demande une phrase � l�utilisateur et qui la code selon ce principe.
	 * Comme dans le cas pr�c�dent, le codage doit s�effectuer au niveau de la
	 * variable stockant la phrase, et pas seulement � l��cran.
	 * 
	 */

	private static void exercice8() {
		try {
			choixExo();
		} finally {

			if (sc != null) {
				sc.close();

			}

		}
	}
	/*
	 * 7. Ecrivez un algorithme qui demande une phrase � l�utilisateur. Celui-ci
	 * entrera ensuite le rang d�un caract�re � supprimer, et la nouvelle phrase
	 * doit �tre affich�e (on doit r�ellement supprimer le caract�re dans la
	 * variable qui stocke la phrase, et pas uniquement � l��cran).
	 * 
	 */

	private static void exercice7() {
		try {
			choixExo();
		} finally {

			if (sc != null) {
				sc.close();

			}

		}
	}
	/*
	 * 6. Ecrivez un algorithme qui demande une phrase � l�utilisateur et qui
	 * affiche � l��cran le nombre de voyelles contenues dans cette phrase.On
	 * pourra �crire deux solutions. La premi�re d�ploie une condition compos�e
	 * bien fastidieuse. La deuxi�me, en utilisant la fonction Trouve, all�ge
	 * consid�rablement l'algorithme.
	 * 
	 */

	private static void exercice6() {
		try {

			String str;
			int a = 0;
			int nbVoyelles = 0;
			System.out.println("Veuillez entrer une phrase");
			str = sc.nextLine();
			System.out.println("Veuillez choisir la m�thode de fonctionnement du programme (1 ou 2)");
			a = Integer.parseInt(sc.nextLine());
			switch (a){
			case 1 : 
				nbVoyelles = exo6meth1(str);
				break;
			case 2 :
				nbVoyelles =exo6meth2(str);
				break;
			default :
				System.out.println("Veuillez entrer une r�ponse valide");
				exercice6();
		
			}
			System.out.println("Il y a "+ nbVoyelles + " voyelles dans la phrase que vous avez tap�e.");
						
			choixExo();
		} finally {

			if (sc != null) {
				sc.close();

			}

		}
	}
	private static int exo6meth2(String phrase) {
	
		  
	int nbVoyelles;
	
	return nbVoyelles;	
	}

	private static int exo6meth1(String phrase) {
		
	
	int nbVoyelles;
	
	
	return nbVoyelles;
	}

	/*
	 * 5. Ecrivez un algorithme qui demande une phrase � l�utilisateur et qui
	 * affiche � l��cran le nombre de mots de cette phrase. On suppose que les
	 * mots ne sont s�par�s que par des espaces (et c'est d�j� un petit peu
	 * moins b�te)
	 * 
	 */

	private static void exercice5() {
		try {
			String str;

			int a = 0;
			System.out.println("Veuillez entrer une phrase");
			str = sc.nextLine();
			String[] mots = str.split("\\s");
			a = mots.length;
			System.out.println("Votre texte a une longueur de " + a + " mots");
			choixExo();
		} finally {

			if (sc != null) {
				sc.close();

			}

		}
	}
	/*
	 * 4. Ecrivez un algorithme qui demande un mot � l�utilisateur et qui
	 * affiche � l��cran le nombre de lettres de ce mot (c'est vraiment tout
	 * b�te).
	 * 
	 */

	private static void exercice4() {
		try {
			String str;
			int a;
			System.out.println("Veuillez entrer un mot");
			str = sc.nextLine().trim();
			a = str.length();
			System.out.println("Le mot que vous avez entr� fait " + a + " caract�res");

			choixExo();
		} finally {

			if (sc != null) {
				sc.close();

			}

		}
	}
	/*
	 * 3. Ecrire un algorithme qui demande un nombre de d�epart, et qui calcule
	 * sa factorielle. NB : la factorielle de 8, not�ee 8 !, vaut 1 x 2 x 3 x 4
	 * x 5 x 6 x 7 x 8
	 * 
	 */

	private static void exercice3() {
		try {
			long somme = 1;
			long x = 1;
			System.out.println("Veuillez entrer un nombre");
			x = Integer.parseInt(sc.nextLine());
			for (int i = 1; i <= x; i++) {
				somme = somme * i;
			}
			System.out.println("La factorielle du nombre choisi est " + somme);

			choixExo();
		} finally {

			if (sc != null) {
				sc.close();

			}

		}
	}

	/*
	 * 2. Ecrire un algorithme qui demande un nombre de d�part, et qui calcule
	 * la somme des entiers jusqu�`a ce nombre. Par exemple, si l�on entre 5, le
	 * programme doit calculer : 1 + 2 + 3 + 4 + 5 = 15 NB : on souhaite
	 * afficher uniquement le r�sultat, pas la d�composition du calcul.
	 * 
	 */
	private static void exercice2() {
		try {
			int somme = 0;
			int x = 0;
			System.out.println("Veuillez entrer un nombre");
			x = Integer.parseInt(sc.nextLine());
			for (int i = 0; i <= x; i++) {
				somme += i;

			}
			System.out.println("Le r�sultat de la somme des entiers jusqu'au nombre choisi est " + somme);
			choixExo();
		} finally {

			if (sc != null) {
				sc.close();

			}

		}
	}
	/*
	 * 1. Ecrire un programme qui �change la valeur de deux variables. Exemple,
	 * si a = 2 et b = 5, le programme donnera a = 5 et b = 2. Idem pour 3, puis
	 * g�n�ralis� � n
	 * 
	 */

	private static void exercice1() {
		try {
			int a, b;
			int temp = 0;
			System.out.println("Entrez un premier nombre A");
			a = Integer.parseInt(sc.nextLine());
			System.out.println("Entrez un second nombre B");
			b = Integer.parseInt(sc.nextLine());
			temp = a;
			a = b;
			b = temp;
			System.out.println("Le chiffre a est " + a + " et le chiffre b est " + b);
			choixExo();

		} finally {

			if (sc != null) {
				sc.close();

			}

		}
	}

}
