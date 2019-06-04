package hackerrank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("h:mm:ssa");
        LocalTime localTime = LocalTime.parse(s, dateTimeFormatter);

        return localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println(timeConversion("12:20:30AM"));
    }

}
