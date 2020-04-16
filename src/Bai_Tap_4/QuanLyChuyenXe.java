/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_Tap_4;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QuanLyChuyenXe {

    ArrayList<ChuyenXe> dsChuyenXe;
    public QuanLyChuyenXe() {
        dsChuyenXe  = new ArrayList<>();
    }
    
    public void them(ChuyenXe chuyenXe) 
    {
        dsChuyenXe.add(chuyenXe);
    }

    public ArrayList<ChuyenXe> getDsChuyenXe() 
    {
        return dsChuyenXe;
    }
    
    public  void inDs() 
    {
        for (int i = 0; i < dsChuyenXe.size(); i++) 
        {
            System.out.println(dsChuyenXe.get(i).getThongTin());
        }
    }
    
    public double tinhTongDoanhThuNoiThanh() 
    {
        double doanhthu = 0;
        for (int i =0; i < dsChuyenXe.size(); i++) 
        {
            if (dsChuyenXe.get(i) instanceof XeNoiThanh) {
                doanhthu += dsChuyenXe.get(i).getdoanhthu();
            } else {
            }
        }
        return doanhthu;
    }
    
    public double tinhTongDoanhThuNgoaiThanh() {
        double doanhthu =0;
        for (int i = 0; i < dsChuyenXe.size(); i++) {
            if (dsChuyenXe.get(i) instanceof XeNgoaiThanh)
                doanhthu += dsChuyenXe.get(i).getdoanhthu();
        }
        return doanhthu;
    }
    
    public double tinhTongDoanhThu() {
        double doanhthu =0;
        for (int i = 0; i < dsChuyenXe.size(); i++) {
            doanhthu += dsChuyenXe.get(i).getdoanhthu();
        }
        return doanhthu;
    }

    void them(XeNoiThanh Noithanh1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
