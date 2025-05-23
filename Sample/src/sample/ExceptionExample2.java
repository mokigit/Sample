package sample;

import javax.swing.plaf.basic.BasicSplitPaneDivider;

public class ExceptionExample2 {

    public static void main(String[] args) {
        System.out.println("処理開始");
        
        try {
            System.out.println("割り算開始");
            int a = divide(10, 0);
            System.out.println(a);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Caught: " + e.getMessage());
        }finally {
            System.out.println("割り算終了");
        }
        System.out.println("処理終了");
    }
    
    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("ゼロ除算エラーです");
        }
        return a /b;
    }
}
