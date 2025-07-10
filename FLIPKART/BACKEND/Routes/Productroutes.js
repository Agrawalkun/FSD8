const express = require('express');
const router = express.Router();
const Product = require('../model/Productschema');
// Create a new product

router.post('/product', async(req,res)=>{
    // res.send('hehehe')
         const product = new Product(req.body);
        const savedProduct = await product.save();     
           res.status(201).json(savedProduct);
})
// Read all products
router.get('/product', async (req, res) => {    try {
        const products = await Product.find().populate('category');        res.status(200).json(products);
    } catch (error) {        res.status(400).json({ message: error.message });
    }});
// Read a single product by ID
router.get('/product/:id', async (req, res) => {    try {
        const product = await Product.findById(req.params.id).populate('category');        if (!product) return res.status(404).json({ message: 'Product not found' });
        res.status(200).json(product);    } catch (error) {
        res.status(400).json({ message: error.message });    }
});

module.exports = router;