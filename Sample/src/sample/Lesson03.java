package sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

public class Lesson03 {

    public static void main(String[] args) {
        String a = new String("Hello");
        String b = new String("Hello");
        String c = a;
        
        System.out.println(a == b);
        
        System.out.println(a == c);
        
        System.out.println(a.equals(b));
        
        Double d = 3.14;
        System.out.println(d.toString());
        
        System.out.println(d.hashCode());
        
        String str = "Hello, World!";
        System.out.println(str.length());
        
        System.out.println(str.substring(1, 4));
        
        System.out.println(str.contains("llo"));
        
        System.out.println(str.replace("l", "L"));
        
        System.out.println(str.trim());
        
        String name = "Alice";
        int age = 25;
        double height = 1.7;
        
        String formattedString = "Name: %s, Age: %d, Height: %2f".formatted(name, age, height);
        System.out.println(formattedString);
        
        // 絶対値
        System.out.println(Math.abs(-5));

        // 切り上げ、切り捨て、四捨五入
        System.out.println(Math.ceil(3.3));
        System.out.println(Math.floor(3.7));
        System.out.println(Math.round(3.5));

        // 最大と最小
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));

        // ランダムな値
        System.out.println(Math.random());
        
     // 日付：今日、指定日
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(2023, Month.DECEMBER, 5));

        // 時刻：今、指定時刻
        System.out.println(LocalTime.now());
        System.out.println(LocalTime.of(13, 45));

        // 日時：現在、指定日時
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.of(2023, Month.DECEMBER, 5, 13, 45));

        // 日付差と時刻差
        System.out.println(Period.between(LocalDate.of(2023, 1, 1), LocalDate.of(2023, 12, 31)));
        System.out.println(Duration.between(LocalTime.of(9, 0), LocalTime.of(17, 0)));

        // 日時から文字列への変換
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(LocalDateTime.now().format(formatter));
        // 文字列から日時への変換
        try {
            System.out.println(LocalDateTime.parse("2023/12/05 15:30:45", formatter));
        } catch (DateTimeParseException e) {
            System.out.println("Error" + e.getMessage());
        }

        // タイムゾーン付日時の扱い
        // 日本タイムゾーンで現在の日時を取得
        var tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        // UTCに変換
        var utcTime = tokyoTime.withZoneSameInstant(ZoneOffset.UTC);
        // 結果を表示
        System.out.println("Tokyo Time: " + tokyoTime);
        System.out.println("UTC Time: " + utcTime);
        
        String content = "これは最初の行です。\nこれは次の行です。\nそして、これが最後の行です。";

        try {
            // ファイルの書き込み
            Files.writeString(Paths.get("example.txt"), content);

            // ファイルの読み込み
            String content2 = Files.readString(Paths.get("example.txt"));
            System.out.println(content2);

            // ファイルを行ごとに読み込み
            List<String> lines = Files.readAllLines(Paths.get("example.txt"));
            var lineNumber = 1;
            for (String line : lines) {
                System.out.println("%d行目：%s".formatted(lineNumber, line));
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
