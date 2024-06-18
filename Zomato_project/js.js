
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
let divOpenNearme = document.querySelectorAll('.hidden-near-me');
let divOpenNearMe = document.querySelectorAll('.hidden-top-near-me');

// let divClosePopular = document.querySelector('#popular');


divOpenNearme.forEach(div=>{
    let hidden = div.nextElementSibling;
    let upArrow = div.querySelector('.up-arrow');
    let isHidden = true; // Initial state is hidden

    div.addEventListener('click',()=>{
        if(isHidden){
            hidden.style.display="block";
            upArrow.style.transform='rotate(-180deg)';
            upArrow.style.transition="all .4s"
        } else{
            hidden.style.display="none";
            upArrow.style.transform='rotate(0deg)';
            upArrow.style.transition="all .4s"
        }
        isHidden =!isHidden;//Toggle the state

})
})
divOpenNearMe.forEach(div=>{
    let hidden = div.nextElementSibling;
    let upArrow = div.querySelector('.up-arrow');
    let isHidden = true; // Initial state is hidden

    div.addEventListener('click',()=>{
        if(isHidden){
            hidden.style.display="grid";
            upArrow.style.transform='rotate(-180deg)';
upArrow.style.transition="all .4s"
        } else{
            hidden.style.display="none";
            upArrow.style.transform='rotate(0deg)';
            upArrow.style.transition='all .4s'
        }
        isHidden =!isHidden;//Toggle the state

})
})


// footer: button India hover
let positionIndia = document.getElementById('position-india');
let hoverIndia = document.getElementsByClassName('hover-india');
let attachedHoverIndia = document.getElementsByClassName('attached-hover-india');
let footerContaint = document.querySelector('.footer-containt');
positionIndia.addEventListener('click',()=>{
    console.log("hello");
    hoverIndia.style.visibility= "visible";
    attachedHoverIndia.style.visibility="visible"
})
footerContaint.addEventListener('click',()=>{
    hoverIndia.style.visibility= "hidden";
    attachedHoverIndia.style.visibility="hidden";
})
// positionIndia.forEach(div=>{
//     let hide = div.nextElementSibling;
//     let hoverIndia = div.querySelector('.hover-india');
//     let attachedHoverIndia = div.querySelector('.attached-hover-india');
//     let isHide = true;
//     div.addEventListener('click',()=>{
//         if (isHide) {
//             hide.style.visibility= "visible";
//             attachedHoverIndia.style.visibility="visible"
//             hoverIndia.style.visibility= "visible";
//         } else {
//             hide.style.visibility= "hidden";
//                attachedHoverIndia.style.visibility="hidden";
//         }
//         isHide =!isHide;
//     })
// })
