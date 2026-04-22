public class Zmienne {
    public static void main(StringDemo[] args) {
        int numer;
        numer = 13;
        double numer2 = 17.7;
        System.out.println("Moja zmienna: " + numer + ", " + numer2);

        int numer3;
        double numer4;

        numer4 = numer;
        numer3 = (int)numer2;
        System.out.println("n3: " + numer3);

        char znak = '#';

        String napis = "Jakiś \"piękny\" \t napis";
        napis += ".";

        System.out.println("Mój napis: " + napis);
        System.out.print("Mój napis: " + napis + "\n");
        System.out.print("Mój napis: " + napis);

        boolean sun = true; //false


    }
}
