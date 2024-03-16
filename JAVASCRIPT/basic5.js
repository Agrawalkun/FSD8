// promises
// 3 posiblities
//1. pending state
//2.fullfil(resolve)
//3. not fullfill(reject)

let promise= new Promise((resolve, reject) => {
    setTimeout(() => {
        console.log('hello')
        resolve('resolve');
        // reject('err')
    }, 2000);
  
})
console.log(promise)

promise.then((data)=>{ // ye tbhi chalega jb promise resolve hoga
    console.log(data);
}).catch(err=>{
    console.log(err);
})

function step_1() {
    return new Promise((resolve, reject) => {
        setTimeout(()=>{
            // console.log("Select Image")
            resolve('Select Image');
        },4000)
    })
}

function step_2(data) {
    return new Promise((resolve, reject) => {
        setTimeout(()=>{
            console.log(data)
            resolve('filtered image');
        },4000)
    })
   
    
}

function step_3(fn) {
    return new Promise((resolve, reject) => {
        setTimeout(()=>{
            console.log(fn)
            resolve('caption image');
        },4000)
    })
}
function step_4(fb) {
    return new Promise((resolve, reject) => {
        setTimeout(()=>{
            console.log(fb)
            resolve('image post');
        },4000)
    })
}
// how to call promise
step_1().then((data)=>{
    return step_2(data)
}).then((fn)=>{
    return step_3(fn)
}).then((fb)=>{
    return step_4(fb)
}).then((n)=>{
    console.log('image post')
})


