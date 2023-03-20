//例外処理
/*
try-catch文（try-catch-finally文）
try-catch文は、例外処理を記述するために使用します。
*/

package exception;

public class Exception02 {
    public static void main(String[] args) {
        try {
            System.out.println("100 ÷ 0 は？");
            int result = 100 / 0;
            System.out.println("計算結果" + result);
        } catch (ArithmeticException e) {
            System.out.println("例外が発生");
        } finally {
            System.out.println("プログラム終了");
        }
    }
}

/*
実行結果
100 ÷ 0 は？
例外が発生
プログラム終了

基本構文
try {
    tryブロック（例外が発生する可能性がある処理）
} catch (例外クラス 変数名) {
    catchブロック（例外が発生した時に実行する処理）
} catch (例外クラス 変数名) {
    catchブロック（例外が発生した時に実行する処理）
} finally {
    finallyブロック(例外発生の有無にかかわらず必ず実行する処理)
}

try文
tryブロックには、例外が発生する可能性がある処理を記述します。
try文は、必ず記述する必要があります。

catch文
catchブロックには、例外が発生した時に実行する処理を記述します。
tryブロックで発生した例外のクラスとcatch文に記述した例外クラスの型が一致した場合、そのcatch文のブロックの処理が実行されます。
catch文は、例外ごとに処理する場合は複数記述することもできます。
実行する例外処理がなければ記述の必要はありません。

finally文
finallyブロックに、例外発生の有無にかかわらず必ず実行する処理を記述します。
finally文もcatch文と同じように、必ず実行する処理がなければ記述の必要はありません。


サンプルプログラムの説明
package exception;

public class Exception02 {
    public static void main(String[] args) {
        // try-catch-finally文の開始
        try {
            // tryブロック：例外が発生する可能性がある処理を記述
            System.out.println("100 ÷ 0 は？");
            // Exception01と同じく、例外が発生
            int result = 100 / 0;
            System.out.println("計算結果" + result);
        // ArithmeticExceptionクラスの例外が発生した場合の例外処理
        } catch (ArithmeticException e) {
            // 例外クラスが一致するので、例外処理が実行される
            System.out.println("例外が発生");
        } finally {
            // 例外発生しても処理を実行
            System.out.println("プログラム終了");
        }
    }
}
*/
