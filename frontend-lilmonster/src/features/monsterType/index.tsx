import {
  Button,
  Card,
  CardBody,
  CardHeader,
  CardText,
  Col,
  Container,
  Image,
  Row,
} from "react-bootstrap";
import { navegar } from "../../utils/funcoes/funcoes";
import { HOMEPAGE, MONSTERTYPE_CREATEMONSTERTYPE } from "../../App";
import { useNavigate } from "react-router";

const MonsterType: React.FC = () => {
  const navigate = useNavigate();

  const handleNavegar = (destino: string) => {
    navegar(navigate, destino);
  };

  return (
    <>
      <Container className="page">
        <Card className="main-card" bg="Light">
          <Row>
            <Col>
              <Image thumbnail></Image>
              Imagem do tipo
            </Col>
            <Col>
              <Card bg="secondary">
                <CardHeader>MonsterTypeTitle</CardHeader>
                <CardBody>
                  <CardText>MonsterType</CardText>
                </CardBody>
              </Card>
            </Col>
          </Row>
        </Card>
        <Button
          variant="secondary"
          onClick={() => handleNavegar(MONSTERTYPE_CREATEMONSTERTYPE)}
        >
          NEW MONSTERTYPE
        </Button>
        <Button
          variant="outline-secondary"
          onClick={() => handleNavegar(HOMEPAGE)}
        >
          VOLTAR
        </Button>
      </Container>
    </>
  );
};

export default MonsterType;
