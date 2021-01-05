import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Mời nhập họ tên: ");
        System.out.println("Họ tên:");
        String hoten = s.nextLine();
        System.out.println("Năm sinh: ");
        Short namsinh = s.nextShort();
        System.out.println("Chiều Cao: ");
        String chieucao = s.next();
        System.out.println("Cân Nặng: ");
        Short cannang = s.nextShort();
        System.out.println("giới tính: ");
        char gioitinh = s.next().charAt(0);
        System.out.println("Quê quán: ");
        String quequan = s.nextLine();

    String format = String.format("STT %-22s%-22s", hoten ,namsinh );
        System.out.println("format");
        System.out.println("============================");
        System.out.println("Họ tên: "+ hoten +"\n Năm sinh: "+ namsinh + "\n Chiều Cao: "+ chieucao + "\n Cân Năng: "+ cannang +"\n Giới tính: "+ gioitinh +"\n Quê quán: "+ quequan );
































    }
}

