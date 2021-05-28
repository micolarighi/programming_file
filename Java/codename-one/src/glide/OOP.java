
class Students {
  String name;
  int age;
}

public class OOP {
  public static void main(String[] args) {
    // instansiasi 
    Students students = new Students();
    Students students2 = new Students();
    students.name = "Micola";
    students.age = 20;
    students2.name = "Arighi";
    students2.age = 18;
    System.out.println(students.name);
    System.out.println(students.age);
    System.out.println(students2.name);
  }
}
