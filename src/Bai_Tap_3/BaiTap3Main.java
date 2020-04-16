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
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
          SinhVienPoly svPoly = new SinhVienBiz("Nguyen Duy Tuan","DESIGN",7,8);
        SinhVienIT svIT = new SinhVienIT( "Ho Thanh Thai","CNTT",6,7,10);
        SinhVienBiz svBiz = new SinhVienBiz("Ly Tuan Ty","TESTER",1,6);
        
        svPoly.xuat();
        System.out.println("Diem: " + svPoly.getDiem() 
                + "\nHoc luc: " + svPoly.getHocLuc() + "\n");
        svIT.xuat();
        System.out.println("Diem: " + svIT.getDiem() 
                + "\nHoc luc: " + svIT.getHocLuc() + "\n");
        svBiz.xuat();
        System.out.println("Diem: " + svBiz.getDiem() 
                + "\nHoc luc: " + svBiz.getHocLuc() );
    }
}
