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
public abstract class ChuyenXe {
    protected String MaSoChuyen, HoTenTaiXe, SoXe;
    protected double doanhthu;
    
    public ChuyenXe()
{
    
    this.MaSoChuyen= "";
    this.HoTenTaiXe= "";
    this.SoXe= "";
    this.doanhthu= 0;
}

    public String getMaSoChuyen()
    {
        return MaSoChuyen;
    }
    public void setMaSoChuyen(String MaSoChuyen)
    {
        this.MaSoChuyen=MaSoChuyen;
    }
    public String getHoTenTaiXe()
    {
        return HoTenTaiXe;
    }
   public void setHoTenTaiXe(String HoTenTaiXe)
   {
       this.HoTenTaiXe= HoTenTaiXe;
   }
   public String getSoXe()
   {
      return SoXe;
   }
    public void setSoXe(String SoXe)
   {
       this.SoXe= SoXe;
   }
    public double getdoanhthu()
    {
        return doanhthu;
    }
    public void setdoanhthu(double doanhthu)
    {
        this.doanhthu=doanhthu;
    }
    public abstract String getThongTin();  
}
