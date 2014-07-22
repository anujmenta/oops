// http://interactivepython.org/courselib/static/java4python/Java4Python.html#java-data-types
//

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class HistoArray {
    public static void main(String[] args) {
        Scanner data = null;
        Integer[] count = {0,0,0,0,0,0,0,0,0,0};
        Integer idx;

        try {
            data = new Scanner(new File("test.dat"));
        }
        catch ( IOException e){
            System.out.println("Sorry couldn't read the data file");
            // Note Didn't had te give a newline
            e.printStackTrace();
            System.exit(0);
        }

        while(data.hasNextInt()) {
            idx = data.nextInt();
            count[idx] = count[idx] + 1;
        }

        idx = 0;
        for(Integer i: count) {
            System.out.println(idx + " occured " + i + " times.");
            idx++; // does i leak outside
        }
        /* System.out.println(i); */ // No
    }
}
