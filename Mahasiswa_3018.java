/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.uts_no3_a_3018;

/**
 *
 * @author HP
 */
public class Mahasiswa_3018 {
    protected String nim_3018;
    protected String nama_3018;
    protected String jurusan_3018;
    protected int ipk_3018;
    
    public Mahasiswa_3018(String nim_3018, String nama_3018, String jurusan_3018, int ipk_3018){
        this.nama_3018 = nama_3018;
        this.nim_3018 = nim_3018;
        this.jurusan_3018 = jurusan_3018;
        this.ipk_3018 = ipk_3018;
    }
    public void tampilDataMhs(){
         System.out.println("Nama : " + nama_3018);
        System.out.println("NIM : " + nim_3018);
        System.out.println("Jurusan : " + jurusan_3018);
        System.out.println("IPK : " + ipk_3018);
    }
}

