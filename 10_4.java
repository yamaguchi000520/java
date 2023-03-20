// throws文
/*
throws文は、例外が発生した場合にcatch文を記述してメソッド内で例外処理するのではなく、
例外をスローして呼び出し元に例外処理させたい場合に使用します。

*/

package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception04 {
    public static void main(String[] args) {
        try {
            Exception04.readFile("exception.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException例外が発生");
        }
        System.out.println("プログラム終了");
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        System.out.println("ファイルの読み込み開始");
        FileReader fr = new FileReader(fileName);
        System.out.println(fileName + "の読み込み完了");
    }
}


/*
実行結果
ファイルの読み込み開始
FileNotFoundException例外が発生
プログラム終了

基本構文
修飾子 戻り値の型 メソッド名(引数) throws 例外クラスの型 {
    // 処理
    return 戻り値;
}

メソッド構文の後ろにthrows文を記述します。
スローする例外クラスの型は、カンマ（,）区切りで複数指定できます。

Javaでの例外処理は、先ほど説明したtry-catch文でメソッド内で処理するか、throws文で呼び出し元に処理させるかの２つなります。
検査例外が発生しうる箇所では、どちらかの例外処理を必ず記述する必要があります(記述がないとコンパイルエラーとなります)。
予め発生に備えることで、実行時にプログラムが動作しなくなるようなことを防げるようになっています。

プログラムの説明
package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception04 {
    public static void main(String[] args) {
        try {
            // readFileメソッドを呼び出し
            Exception04.readFile("exception.txt");
        // 呼び出し元も例外処理を記述しないとコンパイルエラーになる
        } catch (FileNotFoundException e) {
            // 例外処理が実行される
            System.out.println("FileNotFoundException例外が発生");
        }
        // catch文で例外処理されるので、処理が実行される
        System.out.println("プログラム終了");
    }

    // 検査例外のFileNotFoundException例外をスロー
    public static void readFile(String fileName) throws FileNotFoundException {
        System.out.println("ファイルの読み込み開始");
        // ファイルが存在しないため例外が発生
        FileReader fr = new FileReader(fileName);
        System.out.println(fileName + "の読み込み完了");
    }
}



*/