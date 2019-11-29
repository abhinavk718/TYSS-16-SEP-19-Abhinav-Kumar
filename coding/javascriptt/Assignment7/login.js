function showPassword(){
    let a=document.getElementById('password')
    if(a.type==='password')
    {
        a.type='text'
    }
    else
    {
        a.type='password'
    }
}
function enableDisable(){
    let userName=document.getElementById('username').value;
    let password=document.getElementById('password').value;
    let login=document.getElementById('login');
    if(userName.length>5 && password.length>6)
    {
        login.disabled=false;
        
    }
    else
    {
        login.disabled=true;
    }
}

