class ThirdLargestNumber{
    public static void main(String[]args) {
        int Array[]={9,5,3,2,6,8};

        int FirstLargest = Array[0];
        int secondLargest = Array[0];
        int ThirdLargest = Array[0];
        for(int i=0; i<Array.length; i++){
            if(Array[i]<ThirdLargest) {
                FirstLargest = ThirdLargest;
                ThirdLargest=Array[i];

            }else if (Array[i]<FirstLargest) {
                FirstLargest=ThirdLargest;
            }
        }
        System.out.println("Third largest Element is " +ThirdLargest);



    }
}
