// console.log("fghgf");
// let cpu = require('give-cpu-info')
// console.log(cpu);
// let calk = require('chalk')
// console.log(chalk.blue('helloworld'));

// console.log('hello')
// const cat = require("give-me-a-random-cat")
// console.log(cat());
 
// let fs = require('fs')
// fs.writeFileSync('file.txt','data')
// let data = fs.readFileSync('file.txt')
// console.log(data.toString()) 
// fs.renameSync('file.txt','new.txt')

// fs.appendFileSync('new.txt','hiiii')
// let data2 = fs.readFileSync('new.txt')
// console.log(data2.toString())

// // fs.unlinkSync('new.txt')

// //fs.writeFileSync('file_name.txt','data') : to create file through code using filesystem  ,  it is running in nodejs environment
// // fs.readFileSync('file_name.txt') : to read the file , it gives data in buffer format , to make it in string write
// // console.log(file_name.toString())
// // fs.renameSync('old.txt','new.js') : can also change extension on renaming
// // to change the data : fs.writeFileSync('file_name.txt','updated data')
// // to append the data 
// // to delete , we have unlink



// // to create asynchronous file : we can handle error in asynchronous file because here we have a third parameter having callback function
// fs.writeFile('index.html','<h4>heeyyy</h4>', (err)=>{
//     if(err) throw err
//     console.log('file created');
// })

// // to read async file

// fs.readFile('index.html', (err,data)=>{
//     if(err) throw err
//     console.log(data.toString());
// })

// server 
// core module : https : also inbuilt

let http = require('http')
// console.log(server,".....")
let server = http.createServer((req,res)=>{
// console.log('response')
res.end('response')
})
server.listen(6002,()=>{
    console.log('server created')
}) 