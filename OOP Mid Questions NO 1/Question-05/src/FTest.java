class FTest{
    public static void main(String[] args) {
        FlightBooking f1 = new FlightBooking("John", 12);
        FlightBooking f2 = new FlightBooking("Maria", 3);
        if( f1.getConfirm() == false ){
            f1.setConfirm(true);
            f1.setSeatNumber(32);
        }
        System.out.println("seat number of Maria: " + f2.getSeatNumber() );
        System.out.println("seat number of John: " + f1.getSeatNumber());
    }
}