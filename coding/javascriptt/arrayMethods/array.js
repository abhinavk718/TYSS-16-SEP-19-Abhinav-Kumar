const hobbies = ['Sleeping','Cricket','Eating','Coding','Roaming'];
console.log(typeof hobbies);
const isAarrarOrNot = Array.isArray(hobbies);
console.log('Hobbies array or Not : '+isAarrarOrNot);
const hasCricket = hobbies.includes('Cricket');
console.log('using includes method :',hasCricket);
hobbies.push('Guitar','VallyBall');
console.log('After push method :',hobbies);
let len=hobbies.pop();
console.log('After pop method :',len);
hobbies.unshift('Numismatics','Singing');
console.log('After unshift method : ',hobbies);
hobbies.shift();
console.log('After shift method : ',hobbies); 
console.log('**************************************************');
const hobbies1 = ['Sleeping','Cricket','Eating','Coding','Roaming'];
hobbies1.splice(1,2,'Bird Watching','PUBG');
console.log('After splice method : ',hobbies1);
const afterSlice=hobbies1.slice(2,4);
console.log('After slice method : ',hobbies1);
console.log('After slice method : ',afterSlice);
const indexOfCoding = hobbies1.indexOf('Coding',1);
console.log('Index of coding : '+indexOfCoding);
const stringHobbies = hobbies1.join('-');
console.log('After join method : ',stringHobbies);
console.log('*****************************************************');
const numbers =[100,200,300,400];
const num1=numbers.map(function(value,index){
let newValue = value+50;
return newValue; 
})
console.log('After map method : ',num1);
const number = numbers.filter(function(value,index){
if(value>200){
    return true
}else{
    return false
}
})
console.log('After filter method : ',number);
const filterNumArrow = numbers.filter(value =>value>200)
console.log('After filter method : ',filterNumArrow); 