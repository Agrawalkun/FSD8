// import React from 'react'
import React, { useState } from 'react'

const Popup = () => {
    const [isOpen, setIsOpen] = useState(false);
 
    return (
      <div>
        <button onClick={() => setIsOpen(true)}>
          Open Pop-up
        </button>
   
        {isOpen && (

<div class="form" id="formName">
<form action="">
    <div class="form-flex">
        <h1 class="form-heading">Sign up</h1>
        <p class="form-icon" id="signupClose" onClick={() => setIsOpen(false)}>X</p>
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
        <div class="google-logo">

        </div>
        <div class="already-account">
            <p class="account">Already have an account?</p>
            <span class="acc">Log in</span>
        </div>
    </div>
</form>
     </div>
       
        )}
      </div>
    );
}
 //  <div>
        //   <div>
        //     This is the content of the pop-up.
        //   </div>
        //   <button onClick={() => setIsOpen(false)}>
        //     Close Pop-up
        //   </button>
        //  </div>

export default Popup