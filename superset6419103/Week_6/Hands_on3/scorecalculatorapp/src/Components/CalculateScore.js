import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore(props) {
  const { Name, School, Total, Goal } = props;
  const average = Total / Goal;

  return (
    <div className="score-box" id='formatstyle'>
      <h2 className='formatstyle'>Student Details</h2>
      <p className='Name'><strong class>Name:</strong> {Name}</p>
      <p className='School'><strong>School:</strong> {School}</p>
      <p className='Total'><strong>Total :</strong> {Total}</p>
      <p className='Goal'><strong>Goal:</strong> {Goal}</p>
      <p><strong>Average:</strong> {average.toFixed(2)}</p>
    </div>
  );
}

export default CalculateScore;
