import java.util.ArrayList;

public class quanLi {

    private ArrayList<sinhVien> sinhViens;
    public quanLi() {
        sinhViens = new ArrayList<sinhVien>();
    }

    public quanLi(ArrayList<sinhVien> sinhViens) {
        this.sinhViens = sinhViens;
    }

    public void addSinhVien(sinhVien sinhVien){
        for (sinhVien s: sinhViens){
            if (s.getMaSV() == sinhVien.getMaSV()){
                System.out.println("Sinh viên đã tồn tại. Vui lòng nhập lại.");
                return;
            }
            sinhViens.add(sinhVien);
        }
    }
}
