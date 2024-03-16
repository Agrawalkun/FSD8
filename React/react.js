// it is the library of JS , with the help of it we can develop the frontend with the help of it , it is build by facebook , to 500+ company me rwact use hoti h, next Js is the next version of the react js
// advantage: 1. complex structure is made easily
//2. it is Fast  e.g.in loading.
//3. MPW - multi page website ( HTML , CSS ,JS) - kisi bhi link pr click krne pr naya page load hota h 
 //4. SPW - single page website(React JS)- same page me hi data update hota h , if we click on the link then same page me hi data updatw ho jayega
// 5. Structure of the website is spilited into parts, navbar ki alag file , footer ki alag file banakar bhi ek page me dikha skte h 
// due to this readitiblity increases, debug krne me asani hoti h , agar navbar ko refresh krenge to sirf navbar wala file hi refresh hoga pura page refresh nhi hota.
//har file ko component bolte h.

let h1 = React.createElement('h1','null',"hello");
let rootEl = document.querySelector('div');
ReactDOM.render(h1,rootEl);
console.log(rootEl,"hii");

// ek div ko create krke h1 uske adar create krna h;
let div = React.createElement('div',"null",React.createElement("h1",'null',"hello") );
ReactDOM.render(div,rootEl);
console.log(rootEl,"hii");

