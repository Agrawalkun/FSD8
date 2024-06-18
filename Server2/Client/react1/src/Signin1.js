import React, { useState } from 'react'
import axios from 'axios'

const Signin1 = () => {
     let [ Open , setOpen]=useState({
        firstName:"",
        lastName:"",
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
       let res = await axios.post("http://localhost:4000/signin",Open)
       console.log(res,"hello")
     }

  return (
    <div>

<div class="form" id="formName">
<form action="" onSubmit={done}>
    <div class="form-flex">
        <h1 class="form-heading">Sign up</h1>
        <p class="form-icon" id="signupClose" >X</p>
    </div>
    <input type="text" placeholder="Full Name"  value={Open.firstName} name="firstName" onChange={fun1} class="form-input"/>
    <input type="text" placeholder="Full Name"name='lastName'  value={Open.lastName}onChange={fun1} class="form-input"/>
    <input type="email" placeholder="Email"name='email'  value={Open.email} onChange={fun1} class="form-input"/>
    <input type="password" placeholder="password"name='passWord'  value={Open.passWord} onChange={fun1}  class="form-input"/>
    <button> Log In</button>
    <button> Submit</button>


    {/* <input type="checkbox"/><span class="para-open">I agree to Zomato's</span><span class="span"> <span
            class="para-opeen">Terms of Services Privacy Policy</span></span>
    and
    <span class="span">Content Policies</span>
    <button class="btn">Create Account</button>
    <p class="form-para">or</p>
    <div>
        <div class="gmail">
            <p>Sign as Kunika Agrawal</p>
            <span>agrawalkunika1920@gmail.com</span>
        </div>
        <div class="google-logo">

        </div>
        <div class="already-account">
            <p class="account">Already have an account?</p>
            <button ><span class="acc">Log in</span></button>
        </div>
    </div> */}
</form>
     </div>
    </div>
  )
}

export default Signin1