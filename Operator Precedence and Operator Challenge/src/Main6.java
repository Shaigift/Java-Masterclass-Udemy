public class Main6 {
    public static void main(String[] args) {

        double value = 20.00d;
        double type = 80.00d;
        double total = (value + type ) * 100.00d;
        System.out.println("total = " + total);
        double remainder = total % 40.00d;
        System.out.println("remainder = " + remainder);
        boolean NoRemainder = (remainder == 0) ? true : false;
        System.out.println("NoRemainder = " + NoRemainder);
        if (!NoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
