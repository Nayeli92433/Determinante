import java.util.Scanner;

public class EntradaMatriz {
    int c1, c2;
    int matriz[][] = new int[2][2];
    ProcesoOperaciones procesoOperaciones= new ProcesoOperaciones();
    Scanner scanner = new Scanner(System.in);
    public void pedirValores() {
        System.out.println("-------------------------------------------");
        System.out.println("       INGRESE LOS VALORES DE LA MATRIZ   ");
        System.out.println("-------------------------------------------");
        System.out.println("Ingrese valores para las ecuaciones ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int valor = scanner.nextInt();
                matriz[i][j] = valor;
            }
        }
        System.out.println("Ingrese valores para las c1 ");
        c1=scanner.nextInt();
        System.out.println("Ingrese valores para las c2 ");
        c2=scanner.nextInt();
        procesoOperaciones.operacion(matriz, c1, c2);
    }
}

