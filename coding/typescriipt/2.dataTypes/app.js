var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var myName = "Mikel";
console.log(myName, typeof myName);
var age;
console.log(age, typeof age);
var mobileNumber = 9074817338;
console.log(mobileNumber, typeof mobileNumber);
var address;
address = "asdfghjkl";
address = "lkjhgfds";
console.log(address, typeof address);
var calAge = function () {
    console.log("Age is 23.");
};
calAge();
var Person = /** @class */ (function () {
    function Person(name, age) {
        this.name = name;
        this.age = age;
    }
    return Person;
}());
var Person1 = new Person('mikel', 24);
console.log(Person1);
var Student = /** @class */ (function (_super) {
    __extends(Student, _super);
    function Student(name, age, rollNo) {
        var _this = _super.call(this, name, age) || this;
        _this.rollNo = rollNo;
        return _this;
    }
    return Student;
}(Person));
var Student1 = new Student("Jhon", 25, 102);
console.log(Student1);
