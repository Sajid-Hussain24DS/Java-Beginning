class PascalTriangle {
    public static void main(String[] args){
        int row = 5;
        for(int i=0; i<row; i++) {
            for(int j=0; j < row-i-1; j++) {
                System.out.print(" ");
            }
            int number = 1;
            for(int k=0; k<=i; k++) {
                System.out.print(number +" ");
                number = number*(i-k)/(k+1);
            }

            System.out.println();
        }

    }


}
