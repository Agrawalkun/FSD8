// Data type 
// 1. Primitive
//a. Number
//b. String
//c. Boolean
//d. Null
//e. undefined
//f. Symbol
//g. Big int
//2. Non-Primitive
// a. Array
// b. class
// c. object 



// Var , let , const is used to declare any value
// var a =6 data type is number since the value is defined
//  var a dont know the DT
// Var = redeclare and reassigning is possible
var g =5 
var g =3
console.log(g)
//let = only reassigning is possible 
let d=4
d=3
console.log(d)
// const = nothing is possible 
const a = 3
console.log(a)
console.log("Hello")
//Camel Case = firstName

let firstName ='gnfo'
let lastname ='gfs'
console.log(`${firstName} ${lastname}`) // it is used to concatinate or add the value we use the back kit to do this . there is no need to give space with the add operatorlike we give bellow
// we can also used the + operater 
console.log(firstName + " "+lastname)
// = vs == vs ===
//= is used to assign the value
// == is used to compare the value only  console.log(5=='5') gives the true value because only values will compare
// === is used to compare the data type so 5==='5' gives the false value

// undifined vs null
 // undefined me variable declare krne ke baad print krne pr value undefined aayegi
let user;
console.log(user);
// null = it is the value so  we can asign it in the variable so it will give the null 
let use = null;
console.log(use);
 // ternary operator 
 //variable?condition1:condition2
 // by default ye first condition ko hi true check krta h

 let isbool = true
 isbool?console.log('hello'):console.log('hii')

  let k = 78;
  let y = 90
if( a>75 && a>=90){
    console.log('a')
} else{
    console.log('b')
}
// function
//function keyword func_name(){} -- it is the function defination
// calling = func_name();

// function sum(){
//     return 'hello'
// }
// let us =sum()
// sum()
// console.log(sum())
// arrow function 
// new way to to write the normal fuction
const sum =(a)=>{
    console.log('arrow')
}
sum()



// array 
// let arr=[]
let arr1 =['hello', 1, true]
arr1[0]
console.log(arr1[2])


// loop
for(let i = 0; i<6 ; i++){
    console.log(i)
}

let arr =['hello', 1, true]
// for in loop
// point the index value 
// index print krta h
for( let i in arr ){
    console.log(i)
}
//for of loop
// point the value of hte array
// print the value 
for( let i of arr ){
    console.log(i)
}

// for erach loop
// mixture of for in and for of loop 

let ar1 =[ 1,2,3,4]
ar1.forEach((a,b,c)=>{
    console.log(a,b,c)
    // console.log(c*2)

})
let arf1 =[ 1,8,3,4]
arf1.forEach((a,b,c)=>{
    // console.log(a,b,c)
     console.log(a*2)

})

let ar =[ 1,7,3,4]
 let ser =ar.forEach((a,b,c)=>{
    // console.log(a,b,c)
    return a

})
console.log(ser)
// for each koi naya array create nhi krta h to anser undefined aayega 
// for  each loop exist array me hi modification krega
// it will work on the array

// map
// map me naya array create ho jata h 
// ye existing array me modification nhi krta
// same as for each loop bs naya array create kr dega
// it will work on the array
let ad = [1,5,6,7]
let new1 = ad.map((a,b,c)=>{
    return c
})
console.log(new1)

// filter
// ek specified condition lagane pr pura array iterate krta h 
let arr2=[2,3,4,5]

let new2 = arr2.filter((a,b,c)=>{
    return a>2
})
console.log(new2)

// find
// ek specified condition lagane ke baad ek baar jab value ,mil jati h to fir wo pura array itrate nhi krega whi value print krega
let ar2=[2,3,4,5]

let new3 = ar2.find((a,b,c)=>{
    return a>2
})
console.log(new3)

 let a4 =[1,2,3,4,5,6]
 var add =0
 for(var i =0; i<6;i++){
    add = add+a4[i]
 }
console.log(add)

// reduce
// it will pass the 4 parameter
// c and d is fixed c gives the index , d give the value of the array 
// a will point the value of the a

























rray
// b do the iteration like i++
let arr4 =[1,2,3,4,5,67]
let new4 = arr4.reduce((a,b,c,d)=>{
    return a+b
})
console.log(new4)




