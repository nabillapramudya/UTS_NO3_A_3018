/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.uts_no3_a_3018;

/**
 *
 * @author HP
 */
public class StuStaff_3018 extends Mahasiswa_3018 {
    public int unitKerja_3018;
    public int jamKerja_3018;
    
    public StuStaff_3018 (String nama_3018,String nim_3018,String jurusan_3018,int ipk_3018,int unitKerja_3018,int jamKerja_3018){
        super(nama_3018,nim_3018,jurusan_3018,ipk_3018);
        this.unitKerja_3018 = unitKerja_3018;
        this.jamKerja_3018 = jamKerja_3018;
    }
    public double totalPendapatan(){
        return jamKerja_3018 * 30000;
    }
    public void tampilDataMhs(){
        System.out.println("Unit kerja : " + unitKerja_3018);
        System.out.println("Jam kerja : " + jamKerja_3018);
        
    }
}
