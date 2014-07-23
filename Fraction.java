public class Fraction {
    private Integer numerator;
    private Integer denominator;

    public Integer getNumerator() {
        return numerator;
    }

    public void setNumerator( Integer numerator) {
        this.numerator = numerator;
    }

    public Integer getDenominator() {
        return denominator;
    }

    public void setDenominator( Integer denominator){
        this.denominator = denominator;
    }

    public Fraction(Integer top, Integer bottom) {
        numerator = top;
        denominator = bottom;
    }

    public Fraction add(Fraction otherFrac) {
        Integer newNum, newDen, common;

        newNum = otherFrac.getDenominator()*this.numerator +
            this.denominator*otherFrac.getNumerator();
        newDen = this.denominator * otherFrac.getDenominator();

        return new Fraction(newNum, newDen);
    }

    public static Integer gcd(Integer a, Integer b){
        if(b > a){
            return gcd(b, a);
        }
        else{
            Integer c = a % b;
            while(c > 0){
                a = b;
                b = c;
                c = a%b;
            }
            return b;
        }
    }

    public static void main(String[] args) {
        Integer a;
        Integer b;
        java.util.Scanner in;
        in = new java.util.Scanner(System.in);
        System.out.println("Enter a number");
        a = in.nextInt();
        System.out.println("Enter another number");
        b = in.nextInt();
        System.out.println("The gcd of " + a + " and " + b + " is: " + gcd(a, b));
        System.exit(0);
    }
}
