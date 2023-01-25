public class Sample05{
  public static void main(String[] args){
    int a = 15;
    int c;
    c = a + 3;
    int c2 = c;
    System.out.println(c);
    c = a - 5 + c2;
    System.out.println(c);
    int c3 = 10;
    c3--;
    System.out.println(c3);
    c3++;
    System.out.println(c3);
    --c3;
    System.out.println(c3);
    // 下記代入について
    a = c; //aとcはイコール
    a += c; //a= a + c
    a -= c; //a= a - c
    a *= c; //a= a * c
    a /= c; //a= a / c
    a %= c; //a= a % c
    // 下記関係演算子について
    int a = 5;
    boolean c;

    c = a < 5;   // c = false
    c = a <= 5;  // c = true
    c = a > 4;   // c = true
    c = a >= 6;  // c = false
    c = a == 5;  // c = true
    c = a != 5;  // c = false

    boolean a = true;
    boolean b = false;
    boolean c;

    c = a && true;   // c = true
    c = a && false;  // c = false
    c = b || true;   // c = true
    c = b || false;  // c = false
    c = !a;          // c = false
    c = !b;          // c = true

    String a = "100";
    String b = "200";
    String c;
    c = a + b;        // c = 100200
    c = "あ" + "い";   // c = あい

    String a = "applePie";
    String b = "applePie";
    c = a == b;  // c = true

    String a = "applePie";
    String d = "apple";
    String e = d + "Pie";
    c = a == e;  // c = false

    String a = "applePie";
    String f = new String("applePie");
    c = a == f;  // c = false

    // 変数の中身はすぐ上の例と同じ
    c = a.equals(b);  // c = true
    c = a.equals(e);  // c = true
    c = a.equals(f);  // c = true

    // 以下課題
    int val = 2 + 5;
    System.out.println(val);
    int v = val++;
    System.out.println(v);
    int w = val * 5;
    System.out.println(w);
    boolean bool;
    bool = w == 50;
    System.out.println(bool);
    bool = (w < 50) && (w % 10 == 0);

    // 課題答え
    int val = 2 + 5;
    System.out.println(val);

    val++;
    System.out.println(val);

    val *= 5;
    System.out.println(val);

    boolean bool = (val == 50);
    System.out.println(bool);

    bool = (val < 50) && (val % 10 == 0);
    System.out.println(bool);
  }
}