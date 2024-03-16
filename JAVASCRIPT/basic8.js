let arr = [1,2,3,4,5]
let num = [7,8,9]
let number = [4,6,7,8,9]


// old way
let newA = arr.concat(num)
console.log(newA,"rr")

// new way
// spread operator : ... triple dot
 num=[...number,num,789]
 console.log(num,"hello")
 console.log(Math.max(...num))

 function sum ( a,b,c,...num){
    console.log(num);
 }
 sum(1,2,3,4,5,6,7,8,9,10);
 let obj = {
    id:1,
    name:"kun"
 }
 let obj1 ={
    ...obj,
    id:2

 }
 console.log(obj);

 // destructuring
 let arr1 =['hello','hey','bye']
 // old way
 let a = arr1[0];
 let b = arr1[1];
 console.log(a);
 console.log(b);

 // new way
 let [c,d]= arr1
 console.log(c,d)

 let obj2 = {
    id:1,
    name :"hello",
    lastname:"hii"

 }
 let{id,lastname,name}=obj2
 console.log(id);
//  obj2.id
//  obj2.lastname


 // js module
  // import andexport data from one js file to another   
  
  import{data,sum1}from'./export.js'
  console.log(data , sum1(10,20))
//   sum1(10,10)

