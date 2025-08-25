public class arrayMain {
    public static void main(String[] args){
        double[] temp = {32.5, 28.7, 36.2, 29.1, 33.8, 27.6, 34.9, 31.3};

        System.out.println("Average of the temperature => " + AverageTemp.average(temp));
        System.out.println("\nHighest temperature => " + Max.max(temp) + "Lowest temperature => " + Min.min(temp));
        System.out.println("\nTemperature above the average temperature => ");
        for(double i : temp){
            if(Above.above(i, AverageTemp.average(temp)) == 1)
                System.out.println(i);
        }

    }
}
