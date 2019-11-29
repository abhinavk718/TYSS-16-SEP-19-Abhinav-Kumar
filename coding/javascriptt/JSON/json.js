const person = {
    name :'sundra',
    age : 100,
    color :'white',
    address : {
        city :'Bijapur',
        state : 'Karnataka',
        pinCode : 59115
        },
        hobbies : ['Coding','Bird Watching','Singing']
}
console.log('Javascript person object ',person);
const jsonObject = JSON.stringify(person)
console.log('JSON Person Object ',jsonObject);
const JavascriptPersonObject =JSON.parse(jsonObject)
console.log('javascript person object after parse',JavascriptPersonObject );


localStorage.setItem('email','billgates@gmail.com')
const emailId=localStorage.getItem('email')
console.log('Email Id : ',emailId);
localStorage.clear(); 



