// import  { useState } from 'react'
import  React , { useState }  from "react"
import './Login.css';
import axios from 'axios'

const Login = () => {
  let [ Open , setOpen]=useState({
    email:"",
    passWord:""
 });
 function fun1(e) {
  let {name,value} = e.target
  setOpen({...Open,[name]:value})
  
}
async function done(e) {
  
  e.preventDefault();
  console.log("done");
 let res = await axios.post("http://localhost:4000/login",Open)
 let data = JSON.stringify(res.data.loginData)
 localStorage.setItem('token',data)
//  console.log(res,"hello")
}
    // const [isOpen, setIsOpen] = useState(false);
  return (
   
<div class='body'>
   <div class="box-container">
        <form action="" onSubmit={done}>
            <h1>Login</h1>
            <input type="email" class="text" name="email" id="text" value={Open.email}  onChange={fun1} placeholder="email address"/>
            <br/>
            <input type="password" value={Open.passWord} class="Password" name="passWord" id="Password" onChange={fun1} placeholder="Password"/>
 <br/>
          <a href="forgotten_password.html" class="paragraph">Forgotten password? </a><br/>
            <button type='submit' class="button" > <a href="log_in.html" class="btn">Log In</a> </button>

            <p class="or"> OR</p>
           <a href="https://facebook.com" class="img"> <img src="/facebook.png" class="img"/> </a>&nbsp;
            <a href="https://www.facebook.com" class="log_in"> Log in with Facebook</a>
            <hr class="h-line"/>
            <p class="sign_in"> Don't have an account?
            <a href="sign_up.html" class="in">Sign Up</a>
            </p>
           
        </form>
    </div>
</div>
  )
}

export default Login

