import {
  Card,
  CardBody,
  CardHeader,
  CardText,
  Col,
  Container,
  Row,
} from "react-bootstrap";

const MonsterType: React.FC = () => {
  return (
    <>
      <Container className="page">
        <Card className="main-card" bg="Light">
          <Row>
            <Col>Imagem do tipo</Col>
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
      </Container>
    </>
  );
};

export default MonsterType;
