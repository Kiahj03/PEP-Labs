
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int al1 = arr1.length;
        int al2 = arr2.length;

        int[] arr = new int[al1 + al2];
        for(int x = 0; x < al1; x++){
            arr[x] = arr1[x];
        }
        for(int y = 0; y < al2; y++){
            arr[al1 + y] = arr2[y];
        }
        return arr;
    }
}
