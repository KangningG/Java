public class Bike {

    //   String attribute;
    public String wheelShape;
    public int wheelNum;
    public String seatShape;

    public Bike(String wheelShape, int wheelNum, String seatShape) {
        this.wheelShape = wheelShape;
        this.wheelNum = wheelNum;
        this.seatShape = seatShape;
//      System.out.println("Seat Shape is: " + seatShape);
    }

    public Bike(String wheelShape) {
        wheelShape = wheelShape;
    }

    public void setWheelNum(int wheelNum) {
        this.wheelNum = wheelNum;
    }

//    public void getWheelNum() {
//        System.out.println("Wheel Number:" + wheelNum);
//        return wheelNum;
//    }

    public void setSeatShape(String seatShape) {
        this.seatShape = seatShape;
    }

//    public String getSeatShape() {
//        System.out.println("Seat Shape:" + seatShape);
//        return seatShape;
//    }

    public void print() {
        System.out.println("Wheel Shape:" + wheelShape);
        System.out.println("Wheel Number:" + wheelNum);
        System.out.println("Seat Shape:" + seatShape);
    }

    public static void main(String[] args) {
////       Bike myBike = new Bike("Bike", 2, "regular");
        Bike myBike = new Bike("round");
        myBike.wheelShape = "round";
        myBike.wheelNum = 2;
        myBike.seatShape = "regular";
        myBike.print();
    }


}

