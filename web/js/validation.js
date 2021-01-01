/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

const form = document.getElementById("form");
const firstname = document.getElementById("Firstname");
const lastname = document.getElementById("Lastname");
const username = document.getElementById("Username");
const email = document.getElementById("Email");
const phone = document.getElementById("Phone");
const pass = document.getElementById("Password");
const confpass = document.getElementById("ConfPass");

form.addEventListener('submit',function(e){
    
    
});

function validate(){
    const fnameVal = firstname.value();
    const lnameVal = lastname.value();
    const unameVal = username.value();
    const emailVal = email.value();
    const phoneVal = phone.value();
    const passVal = pass.value();
    const cpassVal = confpass.value();
    
    if(fnameVal.length >4 ){
        setErrorFor(username, 'Username cannot be blank');
    } else {
	setSuccessFor(username);
    }  
}

function setErrorFor(input, message){
    const formGroup = input.parentElement;
    const small = formGroup.querySelector('small');
    formGroup.className = 'form-control error';
    small.innerText = message;
}

function setSuccessFor(input) {
	const formGroup = input.parentElement;
	formGroup.className = 'form-control success';
}

