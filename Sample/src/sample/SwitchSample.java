package sample;

public class SwitchSample {

    public static void main(String[] args) {
        var score = 72;
        System.out.println("得点: " + score);
        
        switch (score / 10) {
        case 10 -> System.out.println("満点です！");
        case 9, 8 -> System.out.println("すばらしい！");
        case 7, 6 -> System.out.println("合格です！");
        default -> System.out.println("不合格です……");
        }

    }

}
