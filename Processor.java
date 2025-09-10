package Code;
import java.text.SimpleDateFormat;
import java.util.*;
public class Processor {
    public static void main(String[] args) {
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        int a=1;
        do
        {
            int tam=0;
            System.out.print("Ban muon nhap thong tin cho ai ? 1 - Sinh vien, 2 - Giao vien: ");
            tam=sc.nextInt();
            if(tam==1)
            {
                Student s=new Student();
                s.input(sc, date);
                s.output(sc, date);
            }
            else if(tam==2)
            {
                Teacher t=new Teacher();
                t.input(sc, date);
                t.output(sc, date);
            }
            System.out.print("Tiep tuc? 1-yes,0-no");
            a=sc.nextInt();
        }while(a==1);
    }
}
