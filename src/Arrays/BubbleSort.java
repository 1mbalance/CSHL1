package Arrays;


public class BubbleSort {
    public static int[] bubbleSort(int[] arr)
    {
        int n = arr.length; // 6
        for (int i = 0; i < n - 1; i++){

            for (int j = 0; j < n - i - 1; j++){

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }}}
        return arr;
    }

    // Prints the array
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = { 64, 34, 25, 12, 22, 11};
        ob.bubbleSort(arr);
        ob.printArray(arr);
    }
}

