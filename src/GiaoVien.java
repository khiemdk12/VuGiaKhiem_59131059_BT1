/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class GiaoVien extends CaNhan{
    private String monDay;
    private String toBoMon;

    @Override
    public String HienThiTT() {
        return super.HienThiTT() + 
               "Mon day: " + monDay + 
               "\nTo Bo Mon: " + toBoMon; 
    }
    
}
