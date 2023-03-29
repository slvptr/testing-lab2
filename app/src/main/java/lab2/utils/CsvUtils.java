package lab2.utils;

import lab2.functions.Func;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

@AllArgsConstructor
@Getter
@Setter
public class CsvUtils {
    private String filename;
    private Func function;
    private double from;
    private double to;
    private double step;
    private double exp;

    public void writeCsv() throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(filename)) {
            for (double x = from; x <= to; x += step) {
                function.init(x);
                writer.println(x + "," + function.calc(exp));
            }
        }
    }
}
