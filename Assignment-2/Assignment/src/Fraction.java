import java.util.Scanner;
public class Fraction {
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Addition
    public static Fraction Add(Fraction fraction1, Fraction fraction2) {
        int Numerator = fraction1.numerator * fraction2.denominator - fraction1.denominator * fraction2.numerator;
        int Denominator = fraction1.denominator * fraction2.denominator;
        return new Fraction(Numerator, Denominator);
    }

    // Subtractions
    public static Fraction subtraction(Fraction fraction1, Fraction fraction2) {
        int Numerator = fraction1.numerator * fraction2.denominator - fraction1.denominator * fraction2.numerator;
        int Denominator = fraction1.denominator * fraction2.denominator;
        return new Fraction(Numerator, Denominator);
    }

    // Multiply
    public static Fraction multiply(Fraction fraction1, Fraction fraction2) {
        int Numerator = fraction1.numerator * fraction2.numerator;
        int Denominator = fraction1.denominator * fraction2.denominator;
        return new Fraction(Numerator, Denominator);
    }

    //Division
    public static Fraction division(Fraction fraction1, Fraction fraction2) {
        int Numerator = fraction1.numerator * fraction2.denominator;
        int Denominator = fraction1.denominator * fraction2.numerator;
        return new Fraction(Numerator, Denominator);
    }

    public void display() {
        System.out.println(this.numerator + "/" + this.denominator);

    }
  //  public class Fractions {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char continueCalculation = 'y';


            do {
                System.out.println("Enter First Fraction(Numerator and Denominator)");
                int num1 = scanner.nextInt();
                int den1 = scanner.nextInt();

                System.out.println("Enter Operator( +,-,*,/ )");
                char operator = scanner.next().charAt(0);
                System.out.println("Enter Second Fraction(Numerator and Denominator)");
                int num2 = scanner.nextInt();
                int den2 = scanner.nextInt();

                Fraction fraction1 = new Fraction(num1,den1);
                Fraction fraction2 = new Fraction(num2,den2);
                Fraction result = null;

                switch (operator){
                    case '+':
                    result = Fraction.Add(fraction1,fraction2);
                    break;
                    case'-':
                        result = Fraction.subtraction(fraction1,fraction2);
                        break;
                    case '*':
                        result = Fraction.multiply(fraction1,fraction2);
                        break;
                    case '/':
                        if (fraction2.numerator==0){
                            System.out.println("Can not divided by Zero");
                            continue;
                        }
                        result = Fraction.division(fraction1,fraction2);
                        break;
                    default:
                        System.out.println("You put Invalid Operator; Please put valid Operator");
                        continue;
                }
                System.out.print("The Result is :");
                result.display();

                System.out.println("Do you want to perform another calculation(y/n)");
                continueCalculation = scanner.next().charAt(0);
        }while (continueCalculation == 'y' || continueCalculation == 'Y');

            scanner.close();
            System.out.println("Thank u for using our Fraction Calculator.");



        }


}




