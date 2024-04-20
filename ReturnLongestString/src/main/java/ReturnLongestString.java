
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        int max = arr[0].length();
        String strMax = arr[0];
        for(int x = 0; x < arr.length; x++){
            if(arr[x].length() > max){
                max = arr[x].length();
                strMax = arr[x];
            }
        }
        return strMax;
    }
}
