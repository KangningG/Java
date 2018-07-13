public class BicycleTest{

    public static void main(String[] args) {
        Bicycle myBicycle = new Bicycle("Bicycle");
//        myBike.print();
        myBicycle.wheelShape = "square";
        myBicycle.wheelNum = 2;
        myBicycle.seatShape = "customized";
        myBicycle.pedalNum = 4;
        myBicycle.print();
    }
}