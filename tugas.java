import java.util.Scanner;
public class tugas {
    public static void main(String[] args) {
        
        Scanner input20 = new Scanner (System.in);

        String jenisbuku;
        int jumlah;
        double diskon, totalharga, totaldiskon, harga=20000;

        System.out.println("masukan jenis buku yang ingin anda beli");
        jenisbuku = input20.nextLine();
        System.out.println("masukan jumlah buku yang ingin anda beli");
        jumlah = input20.nextInt();

        if (jenisbuku.equalsIgnoreCase("kamus")){
            if (jumlah <= 2)
            diskon = 0.1;
            else 
            diskon = 0.12;
            totaldiskon =  harga*diskon*jumlah;
            totalharga = (harga*jumlah)- diskon ;
            System.out.println("diskon anda " + totaldiskon);
            System.out.println(" anda harus membayar " + totalharga);
        }
        else if (jenisbuku.equalsIgnoreCase("novel")){
            if (jumlah <= 3)
            diskon = 0.08;
            else 
            diskon = 0.09;
            totaldiskon =  harga*diskon*jumlah;
            totalharga = (harga*jumlah)- diskon ;
            System.out.println("diskon anda " + totaldiskon);
            System.out.println(" anda harus membayar " + totalharga);
        }
        else if (jumlah >= 4){
            diskon= 0.05;
            totaldiskon =  harga*diskon*jumlah;
            totalharga = (harga*jumlah)- diskon ;
            System.out.println("diskon anda " + totaldiskon);
            System.out.println(" anda harus membayar " + totalharga);
    }
       else 
       System.out.println("masukan tidak valid");

    
        

    }
}
