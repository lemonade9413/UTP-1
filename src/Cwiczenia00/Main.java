package Cwiczenia00;//TODO: musimy dodać brakujące klasy!

// OK, ja dodam 'Cwiczenia00.Adder', a s35743 doda 'Cwiczenia00.Substractor'.

public class Main {
    public static void main(String[] args){
        Adder adder = new Adder();
        System.out.println(adder.add(1, 2));

        Substractor substractor = new Substractor();

        System.out.println(substractor.substract(6, 7));
    }
}
