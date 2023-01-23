public class Variable01{
  public static void main(String[] args){
    // 変数を定義
    int num1;
    String str1;
    // 変数に値を代入
    num1 = 10;
    // Stringに文字を代入
    str1 = "Hello World!";
    System.out.println(num1);
    System.out.println(str1);

    // 再代入
    num1 = 20;
    System.out.println(num1);

    int num2 = 30;
    System.out.println(num2);

    // 再代入できないfinal修飾子
    final int MIN_NUM = 77;
    System.out.println(MIN_NUM);

    // 以下課題
    String str2;
    str2 = "山口　圭";
    System.out.println(str2);
    str2 = "最近は辛いものにハマってます。";
    System.out.println(str2);
    int num4;
    num4 = 123;
    System.out.println(num4);
  }
}