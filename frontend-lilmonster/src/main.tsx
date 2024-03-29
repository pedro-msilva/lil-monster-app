import React from "react";
import ReactDOM from "react-dom/client";
import App from "./App.tsx";
import { BrowserRouter } from "react-router-dom";
import MonsterNavBar from "./utils/navbar/index.tsx";

ReactDOM.createRoot(document.getElementById("root")!).render(
  <React.StrictMode>
    <BrowserRouter>
      <MonsterNavBar />
      <App />
    </BrowserRouter>
  </React.StrictMode>
);
