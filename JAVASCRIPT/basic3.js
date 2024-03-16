// Synchronous and the Asynchronous
// Synchronous: sequenctial way me statement ko execute krana
// Asynchronous: order wise code ko execute na karana.
// JS is a synchronous, a single thread

console.log("hello"); // first exacute
setTimeout(()=>{
    console.log('hey'); // third execute
})
console.log("kaise ho "); // second execute

// setTimeout and setInterval is the inbuilt function but they are not the part of the JS like console . it only work on the chrome browser.  ye ek web Api me rhte h ,
// Since JS wait nhi krta h to wo hello ke baad kaise ho pront krega then hey print krega.
// stack me hello gya uske baad setTimeout jakar web Api me baith gya ,utne time pr js wait nhi krta to wo stack me kaise ho daal dega , uske baad web api me se call back  queue me jayega to uske baad event loop rhta h stack aur queue ke beech me jo check krta h ki stack empty a\hai ki nhi if stack empty hoga to queue se statement stack me jakar print ho jayega


// DOM it is help to acess the htlm with JS
// DOM full form = document object model 
// html jo h wo js me object me convert kr deta h 
// DOM  me document jo h wo aceess krta h puri HTML file ko aur uske har ek element ko access kra skte h

console.log(document)
let h2 = document.getElementById('one') // ye normal ek element hi ayega
h2.innerText ='hii i m good'
console.log(h2)
h2.style.color='red'
 console.log(h2)
 let h3 = document.getElementsByClassName('two') // ye array me ayega h3 elemnet because class comman hoti h
 console.log(h3)
 let h4 = document.querySelector('.three') // querrySelector me apn kisi ko bhi access kr skte chahe wo id ho class ho ya fie koi element.
 console.log(h4)
 let h5 = document.querySelectorAll('h2') // it select all the element jo vhi us condition ko satisfy kre.
 console.log(h5)

 let a = document.querySelector('a')
 a.setAttribute('href','abc')
 console.log(a.getAttribute('href'))

 // har do second ke baad chalta jayega rukega hi nhi
//  setInterval(()=>{
//     console.log('hmmm'); 
// },2000)

let j=document.querySelector('p')
console.log(j.innerText) //  inner text me sirf text bs show ho rha h
j.innerText="yaay" 
j.style.color='green'
console.log(j.innerHTML) // paragrap tag ka pura code aayega

// event : kuch bhi hover ya click krne pr ya size change krne pr ydi koi output mile 
// ex: onclick
// 3 ways to perform an event
// 1st: function pass  kr do internal js me html me onclick attribute pass krke fir js me whi function ko define kr do
function func1() {
    console.log("click")
}
// 2nd way:
let btn = document.querySelector("button")
btn.addEventListener('click', function(){
    console.log("button")
})
// dono hi output me dega
btn.addEventListener('click', function(){
    console.log("but")
})

// 3rd way
let btnn = document.querySelector("button")
btnn.onclick=function(){
    console.log("btn")
}
 // ye override ho jayega to neeche wala chalega
btnn.onclick=function(){
    console.log("btnnnnn")
}

let inp = document.querySelector('input')
inp.addEventListener('input',(e)=>{ //function ke jo parameter h wo object contain krke rkhta h to usme jo bhi parameter pass krte h to object ki saari predefined property us parameter me pass ho jayegi 

    console.log(e.target) // ye puri input field ko target krega
    console.log(e.target.value) // ye jo value type krenge usko target krega
})


let inpt = document.querySelector('#input')
let p = document.querySelector('p')
inpt.addEventListener('input',(e)=>{
    p.innerText=e.target.value
})



   
