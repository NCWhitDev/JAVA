public class UsefulArrayOperations
{
    public static void main(String[] arg)
    {
        int[] intArray = {50,2,150,-5,200,-150};
        System.out.println(avg(intArray));
    }

    private static int findMax(int[] array)
    {
        int maxNum = array[0];
        for (int i = 1 ; i<array.length ; i++)
        {
            if (array[i] > maxNum)
                maxNum = array[i];
        }
        return maxNum;
    }

    private static int findMin(int[] array)
    {
        int minNum = array[0];
        for (int i = 1;i<array.length ; i++)
        {
            if (array[i] < minNum) 
                minNum = array[i];
        }
        return minNum;
    }

    private static int sum(int[] array)
    {
        int total = 0;
        for (int i =0; i < array.length ; i++)
            total += array[i];
        return total;
    }

    private static double avg(int[] array)
    {
        return (sum(array) / (double)array.length);
    }

}
