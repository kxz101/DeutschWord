import './App.css';
//import { useState } from "react";
//import Header from "./components_jsx/Header.jsx";
//import ButtonStart from "./components_jsx/ButtonStart.jsx";
import StartPage from "./pages_jsx/StartPage.jsx";
import GamePage from "./pages_jsx/GamePage.jsx";
import { Routes, Route } from "react-router-dom";

function App() {


  //const name = "dior";
  //const [text, setText] = useState(`you may not click this button! ${name}`);
  return (

      <Routes>
        <Route path="/" element={<StartPage />} />
        <Route path="/game" element={<GamePage />} />
      </Routes>

  );
}

export default App
