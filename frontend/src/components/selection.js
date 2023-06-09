import {useNavigate} from 'react-router-dom'
const Selection =()=>{

const navigate= useNavigate()

    const Admins=()=>{
      navigate('/adminlogin')
      
        
    }
    const Users=()=>{

        
        navigate('/signin')
    }
    const Providers=()=>{

       navigate('/ServiceProviderlogin')
      
  }
    return (<div className='container' >
 <h1 style = {{textAlign: 'center', color:'black'}} >Roles</h1>
        <div className = 'row' >  
          <div className='card col mb-4' 
              style={{
                margin: 20,
                display: 'inline-block',
                cursor: 'pointer',
                border:0,
                marginTop:90
              }}>
              <img src="https://www.hostirian.com/wp-content/uploads/2014/04/Admin.png"
               alt= "admin image"
               className="rounded mx-auto d-block"
               style={{ height: 300,width:300, display: 'block' }}  />
              <div className='card-body'>
                <button onClick={Admins}  style ={styles.Button}>
                    Admin
                </button>
              </div>
            </div>
            <div className='card col mb-4  '
              style={{
                margin: 20,
                display: 'inline-block',
                cursor: 'pointer',
                border:0,
                marginTop:90,
                color:'black'
              }}>
              <img src="https://cdn2.iconfinder.com/data/icons/flat-style-svg-icons-part-1/512/customers_customer_user_male-512.png" 
              alt= "user image"
              className="rounded mx-auto d-block"
              style={{ height: 300,width:300, display: 'block' }}  />
              <div className='card-body'width='300'>
                <button onClick={Users}  style ={styles.Button}>
                    User
                </button>
              </div>
            </div>

            <div className='card col mb-4  '
              style={{
                margin: 20,
                display: 'inline-block',
                cursor: 'pointer',
                border:0,
                marginTop:90
              }}>
              <img src="https://th.bing.com/th/id/R.815cda394f84aca7d9c405f8de9cbde7?rik=8yuHG8427Dl1oQ&riu=http%3a%2f%2fmayahomecare.com%2fwp-content%2fuploads%2f2017%2f11%2fmaya-homecare-workers-1200x840.png&ehk=LxTJyVYIkzteN2liMEWbRsD%2bhPyblZEgzsCBhxJDmA4%3d&risl=&pid=ImgRaw&r=0" 
              alt= "Providers image"
              className="rounded mx-auto d-block"
              style={{ height: 300,width:300, display: 'block' }}  />
              <div className='card-body'width='300'>
                <button onClick={Providers}  style ={styles.Button}>
                Service Provider
                </button>
              </div>
            </div>
        
        
              </div>
    </div>
    )
}


const styles = {

    Button: {
      position: 'relative',
      width: '100%',
      height: 40,
      backgroundColor: 'brown',
      color: 'white',
      borderRadius: 5,
      border: 'none',
      marginTop: 10,
    },
  }


export default Selection;