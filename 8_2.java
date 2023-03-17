//do-while文
//while文と同様に[true]の間繰り返し処理を行う
//記述上の違いは、条件式の位置となる

public class DoWhile01 {
  public static void main(String[] args) {
    int number = 1;
    do {
      number *= 2;
      System.out.println("doWhile 01 " + number);
    } while (number < 50);
  }
}

/*
実行結果は次のようになる
DoWhile01 = 2
DoWhile01 = 4
DoWhile01 = 8
DoWhile01 = 16
DoWhile01 = 32
DoWhile01 = 64

・基本構文
do {
    ブロック（繰り返し処理）
} while (条件式);

ブロックの処理を実行し、処理が完了した後に条件式で評価する
そのため、結果が[false]になってもwhile文とは異なり、最低1どは
ブロックの処理が実行される

サンプルプログラムの説明
public class DoWhile01 {
    public static void main(String[] args) {
        int number = 1;
        // do-while文：ループ開始
        do {
            // ブロック：
            // numberにnumber * 2 を代入して、numberを出力
            number *= 2;
            System.out.println("DoWhile01 = " + number);
        // do-while文：
        // numberが50未満の場合、ブロックの処理をループ実行する
        } while (number < 50);
    }
}

while文とdo-while文の相違点
条件式をブロックの実行前に評価するか、後に評価するかになる。
ループ開始時点で、条件が[false]の場合、while文ではブロックが実行されない。
do-while文ではブロックが実行される
*/