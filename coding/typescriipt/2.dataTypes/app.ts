let myName : string = "Mikel";
console.log(myName,typeof myName);

let age : number;
console.log(age,typeof age);

let mobileNumber = 9074817338;
console.log(mobileNumber,typeof mobileNumber);

let address;
address ="asdfghjkl";
address ="lkjhgfds";
console.log(address,typeof address);

let calAge = function() : void{
console.log("Age is 23.");
}
calAge();

class Person{
    constructor(public name :string,public age : number){

    }
}
let Person1 =new Person('mikel',24);
console.log(Person1);

class Student extends Person{
    constructor(name : string , age : number , public rollNo : number){
      super(name,age);
    }
}
let Student1 = new Student("Jhon",25,102);
console.log(Student1);



