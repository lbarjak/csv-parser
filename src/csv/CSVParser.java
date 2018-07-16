package csv;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

class CSVParser {
    
    int columns = 3;
    char delimiter = ';';

    void read() throws IOException {
        File file = new File("test.csv");
        Scanner scanner = new Scanner(file, StandardCharsets.UTF_8.name());
        String content = scanner.useDelimiter("\f").next();
        scanner.close();

        int a = 0;
        int b = 0;
        int c;
        char separator;
        
        while (b < content.length()) {
            c = 0;
            separator = delimiter;
            ArrayList<String> rowIn = new ArrayList<>();
            while (c < columns) {
                if (c == columns - 1) {
                    separator = '\n';
                }
                b = content.indexOf(separator, b);
                rowIn.add(content.substring(a, b));
                a = ++b;
                c++;
            }
            for (int i = 0; i < rowIn.size(); i++) {
                System.out.println(rowIn.get(i));
            }
            GlobalVariables.ROWSIN.add(rowIn);
        }
    }
}
