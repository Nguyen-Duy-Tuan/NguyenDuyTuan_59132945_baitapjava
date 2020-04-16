
package bai_tap_1;

/**
 *
 * @author Admin
 */
public class CaNhan {
    private String hoTen;
    private int Tuoi;
    private String DiaChi;
    private String SDT;
   
    public CaNhan(String hoTen, int Tuoi, String DiaChi, String SDT){
        this.hoTen = hoTen;
        this.Tuoi = Tuoi;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
    }
    
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSdt() {
        return SDT;
    }

    public void setSdt(String SDT) {
        this.SDT = SDT;
    }
    
    public String HienThiTT(){   
        return "Họ tên: "+getHoTen()+" ,Tuổi: "+getTuoi()+" ,Địa chỉ: "+getDiaChi()+" ,SDT: "+getSdt();
    }
    
}
