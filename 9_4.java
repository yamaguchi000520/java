// その他

//インスタンス変数とローカル変数

package classMethod.human;

public class Human04 {

    // static変数
    static public int humanCount = 0;
    public String name;
    // 定数
    public static final String GREETING = "こんにちは";

    public Human04(String name) {
        this.name = name;
        // インスタンス生成ごとにstatic変数をインクリメント
        Human04.humanCount++;
    }

    static public void staticMethodPrint() {
        // staticメソッドからインスタンス変数は使用できない（コンパイルエラー）
        // System.out.println("名前は、" + name);
        // static変数のhumanCountを表示
        System.out.println("人の数は" + Human04.humanCount);
    }

    public void instanceMethodPrint() {
        // インスタンス変数のnameを表示
        System.out.println("名前は" + name);
    }
}

package classMethod;

import classMethod.human.Human04;

public class ClassMethod04 {
    public static void main(String[] args) {
        // Human04インスタンスを生成すると、コンストラクタ内の処理が実行される
        Human04 yamada = new Human04("山田");

        // 静的メンバーは、インスタンス生成せずに直接使用できる
        Human04.staticMethodPrint();

        // staticなクラス定数もインスタンスを生成せずに参照できる
        System.out.println(Human04.GREETING);

        // インスタンスメンバーは直接使用できない（コンパイルエラーになる）
        // Human04.instanceMethodPrint();
        // System.out.println(Human04.name);

        // インスタンスメンバーはインスタンス生成してから使用する
        yamada.instanceMethodPrint();
    }
}

//アクセス修飾子
package classMethod.human; 

public class Human05 {
    private String name;
    private int age;

    public Human05() {
        name = "山田";
        age = 20;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// パッケージ宣言
package classMethod;

// インポート文
import classMethod.human.Human05;

public class ClassMethod05 {
    public static void main(String[] args) {
        Human05 yamada = new Human05();  

        //nameとageはprivateな変数なので直接参照はできない
        //System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

        //nameとageそれぞれの値を返すpublicなメソッドを通して参照し出力することはできる
        System.out.println("名前は" + yamada.getName() + "で、年齢は" + yamada.getAge() + "です。");
    }
}


