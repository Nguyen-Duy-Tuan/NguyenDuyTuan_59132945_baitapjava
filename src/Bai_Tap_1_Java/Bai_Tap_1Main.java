/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_Tap_1_Java;

/**
 *
 * @author Admin
 */
public class Bai_Tap_1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        NhanVien NV1 = new NhanVien("Nguyen Duy Tuan", 21, "Phu Yen", 1000200, 100);
        NhanVien NV2 = new NhanVien("Le Hoan Vinh", 21, "Khanh Hoa", 1404140, 120);
        System.out.println(NV1.getThongTin());
        System.out.println(NV2.getThongTin());
    }
}