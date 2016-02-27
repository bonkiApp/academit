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
        var discriminant = b * b - 4 * a * c;
        if (discriminant === 0) {
            x1 = x2 = (-b) / (2 * a);
            console.log("Уравнение имеет два одинаковых корня:");
            console.log("x1 = " + x1.toFixed(2));
            console.log("x2 = " + x2.toFixed(2));
        } else if (discriminant > 0) {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            console.log("Уравнение имеет два корня:");
            console.log("x1 = " + x1.toFixed(2));
            console.log("x2 = " + x2.toFixed(2));
        } else {
            console.log("Уравнение имеет два мнимых корня:");
            console.log("x1= (" + -b + "+i*" + Math.sqrt(Math.abs(discriminant)).toFixed(2) + ")" + "/" + (2 * a));
            console.log("x2= (" + -b + "-i*" + Math.sqrt(Math.abs(discriminant)).toFixed(2) + ")" + "/" + (2 * a));
        }
    } else {
        x1 = -c / b;
        console.log("Уравнение не является квадратным т.к. а = 0");
        console.log("x = " + x1);
    }
}

function enterIndex(number, letter) {
    var index;
    do {
        index = prompt("Введите " + number + " число - коэффициент " + letter, '');
        index = parseFloat(index);
    } while (isNaN(index));
    return index;
}

function showList() {
    var list = [];
    for (var i = 1; i <= 100; i++) {
        list.push(i);
    }

    list.sort(function (e1, e2) {
        return e2 - e1;
    });
    console.log("Список отсортирован по убыванию:\n" + list);

    var sublistSize = 5;
    var list1 = list.slice(0, sublistSize);
    console.log("Подсписок 1:\n" + list1);
    var list2 = list.slice(list.length - sublistSize);
    console.log("Подсписок 2:\n" + list2);

    var evenSum = 0;
    for (var j = 0; j <= list.length; j++) {
        if (list[j] % 2 === 0) {
            evenSum = evenSum + list[j];
        }
    }
    console.log("Сумма четных чисел:\n" + evenSum);
}


