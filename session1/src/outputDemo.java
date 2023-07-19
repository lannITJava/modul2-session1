import java.sql.SQLOutput;

public class outputDemo {
    public static void main(String[] args) {
        // Khai bao va khoi tao gia tri ma sinh vien , in gia tri ma sinh vien ra man hinh consol
        String studentId = "SV001";
        System.out.println("Gia tri bien studentId: "+studentId);
        String studentName ="Nguyen Van A";
        System.out.print("Gia tri bien: "+studentName);
        System.out.println("\n");
        int age = 25;
        float mark = 8.7F;
        boolean sex = false;
        System.out.printf("Ma sinh vien: %s, Ten sinh vien: %s, Tuoi: %d, Diem: %f, Gioi Tinh: %b",studentId,studentName,age,mark,sex);
        String bookId= "V001";
        String bookName= "abc";
        float giaNhap =5000;
        float giaXuat=10000;
        String tacGia="Nguyen Van A";
        boolean trangThai=true;
        System.out.println("Ma sach: "+bookId);
        System.out.print("Ten sach: "+bookName);
        System.out.printf("\n");
        System.out.printf("Gia Nhap: %f,Gia Xuat: %f,Tac Gia: %s,Trang Thai: %b\n",giaNhap,giaXuat,tacGia,trangThai);
    }
}
