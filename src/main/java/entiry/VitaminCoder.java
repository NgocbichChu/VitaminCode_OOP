package entiry;

public class VitaminCoder {
    String lop, hoTen, chuyenNganh, diaChi;

    public VitaminCoder(){}

    public VitaminCoder(String lop, String hoTen, String chuyenNganh, String diaChi) {
        this.lop = lop;
        this.hoTen = hoTen;
        this.chuyenNganh = chuyenNganh;
        this.diaChi = diaChi;
    }
    public void printInformation(){
        System.out.println("******************************");
        System.out.println("Lop : " + this.lop);
        System.out.println("HoTen : " + this.hoTen);
        System.out.println("ChuyenNganh : " + this.chuyenNganh);
        System.out.println("DiaChi : " + this.diaChi);
        System.out.println("******************************");
    }


}
