//Take 10 examples and iterate using for loop
console.log('iterating usig "for" loop.');
var brands =['Kingfisher','Bisleri','Aqua','kinley'];
for(var i=0;i<brands.length;i++){
    console.log('BrandName : '+brands[i]);   
}
console.log('*************************************');
var mobile = ['Motorola','Nokia','Iphone','Samsung'];
for(var i=0;i<mobile.length;i++){
    console.log('MobileName : '+mobile[i]);  
}
console.log('**************************************');

var PersonName = ['Abhinav','Himanshu','Mohit','Aniket'];
for(var i=0;i<PersonName.length;i++){
    console.log('Name = '+PersonName[i]);   
}
console.log('****************************************');
var bike =['Yamha','Pulsar','Bullet','SportsBike'];
for(var i=0;i<bike.length;i++){
    console.log('BikeName = '+bike[i]);  
}
console.log('*****************************************');
var fruits =['Mango','Guava','Banana','Grapes'];
for(var i=0;i<fruits.length;i++){
    console.log('FruitsName = '+fruits[i]);  
}
console.log('*****************************************');
var vegetables =['Potato','Tomatoo','Carrot','Radish'];
for(var i=0;i<vegetables.length;i++){
    console.log('Vegetables_Name ='+vegetables[i]);  
}
console.log('****************************************');
var laptop =['HP','Dell','Lenovo','Mac'];
for(var i=0;i<laptop.length;i++){
 console.log('Laptop_Name = '+laptop[i]);
}
console.log('****************************************');
var chocolates =['Ferrero Rocher','Lindt & Sprungli','Ghirardelli','Hersheys'];
for(var i=0;i<chocolates.length;i++){
console.log('Chocolates_Name = '+chocolates[i]);
}
console.log('****************************************');
var refrigerator =['LG','Samsung','Worphool','Onida'];
for(var i=0;i<refrigerator.length;i++){
console.log('Refrigator_Name = '+refrigerator[i]);    
}
console.log('**************************************');
var movies =['DDLJ','Welcome','Sahoo','Firangi'];
for(var i=0;i<movies.length;i++){
    console.log('Movie_Name = '+movies[i]);
    }
//Take 10 example and iterate using "for of" loop.
console.log('*******************************************');
console.log('iterate using "for of" loop.');
console.log('*******************************************');
var brands =['Kingfisher','Bisleri','Aqua','kinley'];
for(var element of brands){
    console.log('Brand_Name : '+element);   
}
console.log('++++++++++++++++++++++++++++++++++++++++');
var mobile = ['Motorola','Nokia','Iphone','Samsung'];
for(var product of mobile){
    console.log('MobileName : '+product);  
}
console.log('++++++++++++++++++++++++++++++++++++++++');

var PersonName = ['Abhinav','Himanshu','Mohit','Aniket'];
for(var name of PersonName){
    console.log('Name = '+name);   
}
console.log('++++++++++++++++++++++++++++++++++++++++');
var bike =['Yamha','Pulsar','Bullet','SportsBike'];
for(var halmet of bike){
    console.log('BikeName = '+halmet);  
}
console.log('++++++++++++++++++++++++++++++++++++++++');
var fruits =['Mango','Guava','Banana','Grapes'];
for(var taste of fruits){
    console.log('FruitsName = '+taste);  
}
console.log('+++++++++++++++++++++++++++++++++++++++');
var vegetables =['Potato','Tomatoo','Carrot','Radish'];
for(var flavour of vegetables){
    console.log('Vegetables_Name ='+flavour);  
}
console.log('+++++++++++++++++++++++++++++++++++++++');
var chocolates =['Ferrero Rocher','Lindt & Sprungli','Ghirardelli','Hersheys'];
for(var flavour of chocolates){
console.log('Chocolates_Name = '+flavour);
}
console.log('++++++++++++++++++++++++++++++++++++++++');
var refrigerator =['LG','Samsung','Worphool','Onida'];
for(var brand  of refrigerator){
console.log('Refrigator_Name = '+brand);    
}
console.log('+++++++++++++++++++++++++++++++++++++++');
var movies =['DDLJ','Welcome','Sahoo','Firangi'];
for(var actor of movies){
    console.log('Movie_Name = '+actor);
}
//Take 10 example and iterate using "for in" loop.(Arrays and Objects)
console.log('------------------------------------------');
console.log('iterate using "for in" loop.');
console.log('------------------------------------------');
var brands =['Kingfisher','Bisleri','Aqua','kinley'];
for(var brand in brands){
    console.log('Brand_Name = ',brands[brand]);   
}
console.log('-------------------------------------------');
var mobile = ['Motorola','Nokia','Iphone','Samsung'];
for(var product in mobile){
    console.log('MobileName : '+mobile[product]);  
}
console.log('--------------------------------------------');
var person = ['Abhinav','Himanshu','Mohit','Aniket'];
for(var humanity in person){
    console.log('Name = '+person[humanity]);   
}
console.log('-------------------------------------------');
var bike =['Yamha','Pulsar','Bullet','SportsBike'];
for(var brand in bike){
    console.log('BikeName = '+bike[brand]);  
}
console.log('------------------------------------------');
var fruits =['Mango','Guava','Banana','Grapes'];
for(var taste in fruits){
    console.log('FruitsName = '+fruits[taste]);  
}
console.log('------------------------------------------');
//iterating objects using "for in" loop
var person ={
    name : 'Abhinav kumar',
    Age : 22,
    Company : 'TYSS',
    Gender : 'Male',
    Profile :'Software Devloper'
}
for(var name in person){
    console.log(person[name]);   
}
console.log('-------------------------------------------');
var fruits ={
    fruitName : 'Mango',
    taste : 'Sweet',
    color : 'Yellow',
    price : '40/kg'
}
for( var taste in fruits)
{
    console.log(fruits[taste]);   
}
console.log('--------------------------------------------');
var mobile ={
    brand : 'Motorola',
    size :'5.5 inch',
    battry : '5000mh',
    camera :"40px"
}
for(var product in mobile)
{
    console.log(mobile[product]);
    
}
console.log('---------------------------------------------');
var movies ={
    movie_Name : 'DDLj',
    actor : 'SarukhKhan',
    actress : 'Kajol',
    status : 'Superhit'
}
for(var release in movies)
{
    console.log(movies[release]);   
}
//Take 10 example and iterate using "forEach()" method???
console.log('----------------------------------------------');
console.log('Iterating using "for Each method"');
console.log('---------------------------------------------');
var movies =['Sholay','DDLJ','Titanic','Welcome'];
movies.forEach(function(movie,index){
  console.log('Movie = '+movie);
  console.log("Movie index = "+index);    
});
console.log('--------------------------------------------');
var fruits =['Apple','Mango','Grapes','jackfruit'];
fruits.forEach(function(fruit,index){
    console.log('Fruits_Name : '+fruit);
    console.log('Fruit_index : '+index);   
})
console.log('--------------------------------------------');
var vegetables = ['Potatoo','Tomatoo','Capsicum','Ladyfinger'];
vegetables.forEach(function(vegetable,index){
console.log('Vegetable_Name : '+vegetable);
console.log('Vegetable_index : '+index);
})
console.log('---------------------------------------------');
var mobile =[
    {
        mobile_Name : 'Samsung',
        battery : '5000mh',
        camera : '15mp'
    },
    {
        mobile_Name : 'Nokia',
        battery : '4500mh',
        camera : '10mp'

    },
    {
        mobile_Name : 'OnePlus',
        battery : '5500mh',
        camera : '60mp'
    },
    {
        mobile_Name : 'Apple',
        battery : '3500mh',
        camera : '40mp'
    }
]
mobile.forEach(function(mobile,index)
{
    console.log('Product = ',mobile);
    console.log('Product index = ',index);  
})
