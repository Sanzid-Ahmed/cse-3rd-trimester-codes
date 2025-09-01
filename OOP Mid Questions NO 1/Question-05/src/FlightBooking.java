public class FlightBooking {
    private String passengerName;
    private int seatNumber;
    private boolean confirm = false;
    public FlightBooking(String passengerName, int seatNumber) {
        this.passengerName = passengerName;
        this.seatNumber = seatNumber;
    }
    void setSeatNumber(int seatNumber){
        this.seatNumber = seatNumber;
    }
    int getSeatNumber(){
        return seatNumber;
    }
    void setConfirm(boolean confirm){
        this.confirm = confirm;
    }
    boolean getConfirm(){
        return confirm;
    }
}