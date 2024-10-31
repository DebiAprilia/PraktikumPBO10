/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO10;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args){
        Pembayaran elektronik = new Elektronik();
        double hargaElektronik = 1000000;
        System.out.println("Harga Elektronik : " + hargaElektronik);
        System.out.println("Pajak Elektronik : " + elektronik.hitungPajak(hargaElektronik));
        
        Pembayaran makanan = new Makanan();
        double hargaMakanan = 50000;
        System.out.println("Harga Makanan : " + hargaMakanan);
        System.out.println("Pajak Makanan : " + makanan.hitungPajak(hargaMakanan));
    }
}
