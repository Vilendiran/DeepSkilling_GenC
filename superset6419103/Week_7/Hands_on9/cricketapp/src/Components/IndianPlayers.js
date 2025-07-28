import React from 'react';

const IndianPlayers = () => {
  const T20 = ["Virat", "Rohit", "Rahul"];
  const RanjiTrophy = ["Ashwin", "Pujara", "Jadeja"];

  const allPlayers = [...T20, ...RanjiTrophy];

  const [first, second, ...others] = allPlayers;

  return (
    <div>
      <h2>All Indian Players</h2>
      <ul>
        {allPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h3>Destructured Values</h3>
      <p>First: {first}</p>
      <p>Second: {second}</p>
      <p>Others: {others.join(', ')}</p>
    </div>
  );
};

export default IndianPlayers;
