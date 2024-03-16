let btn = document.querySelector('button');
let inp = document.querySelector('input');
let div = document.querySelector('.div');
btn.addEventListener('click',()=>{
    // let key = '9f6290d6cda9a36a63755fadee71f83d';
   let searchText = inp.value;
    fetch(`https://api.tvmaze.com/search/shows?q=${searchText}`)
.then((res)=>{
    return res.json()
})
.then((data)=>{
console.log(data)
add(data);
})
})

function add(data) {
    data.map((data)=>{
        // console.log(data,"datataat");


        let h2 = document.createElement('h2');
        let img = document.createElement('img');

        // if(localStorage.getItem('data')){
        //     inp.value = localStorage.getItem('data')
        //   }
       
            btn.addEventListener('click',()=>{
                let text = inp.value;
                // localStorage.setItem('data',text);
                h2.innerText=data.show.name;
                img.setAttribute('src',data.show.image.original);
                // p1.innerText=data.main.temp_min;
        
                div.append(h2,img)
                
            }
            )
        
        // else{
        //     alert("no data")
        // }
      
        // let p1 = document.createElement('p');
       
    })
}