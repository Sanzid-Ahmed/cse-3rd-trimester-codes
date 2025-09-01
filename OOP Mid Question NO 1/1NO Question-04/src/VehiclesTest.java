class VehicleTest{
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        bus.start();
        ((Bus)bus).needFuel();
        Vehicle cycle = new Cycle();
        cycle.move();
        ((Cycle)cycle).pedal();
    }
}