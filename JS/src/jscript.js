function strings() {
    var result = "";
    for (var x = 1; x <= 10; x++) {
        result = result + "Строка " + x + "\n";
    }
    alert(result);
}


function equation2() {
    var a = enterIndex("первое", "a");
    var b = enterIndex("второе", "b");
    var c = enterIndex("третье", "c");

    var x1;
    var x2;

    if (a === 0 && b === 0) {
        console.log("Уравнение не является квадратным и корней не имеет.");
    } else if (a !== 0) {
        var Discriminant = b * b - 4 * a * c;
        if (Discriminant === 0) {
            x1 = x2 = (-b) / (2 * a);
            console.log("Уравнение имеет два одинаковых корня:\nx1 = " + x1.toFixed(2) + "\nx2 = " + x2.toFixed(2));
        } else if (Discriminant > 0) {
            x1 = (-b + Math.sqrt(Discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(Discriminant)) / (2 * a);
            console.log("Уравнение имеет два корня:\nx1 = " + x1.toFixed(2) + "\nx2 = " + x2.toFixed(2));
        } else {
            console.log("Уравнение имеет два мнимых корня:\n\
            x1= (" + -b + "+i*" + Math.sqrt(Math.abs(Discriminant)).toFixed(2) + ")" + "/" + (2 * a) + "\n\
            x2= (" + -b + "-i*" + Math.sqrt(Math.abs(Discriminant)).toFixed(2) + ")" + "/" + (2 * a));
        }
    } else {
        x1 = -c / b;
        console.log("Уравнение не является квадратным т.к. а = 0\nx = " + x1);
    }
}

function enterIndex(number, letter) {
    do {
        var index = prompt("Введите " + number + " число - коэффициент " + letter, '');
        index = parseFloat(index);
    } while (isNaN(index));
    return index;
}

function showList() {
    var list = [];
    for (var length = 1; length <= 100; length++) {
        list.push(length);
    }
    list.sort(sortNumber);
    console.log("Список отсортирован по убыванию:\n" + list);

    var foo = 5;
    var list1 = list.slice(0, foo);
    console.log("Подсписок 1:\n" + list1);
    var list2 = list.slice(list.length - foo, list.length);
    console.log("Подсписок 2:\n" + list2);

    var evenSum = 0;
    for (var i = 0; i <= list.length; i++) {
        if (list[i] % 2 === 0) {
            evenSum = evenSum + list[i];
        }
    }
    console.log("Сумма нечетных чисел:\n" + evenSum);

}

function sortNumber(e1, e2) {
    return e2 - e1;
}