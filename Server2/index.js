// console.log('hello');
// let express=require('express')

//  let app=   express()
//  app.use(express.urlencoded({extended:true}))
//  app.use('/home' , express.static('public'))
//  app.set('view engine', 'ejs')
//    let arr=[1,2,3,4,5]      
//  app.get('/cat',(req,res)=>{
//     res.send('cat')
    
//  })
//  app.get('/todo',(req,res)=>{
//     if(req.xhr){
//      res.json(arr)
//     }
//    else{
//     res.render('index',{arr})
//    }

//  })
//  app.post('/todo',(req,res)=>{
//    console.log(req.body,"jeje");
//    let {data}=req.body
//    let data1=  parseInt(data)
//    arr.push(data1)
//    res.send('hehhe')

//  })

//  app.listen(5000,()=>{
//     console.log('server running...');
//  })

// csr vs ssr
let express=require('express')
let mongoose = require('mongoose')
let User =require('./model/model')
let bcrypt = require('bcrypt')
let jwt = require('jsonwebtoken')
let cors = require('cors')
let app = express()
app.use(cors())
mongoose.connect('mongodb://localhost:27017/mydata').then(()=>{
    console.log("db");
}).catch((err)=>{
console.log(err,'not running');
})


// app.get('/',(req,res)=>{
//     res.send('hello')
// })
app.listen(4000,()=>{
    console.log("server running on port 4000");
})

app.use(express.json())

app.get('/',(req,res)=>{
    
    res.send('ehhe')
})

app.post('/signin', async(req,res)=>{
    console.log(req.body);
    let userData=req.body
    let {email}=req.body
    let user=    await  User.findOne({email})
     console.log(user);
     if(user){
        res.send('user jinda hai ')
     }
     else{
          userData.passWord=    await  bcrypt.hash(userData.passWord,10)
          console.log(userData.passWord);
           let dbUser=  new User({
            firstName:userData.firstName,
            lastName:userData.lastName,
            email:userData.email,
            passWord:userData.passWord
          })
          await dbUser.save()
        
          res.send('ho gyaa signinnn')


        //   res.send('createdddd')
     }


    // res.send('hehe')


})


// login  api

 app.post('/login', async(req,res)=>{
    console.log(req.body);
    let userInfo=req.body
      let loginData=   await User.findOne({email:userInfo.email})
      if(!loginData){
        res.send('user nhi milaaaa ')
      }
      else{
        // res.send('koi mil gyaa')
        let validPass=    await  bcrypt.compare(userInfo.passWord,loginData.passWord)
        if(!validPass){
            res.send('invalid password')
        }
        else{
            let data=JSON.stringify(loginData)
            let   token=  jwt.sign(data,'JHSBFIWUGFWIGRFWIPGEU')
            console.log(token,"toeknnn");
            res.send({token,loginData})
        }
      }


 })



// let userSchema =mongoose.Schema({
//   name:String,
//   lastName:String,
//  num:Number,
//   isBool:Boolean
// })

// let User=  mongoose.model('User',userSchema)


//  let User1=  new User({name:"Siri",lastName:"Agrawal",num:1,isBool:true})
//  User1.save()
//  let User2=  new User({name:"Mank",lastName:"Lodhi",num:1,isBool:true})
//  User2.save()