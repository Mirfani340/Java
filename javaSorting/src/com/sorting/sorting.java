package com.sorting;

public class sorting {
    static int temp,pos,i,j;
    public void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    public void selectionSort(int data[]){
        int n = data.length;
        for (int k = 0; k < n-1; k++) {
            pos = k;
            for (int i = k+1; i < n; i++) {
                if (data[i] < data[pos]){
                    pos = i;
                    int temp = data[pos];
                    data[pos] = data[k];
                    data[k] = temp;
                }
            }
        }
    }
   public void insertsionSort(int data[]){
        for (int i = 1; i < data.length; i++) {
            temp = data[i];
            j = i;
//            membandingkan data dengan data sebelumnya
            while ((j > 0) && (data[j-1] > temp)){
//                jika kondisi terpenuhi maka terjadi penyisihan data
                data[j] = data[j-1];
                j--;
            }
            data[j] = temp;
        }
    }
    /* Prints the array */
    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
//        bubble.bubbleSort(arr);
//        System.out.println("Bubble Sort");
//        bubble.printArray(arr);
//
//        selection.selectionSort(arr);
//        System.out.println("Selection Sort");
//        selection.printArray(arr);
