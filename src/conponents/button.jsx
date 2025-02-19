import { useState } from "react"
import "bootstrap/dist/css/bootstrap.min.css"
export default function(){
    const [color, setColor] = useState('')
    const [className, setClassName] = useState('')
    const handleClick = event =>{
        setClassName(`btn btn-${color}`)
    }
    const handleChange = event =>{
        setColor(event.target.value)
    }
    return(
        <>
        <input type="text" name="" id="" placeholder="Input color" onChange={handleChange}/>
        <button type="button" className={className} onClick={handleClick}>Change</button>
        </>
    )
}