package ReviewClass9;

public class Bicycle {
    String make;
    int gears;
    int maxSpeed;

    void drive(){
        System.out.println("Is time to drive Bicycles");
    }
    void applyBreaks(){
        System.out.println("Applying brakes");
    }

}

class MountainBikes{
    boolean suspension=true;
    int seatHeight;
    void setSeatHeight(int seatHeight){
        this.seatHeight=seatHeight;

    }
}

class Test{
    public static void main(String[] args) {
        Bicycle bike=new Bicycle();
        System.out.println(bike);
    }

        }