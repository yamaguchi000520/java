public class If_switch{
  public static void main(String[] args){
    int val = 6;
    if (val <= 5){
      System.out.println("とても近いです。");
    } else if (val <= 10){
      System.out.println("近いです。");
    } else if (val <= 15){
      System.out.println("遠いです。");
    } else{
      System.out.println("とても遠いです。");
    }

    String color = "red";
    switch (color){
      case "bulue":
        System.out.println("青信号です。");
        break;
      case "yellow":
        System.out.println("黄色信号です。");
        break;
      case "red":
        System.out.println("赤信号です。");
        break;
      default:
        System.out.println("信号の色ではありません。");
    }
  }
}