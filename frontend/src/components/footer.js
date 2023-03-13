import React from "react";
import { Link, withRouter } from "react-router-dom";
import "../index.css"

const Footer = () => {
  return (
    <div className="footer">
      <footer class="py-3 bg-light text-dark">
      <div class="container text-justify">
            <div class="row">
                <div class="col-lg-4 col-md-12 col-sm-12">
                    <div class="footer-widget">
                        <h4>About Comfort at Your Door Step</h4>
                        <p>This web application is an initiative to help users directly connect to service providers and vice versa.</p>
                        
                    </div>
                </div>
                <div class="col-lg-4 col-md-12 col-sm-12">
                    <div class="footer-link">
                        <h4>Information</h4>
                        <ul>
                          <li
                          >
                            <Link class="nav-link" to="/terms-and-conditions">
                              Terms &amp; Conditions
                            </Link>
                          </li>

                          <li
                          >
                            <Link class="nav-link" to="/privacy-policy">
                              Privacy Policy
                            </Link>
                          </li>

                          
                        </ul>
                    </div>
                </div>
                
                <div class="col-lg-4 col-md-12 col-sm-12">
                    <div class="footer-link-contact">
                        <h4>Contact Us</h4>
                        <ul>
                            <li>
                                <p><i class="fas fa-map-marker-alt"></i>Address: InfowaySolutions,<br/>Kothrude,Pune,<br/>Maharashtra, India</p>
                            </li>
                            <li>
                                <p><i class="fas fa-phone-square"></i>Phone: <a href="tel:+91-8600619570">+91-8600619570</a></p>
                            </li>
                            <li>
                                <p><i class="fas fa-envelope"></i>Email: <a href="mailto:comfortatyourdoorstep@gmail.com">TrusteddHomeServicesatyourdoorstep@gmail.com</a></p>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
      </footer>
    </div>
  );
}

export default Footer;