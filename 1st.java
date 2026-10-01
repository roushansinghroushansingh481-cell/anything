class car{
    String colour;
    int speed;
    void drive() {
        System.out.println("car is driving");
    }
}
public class main {
    public static void main(String [] args) {
        car car1=new car();
        car1.colour="black";
        car1.speed=20;
        System.out.println(car1.colour);
        System.out.println(car1.speed);
        car1.drive();
    }
}