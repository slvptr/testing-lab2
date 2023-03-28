package lab2.utils;

import lab2.functions.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

@AllArgsConstructor
@Getter
@Setter
public class CsvUtils {
    private String filename;
    private String function;
    private int from;
    private int to;
    private int step;
    private double exp;

    public void writeCsv() throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(new File(filename))) {
            switch (function) {
                case "cos":
                    for (int i = from; i <= to; i += step) {
                        writer.println(i + "," + new Cos(i).calc(exp));
                    }
                    break;
                case "sin":
                    for (int i = from; i <= to; i += step) {
                        writer.println(i + "," + new Sin(i).calc(exp));
                    }
                    break;
                case "tg":
                    for (int i = from; i <= to; i += step) {
                        writer.println(i + "," + new Tg(i).calc(exp));
                    }
                    break;
                case "stg":
                    for (int i = from; i <= to; i += step) {
                        writer.println(i + "," + new Ctg(i).calc(exp));
                    }
                    break;
                case "sec":
                    for (int i = from; i <= to; i += step) {
                        writer.println(i + "," + new Sec(i).calc(exp));
                    }
                    break;
                case "csc":
                    for (int i = from; i <= to; i += step) {
                        writer.println(i + "," + new Csc(i).calc(exp));
                    }
                    break;
                case "log2":
                    for (int i = 1; i <= to; i += step) {
                        writer.println(i + "," + new Log(2, i).calc(exp));
                    }
                    break;
                case "log10":
                    for (int i = 1; i <= to; i += step) {
                        writer.println(i + "," + new Log(10, i).calc(exp));
                    }
                    break;
                case "ln":
                    for (int i = 1; i <= to; i += step) {
                        writer.println(i + "," + new Ln(i).calc(exp));
                    }
                    break;
            }
        }
    }
}
