import java.io.*;
public class BikeTest {

//    public static void main(String[] args) {
//        Bike myBike = new Bike("Bike", 2, "regular");
////
////        myBike.wheelShape("round");
////        myBike.wheelNum(2);
////        myBike.seatShape("regular");
//        myBike.printBike();
//    }

    public static void main(String[] args) {
//       Bike myBike = new Bike("Bike", 2, "regular");
        Bike myBike = new Bike("Bike");
        myBike.wheelShape = "round";
        myBike.wheelNum = 2;
        myBike.seatShape = "regular";
        myBike.printBike();
    }
}