import React from 'react';
import  ComA  from './ComA';
const Home=(a)=>{
    let arr =[1,2,3,4,5]
    console.log(a);
    return(

        // <>
        // <h3> {a.a}</h3>
        // </>
        <div>{

            arr.map((a,b)=>{
                return(
                    <li key={b}> {a}</li>
                )
            })
            }
            
            <h2>{a.a}</h2>
            <ComA b = {a.a}/>
           


        </div>
    )

    
}
export default Home