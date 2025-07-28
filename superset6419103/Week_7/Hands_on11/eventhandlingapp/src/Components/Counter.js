import React, { useState } from 'react';

function Counter() {
  const [count, setCount] = useState(0);

  const sayHello = () => {
    alert('Hello! React Event Triggered!');
  };

  const increment = () => {
    sayHello();
    setCount(count + 1);
  };
  const decrement = () => {
    setCount(count - 1);
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const handlePress = (e) => {
    alert("I was clicked (Synthetic Event)");
    console.log("Synthetic Event object:", e);
  };
  return (
    <div style={{ border: '1px solid gray', padding: '20px', marginBottom: '20px' }}>
      <h2>Counter</h2>
      <p>Current Count: {count}</p>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>
      <br /><br />
      <button onClick={() => sayWelcome("Welcome to React Events!")}>Say Welcome</button>
      <br /><br />
      <button onClick={handlePress}>Synthetic Event (OnPress)</button>
    </div>
  );
}
export default Counter;
