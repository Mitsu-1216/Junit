package kadai1;

/**
 * 数値計算を行う
 *
 */
public class kadai1 {

  /**
   * 絶対値を利用した足し算
   * @param a 値1
   * @param b 値2
   */
  public static int lintAdd(int a, int b) {
    
    if (a < 0) {
      a = a * -1;
    }
    if (b < 0) {
      b = b * -1;
    }
    
    return a + b;
  }
}