package neko.algorithm;

public class Leetcode299 {

  public static void main(String[] args) {
    Leetcode299 leetcode299 = new Leetcode299();
    leetcode299.getHint("1807","7810");
  }
  public String getHint(String secret, String guess) {
    int bullsNum = 0;
    int cowsNum = 0;
    int[] secretMap = new int[10];
    int[] guessMap = new int[10];
    for (int i = 0; i < secret.length(); ++i) {
      if (secret.charAt(i) == guess.charAt(i)) {
        bullsNum++;
      }else {
        secretMap[secret.charAt(i) - '0']++;
        guessMap[guess.charAt(i) - '0']++;
      }
    }
    for (int i = 0; i < 10; ++i) {
      cowsNum = cowsNum + Math.min(secretMap[i], guessMap[i]);
    }
    return bullsNum + "A" + cowsNum + "B";
  }

}
