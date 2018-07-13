public class Bicycle extends Bike {
    public int pedalNum;

    //    public Bicycle(String wheelShape, int wheelNum, String seatShape, int pedalNum) {
    public Bicycle(String wheelShape) {
//        super(wheelShape, wheelNum, seatShape);
        super(wheelShape);
    }
    public void setPedalNum(int pedalNum){
        this.pedalNum = pedalNum;
    }

    public void print() {
        super.print();
        System.out.println("Pedal Number:" + pedalNum);
    }
//
//    public static void main(String[] args) {
//        Bicycle myBicycle = new Bicycle("Bicycle");
////        myBike.print();
//        myBicycle.wheelShape = "square";
//        myBicycle.wheelNum = 2;
//        myBicycle.seatShape = "customized";
//        myBicycle.pedalNum = 4;
//        myBicycle.print();
//    }
}