import React from 'react'
import { Link, NavLink } from 'react-router-dom'


const Nav = () => {
  return (
    <div>
       <NavLink to ='/home'> <p> Get app</p></NavLink>
       <NavLink to ='/dishes'><p>Dishes</p></NavLink>
       <Link to=''  path=''></Link>
      
    </div>
  )
}

export default Nav