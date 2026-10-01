package Cwiczenia00;

public class Substractor {
    public int substract(int a, int b) {
        int c = a - b;

        if (c < 0) {
            System.out.print("Liczba jest ujemna, spróbuj ponownie. Err: ");
            return -1;
        } else {
            System.out.print("Twój wynik to:  ");
            return c;
        }
    }
}
