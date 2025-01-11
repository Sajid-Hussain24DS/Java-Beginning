public class IncrementDecrement{
    public static void main(String[] args){

        // Increment Programm
        int x = 30;
        int y =++x; // here first x is incremented (30 to 31) then y  is assigned x (31)
        System.out.println("The value of Y is:"+y);
       

        int a = 10;
        int b = a++; // first b assigned a (10) then a is incremented
        System.out.println("The value of B is:"+b);
       
    // Decrement Program

    int c = 90;
    int d = --c;//first c is decrement (90 to 89) then d is assigned c (89)
    System.out.println("The value of D is:"+d);
   

    int e = 50;
    int f = e--; // first f assigned a (50) then e is incremented
    System.out.println("The value of F is:"+f);
   
 // Increment in Character (chr)
 char ch = 'a';
 System.out.println(++ch);
    



    }
}