// weather application
// iske liye ek special API chaiye to get the data from the exact location
//https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
//9f6290d6cda9a36a63755fadee71f83d

// let key = '9f6290d6cda9a36a63755fadee71f83d';
// let city = 'Damoh'

// fetch('https://api.openweathermap.org/data/2.5/weather?q=damoh&appid=9f6290d6cda9a36a63755fadee71f83d')
// .then((res)=>{
//     return res.json()
// })
// .then((data)=>{
// console.log(data)
// })

let btn = document.querySelector('button');
let inp = document.querySelector('input');
let img = document.querySelector('.image');
btn.addEventListener('click',()=>{
    let key = '9f6290d6cda9a36a63755fadee71f83d';
   let city = inp.value;
    fetch(`https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${key}`)
.then((res)=>{
    return res.json()
})
.then((data)=>{
console.log(data)
add(data);
})
})

function add(data) {
        let h2 = document.createElement('h2');
        let p = document.createElement('p');
        let p1 = document.createElement('p');
        if(data.main){
            h2.innerText=data.name;
            p.innerText=data.main.temp_max;
            p1.innerText=data.main.temp_min;
    
            img.append(h2,p,p1)
        } else{
            alert("data is not available")
        }
      
 
    // h1.innerText = a.title;
   
}
