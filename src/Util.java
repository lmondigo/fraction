public class Util {

    public static String generateType(int numerator, int denominator){
        if(numerator > denominator)
            return Type.IMPROPER;
        else if(numerator < denominator)
            return Type.PROPER;
        else
            return Type.MIXED;
    }

    public static int findGCD(int a, int b)
    {
        while (b > 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }



    public static int findLCM(int a, int b)
    {
        return a * (b / findGCD(a, b));
    }



    public static Fraction normalize(Fraction fraction){
        if(fraction.getType().equals(Type.MIXED)){
            return new Fraction(fraction.getWholeNumber() * fraction.getNumerator(), fraction.getDenominator());
        }
        return fraction;
    }





}
