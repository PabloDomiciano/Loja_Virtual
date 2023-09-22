import './App.css';
import Home from './pages/home/home';
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import "primereact/resources/themes/lara-light-indigo/theme.css";
import "primereact/resources/primereact.min.css";


function App() {
  return (
    <>
      <div className="App">
        <BrowserRouter>
          <Routes>
            <Route path ='/' Component={() => <Home />} />
          </Routes>
        </BrowserRouter>
      </div>
    </>

  );
}

export default App;
