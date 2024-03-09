import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        File file = new File("");
        FileFilter ff = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.getName().endsWith(".txt")) return true;
                return false;
            }
        };
        File[] files = file.listFiles(ff);
        for (File file1 : files) {
            System.out.println(file1.getName());
        }

    }
}
