
import React, { useState } from 'react'
import { Link } from 'react-router-dom'
import axios from 'axios'
import { createClient} from  '@supabase/supabase-js';
const supabaseUrl = 'https://ucxnwvqheoleuiqvldhr.supabase.co';
const supabaseKey = 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InVjeG53dnFoZW9sZXVpcXZsZGhyIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MjI3NzQ0NzUsImV4cCI6MjAzODM1MDQ3NX0.rIxB1WDddzTfvjW8Pnt20GW17ABslssfAIIHAkg-XyM';
const supabase = createClient(supabaseUrl, supabaseKey);

const Product = () => {
    let [input,SetInput]=useState({
        product:"",
        description:"",
        prize:"",
        brand:"",
        image:""
    });
    const handleImageChange = (e) =>{
        const file = e.target.files[0];
        console.log(file);
        SetInput({...input, image:file});
    }
    const handleChange = (e)=>{
        const { name, value} = e.target;
        SetInput({ ...input, [name]: value });
    }
    const handleSubmit = async (e) => {
        e.preventDefault();
        try {
          // Upload image to Supabase
          const { data, error } = await supabase.storage.from('Bucket').upload('product_images/' + input.image.name, input.image);
          if (error) {
            throw error;
          }
            // Get the URL of the uploaded image
      const imageUrl = `${supabaseUrl}/storage/v1/object/public/Bucket/product_images/${input.image.name}`;
      console.log(imageUrl,"blocking zzzzzzz");

        // }
        const response = await axios.post('http://localhost:8000/api/product', { ...input, image:imageUrl});
        console.log(response);
        
        if (response) {
          alert('product added successfully');
          // Reset form fields
       
        } else {
          alert('Failed to add product');
        }
      } catch (error) {
        console.log('Error adding product:', error);
        alert('Failed to add product');
      }
    };

  return (
    <div>
        <form action=''  onSubmit={handleSubmit}>  
        <input    name='product' value={input.product}  onChange={handleChange}  type='text' placeholder='Product name'/>
        <br/>
        <br/>
        <input   name='description' value={input.description}  onChange={handleChange}   type='text' placeholder='product description'/>
        <br/>
        <br/>
        <input    name='prize' value={input.prize}  onChange={handleChange}    type='number' placeholder='Product Price'/>
        <br/>
        <br/>
        <input   name='brand' value={input.brand}  onChange={handleChange}   type='text' placeholder='Product Brand'/>
        <br/>
        <br/>
        <input    onChange={handleImageChange}   type='file'/>
        <br/>
        <br/>

        <button  type='submit'> Add Product</button>
       
        <Link  to='/'>SigUp</Link>
        </form>
    </div>  

  )
}

export default Product