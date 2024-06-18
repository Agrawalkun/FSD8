import React from 'react'
import './Navbar.css';
import  {NavLink} from 'react-router-dom';
const Navbar = () => {
  return (
    <div>
        <div id="div">

  <NavLink to ='/'><p>home</p> </NavLink>
  <NavLink to ='/aboutus'><p>About Us</p> </NavLink>
  <NavLink to ='/contactus'><p>Contect us</p> </NavLink>


</div>
    </div>
  )
}

export default Navbar