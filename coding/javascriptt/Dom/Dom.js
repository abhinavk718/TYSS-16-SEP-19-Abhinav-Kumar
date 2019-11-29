let h1Element = document.getElementById('demo')
console.log('Element = ',h1Element);
console.log('Element Text : ',h1Element.textContent);
h1Element.textContent = 'Good Evening';
let buttonElement = document.createElement('button');
buttonElement.textContent = 'Click me!!!!';
console.log('Button Element : ',buttonElement);


document.body.appendChild(buttonElement);
let ulElement = document.createElement('ul')
let li1Elemment = document.createElement('li')
let li2Elemment = document.createElement('li')
let li3Elemment = document.createElement('li')

li1Elemment.textContent = 'JAVA'
li2Elemment.textContent = 'SQL'
li3Elemment.textContent = 'JavaScript'

ulElement.appendChild(li1Elemment)
ulElement.appendChild(li2Elemment)
ulElement.appendChild(li3Elemment)
document.body.appendChild(ulElement)

//adding style
h1Element.style.color = 'red';
h1Element.style.fontSize = '60px';


function showMessage(){
    alert('Hi Hello Welcome!!!!')
}
function changeColor(){
    let pElement=document.getElementById('mover')
    pElement.style.color='green'
}
function removeColor(){
    let pElement=document.getElementById('mover')
    pElement.style.color ='black'
}
function printHello(){
    //console.log('Hello');
    let userName=document.getElementById('username').value
    document.getElementById('showusername').textContent=userName
    
}
let name ='Abhinav'
let age =20
let phoneno = 9074817338
console.log('name is ' + name + ' age is ' + age + ' phoneno is ' + phoneno);
console.log(`name is  ${ name}  ' age is   + age + ' phoneno is ' + phoneno);