import java.util.BitSet;
import java.util.Scanner;

public class java_bitset {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt(), m = scanner.nextInt();
    BitSet[] bitSets = {new BitSet(n), new BitSet(n)};
    for (int i = 0; i < m; i++) {
      String s = scanner.next();
      int x = scanner.nextInt(), y = scanner.nextInt();
      if (s.equals("AND")) {
        bitSets[x - 1].and(bitSets[y - 1]);
      } else if (s.equals("OR")) {
        bitSets[x - 1].or(bitSets[y - 1]);
      } else if (s.equals("XOR")) {
        bitSets[x - 1].xor(bitSets[y - 1]);
      } else if (s.equals("FLIP")) {
        bitSets[x - 1].flip(y);
      } else if (s.equals("SET")) {
        bitSets[x - 1].set(y);
      }
      System.out.println(bitSets[0].cardinality() + " " + bitSets[1].cardinality());
    }
  }

}
