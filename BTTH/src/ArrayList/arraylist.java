package ArrayList;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> arrlistperson = new ArrayList<>();
        arrlistperson.add("HTML");
        arrlistperson.add("CSS");
        arrlistperson.add("JavaS");
        for (int i = 0; i < arrlistperson.size(); i++) {
            System.out.println(arrlistperson.get(i));
        }
    }
}
