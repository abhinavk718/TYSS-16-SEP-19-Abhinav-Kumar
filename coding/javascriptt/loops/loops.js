var brands = ['Kingfisher', 'Bisleri' ,'Aqua','Kinley'];
console.log('For of loop');
for( var element of brands){
    console.log('Brand = ' ,element);
    
}
console.log('---------------------------------------');
var brands = ['Kingfisher', 'Bisleri' ,'Aqua','Kinley'];
console.log('For in loop');
for( var index in brands){
    console.log('Brand = ' ,brands[index]); 
}
console.log('---------------------------------------');
console.log('For in loop');
var person ={
    name : 'sundari',
    age : 33,
    color :'white'
}
for(var key in person){
    console.log('Value = ',person[key]);  
}
console.log('----------------------------------------');
console.log('forEach Method');
var movies =['sholay','mayabazar','jurassic','titanic'];
movies.forEach(function(value ,index)
{
    console.log('Movie = ',value);
    console.log('Movie Index = ',index);
    
})
console.log('--------------------------------------');
console.log('for Each item');
var items =[
    {
        item : 'bangles',
        id : 1,
        price : 100
    },
    {
        item : 'eyeliner',
        id : 2,
        price : 500
    },
    {
        item : 'watch',
        id : 3,
        price : 5000
    },
    {
        item : 'bike',
        id : 4,
        price : 1000000
    }
]
items.forEach(function(item,index)
{
    console.log('item = ',item);
    console.log('index of item = ',index);
})




