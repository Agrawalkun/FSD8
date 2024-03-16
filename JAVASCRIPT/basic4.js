// callBack hell 
// make the js asynchronous

// console.log("two")
// setTimeout(()=>{
//     console.log("one")
// },2000)

function step_1(fn) {
    setTimeout(()=>{
        console.log("step1 done")
        fn();
    },5000)
  
}

function step_2(fn) {
    setTimeout(()=>{
        console.log("step2 done")
        fn();
    },3000)
    
}

function step_3(fn) {

    setTimeout(()=>{
        console.log("step3 done")
        fn();
    },2000)

}
function step_4() {
    setTimeout(()=>{
        console.log("step4 done")
    },1000)
}
 // callBack hell : function ke andar hi funtion ko call krna but it is the bit complex so to resolve the problem of theat we use the concept of the promises and other
 // step wise function ko call krayega whethter the time of that function is greater than other funtion
step_1(()=>{
    step_2(()=>{
        step_3(()=>{
            step_4();
        });
    });
});




