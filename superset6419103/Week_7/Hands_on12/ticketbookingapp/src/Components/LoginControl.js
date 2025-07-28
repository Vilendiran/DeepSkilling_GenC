import React, { useState } from 'react';
import GuestPage from './GuestPage';
import UserPage from './UserPage';

function LoginControl() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => setIsLoggedIn(true);
  const handleLogout = () => setIsLoggedIn(false);
  let button;
  if (isLoggedIn) {
    button = <button onClick={handleLogout}>Logout</button>;
  } else {
    button = <button onClick={handleLogin}>Login</button>;
  }
  const page = isLoggedIn ? <UserPage /> : <GuestPage />;

  return (
    <div>
      <h1> Ticket Booking App</h1>
      {button}
      <hr />
      {page}
    </div>
  );
}
export default LoginControl;
