package Code;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Human {

    Scanner sc = new Scanner(System.in);
    String StudentID;

    Student(String name, Date birth, String sex, int cmnd, String StudentID) {
        super(name, birth, sex, cmnd);
        this.StudentID = StudentID;
    }

    Student() {}

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
        System.out.print("Ma sinh vien: ");
        StudentID = sc.nextLine();
        StudentID = sc.nextLine();
    }

    public void xeploai(Scanner sc) {
        int dem;
        System.out.println("Danh gia ren luyen: ");
        System.out.print("1-gioi, 2-kha, 3-trung binh, 4-yeu: ");
        dem = sc.nextInt();
        switch (dem) {
            case 1: {
                System.out.println("Xep loai gioi");
                break;
            }
            case 2: {
                System.out.println("Xep loai kha");
                break;
            }
            case 3: {
                System.out.println("Xep loai trung binh");
                break;
            }
            case 4: {
                System.out.println("Xep loai yeu");
                break;
            }
        }
    }

    @Override
    public void output(Scanner sc, SimpleDateFormat date) {
        xeploai(sc);
        System.out.println("Ho va ten: " + name + ", ngay sinh: " + date.format(birth) + ", Gioi tinh: " + sex + ", CMND: " + cmnd + ", Ma sinh vien: " + StudentID);
        
    }
}
