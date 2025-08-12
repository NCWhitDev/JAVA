public class arrayTrials
{
    public static void main(String[] args)
    {
        // Comparing Arrays
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};
        boolean areEqual = true;
      
        if (array1.length != array2.length)
        {
            areEqual = false;
        }
        else
        {
            int i = 0;
            while(i<array1.length && areEqual)
            {
                if (array1[i] != array2[i])
                    areEqual = false;
                i++;
            }
        }
        System.out.println(areEqual);
    }

}
