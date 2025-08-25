public class divisibleBy3 {
    public static int count(int[] array){
        int count = 0;

        for(int i : array)
        {
            if(i % 3 == 0)count++;
        }

        return count;
    }
}
