public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){
        int temp = arr[0];
        for(int x = 1; x < arr.length; x++) {
            if(arr[x] > temp) {
                temp = arr[x];
            }
        }
        return temp;
    }
}
