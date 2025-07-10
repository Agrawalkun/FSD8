let mongoose=    require('mongoose')
let productsSchema=   new mongoose.Schema({
     product:{
         type:String,
        //  require:true
     },
     description:{
         type :String,
        //  require:true
     },
     price:{
        type :String,
        // require:true
    },
    brand:{
        type :String,
        // require:true
    },
    image:{
        type :String,
        // require:true
    },
   })

 let  Product=  mongoose.model('Product', productsSchema)
    module.exports=Product