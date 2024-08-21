class InsertionSort {
    public static void main (String[] args) {
        int[] array = new int[]{5,2,4,6,1,3};

        
        System.out.println("Before: " + arrayToString(array));

        for (int j = 1; j <= array.length - 1; j++) {
            //j is the index of the number to be inserted

            //key is the value to be sorted
            int key = array[j];

            //i indicates the last index of the sorted numbers up to this point (or the first element if this is first run). 
            int i = j - 1;

            //Now we compare the key with the last sorted element, 
            //if key is less than the element at i, 
            //we subtract 1 from i and continue doing this until we find a spot (or we hit first element)
            //we also shift the value at position i, one to the right each iteration of the whle loop, 
            //this makes space for key when we find its spot. 
            while (i >= 0 && array[i] > key) {

                array[i + 1] = array[i];
                i = i - 1;
            }

            //finally, we insert the key in the spot after the index i.
            array[i + 1] = key;
        }

        System.out.println("After: " + arrayToString(array));
    }

    private static String arrayToString(int[] array) {
        String output = "";
        for (int i : array) {
            output += i; 
            output += ", ";
        }
        return output;
    } 
}