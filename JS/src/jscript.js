function Strings() {
    var foo = "";
    var bar = "";
    for (var x = 1; x <= 10; x++) {
        foo = "Строка " + x + "\n";
        bar = bar + foo;
    }
    alert(bar);
}


function Equation2(){
    do {
        var index1 = prompt("Введите первое число - коэффициент a:", '');
        index1 = parseFloat(index1, 10);
    } while (isNaN(index1));

    do {
        var index2 = prompt("Введите второе число - коэффициент b:", '');
        index2 = parseFloat(index2, 10);
    } while (isNaN(index2));

    do {
        var index3 = prompt("Введите третье число - коэффициент c:", '');
        index3 = parseFloat(index3, 10);
    } while (isNaN(index3));






}
