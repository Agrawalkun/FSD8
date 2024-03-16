
let ul = document.querySelector('ul')
let arr =['one','twe','three'];
arr.map((i,index)=>{
    let li = document.createElement('li');
    li.innerText=i;
    
li.addEventListener('click',()=>{
console.log(index)
// li.remove()
arr.filter((a,b)=>{
   return index!=b;
  
})
})
ul.append(li);
    
})