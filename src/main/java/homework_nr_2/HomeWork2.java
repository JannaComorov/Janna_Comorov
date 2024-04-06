package homework_nr_2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("Hello world");

        long currentWorldPopulation = 7811080815L;
        int carsProducedThisYear = 55235358;
        char firstLetterInAlphabet = 'A';
        boolean javaIsAmazing = true;
        double pi = 3.14159;

        System.out.println("Current World Population: " + currentWorldPopulation);
        System.out.println("Cars Produced This Year: " + carsProducedThisYear);
        System.out.println("First Letter In Alphabet: " + firstLetterInAlphabet);
        System.out.println("Java Is Amazing: " + javaIsAmazing);
        System.out.println("Pi: " + pi);

        double price = 30.70;
        double tax = 7.29;
        int quantity = 3;

        System.out.println("Price: " + price);
        System.out.println("Tax: " + tax);
        System.out.println("Quantity: " + quantity);

        double total = price + tax * (double)quantity;
        System.out.println("Total: " + total);
    }
}
