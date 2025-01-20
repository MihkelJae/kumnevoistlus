import './App.css'
import { Routes } from 'react-router-dom'

function App() {
  
  return (
    <>
        
        <br></br>
          <Routes>
          <Route path='/' element={<HomePage />}/>
            
          </Routes>
      
    </>
  )
}

export default App
