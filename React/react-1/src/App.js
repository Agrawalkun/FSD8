import logo from './logo.svg';
// import './App.css';
import React, { useState } from 'react';
// import Home from './Home';
// import Counter from './Counter';
// import Clock from './Clock';
import Bootstrap from './Bootstrap';
// import Card from './Card';
// import {Form, Route,Routes}  from 'react-router-dom'
import { Route,Routes}  from 'react-router-dom'
import Home from './Home';
import Navbar from './Navbar';
import About_Us from './About_Us';
import Contact_US from './Contact_US';
import Count from './Count';
import Forms from './Forms';
import A from './A';
import Context from './Context';
import Add_to_Cart from './Add_to_Cart';
import View_Cart from './View_Cart';
import StateReducer from './StateReducer';







const App =()=>{
  let user = "hello";
let button = "button";
  // let count = 0;
  let[count,SetCount]=useState(0)
  const fun1 =()=>{
console.log("kugf");
SetCount(count+1)
// if(count%2==0){
//   button.style.color='red';
// }

// count++;
  }
  return(
    <div>
    {/* <p>{count}</p> */}
  
      {/* <button onClick={fun1}> add</button> */}
{/*       
      <h2 class='h2'>I'm Back</h2> */}
    {/* <Home a = {user}/>  it act as the function calling */}
 
{/* <Counter/>
<Clock/> */}
 {/* <Bootstrap/> */}
{/* <Card/> */}
{/* <Navbar/>
<Routes>
  <Route path = '/' element={<Home/>}/>
  <Route path = '/aboutus' element={<About_Us/>}/>
  <Route path = '/contactus' element={<Contact_US/>}/>
</Routes>
<Count/> */}
{/* <Forms/> */}
{/* <Context.Provider value={user}>
  /* <A/> 
</Context.Provider> */}
<StateReducer/>
{/* <Routes>
  <Route path = '/' element={<Add_to_Cart/>}/>
  <Route path = '/view_cart' element={<View_Cart/>}/>
</Routes> */}

    </div>
  )
}

export default App;
