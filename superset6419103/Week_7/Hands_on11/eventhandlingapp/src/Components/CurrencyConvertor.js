import React, { useState } from 'react';

function CurrencyConvertor() {
  const [rupees, setRupees] = useState('');
  const [euro, setEuro] = useState(null);

  const handleSubmit = () => {
    const rupeeValue = parseFloat(rupees);
    if (!isNaN(rupeeValue)) {
      const euroValue = (rupeeValue / 90).toFixed(2);
      setEuro(euroValue);
    } else {
      alert("Please enter an valid number");
    }
  };

  return (
    <div style={{ border: '3px solid gray', padding: '20px' }}>
      <h2>Currency Convertor</h2>
      <input
        type="text"
        placeholder="Enter Rupees"
        value={rupees}
        onChange={(e) => setRupees(e.target.value)}
      />
      <button onClick={handleSubmit}>Convert</button>
      {euro && <p>€ {euro}</p>}
    </div>
  );
}
export default CurrencyConvertor;
