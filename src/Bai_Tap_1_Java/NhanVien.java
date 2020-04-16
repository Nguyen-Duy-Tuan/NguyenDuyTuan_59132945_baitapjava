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
public class NhanVien {

    public static int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private String ten;
    private int tuoi;
    private String diachi;
    private double luong;
    private int tongsogiolam;
    private String getTongSoGioLam;
    
    public NhanVien(String ten, int tuoi, String diachi, double luong, int tongsogiolam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.luong= luong;
        this.tongsogiolam = tongsogiolam;
    }
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getTongSoGioLam() {
        return tongsogiolam;
    }

    public void setTongSoGioLam(int tongsogiolam) {
        this.tongsogiolam = tongsogiolam;
    }
    //phuong thuc/
    public double tinhthuong()
    {
        if(this.tongsogiolam >= 200)
            return this.luong * 0.2;
        else if(this.tongsogiolam >= 100 &&  this.tongsogiolam < 200)
            return this.luong * 0.1;
        else
            return 0;
    }

    public String getThongTin()
    {
        return "Họ Tên: " + getTen() + " Tuổi: " + getTuoi() + " Địa Chỉ: " + getDiachi()+ " Tiền Lương: " + getLuong() + " Tổng Số Giờ Làm: " + getTongSoGioLam + " Tiền Thưởng: " + tinhthuong() ;
    }

}
