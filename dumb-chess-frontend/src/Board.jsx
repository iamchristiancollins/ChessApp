// src/components/Board.jsx
import React, { useState, useEffect } from "react";
import axios from "axios";

function Board() {
  const [board, setBoard] = useState([]);

  useEffect(() => {
    axios.get("/api/chess/initialize").then((response) => {
      setBoard(response.data.pieces);
    });
  }, []);

  return (
    <div className="board">
      {board.map((row, rowIndex) => (
        <div key={rowIndex} className="row">
          {row.map((piece, colIndex) => (
            <div key={colIndex} className="square">
              {piece ? piece.type : null}
            </div>
          ))}
        </div>
      ))}
    </div>
  );
}

export default Board;
