package lab7;

import java.util.HashSet;

public class Lab7_2_9 {
    public static void main(String[] args) {
        // Исходное стихотворение
        String poem = "Белееты парусы одинокийы\nВы туманеы моряы голубомы!\nЧтоы ищеты оны вы странеы далекойы?\nЧтоы кинулы оны вы краюы родномы?";

        // Разбиваем стихотворение на слова
        String[] words = poem.split("\\s");

        // Создаем множество символов для первого слова
        HashSet<Character> commonChars = new HashSet<>();
        for (char c : words[0].toCharArray()) {
            commonChars.add(c);
        }

        // Находим пересечение множеств символов для всех слов
        for (int i = 1; i < words.length; i++) {
            HashSet<Character> wordChars = new HashSet<>();
            for (char c : words[i].toCharArray()) {
                wordChars.add(c);
            }
            commonChars.retainAll(wordChars);
        }

        // Выводим найденные буквы
        System.out.println("Одинаковые буквы, встречающиеся во всех словах:");
        for (char c : commonChars) {
            System.out.print(c + " ");
        }
    }

}
