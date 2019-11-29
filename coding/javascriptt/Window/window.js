console.log('window object',window);
console.log('This Keyword',this);
console.log(this===window);
//window.alert('welcome to java script class.')
//alert('Welcome to TestYantra and ust global')
//let confirmDelete=confirm('Are you sure you want to delete')
//console.log('confrim Delete ',confirmDelete);
//let userName=prompt('What is your name??','Abhinav')
//console.log('UserName : ',userName);


const person={
    firstName : 'Alia',
    lastName : 'Kapoor',
    age : 26,
    getName : function(){
        console.log('This keyword : ',this);
        
    return this.firstName + ' ' + this.lastName
   }
}
let fullName =person.getName()
console.log('Full Name : ',fullName);
