import { useState } from "react"
// import './b3.css'
export default function(){
    const[a, setA] = useState(0);
    const[b, setB] = useState(0);
    const[operator, setOperator] = useState('');
    const[result, setResult] = useState(0);
    const handleChangeA = event => {
        setA(event.target.value)
    }

    const handleChangeB = event => {
        setB(event.target.value)
    }

    const handleRadioChange = event =>{
        setOperator(event.target.value)
    }

    const handleClick = event =>{
        if(operator == '+')
            setResult(parseInt(a) + parseInt(b))
        else if(operator == '-')
            setResult(parseInt(a) - parseInt(b))
        else if(operator == '*')
            setResult(parseInt(a) * parseInt(b))
        else if(operator == '/')
            setResult(parseFloat(a) / parseFloat(b))

    }
    return(
        <>
            <input type="text" placeholder="input a" onChange={handleChangeA}/>
            <br />
            <input type="text" placeholder="input b" onChange={handleChangeB}/>
            <br />
            <span>Choose operator</span>
            <br />
            <input onChange={handleRadioChange} type="radio" name="group" value='+'/> <span>+</span>
            <br />
            <input onChange={handleRadioChange} type="radio" name="group" value='-'/> <span>-</span>
            <br />
            <input onChange={handleRadioChange} type="radio" name="group" value='*'/> <span>*</span>
            <br />
            <input onChange={handleRadioChange} type="radio" name="group" value='/'/> <span>/</span>
            <br />
            <button onClick={handleClick}>Calculate</button>
            <br />
            <span>Result is {result}</span>
        </>
    )
}