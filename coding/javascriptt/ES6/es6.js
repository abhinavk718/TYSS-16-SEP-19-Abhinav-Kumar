const message=new Promise(function(resolve,reject){
if(30>10){
    resolve('Sucess')
}else{
    reject('Failed')
}
})
message.then(function(msg){
console.log('Sucess Message',msg);

}).catch(function(error){
console.log('Failure Message : ',error);
})
console.log('***************************************************');
const employees=new Promise(function(resolve,reject){
    if(30>10){
        resolve([{
            name :'Billgates',
            age :'40'
        },
        {
            name :'Markjukarberg',
            age : 45
        },
        {
            name :'Abhinav',
            age :23
        }
    ])
    }else{
        reject('Failed')
    }
    })
    employees.then(function(arr){
    console.log('data = ',arr);
    
    }).catch(function(error){
    console.log('Failure Message : ',error);
    })
