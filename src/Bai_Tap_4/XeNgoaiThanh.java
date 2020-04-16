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
public class XeNgoaiThanh extends ChuyenXe{

    private String NoiDen;
    private int SoNgayDiDuoc;
    public XeNgoaiThanh()
    {
        super();
        this.NoiDen="";
        this.SoNgayDiDuoc=0;
    }

    public void setNoiDen(String NoiDen) 
    {
        this.NoiDen=NoiDen;
    }

    public void setSoNgayDiDuoc(int SoNgayDiDuoc) 
    {
        this.SoNgayDiDuoc=SoNgayDiDuoc;
    }

    @Override
    public String getThongTin() {
        return "Xe ngoại thành: mã số chuyến: " + MaSoChuyen + ", "
                + "Tên tài xế: " + HoTenTaiXe + ", "
                + "Số xe: " + SoXe + ", "
                + "Doanh thu: " + doanhthu + ", "
                + "Nơi đến: " + NoiDen + ", "
                + "Số ngày đi được: " + SoNgayDiDuoc;
    }
    
}
