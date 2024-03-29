import { Route, Routes } from "react-router-dom";
import MonsterType from "./features/monsterType";
import MonsterMaster from "./features/monsterMaster";
import LilMonster from "./features/lilMonster";
import "bootstrap/dist/css/bootstrap.min.css";
import "./assets/css/style.css";

export const MONSTERTYPE = "/monster-type";
export const MONSTERMASTER = "/monster-master";
export const LILMONSTER = "/lil-monster";

function App() {
  return (
    <>
      <Routes>
        <Route path={MONSTERTYPE} element={<MonsterType />}></Route>
        <Route path={MONSTERMASTER} element={<MonsterMaster />}></Route>
        <Route path={LILMONSTER} element={<LilMonster />}></Route>
      </Routes>
    </>
  );
}

export default App;
