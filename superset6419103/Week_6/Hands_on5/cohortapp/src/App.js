import React from 'react';
import CohortDetails from './CohortDetails';


function App() {
  const cohort1 = {
    name: 'GenC',
    status: 'ongoing',
    startDate: '2025-07-15',
    trainer: 'Alice'
  };

  const cohort2 = {
    name: 'GenC Pro',
    status: 'completed',
    startDate: '2024-09-01',
    trainer: 'Bob'
  };

   const cohort3 = {
    name: 'GenC Next',
    status: 'completed',
    startDate: '2025-03-27',
    trainer: 'Vilendiran'
  };

  return (
    <div>
      <h1 className='ac'>My Academy Cohorts</h1>
      <CohortDetails cohort={cohort1} />
      <CohortDetails cohort={cohort2} />
      <CohortDetails cohort={cohort3} />
    </div>
  );
}

export default App;
