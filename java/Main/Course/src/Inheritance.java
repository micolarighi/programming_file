public class Inheritance {
    public static void main(String[] args) {
        Reference ref = new Reference("Cosmos", "Carl Sagan", 80.000);
        Books book = new Books();
        System.out.println(ref.title);
        System.out.println(ref.writer);
        System.out.println(ref.price);
        System.out.println(book.title);
    }
}
