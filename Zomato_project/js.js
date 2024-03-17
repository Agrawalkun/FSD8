
// sign up form
let  signupClose =document.getElementById('signupClose');
let  signupOpen =document.getElementById('signupOpen');
let  FormPopup =document.getElementById('formName');

signupOpen.addEventListener('click',()=>{
    FormPopup.style.display='block' ;
})
signupClose.addEventListener('click',()=>{
    FormPopup.style.display='none' ;
})

// show more grid
let divClick=document.getElementById('div-click');
let overLapdiv=document.getElementById('overlapdiv');
let gridClose=document.getElementById('grid-close');
let gridPadding = document.getElementById('grid-padding');

divClick.addEventListener('click',()=>{
    overLapdiv.style.display='flex';
    divClick.style.display='none';
    gridClose.style.display='grid';
    gridPadding .style.paddingBottom='0rem';

})
//show less grid
let seeLessDiv =document.getElementById('see-less-div');

seeLessDiv.addEventListener('click',()=>{
    gridClose.style.display='none';
    overLapdiv.style.display='none';
    divClick.style.display='flex';
    gridPadding .style.paddingBottom='3rem';
})

// Explore option
let divOpenPopular = document.querySelector('.Popular');
let divClosePopular = document.querySelector('#popular');
let upArrow = document.querySelector('.up-arrow');
let hidden = document.querySelector('.hidden');
let click =1;

divOpenPopular.addEventListener('click',()=>{
// for(let i =0; i<=click;i++){
//     if(i%2==0){
hidden.style.display="block";
upArrow.style.transform='rotate(-180deg)';
upArrow.style.transition="all .4s"
    // } else{
        // hidden.style.display="none";
        // upArrow.style.transform='rotate(180deg)';
//     }
// }
})

    // }else{
// divClosePopular.addEventListener('click',()=>{
// hidden.style.display="none";
// upArrow.style.trasform='rotate(180deg)';
// })
// }
// click++;
// }

// footer: button India hover
let positionIndia = document.getElementById('position-india');
let hoverIndia = document.querySelector('.hover-india');
let attachedHoverIndia = document.querySelector('.attached-hover-india');
let section = document.querySelector('section');
positionIndia.addEventListener('click',()=>{
    hoverIndia.style.visibility= "visible";
    attachedHoverIndia.style.visibility="visible"
})
section.addEventListener('click',()=>{
    hoverIndia.style.visibility= "hidden";
    attachedHoverIndia.style.visibility="hidden";
})