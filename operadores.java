import java.util.Scanner;
public class operadores {
    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    System.out.print("Ingresar numero 1");
    int num1=scanner.nextInt();
    System.out.print("Ingresar el numero 2");
    int num2=scanner.nextInt();
    System.out.print("Ingresar el numero 3");
    int num3=scanner.nextInt();

    boolean resultado=(num1>num2) && (num1<num3);

    System.out.println("¿El primer numero es mayor que el segundo y menor que el tercero?"+resultado);
    scanner.close();
    }
}


