public class App {
    public static void main(String[] args){


        Fraction fraction1 = new Fraction(1, 3, 5);
        Fraction fraction2 = new Fraction( 1, 2, 5);


        Fraction sum = Operations.subtract(fraction1, fraction2);
        System.out.println(sum);

        ///System.out.println(Util.normalize(new Fraction(4, 5, 6)));
    }
}
