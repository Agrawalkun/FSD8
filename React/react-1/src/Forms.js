import React, { useEffect, useState } from 'react'
import './App.css';

const Forms = () => {
    let [input,SetInput]=useState({
    // let [input,SetInput]=useState({
        firstName:'',
        lastName:'',
        email:'',
        password:'',

    })
    let [data,SetData]=useState(null);
    useEffect(()=>{
        let val = localStorage.getItem('data');
        let newData = JSON.parse(val);
        console.log(newData,"fgb");
        SetData(newData)
    },[])
    function fun1(e) { // e is the object that hold the all valuw of the input
        // console.log(e,'gfhgfh');
        // console.log(e.target.name,e.target.value);
        const {name,value}=e.target;
        SetInput({...input,[name]:value});
        // console.log(input);
      

    }
    const done =(e)=>{
e.preventDefault();
console.log(input);
// localStorage.setItem('data',"hello");
let a = JSON.stringify(input);
 localStorage.setItem('data',a);
 SetData(input);
//    let n = localStorage.getItem('data',k);
    }
   function remove(){
    console.log("gh");
    localStorage.clear('data');
    SetData(null);
   }
  return (
    <div>Form <br></br>
        <form onSubmit={done}>
        <input type='text'  name='firstName'value={input.firstName} onChange={fun1} placeholder='Enter your first name'></input><br></br>
        <input type='text' placeholder='Enter your last name'name='lastName'value={input.lastName}onChange={fun1}></input><br></br>
        <input type='email' placeholder='Enter your email'name='email'value={input.email}onChange={fun1}></input><br></br>
        <input type='password' placeholder='Enter your password' name='password'  value={input.password}  onChange={fun1}></input><br></br>
        <button  type='Submit'>Submit</button>
        </form>
        <button  onClick={remove}>Remove</button>
        <div>
        
       {
        data?(<>
       <h1>{data.firstName}</h1>
        <h1>{data.lastName}</h1>
        <h1>{data.email}</h1>
       <h1>{data.password}</h1>
      
        </>
        ):(<><h1>"no data"</h1></>)
}
</div>




    </div>
  )
}

export default Forms;