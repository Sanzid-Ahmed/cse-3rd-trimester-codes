public class Min {
    public static double min(double[] array){
        double min = Double.MAX_VALUE;
        for(double i : array){
            if(min > i) min = i;
        }

        return min;
    }
}
