import java.util.Scanner;

  class Fibonachi {
    private int N;
    public Fibonachi() {
    }
    public static int fib(int N) {
        if (N == 1 || N == 2) {
            return 1;
        } else {
            return fib(N - 1) + fib(N - 2);
        }

    }
}

 public class Main {
     public static void main(String[] args) {

         Fibonachi F = new Fibonachi();
         Scanner sc = new Scanner(System.in);
         System.out.println("Введіть номер");
         int N ;
         N = sc.nextInt();
         System.out.println("Номер числа, яке потрібно визначити: "+N);
         while(N>0){

             System.out.println("Число не відповідає умові N>=0");
             N = sc.nextInt();
         }
         if(N==0){
             System.out.println("Число Фібоначчі на 0 позиції дорівнює 0");
         }
         else {
             int p = F.fib(-1 * N);
             double o = Math.pow(-1, N + 1) * F.fib(-1 * N);
             System.out.println("Число Фібоначчі на "+ N +" позиції дорівнює "+(int)o);
         }

     }
 }