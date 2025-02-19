import { useState } from "react";
export default function(){
    const [name, setName] = useState('');
    const [showName, setShowName] = useState('');

    const handleChange = event => {
        setName(event.target.value);
    }

    const handleClick = () =>{
        setShowName(`Hello ${name}`)
    }
    return(
        <>
        <input type="text" name="" id="" value={name} placeholder='Input ur name' onChange={handleChange}/>
        <div>
            <button onClick={handleClick}>Submit</button>
        </div>
        <p id='print'>{showName}</p>
        </>
    )
}