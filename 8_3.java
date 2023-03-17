//for文の繰り返し
//指定の条件が[true]の間繰り返し処理を行う制御文
//主に指定した回数文ループして行いたい時に使用する

public class For01{
  public static void main(String[] args) {
    for (int number = 1; number <= 5; number++) {
      System.out.println("For01 = " + number);
    }
  }
}


/*
実行結果は次のようになる
public class For01 {
    public static void main(String[] args) {
        for (int number = 1; number <= 5; number++) {
            System.out.println("For01 = " + number);
        }
    }
}

・基本構文
for (初期化式; 条件式; 変化式) {
    ブロック(繰り返し処理)
}

サンプルプログラムの説明
public class For01 {
    public static void main(String[] args) {
        // for文：
        // 初期化式：numberを1で初期化
        // 条件式：numberが5未満の場合、ブロックの処理を行う
        // 変化式：ブロックの処理後に、numberをインクリメント
        for (int number = 1; number <= 5; number++) {
            // ブロック：numberを出力
            System.out.println("For01 = " + number);
        }
    }
}
*/

//拡張for文
//拡張for文とは、配列やコレクションの全要素に対して、
//繰り返し処理を行う制御文です

public class For02 {
  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5 };
    for (int number : array) {
      System.out.println("For02 = " + number);
    }
  }
}

/*
実行結果は以下のようになる
For02 = 1
For02 = 2
For02 = 3
For02 = 4
For02 = 5

・基本構文
for (型 変数名：配列やコレクションの変数) {
    ブロック(繰り返し処理)
}

配列やコレクションの変数の要素を順番に取得し、指定した型の変数に代入しながらブロック内の処理を行う
拡張for文は、条件式と変化式を記述しないため、通常のfor文に比べ、
簡潔に記述できる

サンプルプログラムの説明
public class For02 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        // 拡張for文：
        // 配列の要素を順番にnumberに代入し、要素分繰り返す
        for (int number : array) {
            // ブロック：numberを出力
            System.out.println("For02 = " + number);
        }
    }
}
*/
