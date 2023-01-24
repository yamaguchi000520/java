public class Null01{
  public static void main(String[] args){
    String string1;
    string1 = "あいう";
    // 文字の数を出力---.length()
    System.out.println(string1 + "の文字:" + string1.length());
    string1 = "";
    System.out.println(string1 + "の文字:" + string1.length());
    // string1 = null;
    // System.out.println(string1 + "の文字:" + string1.length());
    // // オートボクシング
    // Integer integer1 = 5;
    // // 明示的なボクシング
    // Integer integer2 = Integer.value0f(5);
    // // アンボクシング
    // int int1 = integer1;
    // // 明示的なアンボクシング
    // int int2 = integer2.inValue();
    // 配列について
    int[] array1 = new int [3];
    array1[0] = 60;
    array1[2] = 30;
    array1[1] = 20;
    int int3 = array1[2];
    int array2[]=null;

    int[] array3 = new int[] {10, 20 ,50};
    int[] array4 = { 10, 20, 50 };
    // 下記課題
    long long1 = 10000000L;
    System.out.println(long1);
    double double1 =  0.53;
    System.out.println(double1);
    boolean boolean1 = true;
    System.out.println(boolean1);
    Float f = 3.641392f;
    System.out.println(f);
    Integer int5 = 5;
    System.out.println(int5);
    Character chara = 'う';
    System.out.println(chara);

    int[] array5 = new int[] { 1, 2, 3, 4 ,5 };
    System.out.println(array5[3]);
  }
}