/* TODO:
Создайте класс VariablesTheme с методом main
Все задания реализуйте в нем, отделяя их друг от друга пустой строкой
Код любой задачи должен начинаться с вывода на консоль ее названия, включая порядковый номер
Отделяйте в консоли вывод одной программы от другой пустой строкой, чтобы текст не сливался
Не используйте ввод с клавиатуры
Все переменные должны быть локальными
*/
public class VariablesTheme {
    public static void main(String[] args) {
        //Task 1 объявите переменные всех существующих в Java примитивных типов данных, присвоив им значения
        byte totalCore = 4;
        short frequency = 3300;
        int gpu = 1050;
        long totalMemoryGpu = 4095L;
        float partion = 1154.5F;
        double batery = 99.13;
        char procent = '%';
        boolean mobile = true;
        String name = "Dell Inspiron 7577";

        System.out.println("Task №1");
        System.out.println("Model: " + name);
        System.out.println("Laptop: " + mobile);
        System.out.println("Total Cores: " + totalCore);
        System.out.println("Frequency CPU: " + frequency);
        System.out.println("Model GPU: " + gpu);
        System.out.println("Total memory GPU: " + totalMemoryGpu);
        System.out.println("Memory partion: " + partion);
        System.out.println("batery: " + batery + procent);
    }
}