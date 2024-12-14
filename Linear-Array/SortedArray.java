class SortedArray{
public static void main(String[] args){
    int myArray[] = {7,3,1,5,9};
    for(int i=0; i<myArray.length; i++){
        for(int j=i+1; j < myArray.length; j++){
            int temp = 0;
            if(myArray[i]>myArray[j]){

                temp = myArray[i];
                myArray[i] = myArray[j];
                myArray[j] = temp;

            }
        }
        System.out.println(myArray[i]);
    }

 }
}