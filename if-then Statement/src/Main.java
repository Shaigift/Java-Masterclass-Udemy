public class Main {

    public static void main(String[] args) {
        int result = 3;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult= " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 =" + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("4 % 3 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }
    }
}
