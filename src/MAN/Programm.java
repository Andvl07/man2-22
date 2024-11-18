
import java.util.Random;

public class Programm {
    private String name; // Имя
    private int age; // Возраст
    private int hp; // Здоровье в процентах
    private boolean isAlive; // Жив ли человек
    private static final Random rand = new Random();

    public Programm(String name) {
        this.name = name;
        this.age = generRandAge(); // Случайный возраст от 15 до 50
        this.hp = generRandHealth(); // Состояние здоровья от 10 до 100
        this.isAlive = true; // По умолчанию считается, что человек жив
    }

    private int generRandAge() {
        return age;
    }

    private int generRandHealth() {
        return hp;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void talk() {
        System.out.println(name + "Привет!");
    }

    public void go() {
        if (isAlive) {
            if (hp >= 40) {
                System.out.println(name + " мирно прогуливается по городу.");
            } else {
                System.out.println(name + " болен(льна) и не может прогуливаться по городу.");
            }
        } else {
            System.out.println(name + " не может идти, он умер(ла).");
        }
    }

    public void kill() {
        isAlive = false; // Устанавливаем статус жизни в false
        System.out.println(name + " теперь мертв."); // Сообщаем о смерти
    }
}
// реализовать вызов методов в данном файле