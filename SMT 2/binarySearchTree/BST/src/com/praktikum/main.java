package com.praktikum;
//Muhammad Irfani 20104037 SE04B
import java.util.Scanner;

public class main {

    static void mainMenu(){
        System.out.println("=== Main Menu ===");
        System.out.println("1. Input data");
        System.out.println("2. Find Directory");
        System.out.println("3. Remove ");
        System.out.println("4. Find Min");
        System.out.println("5. Find Max");
        System.out.println("6. Data Checking");
        System.out.println("7. Get Leaf Count");
        System.out.println("8. Remove all ");
    }
    public static void main(String[] args) {
        binarySearchTree bst = new binarySearchTree();
        Scanner scan = new Scanner(System.in);
        boolean repeat = true;
        do {
            mainMenu();
            if (bst.isEmpty()){
                System.out.println("Data masih kosong");
            }else {
                System.out.println("Found data");
            }
            System.out.print("> ");
            int usrInputMain = scan.nextInt();
            switch (usrInputMain){
                case 1 :
                    bst.insert(new Node(50));
                    bst.insert(new Node(40));
                    bst.insert(new Node(30));
                    bst.insert(new Node(60));
                    bst.insert(new Node(70));
                    System.out.println("Input data is > 50,40,30,60,70");
                    break;
                case 2 :
                    System.out.println("Search What ?");
                    System.out.print("> ");
                    int searchData = scan.nextInt();
                    bst.findDirectory(searchData);
                    break;
                case 3 :
                    System.out.println("Remove what ?");
                    System.out.print("> ");
                    int removeData = scan.nextInt();
                    bst.remove(removeData);
                    break;
                case 4 :
                    System.out.println("Min is >\t"+bst.findMin().data);
                    break;
                case 5 :
                    System.out.println("Max is >\t"+bst.findMax().data);
                    break;
                case 6 :
                    System.out.println("Check What Data ?");
                    System.out.print("> ");
                    int checkData = scan.nextInt();
                    bst.find(checkData);
                    break;
                case 7 :
                    System.out.println("Leaf is >\t"+bst.getLeafCount());
                    break;
                case 8:
                    System.out.println("Really want to remove all ?");
                    String removeallInput = scan.next();
                    if (removeallInput.equals("yes")){
                        bst.removeAll();
                    }else {
                        System.out.println("Remove all data aborted");
                    }
                    break;
                default:
            }
        }while (repeat);
    }
}
