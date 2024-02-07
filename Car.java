public class Car {
    //variable
    String name;
    int maxSpeed;
    int yearOfMake;

    //constructor
    public Car(String name, int maxSpeed, int yearOfMake){
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.yearOfMake = yearOfMake;
    }

    //method to call info of the car
    public void getInfoCar(){
        System.out.println("Car Name :" + name);
        System.out.println("Max Speed :" + maxSpeed);
        System.out.println("Year of make :" + yearOfMake);
    }

    //method to accelerate the car
    public void accelerate(int speedIncrease){
        maxSpeed += speedIncrease;
        System.out.println("New Max Speed :" + maxSpeed);
    }

    //Main function to define the object and run the methods
    public static void main(String[] args) {
        //creating the object
        Car MyCar = new Car("Porsche", 296, 2023);

        //Displaying the initial info
        System.out.println("Car info:");
        MyCar.getInfoCar();

        //Acceleration
        MyCar.accelerate(4);

        //Displaying the Updated info
        System.out.println("\nUpdated Info:");
        MyCar.getInfoCar();
    }
}