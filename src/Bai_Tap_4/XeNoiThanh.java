/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_Tap_4;

/**
 *
 * @author Admin
 */
public class XeNoiThanh extends ChuyenXe {

     private String SoTuyen;
    private double SoKmDiDuoc;
    public XeNoiThanh()
    {
        super();
        this.SoTuyen = "";
        this.SoKmDiDuoc = 0;
    }

    public void setSoTuyen(String SoTuyen) 
    {
        this.SoTuyen = SoTuyen;
    }

    public void setSoKmDiDuoc(double SoKmDiDuoc) 
    {
        this.SoKmDiDuoc = SoKmDiDuoc;
    }
 
    

    @Override
    public String getThongTin() {
        return "Xe nội thành: mã số chuyến: " + MaSoChuyen + ", "
                + "Tên tài xế: " + HoTenTaiXe + ", "
                + "Số xe: " + SoXe + ", "
                + "Doanh thu: " + doanhthu + ", "
                + "Tuyến: " + SoTuyen + ", "
                + "Số km đi được: " + SoKmDiDuoc;
    }
    
}
