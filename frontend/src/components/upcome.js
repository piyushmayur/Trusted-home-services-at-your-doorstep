import { Row,Col } from "react-bootstrap"
import "./upcome.css"
import TypeWriterEffect from 'react-typewriter-effect';


export default function Upcome(){
    return(
       <center>
       <header className="up">

        <h3>
        <TypeWriterEffect
            textStyle={{ fontFamily: 'any' , fontSize: '2.0em'}}
            startDelay={100}
            cursorColor="white"
            multiText={[" 🤹🏼‍♂️ We Care....We Serve....We Hire....We Assure 🤹🏼‍♂️     "]}
           
            typeSpeed={200}
           
          />  
        </h3>
       
        
       
       </header>
       </center>
    )
}