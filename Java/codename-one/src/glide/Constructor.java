class Books {
  String title;
  String writer;
}

class BooksWithCons {
  String title;
  String writer;

  BooksWithCons(String inputTitle, String inputWriter) {
    title = inputTitle;
    writer = inputWriter;
  }
}

public class Constructor {
  public static void main(String[] args) {
    Books book1 = new Books();
    book1.title = "Cosmos";
    book1.writer = "Carl Sagan";
    BooksWithCons book2 = new BooksWithCons("Sherlock Holmes", "Sir Artur Conan");
    System.out.println(book2.title);
  }
}
