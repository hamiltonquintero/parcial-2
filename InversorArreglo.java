package inversorarreglo;

import java.util.Scanner;

public class InversorArreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arreglo = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = sc.nextLine();
        }

        System.out.println("Arreglo original:");
        mostrarArreglo(arreglo);

        invertirArreglo(arreglo);

        System.out.println("Arreglo invertido:");
        mostrarArreglo(arreglo);
    }

    public static void invertirArreglo(String[] arr) {
        int inicio = 0;
        int fin = arr.length - 1;
        while (inicio < fin) {
            String temp = arr[inicio];
            arr[inicio] = arr[fin];
            arr[fin] = temp;
            inicio++;
            fin--;
        }
    }

    public static void mostrarArreglo(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}