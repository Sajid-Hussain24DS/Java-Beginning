class DemoOverloading{

    public long multi(int a,int b){
        System.out.println("1st method ");
        return a*b;
    }
 
    public float add(long a,long b, long c, long d){
        System.out.println("2nd method ");
        return a+b+c+d;
    }
    public double sub(int a,int b,int c){
        System.out.println("3rd method ");
        return a-b-c ;
    }
    public double remi(short a,short b) {
        System.out.println("4th method ");
        return  a % b;

    }
        public static void main(String args[]){
            DemoOverloading obj = new DemoOverloading();
            //int num1=7; int num2=8; int num3=5;
            System.out.println("Result1 "+obj.multi(2,5));
            System.out.println("Result2 "+obj.add(3,45,87,10));
            System.out.println("Result3 "+obj.sub(5,10,90));
            System.out.println("Result4 "+obj.remi((short)5,(short)10));
    }
    }



