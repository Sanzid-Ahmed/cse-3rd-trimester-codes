public class BrazilFans extends Fifa{
    int havingWorldCup;

    BrazilFans(int noOfGoals, String venue, int havingWorldCup){
        super(noOfGoals, venue);
        this.havingWorldCup = havingWorldCup;
        System.out.println("Brazil will win");
    }

    public String toString(){
        return "BrazilFans -> " + super.toString() + " havingWorldCups: " + havingWorldCup;
    }

    public void incrementWorldCups(){
        havingWorldCup++;
    }
}
