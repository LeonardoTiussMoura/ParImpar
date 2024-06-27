import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o numerador: ");
    int numerador = sc.nextInt();
    System.out.println("");
    System.out.println("Digite o denominador: ");
    int denominador = sc.nextInt();
    int resto = numerador % denominador;
    if (resto==0) {
      System.out.println("");
      System.out.println("O número é par.");
    } 
    if (resto>1){
      System.out.println("");
      System.out.println("O número é impar.");
    }
    sc.close();
  }
}