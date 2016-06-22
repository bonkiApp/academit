package ru.kibon.vector;

public class Main {
    public static void main(String[] args) {

        int dim = 6;
        Vector vector = new Vector(dim);
        System.out.printf("Создание нулевого вектора размерностью %s: %s%n", dim, vector.toString(vector));

        double[] component = {2, 5, 1.5, -2, 1};
        Vector arrVector = new Vector(dim, component);
        System.out.printf("Заполнение вектора размерностью %s значениями из массива: %s%n", dim, arrVector.toString(arrVector));

        Vector copyArrVector = new Vector(arrVector);
        System.out.printf("Копирование вектора: %s%n", copyArrVector.toString(copyArrVector));

        System.out.printf("Проверка предыдущих одинаковых векторов на равенство: %s%n", arrVector.equals(copyArrVector));

        System.out.printf("Размерность вектора %s равна %s%n", copyArrVector.toString(copyArrVector), copyArrVector.getSize());

        Vector vector2 = new Vector(5, new double[]{3, 2, 14.2, 1}); // дополнительный вектор для примеров
        System.out.println(vector2.toString(vector2));

        System.out.printf("Сумма векторов %s и %s равна: %s%n", arrVector.toString(arrVector), vector2.toString(vector2), arrVector.toString(arrVector.sumVectors(vector2)));

        System.out.printf("Разность тех же векторов равна: %s%n", copyArrVector.toString(copyArrVector.subtractVectors(vector2)));

        int scalar = 3;
        System.out.printf("Вектор %s умноженный на скаляр %s равен: %s%n", vector2.toString(vector2), scalar, vector2.toString(vector2.multipleVector(scalar)));

        vector2 = vector2.reverseVector();
        System.out.printf("Разворот предыдущего вектора: %s%n", vector2.toString(vector2));

        System.out.printf("Длина вектора %s равна: %s%n", vector2.toString(vector2), vector2.calcLength());

        int component2 = 3;
        System.out.printf("Компонента вектора под индексом %s равна: %s%n", component2, vector2.getComponent(component2));

        int value = 4;
        vector2.setComponent(component2, value);
        System.out.printf("Установка значения компонента под индексом %s равным %s: %s%n", component2, value, vector2.toString(vector2));

        Vector v1 = new Vector(4, new double[]{1, 2, 3, 4});
        Vector v2 = new Vector(3, new double[]{1, 2, 3});

        System.out.printf("HashCode вектора v1 %s равен: %s%n", v1.toString(v1), v1.hashCode());
        System.out.printf("HashCode вектора v2 %s равен: %s%n", v2.toString(v2), v2.hashCode());
        System.out.printf("Проверка на равенство предыдущих векторов: %s%n", v1.equals(v2));

        Vector v3 = Vector.summationVectors(v1, v2);
        System.out.printf("Сумма векторов v1 и v2 равна: %s%n", v3.toString(v3));

        Vector v4 = Vector.subsVectors(v1, v2);
        System.out.printf("Разность векторов v1 и v2 равна: %s%n", v4.toString(v4));

        Vector v5 = Vector.multiplyVectors(v1, v2);
        System.out.printf("Скалярное произведение вектора v1 на вектор v2 равно: %s%n", v5.toString(v5));
    }
}
