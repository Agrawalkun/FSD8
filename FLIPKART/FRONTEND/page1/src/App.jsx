import React from 'react'
import Headers from './Components/Headers'
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap.bundle.min";
import { Route, Routes } from 'react-router-dom'
import Signup from './Components/Signup.jsx';
import Login from './Components/Login.jsx';
import Product from './Components/Product.jsx';
const App = () => {

  
  return (
    <div>
      
     <Headers/>
     <Routes>
      <Route  path='/'  element={<Signup/>}/>
      <Route  path='/login'  element={<Login/>}/>
      <Route  path='/product'  element={<Product/>}/>


     </Routes>
    </div>
  )
}

export default App
