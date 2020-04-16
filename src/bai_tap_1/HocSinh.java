/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_1;

/**
 *
 * @author Admin
 */
public class HocSinh extends CaNhan{
    
    private String Lop;
    private String NangKhieu;
    
    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public String getNangKhieu() {
        return NangKhieu;
    }

    public void setNangKhieu(String NangKhieu) {
        this.NangKhieu = NangKhieu;
    }

    public HocSinh(String Lop, String NangKhieu, String hoTen, int Tuoi, String DiaChi, String SDT) {
        super(hoTen, Tuoi, DiaChi, SDT);
        this.Lop = Lop;
        this.NangKhieu = NangKhieu;
    }

    @Override
    public String HienThiTT() {
        return super.HienThiTT()+" ,Lớp: "+getLop()+" ,Năng khiếu: "+getNangKhieu(); //To change body of generated methods, choose Tools | Templates.
    }
}
