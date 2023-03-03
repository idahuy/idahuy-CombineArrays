public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        int index = 0;

        // Copy elements from arr1 into result
        for (int i = 0; i < arr1.length; i++) {
            result[index] = arr1[i];
            index++;
        }

        // Copy elements from arr2 into result
        for (int i = 0; i < arr2.length; i++) {
            result[index] = arr2[i];
            index++;
        }

        return result;
    }
}