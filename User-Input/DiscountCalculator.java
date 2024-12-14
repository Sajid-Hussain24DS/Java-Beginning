import java.util.Scanner;

class DiscountCalculator{
 
public static void main(String[] args){
 
 Scanner scanner = new Scanner(System.in);
 
//Give the discount to the customer 15 % if they purchase suit.

 System.out.println("Enter the Original price :");
 double originalPrice = scanner.nextDouble();
if (originalPrice>1000){
 
double discount = originalPrice*0.15;
double finalPrice = originalPrice - discount;
System.out.println("Your discount is :"+ discount);
System.out.println("Original Price is :"+ finalPrice);
} else {
System.out.println("No discount is appliacable :");

}


   }


}