package com.praktikum;
public class binarySearchTree {
    Node root;

    // membuat method isEmpty
    boolean isEmpty(){
        return root == null;
    }

    // Kalo data lebih kecil akan di taruh di kiri, jika lebih besar di taruh di kanan
    // Data tidak boleh sama
    // Method ini untuk insert data
    void insert(Node input){
        Node temp = root;
        Node parent = null;
        // flag sebagai penanda udah masuk apa belum
        boolean flag = false;
        if (isEmpty()){
            root = input;
        }else {
            while (temp != null){
                parent = temp;
                if (input.data < temp.data){
                    temp = temp.left;
                    flag = true;
                }else if (input.data > temp.data){
                    temp = temp.right;
                    flag = true;
                }else {
                    System.out.println("Data tidak boleh ada duplikasi");
                    break;
                }
            }
            if (flag){
                if (input.data > parent.data){
                    parent.right = input;
                }else if (input.data < parent.data){
                    parent.left = input;
                }else {
                    System.out.println("Data tidak boleh ada duplikasi");
                }
            }
        }
    }
    // method find
    void find(int cari){
        Node temp = root;
        boolean cek = false;
        while (temp != null){
            // data masuk ke kiri jika data yang dicari kurang dari root / parent
            if (cari < temp.data){
                temp = temp.left;
                // data akan masuk ke kanan jika data yang di cari lebih besar
            }else if (cari > temp.data){
                temp = temp.right;
                // kalau data sama dengan yang di cari maka akan ke sini
            }else if (cari == temp.data){
                cek = true;
                break;
            }
        }
        if (cek){
            System.out.println("Data "+cari+" ditemukan");
        }else {
            System.out.println("Soory data not found");
        }
    }
    // method findmax
    Node findMax(){
        Node temp = root;
        if (isEmpty()){
            return null;
        }else {
            while (temp.right != null){
                temp = temp.right;
            }
            return temp;
        }
    }
    // method findMin
    Node findMin(){
        Node temp = root;
        if (isEmpty()){
            return null;
        }else {
            while (temp.left != null){
                temp = temp.left;
            }
            return temp;
        }
    }
    // method remove
    void remove(int input){
        if (this.remove(input, root) == null){
            System.out.println("Data"+input+"tidak ada dalam tree");
        }else {
            System.out.println("Data "+input+" deleted");
            root = remove(input, root);
        }
    }
    // method remove yang kedua (double parameter
    private Node remove (int input, Node root){
        // pointer untuk menyimpan data pada node saat ini
        Node parent = null;
        Node temp = root;

        // mencari inputan di dalam tree kemudian
        while (temp != null && temp.data != input)
        {
            // update parent dengan node saat ini (dari root, terus ke parent kiri/kanan, dst)
            parent = temp;

            // menentukan arah pencarian inputan, lebih kecil maka kekiri,
            // lebih besar maka ke kanan
            if (input < temp.data) {
                temp = temp.left;
            }
            else {
                temp = temp.right;
            }
        }
        // return null jika tidak ketemu
        if (temp == null) {
            return root;
        }

        // untuk menghapus data di BST berdasarkan input perlu melalui dibagi menjadi 3
        // yaitu yang pertama :
        // jika node yang dihapus tidak memiliki children
        // dalam artian yang dihapus adalah leaf
        if (temp.left == null && temp.right == null)
        {
            // jika proses memasuki sini maka otomatis dia adalah child / leaf
            // yang di if ini jika dia leaf tapi bukan root
            if (temp != root)
            {
                if (parent.left == temp) {
                    parent.left = null;
                }
                else {
                    parent.right = null;
                }
            }
            // kemudian ini jika dia adalah root
            else {
                root = null;
            }
        }

        // yang kedua, jika node yang dihapus memiliki 2 child
        else if (temp.left != null && temp.right != null)
        {
            // pertama kita mencari node successor / node yang berada dibawah node tertentu
            // atau bisa dibilang disini node yang terkecil
            Node successor = findMin();
            // kemudian menyimpan nilai milik successor ke dalam variabel val
            int val = successor.data;

            // untuk penghapusan kita menggunakan recursive untuk menghapusnya
            remove(successor.data, root);
            // menaruh nilai successor tadi ke node saat ini (dia akan naik jadi parent)
            temp.data = val;
        }

        // yang ketiga adalah jika node yang dihapus hanya memiliki satu child
        else {
            // memilih child mana yang akan dihapus dengan mengecek yang mana yang null
            Node child = (temp.left != null)? temp.left: temp.right;

            // jika node yang dihapus bukan root maka mengganti parentnya dengan childnya
            // maksudnya adalah child dari parent itu naik ke atas, menggantikan parentnya
            if (temp != root)
            {
                if (temp == parent.left) {
                    parent.left = child;
                }
                else {
                    parent.right = child;
                }
            }

            // kalau misal yang akan dihapus itu merupakn rootnya, maka tinggal
            else {
                root = child;
            }
        }
        return root;
    }
    private boolean checking(int input){
        Node temp = root;
        while (temp != null){
            // if pertama untuk mengecek arah dan gerak
            // data yang dilewati
            if (input < temp.data){
                temp = temp.left;
            }else if (input > temp.data){
                temp = temp.right;
                // ke sini jika misal sudah ketemu datannya
            }else if (input == temp.data){
                return true;
            }
        }
        return false;
    }
    void removeAll(){
        if (isEmpty()){
            System.out.println("Maaf data kosong");
        }else {
            root = null;
            System.out.println("Data berhasil dihapus semua");
        }
    }
    // find directory
    void findDirectory(int input){
        if (isEmpty()){
            System.out.println("Tree masih kosong");
        }else {
            if (this.checking(input) == true){
                Node temp = root;
                while (temp != null){
                    if (input > temp.data){
                        System.out.print(temp.data + " ,");
                        temp = temp.right;//kanan
                    }else if (input < temp.data){
                        System.out.print(temp.data +", ");
                        temp = temp.left;//kiri
                    }else if (input == temp.data){
                        System.out.println(input);
                        break;
                    }
                }
            }else {
                System.out.println("Data tidak ada dalam tree");
            }
        }
    }
    // method untuk menghitung leaf
    public int getLeafCount(){
        return this.getLeafCountHelper(root);
    }
    // method getLeafCountHelper
    private int getLeafCountHelper(Node data){
        if (data == null){
            return 0;
        }else if (data.left == null && data.right == null){
            return 1;
        }else {
            return this.getLeafCountHelper(data.left)+this.getLeafCountHelper(data.right);
        }
    }
}
