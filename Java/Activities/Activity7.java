package Activites;

interface BiParts {
    public int tyres = 21;
    public int maxSpeed = 32;
}

interface BicyOperations {
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}


class Bi implements BiParts, BicyOperations {

    public int gears;
    public int currentSpeed;
  
    public Bi(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

   
    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
        System.out.println("Current speed: " + currentSpeed);
    }

    public void speedUp(int increment) {
        currentSpeed += increment;
        System.out.println("Current speed: " + currentSpeed);
    }


    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + maxSpeed);
    }
}

class MountainBike extends Bi {

    public int seatHeight;
  
    public MountainBike(int gears, int currentSpeed, int startHeight) {     
        super(gears, currentSpeed);
        seatHeight = startHeight;
    }


    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    }  
}


public class Activity7 {
    public static void main(String args[]) {
        MountainBike mb = new MountainBike(2, 1, 23);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applyBrake(5);
    }
}