public class Que03 {
    public static void main(String[] args) {
        double num = 99.99;
        int converted = (int) num; // Explicit conversion
        System.out.println("Double value: " + num);
        System.out.println("Converted Int value: " + converted);
        System.out.println("Data loss: Fractional part is lost");
    }

}
