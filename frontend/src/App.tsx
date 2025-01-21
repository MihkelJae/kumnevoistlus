import './App.css'
import { Route, Routes } from 'react-router-dom'
import NavigationBar from './Components/Navigationbar'
import HomePage from './pages/HomePage'
import AddCompetitor from './pages/AddCompetitor'

function App() {

  return (
    <>
    <NavigationBar />
        <br></br>
          <Routes>
            <Route path='/' element={<HomePage />}/>
            <Route path='/add-competitor' element={<AddCompetitor />}/>
          </Routes>
      
    </>
  );
}

export default App
