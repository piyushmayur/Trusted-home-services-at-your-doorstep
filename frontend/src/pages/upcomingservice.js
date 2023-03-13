// import Card from 'react-bootstrap/Card';
// import CardGroup from 'react-bootstrap/CardGroup';
import { Card,CardGroup,Button,ButtonGroup,Dropdown,DropdownButton } from 'react-bootstrap';
import Pic1 from "../images/interior-1-800x460.jpg" ;
import Pic2 from "../images/Flooring-Contractor-800x460.jpg";
import Pic3 from "../images/Labour-Supplier-800x460.jpg";
import Pic4 from "../images/Refrigerator-Repair-800x450.jpg";
//import Pic5 from "../images/Waterproofing-Contractors-800x460.jpg";

import Upcome from '../components/upcome';


function Upcomingservices() {
  return (
    <>
<br>
        </br>
   <Upcome/>

        <br>
        </br>
      <center>
       
<CardGroup>
     
     <Card border="dark" style={{ width: '15rem' , height:'33rem'}}>
             <Card.Img variant="top" src={Pic1} />
             <Card.Body>
               <Card.Title>Interior Decorators</Card.Title>
               <Card.Text>
               Are you looking for an interior designer to help you give a
                           makeover to your place? Don't worry we have got your back.
                           We helps you to get an Interior designer on a click in
                           Vadodara. All the interior designers that we have in our
                           team are experienced and have the expertise of designing all
                           types of places.
               </Card.Text>
             </Card.Body>
            
           </Card>
           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
           
           
           <Card border="dark" style={{ width: '15rem', height:'33rem' }}>
             <Card.Img variant="top" src={Pic2} />
             <Card.Body>
               <Card.Title>Flooring Services</Card.Title>
               <Card.Text>
               We provide the best solution to all those people who are busy in their day to day life. 
           We offer our services for flooring, renovations, AC, Computer, or washing machine repairing, and lots more. 
           Specifically talking about the flooring, we have many registered flooring contractors in the list. 
           
               </Card.Text>
             </Card.Body>
            
           </Card>
     
           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

           <Card border="dark" style={{ width: '15rem',height:'33rem' }}>
             <Card.Img variant="top" src={Pic4} />
             <Card.Body>
               <Card.Title>Refrigerator Repairing Services</Card.Title>
               <Card.Text>
               It is essential to check on the cooling of your
                           refrigerators. As it keeps your food fresh and keeps your
                           family healthy, it is arguably a vital appliance for your
                           home. If you are looking out for the technicians to help you
                           with repairing your refrigerator, then you are at the
                           perfect place.
               </Card.Text>
             </Card.Body>
            
           </Card>
     
     
     </CardGroup>
    
      </center>
    </>
  );
}

export default Upcomingservices;
