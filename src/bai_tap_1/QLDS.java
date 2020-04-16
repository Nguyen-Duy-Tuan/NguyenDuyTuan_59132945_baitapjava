/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_1;

import java.util.ArrayList;
/**
 *implements IQLDS
 * @author Admin
 */

public class QLDS extends IQLDS {
    
    ArrayList<CaNhan> CaNhanN = new ArrayList<>();
    @Override
    public int them(CaNhan p) {
        CaNhanN.add(p);
        return CaNhanN.size();
    }

    @Override
    public int xoa(String ten) {
        for(int i=0; i <CaNhanN.size(); i++){
            if(CaNhanN.get(i).getHoTen().equals(ten))
                CaNhanN.remove(i);
        }
        return CaNhanN.size();
    }

    @Override
    public void inDS() {
         for(int i=0; i<CaNhanN.size(); i++){
             CaNhanN.get(i).HienThiTT();
         }
    }
}
