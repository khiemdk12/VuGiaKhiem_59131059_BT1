/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class HocSinh extends CaNhan{
    
    private String lop;
    private String nangKhieu;
    
    @Override
    public String HienThiTT(){
        return super.HienThiTT() + 
               "Lop: " + lop +
               "\nNang Khieu: " + nangKhieu;
    }
    
}
