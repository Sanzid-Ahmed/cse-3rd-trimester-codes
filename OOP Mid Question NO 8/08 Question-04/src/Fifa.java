public class Fifa {
    int noOfGoals;
    String venue;

    Fifa(){
        System.out.println("Who will be winner?");
    }
    Fifa(int noOfGoals, String venue){
        this();
        this.noOfGoals = noOfGoals;
        this.venue = venue;
    }
    public String toString(){
        return "[Fifa -> noOfGoals: " + noOfGoals + ", venue: " +venue + "]";
    }

}
