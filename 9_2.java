//パッケージ
/*
・基本構文
package パッケージ名;

インポートを宣言する基本構文
import パッケージ名.クラス名;

次のように*を用いて書くと、指定したパッケージ下のすべてのクラスがインポートされます。
import パッケージ名.*;




*/

//パッケージ宣言
package classMethod.human;

public class Human02 {
    public String name;
    public int age;

    public Human02() {
        name = "山田";
        age = 20;
    }

    public Human02(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// パッケージ宣言
package classMethod;

// インポート文
import classMethod.human.Human02;

public class ClassMethod02 {
    public static void main(String[] args) {
        Human02 yamada = new Human02();  //Human02クラスのインスタンスを生成
        System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

        Human02 sato = new Human02("佐藤", 25); //Human02クラスのインスタンスを生成
        System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
    }
}


/*
実行結果
名前は山田で、年齢は20です。
名前は佐藤で、年齢は25です。

解説
・Human02クラス
パッケージ宣言をしてclassMethod.human.Human02とクラスのパッケージを指定する
上記以外はHuman01クラスと同様

・ClassMethod02クラス
パッケージ宣言をしてclassMethod.ClassMethod02とクラスのパッケージを指定する
インポート文を記載してclassMethod.human.Human02クラスを参照できるようにする (この記載がない場合、 new classMethod.human.Human02() という風に毎度パッケージの指定が必要です)
上記以外はClassMethod01クラスと同様


*/