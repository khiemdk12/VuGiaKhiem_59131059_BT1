
import java.util.ArrayList;
import java.util.List;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class QLDS implements IQLDS{
    
    List<CaNhan> dsCaNhan;

    public QLDS() {
        dsCaNhan = new ArrayList<>();
    }
    
    @Override
    public void them(CaNhan p) {
        dsCaNhan.add(p);
    }

    @Override
    public void xoa(String ten) {
        dsCaNhan.removeIf( i -> i.getHoTen().equals(ten)  );
    }
    
    @Override
    public void inDS() {
        for (int i = 0; i < dsCaNhan.size(); i++){
            System.out.println("Ca Nhan " + (i + 1) + " : " + "\n" + dsCaNhan.get(i).HienThiTT());
        }
    }
}
