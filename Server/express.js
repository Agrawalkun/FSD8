let express = require('express')
let methodOverride = require('method-override');
let app= express()
app.use(methodOverride('_method'));
 app.use(express.urlencoded({ extended: true }));

// console.log(app,"hello")
// middleware: koi bhi request jaye but response yhi milna h
// app.use((req,res)=>{
//     res.send('hello serever created')
// })

// routing

// app.get('/',(req,res)=>{
//     res.send('<h2> hello</h2>')
// })
// app.get('/cat',(req,res)=>{
//     res.send('Meowwwww Meooowwww')
// })
// app.get('/new',(req,res)=>{
//     res.send('olddddd!')
// })
// * it take all the request and if the path is correct the it get executed otherwise it send the message that we write.
// app.get('*',(req,res)=>{
//     res.send('Not get the correct path to give the response')
// })

// we install the nodemon to update all the changes without running the terminal again and again.
// command: npm i nodemon
// and then in the json pacakage add the  "start": "nodemon ./express.js" in the script 
// and run npm start.
// app.listen(4000,()=>{
// console.log('server running');
// })
// in the above the code here code is fixed it means it is static routing
// in the dynamic routing we can give the condition and fetch all the information

// dynamic routing

// app.get('/:a/:b',(req,res)=>{
//     let {a,b} = req.params 
//     res.send(`${a}  ${b}`)
    // let {b} = req.params
//    res.send( a + " " + b + " "+ "  <h1>  is a pet </h1> ")
   
// }) 

// app.get('/search',(req,res)=>{
//     console.log(req.query)   // jo question mark ke bad aayega wo query me aayeega
//     let {fn,ln} = req.query
//     res.send(`${fn} ${ln}`)
// })

// http://localhost:4000/search?fn=adsg&ln=sfdg
// app.listen(4000,()=>{
//     console.log('server running!!!!!!!')
// })

// in above functions, only routing and messages are different , can we make it more easy ?? like we have to make only 1 or 2 functions
// query parameter or path parameter
// how to handle all request in one route?   dynamic way  using path parameter is used to give multiple response through one route

// use colon : to make path parameter like /:new
// then we use request 

// app.get('/:a',(req,res)=>{
//      let {a} = req.params    //params meaning parameters params is an object  and it contains router parameter (:a) as key and req as value
//     res.send(a)
// })

// jis cheez ke aage question mark lga hoga , by default wo query parameter me jayega

//  templating

// app.set('index','ejs')
// app.get('/random',(req,res)=>{
//     res.render('index.ejs')
// })
// app.use(express.static('public'))
// app.set('view engine','ejs')
// app.get('/index',(req,res)=>{
//     res.render('index')
    // console.log(req.query); // get the data on the server 
    // let{name,email,password} =req.query
    // res.send(`${name},${email},${password}`)
    // // res.send('done')
// })
// app.set('view engine','ejs')
// app.get('/user',(req,res)=>{
//     console.log(req.query); // get the data on the server 
//     let{name,email,password} =req.query
//     res.send(`${name},${email},${password}`)
    // res.send('done')
// })
// let arr =['hello','hii','A','B','C','A']
// app.get('/random/:a',(req,res)=>{

    // let a = Math.floor(Math.random()*100)
//     res.render('random',{arr})
// })
// app.get('/ifelse',(req,res)=>{
//     let a = Math.floor(Math.random()*100)
//     res.render('if_else',{a})
// })

// app.set('view engine','ejs')
// app.use(express.static('public'))
// app.get('/body',(req,res)=>{
//     res.render('body')
// })

// let express = require('express')
// let app = express()
let comments = [
    {
        id:0,
        username:"Sam",
        comment:"chitkara is a nice university 0"
    },
    {
        id:1,
        username:"g2",
        comment:"chitkara is a nice university 1"
    },
    {
        id:2,
        username:"vohra",
        comment:"chitkara is a nice university 2"
    }
  ]

app.set('view engine','ejs')
app.use(express.urlencoded({extended:true}))    // to get form data 
app.get('/blogs',(req,res)=>{
     res.render('index', {comments})
    })

    app.get('/blogs/new',(req,res)=>{
        res.render('form')
       })
  
    app.post('/blogs',(req,res)=>{
           console.log(req.body)
        //    res.send("saved")
           let id = comments.length 
           let {username,comment} = req.body 
           comments.push({id,username,comment})
           res.redirect('/blogs')
         })

         app.delete('/blogs/:id',(req,res)=>{
            let {id} = req.params
            // console.log(id);
            let newData=  comments.filter((data)=>{
                return data.id!=id
            })
            comments = newData
            res.redirect('/blogs')
         })
      
app.listen(5000,()=>{
    console.log('server running..... ')
})
