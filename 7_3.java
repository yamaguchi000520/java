public class Switch01 {
    public static void main(String[] args) {
        // switch (式（変数や値）){
        // case 値:
        //     ブロック(処理);
        //     break;
        // case 値:
        //     ブロック(処理);
        //     break;
        // default:
        //     ブロック(処理);
        // }
        int val = 2;
        switch (val) {
        case 3:
            System.out.println("よくできました！");
            // break：switch文を終了する
            break;
        case 2:
            System.out.println("ふつうでした！");
            break;
        // default：全てのcaseの値に一致しない場合にブロックを実行
        default:
            System.out.println("がんばろう！");
        }
    },
    public static void main(String[] args) {
        int val = 2;
        if (val == 3) {
            System.out.println("よくできました！");
        } else if (val == 2) {
            System.out.println("ふつうでした！");
        } else {
            System.out.println("がんばろう！");
        }
    }
}