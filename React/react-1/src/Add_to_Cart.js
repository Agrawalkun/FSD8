import React, { useEffect, useState } from 'react'
import Cart_Data from './Cart_Data'
import {useNavigate}from'react-router-dom'
 import './Cart.css';
import View_Cart from './View_Cart';
// import Context from './Context';

const Add_to_Cart = () => {

    const[Data,SetData]=useState([]);
    const[cart,Setcart]=useState([]);
    let navigate = useNavigate();
    useEffect(()=>{
        // SetData(Cart_Data)
        SetData(Cart_Data.map(item=> ({...item,quantity:0})),[]);
    },[]);
  
    const  handleAdd=(id)=>{
        const updatedCart =Data.map(item=>item.id ===id?{...item,quantity:item.quantity+1}:item);
        SetData(updatedCart);
        console.log(updatedCart,"skdjufhufguy7fgwy67f");
        const productToAdd = {...Data[id]};
        Setcart([...cart,productToAdd]);
       

    };
   
    const  handleReduce=(id)=>{
        const updatedCart =Data.map(item=>item.id ===id?{...item,quantity:item.quantity-1}:item);
        SetData(updatedCart);
    }
   
    let total_price =()=>{
    return Data.reduce((total,item)=>
        total+item.price*item.quantity,0);
    };
function  addToCart(id){
        console.log(id);
        const updatedCartData = Data.map(data=>
        data.id === id?{...data,quantity:1}:data);
        SetData(updatedCartData);
        console.log(Data,"skdjbswduyfgw7f6");
        const productToAdd ={...Data.find(item=>item.id===id),quantity:1};
        Setcart([...cart,productToAdd]);
        console.log(cart,"cartttttttttttttt");
    };
    const addCart =() =>{
       
        const filteredCart = Data.filter(item=>item.quantity>0);
        let price = total_price();
        navigate('/view_cart',{state:{cart:filteredCart,price}});
    };
    
    
  return (
    <div>
       
       <h1>Cart</h1>
       <button className='btnb' onClick={addCart}>View Cart({Data.filter(item=>item.quantity>0).length})</button>
       {
           <p className='total_price'>Total Price: ${total_price()}</p>
        }
           { 
           Data.map(item=>{
            return(<div className='container'>
                
                <li>{item.id}</li>
                <div className='div-con'>
            <img src={item.image} alt={item.name}></img>
            <div className='div-content'>
            <h2>{item.name}</h2>
            <p>{item.description}</p>
            <p> Price:${item.price}</p>

            <p>Quantity:{item.quantity}</p>
            {item.quantity ===0 ?(<button onClick={()=>addToCart(item.id)}>Add to Cart </button>):(
            <>
               <button onClick={()=>handleReduce(item.id)}>-</button>
                <button>{item.quantity}</button>
                <button onClick={()=>handleAdd(item.id)}>+</button>
                
                </>)}
            {/* <button onClick={()=>Add_to_Cart(item.id)}>Add to Cart </button> */}
            </div>
            </div>
            
             </div>
             )
        })
            }
       
     
           
          
    </div>
  )

}

export default Add_to_Cart;