package TP_base;
import java.util.Scanner;

public class BasesJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Exercice 1 : 
        System.out.print("Entrez un entier : ");
        int n = sc.nextInt();
        if (n > 0) System.out.println("Positif");
        else if (n < 0) System.out.println("Négatif");
        else System.out.println("Nul");

        // Exercice 2 : 
        System.out.print("Saisissez trois nombres : ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Le plus grand est : " + max);

        // Exercice 3 :
        System.out.print("Table de multiplication de : ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        // Exercice 4 : 
        System.out.print("Calculer la somme jusqu'à N = ");
        int N = sc.nextInt();
        int somme = 0, i = 1;
        while (i <= N) {
            somme += i;
            i++;
        }
        System.out.println("Somme : " + somme);
    
 // Exercice 5 :
    System.out.print("Taille du tableau : ");
    int taille = sc.nextInt();
    int[] tab = new int[taille];
    for (int j = 0; j < taille; j++) {
        System.out.print("Élément " + j + " : ");
        tab[j] = sc.nextInt();
    }

    // Exercice 6 : 
    System.out.print("Nombre à rechercher : ");
    int cherche = sc.nextInt();
    for (int j = 0; j < tab.length; j++) {
        if (tab[j] == cherche) {
            System.out.println("Trouvé à l'indice : " + j);
        }
    }

    // Exercice 7 : 
    int grand = tab[0];
    for (int val : tab) {
        if (val > grand) grand = val;
    }
    System.out.println("Le plus grand élément est : " + grand);

 // Exercice 8 & 9 :
    int[][] matrice = new int[3][3];
    int sommeMatrice = 0;
    for (int l = 0; l < 3; l++) {
        for (int col = 0; col < 3; col++) {
            System.out.print("Matrice["+l+"]["+col+"] : ");
            matrice[l][col] = sc.nextInt();
            sommeMatrice += matrice[l][col];
        }
    }
    System.out.println("Somme totale de la matrice : " + sommeMatrice);

    // Exercice 10 : 
    int[][] transposee = new int[3][3];
    for (int l = 0; l < 3; l++) {
        for (int col = 0; col < 3; col++) {
            transposee[col][l] = matrice[l][col];
        }
    }
    System.out.print("Entrez une chaîne : ");
    sc.nextLine(); 
    String s = sc.nextLine();

    // Exercice 11 :
    System.out.println("Longueur : " + s.length());

    // Exercice 12 : 
    int voyelles = 0;
    String v = "aeiouyAEIOUY";
    for (char cChar : s.toCharArray()) {
        if (v.indexOf(cChar) != -1) voyelles++;
    }
    System.out.println("Nombre de voyelles : " + voyelles);

    // Exercice 13 : 
    String inverse = new StringBuilder(s).reverse().toString();
    System.out.println("Chaîne inversée : " + inverse);

    // Exercice 14 : 
    if (s.equalsIgnoreCase(inverse)) {
        System.out.println("C'est un palindrome !");
    } else {
        System.out.println("Ce n'est pas un palindrome.");
    }
    }
}