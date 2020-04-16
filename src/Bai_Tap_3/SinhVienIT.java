/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_Tap_3;

/**
 *
 * @author Admin
 */
public class SinhVienIT {

    public double diemJava;
    public double diemCss;
    public double diemHtml;

    public SinhVienIT(double a, double b, double c) {       
        this.diemJava = a;
        this.diemCss = b;
        this.diemHtml = c;
    }

    SinhVienIT(String ho_Thanh_Thai, String cntt, int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double getDiem() {
        
        return (2*this.diemJava + this.diemCss + this.diemHtml)/4;
    }

    void xuat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getHocLuc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
