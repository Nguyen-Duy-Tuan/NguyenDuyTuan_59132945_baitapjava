/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_Tap_2;

import Bai_Tap_1_Java.NhanVien;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class QuanLyNhanVien extends IQuanLy {
ArrayList<NhanVien> dsNV = new ArrayList<>();
    @Override
    public void them(NhanVien nv) {
    dsNV.add(nv);
    }

    @Override
    public void inDS() {
         for(int i=0; i<NhanVien.size(); i++){
             NhanVien.get(i);
         }
    }

    
}
