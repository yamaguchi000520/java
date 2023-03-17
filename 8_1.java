//while文の繰り返し
//while文とは、指定の条件が「true」の間繰り返し処理を行う制御ぶん
public class While01 {
  public static void main(String[] args) {
    int nunber = 1;
    while (number < 50) {
      number *= 2;
      System.out.println("While01 = " + number);
    }
  }
}

/*
実行結果は次のようになる
While01 = 2
While01 = 4
While01 = 8
While01 = 16
While01 = 32
While01 = 64

・基本構文
while (条件式) {
  ブロック(繰り返し処理)
}

サンプルプログラムの説明
public class While01 {
    public static void main(String[] args) {
        int number = 1;
        // while文：ループ開始
        // numberが50未満の場合、ブロックの処理を行なう
        while (number < 50) {
            // ブロック：
            // numberにnumber * 2 を代入して、numberを出力
            number *= 2;
            System.out.println("While01 = " + number);
        }
    }
}

*/
