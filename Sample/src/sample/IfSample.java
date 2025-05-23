package sample;

public class IfSample {

    public static void main(String[] args) {
        var score = 100;
        System.out.println("得点: " + score);
        
        if (score == 100) {
            System.out.println("満点です！");
        }
        else if (score >= 80) {
            System.out.println("すばらしい！");
        }
        else if (score >= 60) {
            System.out.println("合格です！");
        }
        else {
            System.out.println("不合格です……");
        }

    }

}
