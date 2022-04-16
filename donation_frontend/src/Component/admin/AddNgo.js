import React, { Component } from 'react'
import ApiService from '../../service/admin/ApiService';

class AddNgo extends Component{

    constructor(props){
        super(props);
        this.state ={
            ngoName: '',
            email: '',
            password: '',
            mobile: '',
            address: '', 
            message: null
        }
        this.saveNgo = this.saveNgo.bind(this);
    }

    saveNgo = (e) => {
        e.preventDefault();
        let ngo = {ngoName: this.state.ngoName, email: this.state.email,password: this.state.password, mobile:this.state.mobile,address:this.state.address};
        ApiService.addNgo(ngo)
            .then(resp => {
                console.log(resp.data);//actual response data sent by back end
                this.setState({message : 'Ngo added successfully.'});
                this.props.history.push('/admin/dashboard');
                alert(this.state.message);
            }).catch( err=>{
              //  console.error(err);
                console.error("in err ",err.response.data);
                //err.response.data => DTO on the server side : ErrorResponse
                alert(err.data.message);             
                this.props.history.push('/admin/dashboard');
            })
            
    }

    onChange = (e) =>
        this.setState({ [e.target.name]: e.target.value });

    render() {
        return(
            <div className="col-6">
                <h2 className="text-center">Register Ngo</h2>
                <form>
                <div className="form-group">
                    <label>Ngo Name:</label>
                    <input type="text" placeholder="Ngo Name" name="ngoName" className="form-control" value={this.state.ngoName} onChange={this.onChange}/>
                </div>

                {/* <div className="form-group">
                    <label>Middle Name:</label>
                    <input placeholder="Middle Name" name="middleName" className="form-control" value={this.state.middleName} onChange={this.onChange}/>
                </div>

                <div className="form-group">
                    <label>Last Name:</label>
                    <input placeholder="Last Name" name="lastName" className="form-control" value={this.state.lastName} onChange={this.onChange}/>
                </div> */}

                
                <div className="form-group">
                    <label>Email id:</label>
                    <input type="email" placeholder="email id" name="email" className="form-control" value={this.state.email} onChange={this.onChange}/>
                </div>
    
                
                <div className="form-group">
                    <label>Password:</label>
                    <input type="password" placeholder="password" name="password" className="form-control" value={this.state.password} onChange={this.onChange}/>
                </div>


                <div className="form-group">
                    <label>Mobile:</label>
                    <input type="mob" placeholder="Mobile" name="mobile" className="form-control" value={this.state.mobile} onChange={this.onChange}/>
                </div>

                <div className="form-group">
                    <label>Address:</label>
                    <input type="text" placeholder="Address" name="address" className="form-control" value={this.state.address} onChange={this.onChange}/>
                </div>


            
                <button className="btn btn-success" onClick={this.saveNgo}>Save</button>
            </form>
    </div>
        );
    }
}

export default AddNgo