
// let mongoose = require('mongoose')
// let userSchema = mongoose.Schema({
//     name:{
//         type:String,
//         required:true
//     },
//     lastName:{
//         type:String,
//         required:true
//     },
//     number:{
//         type:Number
//     },
//     isBool:{
//         type:Boolean,
//         required:true
//     }
// })
// let User = mongoose.model("User",userSchema)
// module.exports = User

let mongoose=   require('mongoose')

let userSchema=  mongoose.Schema({
    firstName:{
        type:String
    },
    lastName:{
        type:String
    },
    email:{
        type:String
    },
    passWord:{
        type:String

    }

})
let User=  mongoose.model('User',userSchema)
module.exports=User