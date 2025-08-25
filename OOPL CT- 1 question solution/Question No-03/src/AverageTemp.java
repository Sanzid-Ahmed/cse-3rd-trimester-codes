public class AverageTemp {
    public static double average(double[] array){
        double sum = 0;
        for(double i : array){
            sum += i;
        }

        return sum / array.length;
    }
}
