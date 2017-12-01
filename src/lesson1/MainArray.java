package lesson1;

public class MainArray {
    public static void main(String[] args) {

        ArrayStorage arR = new ArrayStorage();

        // создаем 3 елемента резюме
        Storage st1 = new Storage();
        st1.setName("1 storage");

        Storage st2 = new Storage();
        st2.setName("2 storage");

        Storage st3 = new Storage();
        st3.setName("3 storage");

        // сохраняем елементі в наш масих хранения
        arR.save(st1);
        arR.save(st2);
        arR.save(st3);

        // удаляем с масива елемент с индексом 1
        arR.delete(1);

        // метод который считает и  печатает элементы резюме
        arR.printArrayStorage();

        // достаем с масива элемент с индексом 0
        Storage aa = arR.get(0);

        // распечатываем значение поля Name для проверки рабоспособности
        System.out.println(aa.getName());


        // метод который очищает все елементы (делает их Null)
        arR.clear();
        arR.printArrayStorage();

        // запускаем метот который удаляет NULL элементы
        arR.clearNullElementForArrayStorage();

        // метод который считает и  печатает элементы резюме
        arR.printArrayStorage();

    }
}

