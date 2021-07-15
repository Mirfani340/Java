import java.util.Random;
import java.util.Scanner;
/* Muhammad Irfani 20104037 SE04B */
public class main {
    public static void main(String[] args) {
        int[] array;
        quickSort quick = new quickSort();
        mergeSort merge = new mergeSort();
        boolean repeat = true;
        Scanner scan = new Scanner(System.in);
        while (repeat){
            System.out.println("1. quickSort");
            System.out.println("2. mergeSort");
            System.out.println("3. Auto Mode N = 100");
            System.out.print("> ");
            int usrInput = scan.nextInt();
            switch (usrInput){
                case 1 :
                    System.out.print("How many data ?");
                    int manyData = scan.nextInt();
                    array = new int[manyData];
                    for (int i = 0; i < manyData; i++) {
                        System.out.print("> ");
                        array[i] = scan.nextInt();
                    }
                    quick.quickSort(array,0,array.length -1);
                    quick.printArray(array,array.length);
                    break;
                case 2 :
                    System.out.print("How many data ?");
                    manyData = scan.nextInt();
                    array = new int[manyData];
                    for (int i = 0; i < manyData; i++) {
                        System.out.print("> ");
                        array[i] = scan.nextInt();
                    }
                    merge.sort(array,0, array.length -1);
                    merge.printArray(array);
                    break;
                case 3 :
                    Random random = new Random();
                    int[]arr = new int[100];
                    System.out.println("=== Inserted Data ===");
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = random.nextInt(100);
                        System.out.print(arr[i]+",");
                    }
                    System.out.println();
                    long start = System.currentTimeMillis();
                    merge.sort(arr,0, arr.length -1);
                    System.out.println("=== Merge Sorted ===");
                    merge.printArray(arr);
                    long end = System.currentTimeMillis();
                    System.out.println(" Time taken --- > "+((end - start) / 1000d)+"Second");
                    System.out.println();
                    long start1 = System.currentTimeMillis();
                    System.out.println("=== Quick Sorted ===");
                    quick.quickSort(arr,0,arr.length -1);
                    quick.printArray(arr,100);
                    long end1 = System.currentTimeMillis();
                    System.out.println("Time taken --- >"+((end1 - start1) / 1000d)+"Second");
                    break;
            }
        }
    }
}
