import React from "react";
import {Link} from "react-router-dom";
import About from "./About";
import Cart from "./Cart";
/* import Chair from "./Books"; */
import Home from "./Home";
import "./NavStyle.css";
import Clothes from "./Clothes";
import Table from "./ProductDetail";
import logo from "../../images/logo.jpg"
import Books from "./Books";






function NavBar(){
	let loginData = localStorage.getItem('loginDetails') ? localStorage.getItem('loginDetails') : null;
	if(loginData)
  {
    loginData = JSON.parse(loginData)
  
  }


return(

    <>

      <nav className="navbar navbar-expand-lg navbar-dark " style={{backgroundColor:"#638ed3"}}>
  <div className="container-fluid">
    <a className="navbar-brand" href="#">
      <img src={logo} width="30" height="30" class="d-inline-block align-top" alt=""></img>
      Let's Donate</a>
    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span className="navbar-toggler-icon"></span>
    </button>
    <div className="collapse navbar-collapse" id="navbarSupportedContent">
      <ul className="navbar-nav me-auto mb-2 mb-lg-0">
        <li className="nav-item">
          <Link className="nav-link active" aria-current="page" to="/">Home</Link>
        </li>
        <li className="nav-item">
          <Link className="nav-link" to="/About">About</Link>
       
      
        </li>
        <li className="nav-item dropdown">
          <a className="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Donate
          </a>  
          <ul className="dropdown-menu" aria-labelledby="navbarDropdown">
          <li><Link className="dropdown-item" to="/Medicines">Medicine</Link></li>
          <li><Link className="dropdown-item" to="/Clothes">Clothes</Link></li>
          <li><Link className="dropdown-item" to="/Books">Books</Link></li>
          </ul>
        </li>
        <li className="nav-item dropdown">
         <a className="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Profile
          </a>
          <ul className="dropdown-menu" aria-labelledby="navbarDropdown">
           { loginData ?<li><Link className="dropdown-item" to="/Logout">Logout</Link></li>:<li><Link className="dropdown-item" to="/Login">Login</Link></li>}
           { loginData ?<li><Link className="dropdown-item" to="/order">MyDonations</Link></li> :<li><Link className="dropdown-item" to="/Register">Signup</Link></li>}
            
          </ul>
        </li>
        
       {/*  <li className="nav-item">
          <Link className="nav-link" to="/Cart"><i class="fas fa-shopping-cart"></i></Link>

        </li> */}
      </ul>
    {/*   <form className="d-flex">
        <input className="form-control me-2" type="search" placeholder="Search" aria-label="Search" />
        <button className="btn btn-outline-success" type="submit">Search</button>
      </form */}

    </div>
  </div>
</nav>














    </>

);

} 
export default NavBar;