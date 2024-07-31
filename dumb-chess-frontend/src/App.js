// src/App.js
import React from "react";
import Board from "./components/Board";
import CustomizeRules from "./components/CustomizeRules";
import RandomizeRules from "./components/RandomizeRules";

function App() {
  return (
    <div>
      <Board />
      <CustomizeRules />
      <RandomizeRules />
    </div>
  );
}

export default App;
