import React from "react";
import Posts from "./Posts";
import { render } from "@testing-library/react";

function App(){
  render(
    <div className="App">
      <Posts/>
    </div>
  );
}
export default App;