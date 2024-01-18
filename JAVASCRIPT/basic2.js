let obj ={
    id:1,
    user:'hello',
    print: function()
{
    console.log(this.user)
}
}
console.log(obj.name) // it give the undefined because object ke prototype me name ki value null h
console.log(obj.toString()) // it give the output [object object] because iske prototype me toString object h 
//console.log(obj.toNum()) 
// it give the output error because oject ke prototype me toNum exixt hi nhi krta h .

//array converted into the object
// object converted into its prototype then  it goes to null which gives the undefined.
// we use the map reduce filter in the arr with the help of(.) operator because it array converted into the object first
// String is also first converted into object first 
let a=obj.user.toUpperCase(); // ye pura uppercase me kr dega
console.log(a);

function outer(){

}
let user = new outer()
console.log(user) // it will give the empty object kuki function ke andar kuch bhi nhi h

// cunstructure ki madad se object ko create krna
function outer1(){
this.userName ='hello'
this.userlastName ='hii'
}
let user1 = new outer1()
console.log(user1)


function outer2(userName,userlastName){
    this.userName ='hello'
    this.userlastName ='hii'
    }
let user2 = new outer2 ('kun','hello')
console.log(user2)