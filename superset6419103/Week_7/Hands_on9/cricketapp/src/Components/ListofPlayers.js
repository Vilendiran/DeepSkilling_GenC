import React from 'react';
const ListofPlayers = () => {
  const players = [
    { name: "Virat", score: 90 },
    { name: "Rohit", score: 85 },
    { name: "Dhoni", score: 60 },
    { name: "Jadeja", score: 65 },
    { name: "Pant", score: 70 },
    { name: "Ashwin", score: 50 }
  ];

  const filteredPlayers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((p, index) => (
          <li key={index}>
            {p.name} - {p.score}
          </li>
        ))}
      </ul>
      <h3>Players with Below the score of 70</h3>
      <ul>
        {filteredPlayers.map((p, index) => (
          <li key={index}>
            {p.name} - {p.score}
          </li>
        ))}
      </ul>
    </div>
  );
};
export default ListofPlayers;
