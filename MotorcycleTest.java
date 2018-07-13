public class MotorcycleTest{
    public static void main(String[]args){
        Motorcycle myMotorcycle=new Motorcycle("Motorcycle");
//        myBike.print();
        myMotorcycle.wheelShape="triangle";
        myMotorcycle.wheelNum=2;
        myMotorcycle.seatShape="customized";
        myMotorcycle.pedalNum=4;
        myMotorcycle.gasTank="front";
        myMotorcycle.motor="electirc";
        myMotorcycle.print();
    }
}