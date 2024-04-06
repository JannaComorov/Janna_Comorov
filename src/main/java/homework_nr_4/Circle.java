package homework_nr_4;

public class Circle {
    double radius; // Variabilă pentru raza cercului

    // Constructor cu un parametru pentru raza cercului
    public Circle(double radius) {
        this.radius = radius; // Setarea valorii razei la valoarea parametrului
    }

    // Metoda pentru calculul ariei cercului
    public double calculateArea() {
        return Math.PI * radius * radius; // Calcularea ariei cercului
    }

    // Metoda main
    public static void main(String[] args) {
        double radiusValue = 7.0; // Valoarea pentru raza cercului
        Circle circle = new Circle(radiusValue); // Inițializarea obiectului de tip Circle cu valoarea razei specificată
        double area = circle.calculateArea(); // Calcularea ariei cercului
        System.out.println("Area is " + area); // Afișarea ariei cercului
    }
}
