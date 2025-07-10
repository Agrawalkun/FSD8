let express = require('express')
let mongoose = require('mongoose')
let userRoutes = require('./Routes/Userroutes')
let productRoutes = require('./Routes/Productroutes')
let cors = require('cors')
let app = express();
app.use(cors())
let loginRoutes = require('./Routes/Loginroutes')

app.use(express.urlencoded({ extended: true }));
mongoose.connect('mongodb://127.0.0.1:27017/FLIPKART').then(()=>{
    console.log('db...');
}).catch((err)=>{
    console.log(err);
})

app.get('/',(req,res)=>{
    res.send('hello');
})
app.get('/user',(req,res)=>{
    res.send('hey');
})
app.use('/api', userRoutes)
app.use('/api', loginRoutes)
app.use('/api',productRoutes)
app.listen(8000,()=>{
console.log("server running on port number 8000");
})
