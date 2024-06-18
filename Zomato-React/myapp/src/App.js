import logo from './logo.svg';
import { Link, Route,Routes}  from 'react-router-dom'
import './App.css';
import Home1 from './Home1';
import Dishes from './AddRestrorent';
import Nav from './Nav';
import AddRestrorent from './AddRestrorent';
import GetApp from './GetApp';
import InvesterRelation from './InvesterRelation';
// import Login from './Login';
import Signin from './Signin';
import Popup from './Popup';

function App() {
  return (
   < div>
   
   <Routes>
   {/* <Route   path='/'  element={<Nav/>}  /> */}
    <Route path='/' element={<Home1/>}/>
    <Route path='/Get the App' element={<GetApp/>}/>
    <Route path='/Invester Realations' element={<InvesterRelation/>}/>
    <Route path='/Add restaurant' element={<AddRestrorent/>}/>
    {/* <Route path='/Log in' element={<Login/>}/> */}
    {/* <Route path='/Sign in' element={<Signin/>}/> */}
   </Routes>
   {/* <Popup/> */}
   </div>
  );
}

export default App;
