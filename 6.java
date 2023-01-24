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
    c = a > 5; // c = false
    c = a <= 5; // c = true
    
  }
}