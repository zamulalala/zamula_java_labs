package lab3;


public class Lab4_1_8 {
    public static void main(String[] args) {
        // Создание объекта компьютера с именем "Мой компьютер"
        Computer myComputer = new Computer("Мой компьютер", new Computer.Specification("Windows 10", "Intel Core i5", 8));

// Получение имени компьютера
        System.out.println("Имя компьютера: " + myComputer.getName());

// Получение информации о спецификации компьютера
        Computer.Specification spec = myComputer.getSpecification();
        System.out.println("Операционная система: " + spec.getOperatingSystem());
        System.out.println("Процессор: " + spec.getProcessor());
        System.out.println("Оперативная память: " + spec.getMemory() + " ГБ");

// Изменение информации о спецификации компьютера
        spec.setOperatingSystem("Windows 11");
        spec.setMemory(16);
        myComputer.setSpecification(spec);

// Вывод обновленной информации о спецификации компьютера
        System.out.println("Операционная система: " + myComputer.getSpecification().getOperatingSystem());
    }
}
