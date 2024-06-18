import React , {useContext}from 'react'
import Context from './Context'

const B = () => {
    let a = useContext(Context)
    console.log(a,"kunikaaaa");
  return (

    <div>
     
        {
            a
        }
    </div>
  )
}

export default B