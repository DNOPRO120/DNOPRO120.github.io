import java.util.Scanner;

public class sinhVien {
    private int maSV;
    private String name;
    private int age;
    private String address;

    public sinhVien(int maSV, String name, int age, String address) {
        this.maSV = maSV;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã SV: ");
        maSV = sc.nextInt();
        System.out.println("Nhập tên SV: ");
        name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        age = sc.nextInt();
        System.out.println("Nhập địa chỉ: ");
        address = sc.nextLine();
    }

    @Override
    public String toString() {
        return "sinhVien{" +
                "maSV=" + maSV +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
