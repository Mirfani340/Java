package com.praktikum;
//Muhammad Irfani 20104037 SE04B
import java.util.Scanner;

public class HashMapImpl<K, V> {
    //    Deklarasi atribut
    private int capacity = 100; // menentukan total kapasitas pasangan key dan value
    private int size = 0;
    private Entry<K, V> table[] = new Entry[capacity]; // Deklarasi array untuk membuat tabel

    //    Membuat kode unik berdasarkan hasil dari method hashcode
    private int Hashing(int hashcode){
        int location = hashcode % capacity;
        return location;
    }

    //    Menentukan ukuran hashMap
    public int size(){
        return this.size;
    }

    //    Mengecek apakah key tersedia atau tidak
    public boolean containsKey(Object key){
//        Jika key null
        if (key==null){
            if(table[0].getKey() == null){
                return true; // mengembalikan nilai true
            }
        }
//        Cari lokasi penyimpanan
        int location = Hashing(key.hashCode());
        Entry e = null; // entry null
//        Error handling
        try{
            e = table[location];
        } catch (NullPointerException ex){ }

//        Jika e != null dan kunci pada tabel == kunci yang kita cari
        if(e != null && e.getKey() == key){
            return true; // mengembalikan nilai true
        }
//        Default mengembalikan nilai false
        return false;
    }

    //    Mengecek apakah value tersedia atau tidak
    public boolean containsValue(Object value){
        for (int i = 0; i < table.length; i++) {
//            Jika table ke-i tidak kosong dan value yang ada di tabel == value yang di cari
            if(table[i] != null && table[i].getVal() == value){
                return true; // mengembalikan nilai true
            }
        }
        return false; // mengembalikan nilai false
    }

    //    Mengambil data pada hashMap berdasarkan key
    public V get (K key){
        V ret = null;
//        Jika key == null
        Entry<K, V> e = null;
        if(key == null){
//            Error handling
            try {
//                Cek e di table ke-0
                e = table[0];
            } catch (NullPointerException ex){}
//            Jika e ditable[0] != null
            if(e != null) {
//                Mengembalikan nilai value yang ada di table ke-0
                return (V) e.getVal();
            }
        } else {
//                Cari lokasi peyimpanan key dan value
            int location = Hashing(key.hashCode());
            try {
//                    cek e di table ke-lokasi
                e = table[location];
            } catch (NullPointerException ex) {}
//                Jika e != null & kunci pada tabel = kunci yang dicati
            if(e != null && e.getKey() == key){
//                    Mengembalikan value pada kunci tersebut
                return (V) e.getVal();
            }
        }
//        Mengembalikan nilai default jika semua tidak terpenuhi
        return ret;
    }

    //    Menaruh data ke dalam hashmap
    public V put(K key, V val){
        V ret = null;
//        Jika key null
        if(key == null){
            ret = putForNullKey(val);
            return ret;
//            Jika key tidak null
        } else {
            int location = Hashing(key.hashCode());
//            Jika lokasi melebihi kapasitas
            if(location >= capacity){
                System.out.println("Rehashing required");
//                Mengembalikan nilai null
                return null;
            }
            Entry<K, V> e = null;
            try {
                e = table[location];
            } catch (NullPointerException ex) {}
//            jika e != null && key pada hashmap == key yang diinputkan
            if(e != null && e.getKey() == key){
//                ret = value yang ada pada key yang diinputkan
                ret = (V) e.getVal();
            } else {
//                Jika e == null && key pada hashmap != key yang diinputkan
                Entry<K, V> eNew = new Entry<K, V>();
//                Set key dan value
                eNew.setKey(key);
                eNew.setVal(val);
                table[location] = eNew;
                size++;
            }
        }
        return ret;
    }

    //    Jika akan menaruh value pada key yang bernilai null
    private V putForNullKey(V val) {
        Entry<K, V> e = null;
        try{
            e = table[0];
        } catch (NullPointerException ex){
        }
        V ret = null;
//        Jika e != null && key pada hashmap == null
        if(e != null && e.getKey() == null){
            ret = (V) e.getVal();
//            put value
            e.setVal(val);
            return ret;
        } else {
            Entry<K, V> eNew = new Entry<K, V>();
//            set key jadi null
            eNew.setKey(null);
//            put value
            eNew.setVal(val);
            table[0] = eNew;
            size++;
        }
        return ret;
    }

    public V remove(K key){
        V ret = null;
//        Jika key == null
        Entry<K, V> e = null;
//                Cari lokasi peyimpanan key dan value
            int location = Hashing(key.hashCode());
            try {
//                    cek e di table ke-lokasi
                e = table[location];
            } catch (NullPointerException ex) {}
//                Jika e != null & kunci pada tabel = kunci yang dicati
            if(e != null && e.getKey() == key){
//                    Mengembalikan value pada kunci tersebut
                table[(int) key] = null;
                return (V) e.getVal();
            }
//        Mengembalikan nilai default jika semua tidak terpenuhi
        return ret;
    }

    public static void integerMenu(){
        System.out.println("( Assalamu 'alaikum Wr. Wb ) السَّلاَمُ عَلَيْكُمْ وَرَحْمَةُ اللهِ وَبَرَكَاتُهُ ");
        System.out.println("=== Integer Menu ===");
        System.out.println("1. Input data");
        System.out.println("2. Print data");
        System.out.println("3. Check Key");
        System.out.println("4. Check Size");
        System.out.println("5. Remove Key");
        System.out.println("6. Back to main menu");
    }
    public static void mainMenu(){
        System.out.println("=== Menu ===");
        System.out.println("1. Data String Only");
        System.out.println("2. Data String with key");
        System.out.println("3. Exit Application");
    }
    public static void main(String[] args) {
        HashMapImpl<Integer, String> hashMap1 = new HashMapImpl<Integer, String>();
        HashMapImpl<String, String> hashMap = new HashMapImpl<String, String>();
        Scanner scan = new Scanner(System.in);
        boolean end = false;
        do {
            mainMenu();
            System.out.println("Pilih");
            System.out.print("> ");
            int usrInput = scan.nextInt();
            switch (usrInput){
                case 1 :
                    hashMap.put("Nama", "Muhammad Irfani");
                    hashMap.put("Prodi", "Rekayasa Perangkat Lunak");
                    hashMap.put("Gender", "Laki-laki");

                    System.out.println("Nama :\t"+hashMap.get("Nama"));
                    System.out.println("Prodi :\t"+hashMap.get("Prodi"));
                    System.out.println("Gendedr :\t"+hashMap.get("Gender"));

                    System.out.println("Check Value >>>\t"+hashMap.containsValue("Muhammad Irfani"));
                    System.out.println("Check Key >>>\t"+hashMap.containsKey("Prodi"));
                    System.out.println("Check Size >>>\t"+hashMap.size());

                    hashMap1.put(null, "Semangka");
                    hashMap1.put(null, "Nanas");
                    System.out.println("Buah pada key null : "+hashMap1.get(null));
                    System.out.println("Benarkah key pada hashmap tersebut bernilai null ? "+hashMap1.containsKey(null));
                    System.out.println("Benarkah key pada hashmap tersebut bernilai null ? "+hashMap1.containsValue("Semangka"));
                    break;
                case 2 :
                    boolean repeat = true;
                    do {
                        integerMenu();
                        System.out.print(">\t");
                        usrInput = scan.nextInt();
                        if (usrInput == 1){
                            System.out.print("Input Key : ");
                            int integerInput = scan.nextInt();
                            System.out.print("input String Value :");
                            String stringInput = scan.next();
                            hashMap1.put(integerInput, stringInput);
                        }else if (usrInput == 2){
                            System.out.print("Input Key >\t");
                            int key = scan.nextInt();
                            System.out.println(hashMap1.get(key));
                        }else if (usrInput == 3){
                            System.out.println("Input Contain search");
                            System.out.println(">\t");
                            int containInteger = scan.nextInt();
                            System.out.println(">>>"+hashMap1.containsKey(containInteger));
                        }else if (usrInput == 4){
                            System.out.print(">>>\t"+hashMap1.size());
                            System.out.println();
                        }else if (usrInput == 6){
                            repeat = false;
                        }else if (usrInput == 5){
                            System.out.println("Input Key To Remove");
                            System.out.print(">\t");
                            int removeInteger = scan.nextInt();
                            if (hashMap1.containsKey(removeInteger)){
                                System.out.println("\tTrue");
                                hashMap1.remove(removeInteger);
                                System.out.println("Data >> \'"+removeInteger+"\'Removed");
                            }else {
                                System.out.println();
                                System.out.println("I'm soory data not found !!!");
                            }
                        }
                    }while (repeat == true);
                    break;
                case 3 :
                    System.out.println("( Wassalamu 'alaikum Wr. Wb) وَ السَّلاَمُ عَلَيْكُمْ وَرَحْمَةُ اللهِ وَبَرَكَاتُهُ ");
                    return;
            }
        }while (end ==  false);
    }
}
