import java.io.*;

class Person implements Serializable{
  private String name;

  public Person(String n){
    name = n;
  }

  public String getName(){
    return name;
  }
}

public class SerializePerson{
  public static void main(String[] args) {
    Person person = new Person("Budi");
    try {
      FileOutputStream fos = new FileOutputStream("person.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fos); 
      oos.writeObject(person);
      System.out.println("Selesai menulis objek person");
      oos.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}