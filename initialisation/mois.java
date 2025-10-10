import java.util.Scanner ;
public class mois {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int i,j,x;
        i=Sc.nextInt();
        System.out.println("donner une entier entre 0 et 10");
        while (i>10){
        System.out.println("donner une entier entre 0 et 10");
    }
    for (j=0;j<=10;j++){
        x=i* j;
        System.out.println("donner une entier entre 0 et 10");
        System.out.println("tableau de"+i+"*"+j+"="+x);
    }
    }
    
}
