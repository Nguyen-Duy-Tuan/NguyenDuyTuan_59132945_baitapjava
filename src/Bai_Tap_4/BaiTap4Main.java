/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_Tap_4;

import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class BaiTap4Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner nhap=new Scanner(System.in);
        QuanLyChuyenXe QuanLy=new QuanLyChuyenXe();

           XeNoiThanh Noithanh1=new XeNoiThanh();
        System.out.println("Mã số chuyến: ");
        Noithanh1.setMaSoChuyen(nhap.nextLine());
        System.out.println("Tên tài xế: ");
        Noithanh1.setHoTenTaiXe(nhap.nextLine());
        System.out.println("Số xe: ");
        Noithanh1.setSoXe(nhap.nextLine());
        System.out.println("Doanh thu: ");
        Noithanh1.setdoanhthu(nhap.nextDouble());
        nhap.nextLine();
        System.out.println("Tuyến: ");
        Noithanh1.setSoTuyen(nhap.nextLine());
        System.out.println("Số km đi được: ");
        Noithanh1.setSoKmDiDuoc(nhap.nextInt());
        nhap.nextLine();
        
           XeNoiThanh Noithanh2=new XeNoiThanh();
        System.out.println("Mã số chuyến: ");
        Noithanh2.setMaSoChuyen(nhap.nextLine());
        System.out.println("Tên tài xế: ");
        Noithanh2.setHoTenTaiXe(nhap.nextLine());
        System.out.println("Số xe: ");
        Noithanh2.setSoXe(nhap.nextLine());
        System.out.println("Doanh thu: ");
        Noithanh2.setdoanhthu(nhap.nextDouble());
        nhap.nextLine();
        System.out.println("Tuyến: ");
        Noithanh2.setSoTuyen(nhap.nextLine());
        System.out.println("Số km đi được: ");
        Noithanh2.setSoKmDiDuoc(nhap.nextInt());
        nhap.nextLine();
        
           XeNoiThanh Noithanh3=new XeNoiThanh();
        System.out.println("Mã số chuyến: ");
        Noithanh3.setMaSoChuyen(nhap.nextLine());
        System.out.println("Tên tài xế: ");
        Noithanh3.setHoTenTaiXe(nhap.nextLine());
        System.out.println("Số xe: ");
        Noithanh3.setSoXe(nhap.nextLine());
        System.out.println("Doanh thu: ");
        Noithanh3.setdoanhthu(nhap.nextDouble());
        nhap.nextLine();
        System.out.println("Tuyến: ");
        Noithanh3.setSoTuyen(nhap.nextLine());
        System.out.println("Số km đi được: ");
        Noithanh3.setSoKmDiDuoc(nhap.nextInt());
        nhap.nextLine();
        
        
            XeNgoaiThanh Ngoaithanh1=new XeNgoaiThanh();
        System.out.println("Mã số chuyến: ");
        Ngoaithanh1.setMaSoChuyen(nhap.nextLine());
        System.out.println("Tên tài xế: ");
        Ngoaithanh1.setHoTenTaiXe(nhap.nextLine());
        System.out.println("Số xe: ");
        Ngoaithanh1.setSoXe(nhap.nextLine());
        System.out.println("Doanh thu: ");
        Ngoaithanh1.setdoanhthu(nhap.nextDouble());
        nhap.nextLine();
        System.out.println("Nơi đến: ");
        Ngoaithanh1.setNoiDen(nhap.nextLine());
        System.out.println("Số ngày: ");
        Ngoaithanh1.setSoNgayDiDuoc(nhap.nextInt());
        
        
             XeNgoaiThanh Ngoaithanh2=new XeNgoaiThanh();
        System.out.println("Mã số chuyến: ");
        Ngoaithanh2.setMaSoChuyen(nhap.nextLine());
        System.out.println("Tên tài xế: ");
        Ngoaithanh2.setHoTenTaiXe(nhap.nextLine());
        System.out.println("Số xe: ");
        Ngoaithanh2.setSoXe(nhap.nextLine());
        System.out.println("Doanh thu: ");
        Ngoaithanh2.setdoanhthu(nhap.nextDouble());
        nhap.nextLine();
        System.out.println("Nơi đến: ");
        Ngoaithanh2.setNoiDen(nhap.nextLine());
        System.out.println("Số ngày: ");
        Ngoaithanh2.setSoNgayDiDuoc(nhap.nextInt());
        
        
             XeNgoaiThanh Ngoaithanh3=new XeNgoaiThanh();
        System.out.println("Mã số chuyến: ");
        Ngoaithanh3.setMaSoChuyen(nhap.nextLine());
        System.out.println("Tên tài xế: ");
        Ngoaithanh3.setHoTenTaiXe(nhap.nextLine());
        System.out.println("Số xe: ");
        Ngoaithanh3.setSoXe(nhap.nextLine());
        System.out.println("Doanh thu: ");
        Ngoaithanh3.setdoanhthu(nhap.nextDouble());
        nhap.nextLine();
        System.out.println("Nơi đến: ");
        Ngoaithanh3.setNoiDen(nhap.nextLine());
        System.out.println("Số ngày: ");
        Ngoaithanh3.setSoNgayDiDuoc(nhap.nextInt());
        
  
        QuanLy.them(Noithanh1);
        QuanLy.them(Noithanh2);
        QuanLy.them(Noithanh3);
        
        QuanLy.them(Ngoaithanh1);
        QuanLy.them(Ngoaithanh2);
        QuanLy.them(Ngoaithanh3);
        
        
        
        QuanLy.inDs();
        System.out.println("Doanh thu nội thành: " + QuanLy.tinhTongDoanhThuNoiThanh());
        System.out.println("Doanh thu ngoại thành: " + QuanLy.tinhTongDoanhThuNgoaiThanh());
        System.out.println("Tổng doanh thu: " + QuanLy.tinhTongDoanhThu());    
    }
}
