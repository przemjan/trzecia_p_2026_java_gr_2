public class StringDemo {
    public static void main(java.lang.String[] args) {
        String name = "Tadeusz";

        int dlugosc = name.length();

        char inicjal = name.charAt(3);

        String male, duze;
        name = name.toLowerCase();
        duze = name.toUpperCase();

        System.out.println("Imię: " + name);
    }
}
