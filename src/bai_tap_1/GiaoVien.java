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
public class GiaoVien extends CaNhan{
    private String BoMon;
    private String ToBoMon;

    public GiaoVien(String BoMon, String ToBoMon, String hoTen, int Tuoi, String DiaChi, String SDT) {
        super(hoTen, Tuoi, DiaChi, SDT);
        this.BoMon = BoMon;
        this.ToBoMon = ToBoMon;
    }
    
    public String getBoMon() {
        return BoMon;
    }

    public void setBoMon(String BoMon) {
        this.BoMon = BoMon;
    }

    public String getToBoMon() {
        return ToBoMon;
    }

    public void setToBoMon(String ToBoMon) {
        this.ToBoMon = ToBoMon;
    }

    @Override
    public String HienThiTT() {
        return super.HienThiTT()+" ,Bộ môn: "+getBoMon()+" ,Tổ bộ môn: "+getToBoMon(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
