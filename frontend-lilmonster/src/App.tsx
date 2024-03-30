import { Route, Routes } from "react-router-dom";
import MonsterType from "./features/monsterType";
import MonsterMaster from "./features/monsterMaster";
import LilMonster from "./features/lilMonster";
import "bootstrap/dist/css/bootstrap.min.css";
import "./assets/css/style.css";
import HomePage from "./features/home";
import CreateMonsterType from "./features/monsterType/createMonsterType";

export const MONSTERTYPE = "/monster-type";
export const MONSTERTYPE_CREATEMONSTERTYPE = "/monster-type/create";
export const MONSTERMASTER = "/monster-master";
export const LILMONSTER = "/lil-monster";
export const HOMEPAGE = "/";

function App() {
  return (
    <>
      <Routes>
        <Route path={MONSTERTYPE} element={<MonsterType />}></Route>
        <Route path={MONSTERMASTER} element={<MonsterMaster />}></Route>
        <Route path={LILMONSTER} element={<LilMonster />}></Route>
        <Route path={HOMEPAGE} element={<HomePage />}></Route>
        <Route
          path={MONSTERTYPE_CREATEMONSTERTYPE}
          element={<CreateMonsterType />}
        ></Route>
      </Routes>
    </>
  );
}

export default App;
