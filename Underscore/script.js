var persons = [
    {age: 37, name: 'Святополк', lastName: 'Дружинин'},
    {age: 11, name: 'Мирослава', lastName: 'Зимова'},
    {age: 22, name: 'Златомир', lastName: 'Добромыслов'},
    {age: 59, name: 'Мечислав', lastName: 'Всеволодов'},
    {age: 40, name: 'Радимир', lastName: 'Милорадович'},
    {age: 28, name: 'Ярополк', lastName: 'Гостемилов'},
    {age: 30, name: 'Тихомир', lastName: 'Твердиславов'},
    {age: 25, name: 'Всемила', lastName: 'Войнова'},
    {age: 32, name: 'Ростислав', lastName: 'Малышев'},
    {age: 18, name: 'Светозара', lastName: 'Добролюбова'}
];


var sum = _.reduce(persons, function (memo, value) {
    return memo + value.age;
}, 0);

var averAge = sum / persons.length;

console.log('Средний возраст: ' + averAge);


filterByAge = function (value) {
    return value.age >= 20 && value.age <= 30;
};

var filterAge = _.filter(persons, filterByAge);


console.log(_.sortBy(filterAge, function (value) {
    return value.age;
}));


_.each(persons, function(value){
    console.log(
        value.fullName = value.lastName + ' ' + value.name
    );
});
