public class ArgentinaFans extends Fifa{
    int havingWorldCups;

    ArgentinaFans(int noOfGoals, String venue, int havingWorldCups){
        super(noOfGoals, venue);
        this.havingWorldCups = havingWorldCups;
        System.out.println("Argentina will win");
    }

    public String toString(){
        return "ArgentinaFans -> " + super.toString() + " havingWorldCups: " + havingWorldCups;
    }

    public void incrementWorldCup(){
        havingWorldCups++;
    }
}
