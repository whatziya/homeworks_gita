package lesson_11.Text;

import java.util.ArrayList;
import java.util.List;

public class teks {
    public static void main(String[] args) {
        List<String> das = new ArrayList<>();
        das.add("SAS");
        System.out.println(das.remove(1) == null);
    }
}
