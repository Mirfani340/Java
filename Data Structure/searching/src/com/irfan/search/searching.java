package com.irfan.search;

import java.util.Random;
import java.util.Scanner;

public class searching {
    static int temp, pos, i, j, start, end, mid, low, high;

    //    SEQUENTIAL SEARCH
    public static int sequential(int[] data, int search) {
//        looping sebanyak element yang ada
        for (i = 0; i < data.length; i++) {
            if (data[i] == search) {
                return i;
            }
        }
        return -1;//kenapa return -1, karena indeks di mulai dari 0
    }

    //    selection sort
    public static int[] selectionSort(int data[]) {
        for (i = 0; i < data.length - 1; i++) {
            pos = i;
            for (j = i + 1; j < data.length; j++) {
                if (data[j] < data[pos]) {
                    pos = j;
                }
            }
            if (pos != i) {
                temp = data[pos];
                data[pos] = data[i];
                data[i] = temp;
            }
        }
        return data;
    }

    public static int binarySearch(int[] data, int search) {
        searching.selectionSort(data);
        start = 0;
        end = data.length - 1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (data[mid] == search) {
                return mid;
            } else if (data[mid] < search) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    //    Interpolation Search
    public static int interpolationSearch(int data[], int search,int low,int high) {
        searching.selectionSort(data);
        low = 0;
        high = data.length - 1;
        while (search >= data[low] || search <= data[high]) {
            pos = ((search - data[low]) / (data[high] - data[low]));
                if (data[pos] == search) {
                    return pos;
                }
                if (data[pos] > search) {
                    high = pos - 1;
                } else if (data[pos] < search) {
                    low = pos + 1;
                }
            }
            return -1;
    }

    static void menu(){
        System.out.println("1. Sequential Search");
        System.out.println("2. Binarry Search");
        System.out.println("3. Interpolation Search");
        System.out.println("4. Searching Benchmark");
    }
    public static void main(String[] args) {
        int array[] = {1,5,4,2,6,9,7,8};
        Scanner scan = new Scanner(System.in);
        boolean repeat = true;
        while(repeat){
            menu();
            System.out.println("Choose");
            System.out.print("> ");
            int option = scan.nextInt();
            switch (option){
                case 1 :
                    System.out.print("Search ? ");
                    int search = scan.nextInt();
                    int index = sequential(array,search);
                    if (index != -1){
                        System.out.println("Data found at index " + index);
                    }else {
                        System.out.println("Soory data not found");
                    }
                    break;
                case 2 :
                    System.out.print("Search ? ");
                    search = scan.nextInt();
                    index = binarySearch(array,search);
                    if (index != -1){
                        System.out.println("Data found at index " + index);
                    }else {
                        System.out.println("Soory data not found");
                    }
                    break;
                case 3 :
                    int N = array.length;
                    System.out.print("Seach ?");
                    search = scan.nextInt();
                    index = interpolationSearch(array,search,0,N - 1);
                    if (index != -1){
                        System.out.println("Data found at "+index);
                    }else {
                        System.out.println("Soory data not found");
                    }
                    break;
//                case 4 :
//                    Random random = new Random();
//                    System.out.println("Searching Bencmark...");
//                    int bigArray[] = new int[1000];
//                    for (int k = 0; k < bigArray.length; k++) {
//                        bigArray[k] = random.nextInt(1000);
//                    }
//                    System.out.println("=== Sequntial ===");
//                    long start = System.currentTimeMillis();
//                    System.out.println(sequential(bigArray,69));
//                    long end = System.currentTimeMillis();
//                    System.out.println("Sequential Time taken --- >"+(end - start) / 1000d);
//
//                    start = System.currentTimeMillis();
//                    System.out.println(binarySearch(bigArray,69));
//                    end = System.currentTimeMillis();
//                    System.out.println("Binarry Time taken --- >"+(end - start) / 1000d);
//                    break;
            }
        }
    }
}
