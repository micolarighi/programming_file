class Book {
  String title;
  String writer;

  Book(String title, String writer){
    this.title = title;
    this.writer = writer;
  }

  void info(){
    System.out.println(this.title);
    System.out.println(this.writer);
  }

  void setTitle(String title){
    this.title = title;
  }

  String getTitle(){
    return this.title;
  }
}

public class Methods {
  public static void main(String[] args) {
    Book b1 = new Book("Cosmos", "Carl Sagan");
    Book b2 = new Book("Sherlock Holmes", "Sir Artur");
    b1.info();
    b2.info();
    b1.setTitle("Kosmos");
    System.out.println(b1.getTitle());
  }
}
