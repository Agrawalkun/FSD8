import React, { useState } from 'react'

const Counter = () => {
  let Increament="button"
  let Decreament="button"
  let Reset="button"
  let[count,SetCount]=useState(0); // koi bhi dynanic kaam karana h to use state ka use krte hai
  const fun1 =()=>{
    // console.log("thh");
SetCount(count+1);
  }
  // let[co,Setcount]=useState(count);
  const fun2 =()=>{
    if(count!=0){

SetCount (count-1);
    }
  }
  const fun3 =()=>{
SetCount (0);
  }

  return (
    <div>
      <h2>Counter</h2>
      <p> Count:{count}</p>
      <button onClick={fun1}> Increament</button>
      <button onClick={fun2}> Decreament</button>
      <button onClick={fun3}> Reset</button>
    </div>

  )
}

export default Counter