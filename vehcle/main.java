package vehcle;

public class main {
    public static void main(String[] args){

        car car =new car();
        car.brand ="toyota";
        car.year =2024;
        car.numDoors =4;

        motorcycle motorcycle =new motorcycle();
        motorcycle.brand "yahama";
        motorcycle.year =2023;
        motorcycle.enginecapacity =150;

        car.displaycarinfo();
        System.out.println();
        motorcycle.displayMotorcycleInfo();
        

    }
    
}
