public class ProcesoOperaciones {
    int c1;
    int c2;
    ImprimirResusltado imprimirResusltado= new ImprimirResusltado();
    public void operacion (int matriz[][], int c1, int c2){

        System.out.println("LA MATRIZ ES :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println(matriz[i][j]+ "    "+ matriz[i][j+1]);
            }
        }
        int valorX= (c1* matriz[1][1])-(c2*matriz[0][1]);
        int valorX1= (matriz[0][0]*matriz[1][1])-(matriz[1][0]*matriz[0][1]);

        int valorY=(matriz[0][0]*c2)-(matriz[1][0]*c1);
        int valorY1=(matriz[0][0]*matriz[1][1]-matriz[1][0]*matriz[0][1]);

        int resultadoX= valorX/valorX1;
        int resultadoY= valorY/valorY1;
        imprimirResusltado.resultado(resultadoX, resultadoY);


    }
}
