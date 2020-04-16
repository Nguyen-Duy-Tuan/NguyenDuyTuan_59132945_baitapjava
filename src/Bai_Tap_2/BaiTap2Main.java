/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_Tap_2;

import Bai_Tap_1_Java.NhanVien;

/**
 *
 * @author Admin
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        IQuanLy qlNV = new QuanLyNhanVien();
        
        NhanVien NV1 = new NhanVien("Nguyen Duy Tuan", 21, "Phu yen", 20123123, 202);        
        NhanVien NV2 = new NhanVien("Nguyen Hong ", 21, "Nha Trang", 3000000, 150);
        NhanVien NV3 = new NhanVien("Le Thanh ", 21, "Khanh Hoa", 3800000, 200);
        NhanVien NV4 = new NhanVien("Nguyen Ton Vi", 21, "Khanh Hoa", 2500000, 195);
        NhanVien NV5 = new NhanVien("Ngeh Ba Khen", 25, "long bien", 1000000, 190);
        qlNV.them(NV1);
        qlNV.them(NV2);
        qlNV.them(NV3);
        qlNV.them(NV4);
        qlNV.them(NV5);
        qlNV.inDS();
    }
}
