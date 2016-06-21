package ru.kibon.vector;

public class Main {
    public static void main(String[] args) {

        int dim = 5;
        Vector vector = new Vector(dim);
        System.out.printf("Создание нулевого вектора размерностью %s: %s%n", dim, vector.toString(vector));

        double[] compon = {2, 5, 1.5, -2, 1};
        Vector arrVector = new Vector(dim, compon);
        System.out.printf("Заполнение вектора размерностью %s значениями из массива: %s%n", dim, arrVector.toString(arrVector));

        Vector copyArrVector = new Vector(arrVector);
        System.out.printf("Копирование вектора: %s%n", copyArrVector.toString(copyArrVector));

        System.out.printf("Проверка предыдущих одинаковых векторов на равенство: %s%n", arrVector.equals(copyArrVector));

        System.out.printf("Длина вектора %s равна %s%n", copyArrVector.toString(copyArrVector), copyArrVector.getSize());

        Vector vector2 = new Vector(4, new double[]{3, 2, 14.2, 1}); // дополнительный вектор для примеров

        System.out.printf("Сумма векторов %s и %s равна: %s%n", arrVector.toString(arrVector), vector2.toString(vector2), arrVector.toString(arrVector.sumVectors(vector2)));

        System.out.printf("Разность тех же векторов равна: %s%n", copyArrVector.toString(copyArrVector.subtractVectors(vector2)));

        int scalar = 3;
        System.out.printf("Вектор %s умноженный на скаляр %s равен: %s%n", vector2.toString(vector2), scalar, vector2.toString(vector2.multipleVectors(scalar)));

        vector2 = vector2.reversVector();
        System.out.println(vector2.toString(vector2));

        System.out.println(vector2.calcLength());

        System.out.println(vector2.getComponent(3));

        vector2.setComponent(3, 4);
        System.out.println(vector2.toString(vector2));

        System.out.println(arrVector.equals(copyArrVector));

        Vector v1 = new Vector(4, new double[]{1, 2, 3, 4});
        Vector v2 = new Vector(3, new double[]{1, 2, 3.0001});

        System.out.println(v1.hashCode());
        System.out.println(v2.hashCode());
        System.out.println(v1.equals(v2));

        Vector v3 = Vector.summationVectors(v1, v2);
        System.out.println(v3.toString(v3));

        Vector v4 = Vector.subsVectors(v3, v2);
        System.out.println(v4.toString(v4));

        Vector v5 = Vector.scalarMultiplyVectors(v4, 1.5);
        System.out.println(v5.toString(v5));
    }
}
