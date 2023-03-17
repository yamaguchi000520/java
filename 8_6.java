//再起処理
/*
あるメソッドが自分自身を呼び出すことで繰り返しを実現することもできます。
これを、「再帰処理」や「再帰呼び出し」と言います。
*/


public class Recursive01 {
  public static void main(String[] args) {
    int number = 1;
    printNum(number);
  }

  public static int printNum(int number) {
    if (number < 50) {
      number *= 2;
      System.out.println("While01 = " + number);
      // 条件にマッチしたら自分自身を再度呼び出す
      printNum(number);
    }
    return number;
  }
}