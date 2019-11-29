//named function
function add(num1,num2)
{
    console.log('sum =',num1+num2 )
}
add(10,20,30 )
function add(num1,num2,num3)
{
    console.log('sum value =' ,num1+num2+num3); 
}
//Function Expression(Anonymous)
var sub =function(num1,num2)
{
    var subValue =num1-num2;
    return subValue;
}
var value =sub(30,20)
console.log('Value =' ,value);
//Self invoked function
(function(num1,num2)
{
    console.log('value = ',num1*num2 )
})(2,3)
//Fat Arrow Function
var div =(num1,num2)=>{
    console.log('value = ' ,num1/num2);  
}
div(10,5)
//single parameter function
var div1=num1=>{
    console.log('value = ',num1); 
}
div1(10)
//Single line of code
var div2 =num1=>console.log('value =',num1);
div2(20)
//if we have one line of code compilar will add return  statements 
var add=(num1,num2)=>num1+num2
var value = add(50,10);
console.log('value = ' ,value);
console.log('-------------------------------------------');
console.log('variable foisting');
console.log(hoist);
var hoist;
function hoisting(){
    console.log(hoistingA);
    var hoistingA;  
}
hoisting();


