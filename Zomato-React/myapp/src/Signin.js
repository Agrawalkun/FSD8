import React from 'react'
import { Link } from 'react-router-dom'

const Signin = () => {
  return (
    <div> <div class="form" id="formName">
    <form action="">
       <div class="form-flex">
           <h1 class="form-heading">Sign up</h1>
          <Link to="/"> <p class="form-icon" id="signupClose">X</p></Link>
        </div>
     <input type="text" placeholder="Full Name" class="form-input"/>
     <input type="text" placeholder="Full Name" class="form-input"/>
     <input type="checkbox"/><span class="para-open">I agree to Zomato's</span><span class="span"> <span
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
           <div class="google-logo"></div>
              <div class="already-account">
                 <p class="account">Already have an account?</p>
                 <span class="acc">Log in</span>
               </div>
        </div>
    </form>
   </div></div>
  )
}

export default Signin