import java.util.Scanner; // Импортируем класс Scanner для чтения ввода пользователя

public class Programm { // Определяем главный класс
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Создаем объект Scanner для считывания ввода
        MAN man = null; // Экземпляр класса Person, изначально равен null
        boolean running = true; // Переменная для управления циклом

        while (running) { // Бесконечный цикл для обработки команд
            System.out.print("Введите команду: "); // Запрос команды у пользователя
            String userCommand = in.nextLine(); // Считываем команду

            switch (userCommand) { // Обрабатываем введенную команду
                case "Exit": { // Команда "Exit"
                    running = false; // Завершение цикла
                    break;
                }
                case "Help": { // Если команда "Help"
                    System.out.println("Все команды:");
                    System.out.println("---");
                    System.out.println("Create_man : создать человека (экземпляр класса MAN)");
                    System.out.println("kill_person : убить человека");
                    System.out.println("Discussion : заставить человека говорить (после создания)");
                    System.out.println("Common : заставить человека идти (после создания)");
                    System.out.println("---");
                    break;
                }
                case "Create_man": { // Если ввести команду "Create_man"
                    if (man != null) { // Проверка на наличие соданного человека
                        man.kill(); // Убийство, если он уже создан
                    }
                    System.out.print("Введите имя создаваемого человека: "); // Запрос имени
                    String userName = in.nextLine(); // Сканируем
                    man = new MAN(userName); // Создаем нового человека
                    System.out.println("Человек создан: " + man.getName()); // Сообщаем о создании
                    break;
                }
                case "Kill_man": { // Если команда "Kill_man"
                    if (man != null) {
                        man.kill(); // Убийство человека
                    } else {
                        System.out.println("Сначала создайте человека командой Create_man.");
                    }
                    break;
                }
                case "Discussion": { // Если команда "Discussion"
                    if (man != null) {
                        man.disscus(); // Человек говорит
                    } else {
                        System.out.println("Сначала создайте человека с помощью команды Create_man.");
                    }
                    break;
                }
                case "Common": { // Если команда "o"
                    if (man != null) {
                        man.go(); // Человек идет
                    } else {
                        System.out.println("Сначала создайте человека с помощью команды Create_man.");
                    }
                    break;
                }
                default: { // Если команда не распознана
                    System.out.println("Неизвестная команда. Введите Help для получения списка команд.");
                    break;
                }
            }
        }

        in.close(); // Закрываем сканер
        System.out.println("Программа завершена."); // Сообщаем о завершении программы
    }
}