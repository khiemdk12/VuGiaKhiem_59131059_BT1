/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public abstract class CaNhan {
    private String hoTen;
    private int tuoi;
    private String diaChi;
    private String sdt;

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSdt() {
        return sdt;
    }
    
    
    public CaNhan(String hoTen, int tuoi, String diaChi, String sdt) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }
    
    public String HienThiTT(){
        return "Ho ten: " + hoTen + 
               "\nTuoi: " + tuoi + 
               "\nDia chi: " + diaChi + 
               "\nsdt: " + sdt;
    }
}
