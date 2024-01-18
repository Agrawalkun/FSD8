// object
// keys or values ke  pair me sara data store hota h
 let obj = {
    id:1, // keys:values
    user:'hello',
    isttrue:true
 }
 obj.user // calling the object
 // we can change the value of the user here
 obj.user="hii"
 console.log(obj.user)

 //array in object
  let arr =[{id:1, user:'hello',isttrue:true} ,{id:2, user:'hii', isfalse:false}]
  arr.map((k)=>{
console.log(k.id)
  }
  )

  // push
  let arr1=[1,2,3,4,5]
  arr1.push(7) // upend at last
  console.log(arr1)

  // pop
  let arr2=[1,2,3,4,5]
  arr2.pop(3) // delete from the last
  console.log(arr2)

  // unshift
  let arr3=[1,2,3,4,5]
  arr3.unshift(3) // add from the start
  console.log(arr3)
  // shift
  let arr4=[1,2,3,4,5]
  arr4.shift(1) // remove from the start
  console.log(arr4)

  // function ke object ko pass krana 
  function add(a){
    console.log(a.id)

  }
  let obj1 ={
    id:1,
    user:"hello"
  }
  add(obj1)

  // object ke andar function ko pass krana called the method

  let obj2={
    fisrtName:"hello",
    lastName :"hii",
    fullName: function(){
        //console.log(t)
        console.log(this) // this keyword point the present object so it gives the whole information of the object
    }
  

  }
  obj2.fullName()

  let user ='hello'
  function add(){
    console.log(user)
  }
  add() 
;obj;


  let user1 ='hello'
  function add(){
    let num =5
    console.log(num)
  }
  console.log(user)
  add() 

  function outer(){
    inner()
    var num1 = 5;
    function inner(){
      console.log(num1)
    }

  }
  outer()

  function outer1(){
    var num2 = 5;
    inner1()

    function inner1(){
      console.log(num2)
    }

  }
  outer1()

  // hoisting , local and global variable
  console.log(p)
  var p =6

  let a = 5;
  console.log(a)
  // let and const are the blockscope

  // higher order function
  //aisa koi  bhi ek fuction jo apne argument me koi doorsa function contain kre ya apne function me return  doorsa function kre

  function outer4(a){
    console.log("outer")
    a()
  }
  function inner4(){
    console.log("inner")
  }
  outer4(inner4)


  // now here we are returning the function
  function  outer5(){
    console.log("outer")
    function inner5 (){
      console.log("inner")
    }
    return inner5;
  }
  // outer5()
  console.log(outer5())

  // do not use filter aur if else make the function which print everythig seperately
  let arr7=[1,2,3,4,'hello','hii', true,false]