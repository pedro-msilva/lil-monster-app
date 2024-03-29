import { Navbar, Container, Nav, Image } from "react-bootstrap";
import { Link } from "react-router-dom";
import { LILMONSTER, MONSTERMASTER, MONSTERTYPE } from "../../App";

function MonsterNavBar() {
  return (
    <Navbar expand="lg" className="bg-body-tertiary">
      <Image
        className="ms-auto"
        src="src\assets\img\logos\lilmonsterlogo.png"
      />
      <Container>
        <Navbar.Brand href="#home">Lil Monster</Navbar.Brand>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="me-auto">
            <Nav.Link>
              <Link className="link-router" to={LILMONSTER}>
                Monsters
              </Link>
            </Nav.Link>
            <Nav.Link>
              <Link className="link-router" to={MONSTERMASTER}>
                Monster Masters
              </Link>
            </Nav.Link>
            <Nav.Link>
              <Link className="link-router" to={MONSTERTYPE}>
                Monster Types
              </Link>
            </Nav.Link>
          </Nav>
        </Navbar.Collapse>
      </Container>
    </Navbar>
  );
}

export default MonsterNavBar;
