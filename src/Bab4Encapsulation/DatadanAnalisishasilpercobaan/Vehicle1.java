package Bab4Encapsulation.DatadanAnalisishasilpercobaan;
public class Vehicle1 {
    private double load, maxLoad;

    public Vehicle1 (double max){
        this.maxLoad = max;
    }
    public double getLoad(){
        return this.load;
    }
    public double getMaxLoad(){
        return this.maxLoad;
    }
    public boolean addBox(double weight){
        double temp = 0.0D;
        temp = this.load + weight;
        if(temp <= maxLoad){
            this.load = this.load + weight;
            return true;
        }
        else {
            return false;
        }
    }

}

class TestVehicle1{
    public static void main(String[] args){
        System.out.println("Creating a vehicle with a 10,000  kg maximumload.");
        Vehicle1 vehicle = new Vehicle1(10000);
        System.out.println("Add box #1 (500kg) : " + vehicle.addBox(500));
        System.out.println("Add box #2 (250kg) : " + vehicle.addBox(250));
        System.out.println("Add box #3 (5000kg) : " + vehicle.addBox(5000));
        System.out.println("Add box #4 (4000kg) : " + vehicle.addBox(4000));
        System.out.println("Add box #5 (300kg) : " + vehicle.addBox(300));
        System.out.println("Vehicle load is " +vehicle.getLoad() + "kg");
    }

}

