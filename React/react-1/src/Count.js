import React, { useCallback, useEffect, useState } from 'react'

const Count = () => {
let [count,SetCount]=useState(0)
let [city,SetCity]=useState('bhopal');
//useEffect
// jo data baar baar load hota h koi bhi state change hone se to usko restricted krne ke liye duaeeffect ka use hota h
// 
useEffect(()=>{
    fetch('https://jsonplaceholder.typicode.com/todos')
    .then((res)=>{
return res.json()
    }).then((data)=>{
        console.log(data);
    })
    // }) it is the normal state data will fetch in every condition
//},[]) // it will load the data only once // Empty dependency
},[count]) // jb count button ko click krne pr hi baar baar data loat hoga.

function fun1(){
    console.log("dtght");
    SetCount(count+1);
}
function fun2(){
    // console.log("dtght");
    SetCity("delhi");
}

  return (

    <div>
        <p>{count}</p>
        <button onClick={fun1}>count</button>
        <h3 >{city}</h3>
        <button onClick={fun2}>count</button>
       
    </div>

  )
}

export default Count