import com.sorting.sorting;
import com.linkedList.*;
import java.util.Scanner;
public class main {
    static void menu(){
        System.out.println("=== Main Menu ===");
        System.out.println("1. bubble Sort");
        System.out.println("2. selection Sort");
        System.out.println("3. insertsion Sort");
        System.out.println("4. bubbble LinkedLIst");
        System.out.println("5. selection LinkedList");
        System.out.println("6. insertion LinkedList");
        System.out.println("Please Choose");
    }
    public static void main(String[] args) {
        int array[];

        Scanner scan = new Scanner(System.in);
        boolean repeat = true;

        sorting sort = new sorting();
        linkedList link = new linkedList();

//        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        while (repeat) {
            menu();
            System.out.print("> ");
            int usrOption = scan.nextInt();
            switch (usrOption) {
                case 1:
                    System.out.print("How many data ? >");
                    int manyData = scan.nextInt();
                    array = new int[manyData];
                    for (int k = 0; k < manyData; k++) {
                        System.out.print(">\t");
                        array[k] = scan.nextInt();
                    }
                    sort.bubbleSort(array);
                    System.out.println("Bubble Sort");
                    sort.printArray(array);
                    break;
                case 2:
                    System.out.print("How many data ? > ");
                    manyData = scan.nextInt();
                    array = new int[manyData];
                    for (int k = 0; k < manyData; k++) {
                        System.out.print("> ");
                        array[k] = scan.nextInt();
                    }
                    sort.selectionSort(array);
                    System.out.println("Selection Sort");
                    sort.printArray(array);
                    break;
                case 3:
                    System.out.print("How many data ? > ");
                    manyData = scan.nextInt();
                    array = new int[manyData];
                    for (int k = 0; k < manyData; k++) {
                        System.out.print("> ");
                        array[k] = scan.nextInt();
                    }
                    sort.insertsionSort(array);
                    System.out.println("Insertsion Sort");
                    sort.printArray(array);
                    break;
                case 4 :
                    System.out.print("How many data ? > ");
                    manyData = scan.nextInt();
                    for (int i = 0; i < manyData; i++) {
                        Node obj = new Node();
                        System.out.print("> ");
                        int nodeInput = scan.nextInt();
                        obj.data = nodeInput;
                        link.addFirst(obj);
                    }
                    link.bubbleShort();
                    link.printNode();
                    link.clear();
                    break;
                case 5 :
                    System.out.print("How many data ? > ");
                    manyData = scan.nextInt();
                    for (int i = 0; i < manyData; i++) {
                        Node obj = new Node();
                        System.out.print("> ");
                        int nodeInput = scan.nextInt();
                        obj.data = nodeInput;
                        link.addFirst(obj);
                    }
                    link.selectionSort();
                    link.printNode();
                    link.clear();
                    break;
                case 6 :
                    System.out.print("How many data ?");
                    int manydata = scan.nextInt();
                    for (int i = 0; i < manydata; i++) {
                        System.out.print("input > ");
                        Node obj = new Node();
                        int data = scan.nextInt();
                        obj.data = data;
                        link.addFirst(obj);
                    }
                    link.insertionSort();
                    link.printNode();
                    link.clear();
                    break;
                default:
            }
        }
    }
}
