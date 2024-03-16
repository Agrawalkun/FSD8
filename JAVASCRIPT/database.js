// JS provide the local storage to store the data.
// browser ke paas power hoti h data store karane ki 
// ek baar me ek hi data store hoga
//

let inp = document.querySelector("input");
let btn = document.querySelector("button");
let remove = document.querySelector(".remove");
if(localStorage.getItem('data')){
    inp.value = localStorage.getItem('data')

  }

btn.addEventListener('click',()=>{
    let text = inp.value;
    localStorage.setItem('data',text);
}
)
remove.addEventListener('click',()=>{

    if(localStorage.getItem('data')){
         localStorage.clear('data')
         inp.value=" "
    
      }
      else{
        alert("no data is present")
      }
   
}
)
