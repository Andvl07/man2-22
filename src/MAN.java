import java.util.Random; // Импорт класса Random для генерации случайных чисел

    public class MAN {
        private String name; // Поле хранения имени
        private int age; // Поле хранения возраста
        private int hp; // Поле хранения уровня здоровья
        private boolean isAlive; // Поле, указывающее, жив ли человек
        private static final Random rnd = new Random(); // Экземпляр Random для генерации случайных чисел

        // Конструктор класса, инициализирующий имя, возраст и здоровье
        public MAN(String name) {
            this.name = name; // Устанавливаем имя
            this.isAlive = true; // Человек изначально жив
            this.age = rnd.nextInt(36) + 15; // Генерируем возраст от 15 до 50
            this.hp = rnd.nextInt(91) + 10; // Генерируем здоровье от 10 до 100
        }

        // Метод получения имени
        public String getName() {
            return name; // Возвращение имени
        }

        // Метод получения возраста
        public int getAge() {
            return age; // Возвращаем возраст
        }

        // Метод получения очков здоровья
        public int getHp() {
            return hp; // Возвращение уровень здоровья
        }

        // Метод, возвращающий статус жизни
        public boolean isAlive() {
            return isAlive; // Возвращение true, если человек жив
        }

        // Метод, имитирующий речь человека
        public void disscus() {
            System.out.println(name + " говорит: Привет!"); // Человек говорит привет
        }

        // Метод, имитирующий действие "идти"
        public void go() {
            if (isAlive) { // Проверяем, жив ли человек
                if (hp > 40) { // Если здоровье больше 40
                    System.out.println(name + " беззаботно гуляет по городу."); // Человек идет
                } else {
                    System.out.println(name + " не может идти, т.к. заболел."); // Человек не может идти из-за болезни
                }
            } else {
                System.out.println(name + " не может идти, мертв."); // Человек мертв
            }
        }

        // Метод, имитирующий действие "убить"
        public void kill() {
            isAlive = false; // Устанавливаем статус жизни в false
            System.out.println(name + " ныне мертв, можете создавать нового человека."); // Сообщение о смерти
        }
    }