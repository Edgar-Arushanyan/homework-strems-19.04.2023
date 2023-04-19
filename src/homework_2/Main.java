package homework_2;

import java.util.stream.Stream;

public class Main {
    /*
    Задача2
Используя стримы написать метод, принимающий строку, состоящую из слов,
 разделенных пробелом и букву и возвращающий количество слов, начинающихся с этой буквы.
long countWords (String input, String letter)

пример: принимает "aaa ffff aa bbbb a bb aaa gggggggggggggg" и "a" -> возвращает 4 ,
 т.к. слово, начинающееся на a встречается 4 раза
     */
    public static void main(String[] args) {

        String input = "aaa fff aa bbbb a bb aa ggggggggggg";
        String letter = "a";


        System.out.println(countWords(input,letter));  // output  4

    }
    public static long countWords(String input, String letter) {

       long counter = Stream.of(input.split(" "))
                .filter(word -> word.startsWith(letter))
               .count();

       return counter;



    }
}
