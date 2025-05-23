package sample;

public class NestedIfSample {

    public static void main(String[] args) {
        int number = 30;
        System.out.println("number = " + number);
        
        if (number >= 20) {
            System.out.println("20以上");
            
            if (number < 40) {
                System.out.println("20以上40未満");
                
                if (number == 30) {
                    System.out.println("ちょうど30");
                    
                }else {
                    System.out.println("30でない");
                }
            }else {
                System.out.println("40以上");
            }
        }else {
            System.out.println("20未満");
        }
    }
}
