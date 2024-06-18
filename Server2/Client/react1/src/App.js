import logo from './logo.svg';
import './App.css';
import { Route,Routes } from 'react-router-dom';
import Signin1 from './Signin1'
import Login1 from'./Login1'
import React from 'react';
function App() {
  return (
    <div className="App">
    <Routes>
   
    <Route path='/' element={<Login1/>}/>
    <Route path='/signin' element={<Signin1/>}/>
   </Routes>
    </div>
  );
}

export default App;
