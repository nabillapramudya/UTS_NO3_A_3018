/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.uts_no3_a_3018;

/**
 *
 * @author HP
 */
public class AsisPrak_3018 extends Mahasiswa_3018 {
    public String mkAsistensi_3018;
    public int jmlPertemuan_3018;
    
    public AsisPrak_3018(String nim_3018, String nama_3018, String jurusan_3018, int ipk_3018, String mkAsistensi_3018, int jmlPertemuan_3018){
        super(nama_3018, nim_3018, jurusan_3018, ipk_3018);
        this.mkAsistensi_3018 = mkAsistensi_3018;
        this.jmlPertemuan_3018 = jmlPertemuan_3018;
    }
     public double totalPendapatan(){
        return jmlPertemuan_3018 * 50000;
    }
      public void tampilDataMhs(){
          System.out.println("Mata kuliah : " +mkAsistensi_3018);
          System.out.println("Jumlah pertemuan : " + jmlPertemuan_3018);
    }
}
