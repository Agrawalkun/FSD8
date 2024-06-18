import React, { useState } from 'react'
import './index.css';
const Clock = () => {
    let [time,SetTime]=useState();
    setInterval(() => {
        let a =  new Date().toLocaleTimeString();
        SetTime(a);
        // console.log(a);
    });
  return (
    <div class="clock"> <h2 class="h2-clock">Time:</h2>
       <p class="time">{ time}</p> </div>
  )
}

export default Clock