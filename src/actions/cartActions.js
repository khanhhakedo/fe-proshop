import axios from "axios";
import { useDispatch } from "react-redux";
import { CART_ADD_ITEM ,CART_REMOVE_ITEM} from "../constants/cartConstants";


export const addToCart = (id, qty) => async (dispatch, getState) => {
    const{data} = await axios.get(`http://localhost:8080/api/v1/products/${id}`)

    dispatch({
        type: CART_ADD_ITEM,
        payload: {
            product: data.id,
            name:data.name,
            image: data.image,
            price: data.price,
            countInStock: data.countInStock,
            qty
        }
    })

    localStorage.setItem('cartItems',JSON.stringify(getState().cart.cartItems))

}

export const removeFromCart = (id) =>(dispatch, getState) =>{
    dispatch({
        type:CART_REMOVE_ITEM,
        payload:id
    })

    localStorage.setItem('cartItems', JSON.stringify(getState().cart.cartItems))
}