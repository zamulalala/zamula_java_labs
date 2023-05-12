package lab10;

package org.example;

import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

public class Lab10 {
    public static void main(String[] args) {
        // Подгружаем файл
        SparkSession spark = SparkSession
                .builder()
                .appName("Java Spark SQL basic example")
                .config("spark.master", "local")
                .getOrCreate();
        // Создаем датасет из csv файла
        Dataset<Row> df = spark.read().option("header","true").csv("src/lab10/sample.csv");
        // Создаем временную таблицу twitter_support
        df.createOrReplaceTempView("twitter_support");
        // Заголовки в csv файле:
        // tweet_id,author_id,inbound,created_at,text,response_tweet_id,in_response_to_tweet_id
        // Используем SQL и .show() для 10 примеров выборки и аггрегации
        // Вывести все твиты, отправленные пользователем с ID 119280:
        spark.sql("SELECT * FROM twitter_support WHERE author_id = 119280").show();
        // Вывести все твиты пользователей, "входящих" в компанию, оказывающей поддержку клиентов в Twitter (inbound=TRUE):
        spark.sql("SELECT * FROM twitter_support WHERE inbound = True").show();
        // Вывести количество твитов, отправленных каждым пользователем
        spark.sql("SELECT author_id, COUNT(*) AS tweet_count FROM twitter_support GROUP BY author_id").show();
        // Вывести все твиты, на которые не был дан ответ (response_tweet_id - NULL):
        spark.sql("SELECT * FROM twitter_support WHERE response_tweet_id IS NULL").show();
        // Получить список всех твитов, содержащих определенное слово в тексте:
        spark.sql("SELECT * FROM twitter_support WHERE text LIKE 'hi'").show();
        // Найти все твиты, отправленные за последние 10 дней:
        spark.sql("SELECT * FROM twitter_support WHERE created_at >= DATE_SUB(NOW(), INTERVAL 10 DAY);").show();
        // Найти все твиты, содержащие менее 30 символов:
        spark.sql("SELECT * FROM twitter_support WHERE CHAR_LENGTH(text) < 30;").show();
        // Вывести все твиты, в которых менее 10 символов, которые отправлены до полудня любого дня
        spark.sql("SELECT * FROM twitter_support WHERE LENGTH(text) < 10 AND TO_CHAR(TO_DATE(created_at, 'DY MON DD HH24:MI:SS TZD YYYY'), 'HH24') < '12'").show();
        // Получить среднее количество символов в твитах (text):
        spark.sql("SELECT AVG(LENGTH(text)) FROM twitter_support").show();
        //Найти твиты, которые являются ответом на другой твит:
        spark.sql("SELECT * FROM twitter_support WHERE in_response_to_tweet_id IS NOT NULL").show();


    }
}