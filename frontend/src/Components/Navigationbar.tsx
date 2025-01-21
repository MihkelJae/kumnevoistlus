import { Container, Nav, Navbar } from "react-bootstrap";
import { Link } from "react-router-dom";


function NavigationBar() {
  return(
    <Navbar collapseOnSelect expand="lg" className="bg-body-tertiary">
        <Container>
        <Navbar.Brand as={Link} to ="/">Decathlon</Navbar.Brand>
        {/* <Navbar.Toggle aria-controls="responsive-navbar-nav" /> */}
        <Navbar.Collapse id="responsive-navbar-nav">
          <Nav className="me-auto">
            <Nav.Link as={Link} to ="/add-competitor">Add Competitor</Nav.Link>
          </Nav>
        </Navbar.Collapse>
        </Container>
    </Navbar>
  );
}

export default NavigationBar;