package net.salesianos.utiles.counter;

public class Counter {
    public static void main(String[] args)throws Exception {
        int contador = 0;
        String texto = args[0];
        char charToCount = args[1].charAt(0);

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i)== charToCount) {
                contador++;
            }
        }

        System.out.println("El numero de " + charToCount + " es " + contador);
    }
}
