import { useState } from "react";
import { useLocation } from "react-router-dom";

const View_Cart = () => {
const location= useLocation();
const{cart,price}=location.state;
console.log(cart,price,"fghth");
let[totalPrice,SetTotalPrice]=useState(price);
let[dcart,SetDCart]=useState(cart);

  return (
    <div>
      <h2>View Cart</h2>
      <ul>
        <h4>
          totalPrice:${price}
        </h4>
        {cart.map((item,index)=>(
          <li key={index}>
          {item.name}-Quantity:{item.quantity}</li>
        ))}
      </ul>

    </div>
  )
}

export default View_Cart;