public class Finder {

    // function findMin
public static int findMin(int[] array)
{
    if (array == null || array.length == 0) return Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int value : array) {
        if (min > value) {
             min = value;
        }
    }
    return min;

}

    public static void main(String[] args) {
        System.out.println("abc");
    }


    // function findMax
    public static int findMax(int[] array)
    {
        if (array == null || array.length == 0) return Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int value : array) {
            if (max < value) {
                max = value;
            }
        }
        return max;
    }





}
