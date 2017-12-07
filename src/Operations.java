public class Operations {

    public static Fraction add(Fraction fraction1, Fraction fraction2){

        // Both proper
        if((fraction1.getType().equals(Type.PROPER) && fraction2.getType().equals(Type.PROPER))
                || (fraction1.getType().equals(Type.IMPROPER) && fraction2.getType().equals(Type.IMPROPER))){
            // Simple addition (Same denominator)
            return addTwoFractions(fraction1, fraction2);
        }


        if(fraction1.getType().equals(Type.MIXED) || fraction2.getType().equals(Type.MIXED)){
            Fraction normalizedFrac1 = Util.normalize(fraction1);
            Fraction normalizedFrac2 = Util.normalize(fraction2);

            return addTwoFractions(normalizedFrac1, normalizedFrac2);
        }
        return null;
    }


    private static Fraction addTwoFractions(Fraction fraction1, Fraction fraction2) {
        // Simple addition (Same denominator)
        if(fraction1.getDenominator() == fraction2.getDenominator()){
            return new Fraction(fraction1.getNumerator() + fraction2.getNumerator(), fraction1.getDenominator());
        }

        // Different denominator
        if(fraction1.getDenominator() != fraction2.getDenominator()){
            // Generate LCM
            int LCM = Util.findLCM(fraction1.getDenominator(), fraction2.getDenominator());
            int frac1Multiplier = LCM / fraction1.getDenominator();
            int frac2Multiplier = LCM / fraction2.getDenominator();

            Fraction newFrac1 = new Fraction(fraction1.getNumerator() * frac1Multiplier, LCM);
            Fraction newFrac2 = new Fraction(fraction2.getNumerator() * frac2Multiplier, LCM);

            return new Fraction(newFrac1.getNumerator() + newFrac2.getNumerator(), LCM);

        }
        return null;
    }


    public static Fraction subtract(Fraction fraction1, Fraction fraction2){
        // Both proper
        if((fraction1.getType().equals(Type.PROPER) && fraction2.getType().equals(Type.PROPER))
                || (fraction1.getType().equals(Type.IMPROPER) && fraction2.getType().equals(Type.IMPROPER))){
            // Simple addition (Same denominator)
            return subtractTwoFractions(fraction1, fraction2);
        }


        if(fraction1.getType().equals(Type.MIXED) || fraction2.getType().equals(Type.MIXED)){
            Fraction normalizedFrac1 = Util.normalize(fraction1);
            Fraction normalizedFrac2 = Util.normalize(fraction2);

            return subtractTwoFractions(normalizedFrac1, normalizedFrac2);
        }
        return null;
    }

    private static Fraction subtractTwoFractions(Fraction fraction1, Fraction fraction2) {
        // Simple addition (Same denominator)
        if(fraction1.getDenominator() == fraction2.getDenominator()){
            return new Fraction(fraction1.getNumerator() - fraction2.getNumerator(), fraction1.getDenominator());
        }

        // Different denominator
        if(fraction1.getDenominator() != fraction2.getDenominator()){
            // Generate LCM
            int LCM = Util.findLCM(fraction1.getDenominator(), fraction2.getDenominator());
            int frac1Multiplier = LCM / fraction1.getDenominator();
            int frac2Multiplier = LCM / fraction2.getDenominator();

            Fraction newFrac1 = new Fraction(fraction1.getNumerator() * frac1Multiplier, LCM);
            Fraction newFrac2 = new Fraction(fraction2.getNumerator() * frac2Multiplier, LCM);

            return new Fraction(newFrac1.getNumerator() - newFrac2.getNumerator(), LCM);

        }
        return null;
    }
}
