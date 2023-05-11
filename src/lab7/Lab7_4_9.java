package lab7;

public class Lab7_4_9 {
    public static void main(String[] args) {
        String text = "Преобразовать каждое слово в тексте, удалив из него все последующие предыдущие вхождения первой последней буквы этого слова";

        // Разбиваем текст на слова
        String[] words = text.split("\\s+");

        // Проходим по каждому слову
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char firstChar = word.charAt(0);
            char lastChar = word.charAt(word.length() - 1);
            StringBuilder sb = new StringBuilder();

            // Проходим по каждой букве слова
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                if (c == firstChar && j != 0) {
                    // Если это не первая буква и она равна первой букве слова, то пропускаем ее
                    continue;
                }
                if (c == lastChar && j != word.length() - 1) {
                    // Если это не последняя буква и она равна последней букве слова, то пропускаем ее
                    continue;
                }
                sb.append(c);
            }
            words[i] = sb.toString();
        }

        // Собираем обратно текст из слов
        String result = String.join(" ", words);

        // Выводим результат
        System.out.println(result);
    }
}
