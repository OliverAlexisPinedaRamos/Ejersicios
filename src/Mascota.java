import java.util.Scanner;

public class Mascota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] mascotas = new String[10];

        int i = 0;
        while (i < 10) {
            System.out.println("nombre de la mascota " + (i + 1) + ":");
            mascotas[i] = scanner.nextLine();
            i++;
        }

        System.out.println("Nombres de mascotas :");
        i = 0;
        while (i < 10) {
            if (i % 2 == 0) {
                System.out.println(mascotas[i]);
            }
            i++;
        }

        scanner.close();
    }
}
