/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class BtMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        HocSinh hs1 = new HocSinh("59cntt3", "k", "Vũ" , 21 , "abc", "1");
        HocSinh hs2 = new HocSinh("59cntt3", "k", "Gia" , 22 , "abc", "2");
        HocSinh hs3 = new HocSinh("59cntt3", "k", "Khiêm" , 23, "abc", "3");
        
        GiaoVien gvcn = new GiaoVien("toan", "toan", "GVCN", 33, "abc", "4");
        GiaoVien gv1 = new GiaoVien("ly", "ly", "Giáo", 44, "abc", "5");
        GiaoVien gv2 = new GiaoVien("hoa", "hoa", "Viên", 55, "abc", "5");
        
        LopHoc lh = new LopHoc(gvcn);
        lh.themHocSinh(hs1);
        lh.themHocSinh(hs2);
        lh.themHocSinh(hs3);
        
        lh.themGVGD(gv1);
        lh.themGVGD(gv2);
        
        lh.inDSHS();
        lh.inDSGVGD();
    }
    
}
