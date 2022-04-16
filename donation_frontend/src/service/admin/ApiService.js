import axios from 'axios';

const USER_API_BASE_URL = 'http://localhost:8085/admin';

class ApiService {

    addUser(user){
        return axios.post(USER_API_BASE_URL+ '/user-add',user);
    }
    addNgo(ngo){
        return axios.post(USER_API_BASE_URL+ '/ngo-add', ngo);
    }

    fetchUserById(userId) {
        return axios.get(USER_API_BASE_URL + '/' + userId);
    }

    fetchAllUsers(){
        return axios.get(USER_API_BASE_URL + '/users');
    }

    editUser(user) {
        return axios.put(USER_API_BASE_URL + '/' + user.id, user);
    }

    deleteUser(userId) {
        return axios.delete(USER_API_BASE_URL + '/' + userId);
    }

    
    fetchAllProducts(){
        return axios.get(USER_API_BASE_URL + '/products');
    }

    addProduct(product){
        return axios.post(USER_API_BASE_URL+ '/product-add',product);
    }

    fetchProductById(productId) {
        return axios.get(USER_API_BASE_URL + '/product/' + productId);
    }

    editProduct(product) {
        return axios.put(USER_API_BASE_URL + '/product/' + product.id, product);
    }

    deleteProduct(productId) {
        return axios.delete(USER_API_BASE_URL + '/product/' + productId);
    }

}

export default new ApiService();