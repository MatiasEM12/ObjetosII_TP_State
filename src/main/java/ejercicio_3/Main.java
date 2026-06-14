package ejercicio_3;

public class Main {

    public static void main(String[] args) {

        Golondrina golondrina = new Golondrina();

        System.out.println(String.valueOf(golondrina.energia())); //45

        golondrina.realizarDeseo(); //estado débil, come 50 gramos

        System.out.println(String.valueOf(golondrina.energia())); //295

        golondrina.comer(85);

        System.out.println(String.valueOf(golondrina.energia())); //720

        golondrina.realizarDeseo(); //estado euforico, realiza un paseo

        System.out.println(String.valueOf(golondrina.energia())); //700

    }
}
