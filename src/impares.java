import java.util.Scanner;
public class impares {

    public static void main(String[] args) {

        Scanner entrada  = new Scanner(System.in);

        int num;

        System.out.println("Escriba un número : ");
        num = entrada.nextInt();

        if (num <= 0) {
            System.out.println(" ingresar un número .");
        } else {

            int i = 1;
            System.out.println("Números impares entre 0 y " + num + ":");

            while (i <= num) {
                System.out.println(i);
                i += 2;
            }
        }
        entrada.close();
    }

}
