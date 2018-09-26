/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author User
 */
public class PembayaranGaji {
    public int hitunganGaji(Pegawai peg){
        int uang = peg.gaji();
        if(peg instanceof Direktur)
            uang += ((Direktur)peg).tunjangan();
        if(peg instanceof Staf)
            uang += ((Staf)peg).bonus();
        return uang;
    }
    public static void main(String[] args) {
        PembayaranGaji pg = new PembayaranGaji();
        Staf ali = new Staf();
        Direktur Tony = new Direktur();
        System.out.println("Gaji yang dibayarkan untuk staf = "+pg.hitunganGaji(ali));
        System.out.println("Gaji yang dibayarkan untuk Direktur = "+pg.hitunganGaji(Tony));
        
    }
}
