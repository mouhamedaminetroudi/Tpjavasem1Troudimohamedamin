import java.util.Scanner;
public class in_decrementation {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("donner un entier x"); 
        x=sc.nextInt();
        System.out.println("donner un entier y");
        y=sc.nextInt();
        System.out.println("x="+x+"y="+y); /* x=15y=21*/
        x=y++ ;
        System.out.println("x="+x+"y="+y);/* x=21y=22*/
        x=++y ;
        System.out.println("x="+x+"y="+y);/* x=23y=23*/
        y=x--;
        System.out.println("x="+x+"y="+y);/*x=22y=23 */
        y=--x;
        System.out.println("x="+x+"y="+y);/* x=21y=21*/
        
    }
}
