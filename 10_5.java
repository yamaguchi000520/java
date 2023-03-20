//例外クラスの定義
/*
Javaで予め用意されているもの以外に、自分で例外クラスを定義することもできます。
基本的にはこれまで扱ってきた普通のクラスと同じくフィールドやメソッド、コンストラクタを定義することができます。
特徴としては、例外クラスを継承すること、例外クラスなので try-catch文 や throws とあわせて用いることです。

*/

// 独自の例外クラス
public class MyException extends Exception { // Exceptionクラスを継承
  // 引数なしのコンストラクタ
  public MyException() {
  }

  // エラーメッセージを受け取るコンストラクタ
  public MyException(String message) {
    super(message);
  }

  // エラーメッセージおよび発生した例外オブジェクトを受け取るコンストラクタ
  public MyException(String message, Throwable cause) {
    super(message, cause);
  }

  // エラー内容を出力するメソッド
  public void printError(String content) {
    System.out.println("エラーが発生しました:" + content);
  }
}


/*





*/