import React, { useReducer } from 'react'

const StateReducer = () => {
let initialState=false;
let reducer = (state,action)=>{
    if(action.type==="increase"){
        if(state%2==0){
          return true;
        }
        else if( state%2!=0){
            return false;
        }
        // return state+1
    }
    else if(action.type==="decrease" && state>0){
        return state-1
    }
    else if(action.type==="reset"){
        return state=false;
    }
    return state;
}
let [state,dispatch]=useReducer(reducer,initialState);
  return (
    <div>
     <p style={{color:state?'black':'violet'}}>Count:{state?(state+1):(state-1)}</p>
       <div>

       <button onClick={()=>dispatch({type:'increase'})}>+</button>
       <button onClick={()=>dispatch({type:'decrease'})}>-</button>
       <button onClick={()=>dispatch({type:'reset'})}>Reset</button>
       </div>
    </div>
  )
}

export default StateReducer
