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
        //khởi tạo các học sinh, giáo viên và danh sách
        HocSinh hocSinh1 = new HocSinh("59cntt3", "k", "Vũ Gia Khiêm" , 21 , "Nha Trang", "0123456789");
        HocSinh hocSinh2 = new HocSinh("59cntt3", "k", "Vũ Gia Bảo" , 22 , "Diên Khánh", "0356234567");
        HocSinh hocSinh3 = new HocSinh("59cntt3", "k", "Lê Khánh Phương" , 23, "Đà Nẵng", "0643889421");
        
        GiaoVien gvcn = new GiaoVien("toán", "toán", "Ngô Bảo Châu", 33, "Nha Trang", "445678");
        GiaoVien gvGD1 = new GiaoVien("lý", "lý", "Albert Einstein", 44, "Nha Trang", "0123456789");
        GiaoVien gvGD2 = new GiaoVien("Hóa", "Hóa", "Faraday", 55, "Nha Trang", "0754326896");
        
        LopHoc lh = new LopHoc(gvcn);
        lh.themHocSinh(hocSinh1);
        lh.themHocSinh(hocSinh2);
        lh.themHocSinh(hocSinh3);
        
        lh.themGVGD(gvGD1);
        lh.themGVGD(gvGD2);
        System.out.println("In danh sách học sinh: ");
        lh.inDSHS();
        
        System.out.println("In danh sách giáo viên giảng dạy: ");
        lh.inDSGVGD();
    }
}
