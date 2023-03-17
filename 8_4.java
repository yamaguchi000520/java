//break文
/*
・break文
switch文のbreak文と同じで、ループ処理の途中でループ処理を終了させたい場合に使用する仔魚分である。
*/

public class Break01 {
  public static void main(String[] args) {
    for (int count = 0; count < 5; count++){
      if (count == 2 ) {
        breake; //countが2の場合、for文を終了
      }
      System.out.println("Break01 = " + count)
    }
  }
}

/*
実行結果は以下のようになる
Break01 = 0
Break01 = 1

*/