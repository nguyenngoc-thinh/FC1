package Code;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Teacher extends Human {

    Scanner sc = new Scanner(System.in);
    String TeacherID;
    Teacher(){};
    Teacher(String name, Date birth, String sex, int cmnd, String TeacherID) {
        super(name, birth, sex, cmnd);
        this.TeacherID = TeacherID;
    }

    @Override
    public void input(Scanner sc, SimpleDateFormat date) {
        System.out.println("Nhap thong tin:");
        System.out.print("Nhap ho va ten: ");
        name = sc.nextLine();
        name = sc.nextLine();
        System.out.print("Ngay sinh(dd/MM/YYYY): ");
        try {
            birth = date.parse(sc.nextLine());
        } catch (ParseException e) {
            System.err.println("Error parsing date: " + e.getMessage());
        }
        System.out.print("Gioi tinh: ");
        sex = sc.nextLine();
        System.out.print("CMND: ");
        cmnd = sc.nextInt();
        System.out.print("Ma giao vien: ");
        TeacherID = sc.nextLine();
        TeacherID = sc.nextLine();
    }

    public void xeploai(Scanner sc) {
        int dem;
        System.out.println("Chon xep loai thi dua: ");
        System.out.print("1-loai A, 2-loai B, 3-loai C: ");
        dem = sc.nextInt();
        switch (dem) {
            case 1: {
                System.out.println("Thi dua loai A");
                break;
            }
            case 2: {
                System.out.println("Thi dua loai B");
                break;
            }
            case 3: {
                System.out.println("Thi dua loai C");
                break;
            }
        }
    }

    @Override
    public void output(Scanner sc, SimpleDateFormat date) {
        xeploai(sc);
        System.out.println("Ho va ten: " + name + ", ngay sinh: " + date.format(birth) + ", Gioi tinh: " + sex + ", CMND: " + cmnd + ", Ma giao vien: " + TeacherID);
        
    }
}
