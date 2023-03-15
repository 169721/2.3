//suma a^b+b^a int potega 1= (int) Math.pow(a,b);
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int a, b, suma;
    Scanner sc = new Scanner(System.in);
    System.out.println("podaj a:");
    a=sc.nextInt();
    System.out.println("podaj b:");
    b=sc.nextInt();
    int potega1= (int) Math.pow(a,b);
    int potega2 = (int) Math.pow(b,a); 
    suma = potega1 + potega2 ;
    System.out.println(+suma);
  }
}