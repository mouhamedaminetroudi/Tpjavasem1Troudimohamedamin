import java.util.Scanner;

public class pair {

    public static int[] creerTpair(int[] t){
        int count = 0;

        
        for(int i = 0; i < t.length; i++){
            if(t[i] % 2 == 0){
                count++;
            }
        }

        int[] tpair = new int[count];
        int j = 0;

        
        for(int i = 0; i < t.length; i++){
            if(t[i] % 2 == 0){
                tpair[j] = t[i];
                j++;
            }
        }

        return tpair;
    }

    public static int[] creerTimpaire(int[] t){
        int count = 0;

        
        for(int i = 0; i < t.length; i++){
            if(t[i] % 2 != 0){
                count++;
            }
        }

        int[] timpair = new int[count];
        int j = 0;

        
        for(int i = 0; i < t.length; i++){
            if(t[i] % 2 != 0){
                timpair[j] = t[i];
                j++;
            }
        }

        return timpair;
    }

   
    public static void afficher(int[] t){
        System.out.print("[ ");
        for(int i = 0; i < t.length; i++){
            System.out.print(t[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("saisir taille de tableau");
        int n = sc.nextInt();

        while(n <= 0){
            System.out.println("saisir taille de tableau");
            n = sc.nextInt();
        }

        int[] tab1 = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("donner entier de case");
            tab1[i] = sc.nextInt();
        }

        int[] tpair = creerTpair(tab1);
        int[] timpair = creerTimpaire(tab1);

        System.out.println("Tableau des pairs : ");
        afficher(tpair);

        System.out.println("Tableau des impairs : ");
        afficher(timpair);
    }
}
