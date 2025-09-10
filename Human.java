package Code;

import java.text.SimpleDateFormat;
import java.util.*;

public abstract class Human {

    Scanner sc = new Scanner(System.in);
    String name;
    Date birth;
    String sex;
    int cmnd;

    public Human() {
    }

    public Human(String name, Date birth, String sex, int cmnd) {
        this.name = name;
        this.birth = birth;
        this.sex = sex;
        this.cmnd = cmnd;
    }

    public void input(Scanner sc, SimpleDateFormat date) {
    }
    public void output(Scanner sc, SimpleDateFormat date) {
    }
}
