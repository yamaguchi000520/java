//continue文
/*
continue文とは、ループ処理の途中でその後の処理をスキップして、
ループ処理の最初から実行させたい場合に使用する制御文
*/

public class Continue01 {
  public static void main(String[] args){
    for (int count = 0; count < 5; count++){
      if (count ==2){
        continue; //countが2の場合、この後の処理をスキップ
      }
      System.out.println("Continue01 = " + count);
    }
  }
}

/*
実行結果は次のようになる
Continue01 = 0
Continue01 = 1
Continue01 = 3
Continue01 = 4

無限ループ
ループを終了する条件が決して満たされないようなループを「無限ループ」と言います。
ループは多くの場合、意図しないプログラムの不備（つまりバグ）によって引き起こされます。
無限ループが発生するとメモリ消費やCPU負荷上昇により、アプリケーションの異常終了を引き起こす可能性が高くなりますので、
意図しない無限ループが起きないよう注意しましょう。
*/