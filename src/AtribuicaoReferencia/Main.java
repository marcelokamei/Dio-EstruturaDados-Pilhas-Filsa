package AtribuicaoReferencia;

public class Main {
    public static void main(String[] args) {

        int A = 1;
        int B = A;
        System.out.println("A = " + A + " B = " + B);
        A = 2;
        System.out.println("A = " + A + " B = " + B);

        Objeto objetoA = new Objeto(1);
        Objeto objetoB = objetoA;
        System.out.println("Objeto A = " + objetoA + " Objeto B = " + objetoB);
        objetoA.setNum(4);
        System.out.println("Objeto A = " + objetoA + " Objeto B = " + objetoB);
    }
}
