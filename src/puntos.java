import java.util.Scanner;

public class puntos {    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print(" puntos del cliente: ");
    int puntos = scanner.nextInt();

    String tipoCliente;
    if (puntos < 1000) {
        tipoCliente = "Bronce";
    } else if (puntos >= 1000 && puntos <= 3000) {
        tipoCliente = "Plata";
    } else {
        tipoCliente = "Oro";
    }

    System.out.println(" cliente es de tipo " + tipoCliente);

    scanner.close();
}
}
