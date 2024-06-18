// let ex = require('ex')
// let ap= ex()



// ap.get('/:a/:b',(req,res)=>{
//     let {a,b} = req.params 
//     res.send(`${a}  ${b}`)
//     // let {b} = req.params
// //    res.send( a + " " + b + " "+ "  <h1>  is a pet </h1> ")
   
// }) 

// ap.get('/search',(req,res)=>{
//     console.log(req.query)   // jo question mark ke bad aayega wo query me aayeega
//     let {fn,ln} = req.query
//     res.send(`${fn} ${ln}`)
// })

// http://localhost:4000/search?fn=adsg&ln=sfdg
// ap.listen(3000,()=>{
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

// ap.set('index','ejs')
// ap.get('/random',(req,res)=>{
//     res.render('index.ejs')
// })
