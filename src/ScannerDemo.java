import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int numerButa;
        System.out.println("Podaj numer buta: ");
        numerButa = klawiatura.nextInt();
        klawiatura.nextLine();

        System.out.println("Podaj średnią z matmy: ");
        double average = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.println("POdaj imię: ");
        String firstName = klawiatura.nextLine();

        System.out.println("Twój numer buta: " + numerButa + ", twoja średnia: " + average + ", imię: " + firstName);


    }
}
