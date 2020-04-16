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
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        HocSinh hs1 = new HocSinh("59CNTT3", "java", "Nguyen Duy Tuan", 21, "Phu yen", "532");
        HocSinh hs2 = new HocSinh("59CNTT3", "C#", "Nguyen song Thanh", 24, "Khanh Hoa", "35235");
        HocSinh hs3 = new HocSinh("59CNTT3", "C++", "Nguyen Minh Hoang", 26, "Khanh Hoa", "5225");
      
        GiaoVien gv1 = new GiaoVien("Do Hoa", "CNTT", "Nguyen Anh", 30, "Khanh Hoa", "12335");
        GiaoVien gv2 = new GiaoVien("Toan", "CNTT", "Nguyen Van Binh", 34, "Khanh Hoa", "2145262");
        GiaoVien gv3 = new GiaoVien("Tieng Anh", "NN", "Nguyen Van C", 43, "Khanh Hoa", "432232");
        
        LopHoc lophoc = new LopHoc();
        lophoc.themHocSinh(hs1);
        lophoc.themHocSinh(hs2);
        lophoc.themHocSinh(hs3);
        
        lophoc.themGVGD(gv1);
        lophoc.themGVGD(gv2);
        lophoc.themGVGD(gv3);
        
        System.out.println(lophoc.inDSHS());
        
        System.out.println(lophoc.inDSGVGD());
    }
}
