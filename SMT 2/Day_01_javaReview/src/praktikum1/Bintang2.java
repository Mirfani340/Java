package praktikum1;

public class Bintang2 {
    public static void main(String[] args) {
        //Deklaration Variable
        int i, j, k;
        // Outer Loop
        for (i = 1; i<= 5; i++){
            //inner loop 1
            // untuk mencetak space
            //i jadi 2 karena i++
            for (j = 5; j > i; j--){
                // j decrement samadengan kurang 1 = 4
                System.out.print(" ");
            }
            // inner loop 2
            // untuk mencetak bintang
            for (k = 1; k < (2 * i); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
