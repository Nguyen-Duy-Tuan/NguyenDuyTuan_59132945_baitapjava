/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_1;

import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class LopHoc {
    
    ArrayList<HocSinh> HocSinhN = new ArrayList<>();
    ArrayList<GiaoVien> GiaoVienN = new ArrayList<>();
    
    public int themHocSinh(HocSinh hs){
       HocSinhN.add(hs);
       return HocSinhN.size();
   }
    
   public int themGVGD(GiaoVien gv){
       GiaoVienN.add(gv);
       return GiaoVienN.size();
   }
   
   public int inDSHS(){
       int i = 1;
       for (HocSinh hs: HocSinhN){
           System.out.println("Học sinh "+i+" :");
           System.out.println(hs.HienThiTT());
           i++;
       }
       return 0;
   }
   public int inDSGVGD(){
       int j = 1;
       for (GiaoVien gv : GiaoVienN){
           System.out.println("Giáo viên "+j+" :");
           System.out.println(gv.HienThiTT());
           j++;
       }
       return 0;
   }
    
}
