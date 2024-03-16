import logo from './logo.svg';
import './App.css';
import React, { useState } from 'react';
import Home from './Home';

const App =()=>{
  let user = "hello";
let button = button;
  // let count = 0;
  let[count,SetCount]=useState(0)
  const fun1 =()=>{
console.log("kugf");
SetCount(count+1)
if(count%2==0){
  button.style.color='red'
}

// count++;
  }
  return(
    <div>
    <p>{count}</p>
  
      <button onClick={fun1}> add</button>
      
      <h2 class='h2'>I'm Back</h2>
    <Home a = {user}/>  {/* it act as the function calling */}
 
    </div>
  )
}

export default App;
