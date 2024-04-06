package homework_nr_3;

public class HomeWork3 {
    public static void main(String[] args) {
        // Switch-case
        int numarLuna = 3;
        switch (numarLuna) {
            case 1:
                System.out.println("Ianuarie");
                break;
            case 2:
                System.out.println("Februarie");
                break;
            case 3:
                System.out.println("Martie");
                break;
            case 4:
                System.out.println("Aprilie");
                break;
            case 5:
                System.out.println("Mai");
                break;
            case 6:
                System.out.println("Iunie");
                break;
            case 7:
                System.out.println("Iulie");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("Septembrie");
                break;
            case 10:
                System.out.println("Octombrie");
                break;
            case 11:
                System.out.println("Noiembrie");
                break;
            case 12:
                System.out.println("Decembrie");
                break;
            default:
                System.out.println("Numărul trebuie să fie între 1 și 12.");
        }

        // Ciclu care afișează numerele între 100 și 1000 care sunt divizibile cu 5
        System.out.println("Numere divizibile cu 5 între 100 și 1000:");
        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Calculul și afișarea sumei seriei specificate
        double suma = 0;
        for (int i = 1; i <= 97; i += 2) {
            suma += (double)i / (i + 2);
        }
        System.out.println("Suma seriei este: " + suma);
    }
}
