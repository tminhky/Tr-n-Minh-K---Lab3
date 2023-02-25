package Lab3;

public class bai3lab3 {
    private String tenNhanvien;
    private double luongCoban;
    private double heSoluong;
    private static double Luong_max = 10000000;

public bai3lab3(String tenNhanvien, double luongCoban, double heSoluong){
    this.tenNhanvien = tenNhanvien;
    this.luongCoban = luongCoban;
    this.heSoluong = heSoluong;   
}
public double tinhLuong() {
    return luongCoban * heSoluong;
}
public void inTTin() {
    System.out.println("Tên nhân viên: " + tenNhanvien);
    System.out.println("Lương cơ bản: " + luongCoban);
    System.out.println("Hệ số lương: " + heSoluong);
    System.out.println("Lương: " + tinhLuong());
}
public boolean tangLuong(double tangHeSoluong) {
    double newHeSoluong = heSoluong + tangHeSoluong;
    if (tinhLuongmax(newHeSoluong)) { 
        return false;
    }
    heSoluong = newHeSoluong;
    return true;
}
private boolean tinhLuongmax(double newHeSoluong) {
    return tinhLuong() > Luong_max && tinhLuong(newHeSoluong) > Luong_max;
}
private double tinhLuong(double newHeSoluong) {
    return 0;
}
public String getTenNhanVien() {
    return tenNhanvien;
}
public void setTenNhanvien(String tenNhanvien) {
    this.tenNhanvien = tenNhanvien;
}

public double getLuongCoban() {
    return luongCoban;
}
public void setLuongCoban(double luongCoban) {
    this.luongCoban = luongCoban;
}

public double getHeSoLuong() {
    return heSoluong;
}

public void setHeSoluong(double heSoluong) {
    this.heSoluong = heSoluong;
}

public static double getLuong_max() {
    return Luong_max;
}

public static void setLuong_max(double luong_max) {
    Luong_max = luong_max;
}
}
