/*
Muhammad Irfani
20104037
SE04B
 */
import java.util.Scanner;
import java.util.ArrayList;
public class CircularQueue {

    // Declaring the class variables.
    private int size, front, rear;

    // Declaring array list.
    private ArrayList<String> nim = new ArrayList<String>();
    private ArrayList<String> nama = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();

    // Constructor
    CircularQueue(int size) {
        this.size = size;
        this.front = this.rear = -1;
    }

    // Method insert queue
    public void enQueue(String nim, String nama, String alamat) {

        // Condition if queue is full.
        if((front == 0 && rear == size - 1) || (rear == (front - 1) % (size - 1))) {
            System.out.print("Queue is Full");
        } else if (front == -1) {
            front = 0;
            rear = 0;
            this.nim.add(rear, nim);
            this.nama.add(rear, nama);
            this.alamat.add(rear, alamat);
        } else if (rear == size - 1 && front != 0) {
            rear = 0;
            this.nim.set(rear, nim);
            this.nama.set(rear, nama);
            this.alamat.set(rear, alamat);
        } else {
            rear = (rear + 1);
            if(front <= rear) {
                this.nim.add(rear, nim);
                this.nama.add(rear, nama);
                this.alamat.add(rear, alamat);
            } else {
                this.nim.set(rear, nim);
                this.nama.set(rear, nama);
                this.alamat.set(rear, alamat);
            }
        }
    }

    public String deQueue() {
        String temp;

        // Condition jika kosong
        if(front == -1) {
            System.out.println("Queue kosong!");

            // Return -1 jika queue kosong
            return "-1";
        }
        temp = nim.get(front);
        // Condition untuk 1 element
        if(front == rear) {
            front = -1;
            rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front = front + 1;
        }
        // Returns ke dequeue element
        return temp;
    }

    // Method untuk display / output
    public void displayQueue()
    {
        // Condition untuk empty queue
        if(front == -1){
            System.out.println("Queue kosong!");
            return;
        }
        System.out.println("Data yang terdaftar di queue: ");
        if(rear >= front) {
            for(int i = front; i <= rear; i++) {
                System.out.println("NIM: " + nim.get(i));
                System.out.println("Nama: " + nama.get(i));
                System.out.println("Alamat: " + alamat.get(i));
                System.out.println();
            }
        } else {
            for(int i = front; i < size; i++) {
                System.out.println("NIM: " + nim.get(i));
                System.out.println("Nama: " + nama.get(i));
                System.out.println("Alamat: " + alamat.get(i));
                System.out.println();
            }
            for(int i = 0; i <= rear; i++) {
                System.out.println("NIM: " + nim.get(i));
                System.out.println("Nama: " + nama.get(i));
                System.out.println("Alamat: " + alamat.get(i));
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        // Deklarasi Circular Queue
        CircularQueue circularQueue = new CircularQueue(10);
        // Scanner
        Scanner input = new Scanner(System.in);
        // Loop
        boolean exit = false;
        do {
            System.out.println("Choose");
            System.out.println("1. Masukan data");
            System.out.println("2. DeQueue data");
            System.out.println("3. Lihat data");
            System.out.println("4. Keluar");
            System.out.print("\n> ");
            int option = input.nextInt();
            input.nextLine();
            switch(option) {
                case 1:
                    System.out.print("Masukan NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Masukan Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Masukan Alamat: ");
                    String alamat = input.nextLine();
                    circularQueue.enQueue(nim, nama, alamat);
                    break;
                case 2:
                    String deQueuedNIM = circularQueue.deQueue();
                    if(!deQueuedNIM.equals("-1"))
                        System.out.print("Berhasil melakukan DeQueue data milik mahasiswa ber-NIM " + deQueuedNIM);
                    System.out.println();
                    break;
                case 3:
                    circularQueue.displayQueue();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    exit = true;
                    break;
                default:
                    System.out.println("Error : Maaf, hanya pilih 1-4");
                    break;
            }
            System.out.println();
        } while(!exit);
    }
}
