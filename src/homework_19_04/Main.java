package homework_19_04;


import java.util.List;
import java.util.stream.Collectors;

public class Main {
  /*  Задача1.  Есть класс Address с полями
                String street
                int houseNumber

    и класс Person с полями
    String name
    int age
    Address address

Используя стримы, написать метод, принимающий список персонов и возвращающий список адресов тех,
 кто старше 17 лет.

List\<Address>getAddresses(List\<Person> input)
     */
  public static void main(String[] args) {


      Person person = new Person("Jack",40,new Address("Berliner",5));
      Person person1 = new Person("John",25,new Address("Gasse",12));
      Person person2 = new Person("Helen",15,new Address("Dilingen",2));

      List<Person> people = List.of(person,person1,person2);
      System.out.println(getAddress(people));


  }
  public static List<Address> getAddress(List<Person> input) {
      return input.stream()
              .filter(person -> person.getAge() > 17)
              .map(Person::getAddress)
              .collect(Collectors.toList());
  }
}
