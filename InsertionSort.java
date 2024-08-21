class InsertionSort {
    public static void main (String[] args) {
        int[] array = new int[]{5,2,4,6,1,3};

        
        System.out.println("Before: " + arrayToString(array));

        for (int j = 1; j <= array.length - 1; j++) {
            int key = array[j];

            int i = j - 1;
            while (i > 0 && array[i] > key) {
                array[i + 1] = array[i];
                i = i - 1;
            }
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