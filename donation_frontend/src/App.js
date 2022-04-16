import './App.css';
import {BrowserRouter as Router,Switch,Route, Link} from 'react-router-dom';
import NavBar from './Component/customer/NavBar';
import Home from './Component/customer/Home';
import About from './Component/customer/About';
import Cart from "./Component/customer/Cart";
import Register from './Component/customer/Register';
import Login from './Component/customer/Login';
import Logout from './Component/customer/Logout';
import Books from './Component/customer/Books';
import Clothes from './Component/customer/Clothes';
import CheckOut from './Component/customer/CheckOut';
import ListAllUser from './Component/admin/ListAllUsers';
import AddNgo from './Component/admin/AddNgo';

import EditUser from './Component/admin/EditUser';
import AddUser from './Component/admin/AddUser';
import AdminNavBar from './Component/admin/AdminNavBar';
import ProductDetail from './Component/customer/ProductDetail';
import Order from './Component/customer/Order';
import { useEffect, useState } from "react";
import Footer from './Component/customer/Footer';


import ListAllProduct from './Component/admin/ListAllProduct';
import AddProduct from './Component/admin/AddProduct';
import EditProduct from './Component/admin/EditProduct';
import Medicines from './Component/customer/Medicines';


function App() {
  const[user,setuser]=useState(1);

  useEffect(() => {
    setuser(JSON.parse(localStorage.getItem("role")==='admin'?2:1))
}, [])




  return (
    <div className="App">
     
          <Router>
               { user===1?<NavBar />: <AdminNavBar />}
              <Switch>
                  <Route path="/" component={Home} exact ></Route>
                  <Route path="/About" component={About} ></Route>
                  <Route path="/Cart" component={Cart}></Route>
                  <Route path="/Register" component={Register}></Route>
                  <Route path="/Logout" component={Logout}></Route>
                  <Route path="/Login" component={Login}></Route>
                 <Route path="/ProductDetail" component={ProductDetail}></Route>
                 <Route path="/Books" component={Books}></Route>
                 <Route path="/Clothes" component={Clothes}></Route>

             
                 
                 <Route path="/CheckOut" component={CheckOut}></Route>
                 <Route path="/Order" component={Order}></Route>
                 <Route path="/Medicines" component={Medicines}></Route>
                                   

                 <Route path="/admin/ngo-add" component={AddNgo}></Route>
                 <Route path="/admin/dashboard" component={ListAllUser}></Route>
                  <Route path="/admin/edit-user" component={EditUser}></Route>
                  <Route path="/admin/user-add" component={AddUser}></Route>

                  <Route path="/admin/products" component={ListAllProduct}></Route>
                  <Route path="/admin/product-add" component={AddProduct}></Route>
                  <Route path="/admin/edit-product" component={EditProduct}></Route>
                  



              </Switch>
 
 
              <Footer />

          </Router>

    </div>
  );
}

export default App;
