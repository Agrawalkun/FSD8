// Async Await
// it is used to avoid the .then and .catch condition
function step_1() {
    return new Promise((resolve, reject) => {
        setTimeout(()=>{
            console.log("Select Image")
            resolve();
        },4000)
    })
}

function step_2() {
    return new Promise((resolve, reject) => {
        setTimeout(()=>{
            console.log('filtered image')
            resolve();
        },4000)
    })
   
    
}

function step_3() {
    return new Promise((resolve, reject) => {
        setTimeout(()=>{
            console.log('caption image')
            resolve();
        },4000)
    })
}
function step_4() {
    return new Promise((resolve, reject) => {
        setTimeout(()=>{
            console.log('image post')
            resolve();
        },4000)
    })
}
// how to call the async await 
async function call() {
    await step_1();
    await step_2();
    await step_3();
    await step_4();
}
call();

// request

// 
// by the help of the .then and .catch
fetch('https://dummyjson.com/products/1')
.then((data)=>{
    console.log(data); // it give the meta data
return data.json() // it give the exact data
})
.then((res)=>{
    console.log(res);
})
.catch((err)=>{
    console.log(err);
})

// by the help of async await
let h1 = document.querySelector('h1');
let div = document.querySelector('div');
async function cal() {
    let data  = await fetch('https://jsonplaceholder.typicode.com/todos')
    console.log(data);
  let res=await  data.json();
  console.log(res);
  fun1(res)
}
cal();
// display the title on the screen which we get in the console inside the data.
function fun1(a) {
    
    a.map((data)=>{
        let h2 = document.createElement('h2');
        h2.innerText=data.title;
        div.append(h2)
    })
    h1.innerText = a.title;
   
}