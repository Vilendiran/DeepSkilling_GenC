import React from 'react';
import Counter from './Components/Counter';
import CurrencyConvertor from './Components/CurrencyConvertor';

function App() {
  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      <h1 >React EventExamplesApp </h1>
      <Counter />
      <CurrencyConvertor />
    </div>
  );
}
export default App;
