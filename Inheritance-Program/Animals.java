class Animals{

    public void move(){
        System.out.println("Move slowly");
    }
      }
class cheetah extends Animals {
    public void move(){
        System.out.println("Chetaah is Runing");
    }
    public static  void main(String [] args){
        cheetah cheetah1= new cheetah ();
        cheetah1.move();

        
    }
}