let express=require('express')
let mongoose = require('mongoose')
mongoose.connect('mongodb://localhost:27017/?directConnection=true&serverSelectionTimeoutMS=2000&appName=mongosh+1.10.6').then(()=>{
    console.log("db/");
}).catch((err)=>{
console.log(err,'not running');
})

let app=express()
app.get('/',(req,res)=>{
    res.send('hello')
})
app.listen(4000,()=>{
    console.log("server running on port 4000");
})
