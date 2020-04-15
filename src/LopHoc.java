/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class LopHoc {
    private QLDS dshs; //danh sách học sinh
    private QLDS dsgvgd; //danh sách giáo viên giảng dạy
    private GiaoVien gvcn; // giáo viên chủ nhiệm

    public LopHoc(GiaoVien gvcn) {
        this.gvcn = gvcn;
        dshs = new QLDS();
        dsgvgd = new QLDS();
    }
    
    public void themHocSinh (HocSinh hs){
        dshs.them(hs);
    }
    
    public void themGVGD (GiaoVien gv){
        dsgvgd.them(gv);
    }
    
    public void inDSHS (){
        dshs.inDS();
    }
    
    public void inDSGVGD (){
        dsgvgd.inDS();
    }
}
