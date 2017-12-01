package lesson1;

import java.util.Arrays;

public class ArrayStorage {

    private Storage[] storages = new Storage[0];

    public void clear() {
        for(int i = 0; i<storages.length; i++) {
            storages[i] = null;
        }
    }

    public Storage get(int i) {
        return storages[i];
    }

    public Storage[] getAll() {
        return storages;
    }

    // добавление нового елемента в масив
    public void save(Storage storage) {
        // переменная с новой размерностью масива
        int j = storages.length+1;

        // создаем новый масив на основаниеи старого с размерностью на 1 больше
        Storage[] arr2 = Arrays.copyOf(storages, j);
        arr2[j-1] = storage;
        // заменяем изначальный масив на новый изменённый
        saveAll(arr2);
    }

    // сохраняет невый масив в масив наших резюме
    public void saveAll(Storage[] storages) {
        this.storages = storages;
    }

    // метод который удаляет с масива элемент с указаным индексом
    public boolean delete(int index) {
        printArrayStorage();
        // проверяем на коректность индекса для поиска елемента в дальнейшем
        if( index >= storages.length || index < 0 ) {
            return false;
        } else {
            // создаем временный масив с количеством елементов на 1 меньше чем исходный масив резюме
            Storage[] storagesNew = new Storage[storages.length - 1];

            int k = 0; // временний счетчик
            // делаем перебор елементов и копируем их в новій временній масив, если  дошли к  елементу с номером который указан в методе не выполняем никаких действий,
            // в итоге в нвом масиве этого елемента не окажеться

            for(int i = 0; i<storages.length; i++) {
                if (i != index) {
                    storagesNew[k] = storages[i];
                    k++;
                }
            }
            saveAll(storagesNew);
            return true;
        }
    }

    // сервисный метод для проверки  количества  елеемнтов и  отображения поля Name обекта Storage
    public void printArrayStorage() {
        System.out.println("count - " + storages.length);
        for (Storage item:storages) {
            if( item != null ) {
                System.out.println(item.getName());
            }
        }
    }

    // метод для удаление елементов NULL с масива и пересоздание масива без NULL элементов
    public void clearNullElementForArrayStorage() {
        int k = 0;
        for(int i = 0; i<storages.length; i++) {
            if ( storages[i] == null ) {
                k++;
            }
        }

        Storage[] storagesNew = new Storage[storages.length - k];

        int j = 0;
        for(int i = 0; i<storages.length; i++) {
            if ( storages[i] != null ) {
                storagesNew[j] = storages[i];
                j++;
            }
        }
        saveAll(storagesNew);
    }

}