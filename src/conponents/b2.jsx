import { useState } from "react";
export default function(){
    const[a, setA] = useState(0);
    const[b, setB] = useState(0);
    const[result, setResult] = useState(0);
    const handleChangeA = event => {
        setA(event.target.value)
    }

    const handleChangeB = event => {
        setB(event.target.value)
    }

    const handleClick = event =>{
        setResult(parseInt(a) + parseInt(b))
    }
    return(
        <>
            <input type="text" placeholder="input a" onChange={handleChangeA}/>
            <br />
            <input type="text" placeholder="input b" onChange={handleChangeB}/>
            <br />
            <button onClick={handleClick}>Submit</button>
            <br />
            <span>Result is {result}</span>
        </>
    )
}
    