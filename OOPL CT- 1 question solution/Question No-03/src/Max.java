public class Max {
    public static double max(double[] array){
        double max = Integer.MIN_VALUE;
        for(double i : array){
            if(max < i) max = i;
        }

        return max;
    }
}
