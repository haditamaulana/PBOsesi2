import java.util.Scanner;

// Class untuk Segitiga
class Segitiga {
    // Properties
    double alas;
    double tinggi;

    // Constructor
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Method untuk menghitung luas segitiga
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}

// Class untuk Books
class Books {
    // Properties
    String author;
    String title;
    double price;
    String publisherNumber;

    // Constructor
    public Books(String author, String title, double price, String publisherNumber) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.publisherNumber = publisherNumber;
    }

    // getPrice()mengambil harga buku
    public double getPrice() {
        return price;
    }
}

public class Pbosesi2 {
    public static void main(String[] args) {
        System.out.println("Hadita Maulana - 20220040013 - TI22E");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang alas segitiga: ");
        double alasSegitiga = scanner.nextDouble();

        System.out.print("Masukkan tinggi segitiga: ");
        double tinggiSegitiga = scanner.nextDouble();

        // Membuat objek Segitiga
        Segitiga segitiga = new Segitiga(alasSegitiga, tinggiSegitiga);
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
        scanner.nextLine();

        // Input pengguna untuk Buku
        System.out.print("Masukkan penulis buku: ");
        String author = scanner.nextLine();

        System.out.print("Masukkan judul buku: ");
        String title = scanner.nextLine();

        System.out.print("Masukkan harga buku: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Masukkan nomor penerbit buku: ");
        String publisherNumber = scanner.nextLine();

        // Membuat objek Buku
        Books book = new Books(author, title, price, publisherNumber);
        System.out.println("Harga Buku: " + book.getPrice());
    }
}
