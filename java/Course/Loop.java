public class Loop {
  public static void main(String[] args) {

    // == FOR LOOP ==
    // for (int i = 0; i < 10; i++) {
    // System.out.println("Perulangan ke-" + i);
    // }

    // == WHILE LOOP ==
    // var counter = 0;
    // while (counter <= 10) {
    // System.out.println("Perulangan " + counter);
    // counter++;
    // }

    // == DO WHILE LOOP ==
    // do {
    // system.out.println("Perulangan " + counter)
    // counter++;
    // } while (counter <= 10);

    // == BREAK & CONTINUE
    for (var i = 0; i < 100; i++) {
      if (i % 2 == 0) {
        continue;
      }
      System.out.println("Perulangan Ke " + i);
    }
  }
}
