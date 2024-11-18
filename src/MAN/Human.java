import java.util.Random;

public class Human {
    private String name; // Имя
    private int age; // Возраст
    private int hp; // Здоровье в процентах
    private boolean isAlive; // Жив ли человек

    // Массив имен
    private static String[] names = {
            "Дима", "Ксения", "Руслан", "Анастасия", "Илья",
            "Ольга", "Дмитрий", "Екатерина", "Максим", "Татьяна",
            "Яна", "Алёна", "Даниил", "Степан", "Егор", "Никита"
    };

    // Конструктор
    public Human(String name) {
        this.name = name;
        this.age = generRandAge(); // Случайный возраст от 15 до 50
        this.hp = generRandHealth(); // Состояние здоровья от 10 до 100
        this.isAlive = true; // По умолчанию считается, что человек жив
    }

    // Метод генерации случайного возраста от 15 до 50
    private int generRandAge() {
        Random random = new Random();
        return random.nextInt(36) + 15; // Возраст от 15 до 50
    }

    // Метод генерации здоровья от 10 до 100
    private int generRandHealth() {
        Random random = new Random();
        return random.nextInt(91) + 10; // Здоровье от 10 до 100
    }

    // Метод Kill (убийство )
    public void kill() {
        if (isAlive) {
            isAlive = false;
            hp = 0; // Здоровье при смерти
            System.out.println(name + " умер(ла).");
        } else {
            System.out.println(name + " уже мертв(а).");
        }
    }

    // Метод IsAlive
    public boolean isAlive() {
        return isAlive;
    }
}
