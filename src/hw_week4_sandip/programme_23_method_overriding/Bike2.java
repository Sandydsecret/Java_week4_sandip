package hw_week4_sandip.programme_23_method_overriding;

public class Bike2 extends Vehicle{
    public  void run (){
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike2 obj = new Bike2(); //creating objet//
        obj.run();
    }
}
