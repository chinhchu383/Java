package ArrayList;

import java.util.ArrayList;



public class ARRLIST {
    public static void main(String[] args) {
        ArrayList<person> arrlistperson = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            person ps = new person();
            ps.NhapThongTin();
            arrlistperson.add(ps);
        }
        for (int i = 0; i < arrlistperson.size(); i++) {
            arrlistperson.get(i).XuatThongTin();
        }
    }
}
