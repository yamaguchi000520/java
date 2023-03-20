//例外の基本を学ぶ

/*
例外の基本
例外とは、プログラム実行中に発生する予想しない事象（エラー）のことです。
例えば、0で割り算をした場合やnullオブジェクトのメンバを参照した場合、存在しないファイルにアクセスした場合などに発生します。
例外が発生した時に実行する処理を例外処理と言います。例外処理の記述がない場合は、エラーメッセージを出力してプログラムが終了します。



*/

package exception;

public class Exception01 {
    public static void main(String[] args) {
        System.out.println("100 ÷ 0 は？");
        int result = 100 / 0;
        System.out.println("計算結果" + result);
        System.out.println("プログラム終了");
    }
}

/*
説明
package exception;

public class Exception01 {
    public static void main(String[] args) {
        System.out.println("100 ÷ 0 は？");
        // 0で割り算するので、例外が発生
        int result = 100 / 0;
        // 例外が発生した以降の処理は実行されない
        System.out.println("計算結果" + result);
        System.out.println("プログラム終了");
    }
}

例外の種類
例外関連のクラスは大きく分け、Errorクラス、RuntimeExceptionクラス、RuntimeExceptionクラス以外のExceptionクラスの３つがあります。
すべての例外関連のクラスは、Throwableクラスを継承したサブクラスです。

Errorクラス
例外処理を記述すべきではない、致命的なエラーを表すクラスです。
メモリ不足した時に発生するOutOfMemoryErrorクラスなどがあります。

Exceptionクラス（RuntimeExceptionクラス以外）
例外処理を記述する必要がある、一般的な例外を表すクラスです。
例外を捕捉する記述がないとコンパイルエラーになります。
例外処理が記述されているかコンパイル時に検査（チェック）される例外のため「検査（チェック）例外」と呼ばれています。
存在しないファイルにアクセスした時に発生するFileNotFoundExceptionクラスなどがあります。

RuntimeExceptionクラス
例外処理を記述しなくてもコンパイルエラーにならない、プログラム実行中に発生する例外を表すクラスです。
RuntimeException が発生する原因の多くは考慮不足や実装漏れによる、所謂バグと呼ばれるものです。
RuntimeExceptionクラスは、例外処理の記述がコンパイル時には検査されず実行時に発生する例外のため「非検査（非チェック）例外」や「実行時例外」と呼ばれています。
0で割り算をした時に発生するArithmeticExceptionクラスやnullオブジェクトのメンバを参照したNullPointerExceptionクラスなどがあります。
*/