import { Link } from "react-router-dom";
import { FaSearch } from "react-icons/fa";
import { useState } from "react";
import { toast } from "react-toastify";
const Navbar = () => {
  const [dropdown, setDropdown] = useState(false);

 
  const log = JSON.parse(window.sessionStorage.getItem("userlog"));

  const logout = () => {
    toast.success("Logout Successfully!!!!");
    sessionStorage.clear();
    window.location.href = "/home";
  };

  return (
    <nav
      style={{ backgroundColor: "black" }}
      className="navbar navbar-expand-lg navbar-dark"
    >
      <div className="container-fluid">
        
        <Link className="navbar-brand" to="/home">
          home
        </Link>

        <button
          className="navbar-toggler"
          type="button"
          data-bs-toggle="dropdown"
          data-bs-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span className="navbar-toggler-icon"></span>
        </button>

        <div className="collapse navbar-collapse">
          <ul className="navbar-nav me-auto mb-2 mb-lg-0">
            <li className="nav-item">
              <Link
                className="nav-link active"
                aria-current="page"
                to="/available-services"
              >
                Available Services
              </Link>
            </li>

            <li className="nav-item">
              <Link
                className="nav-link active"
                aria-current="page"
                to="/upcoming-services"
              >
                Upcoming Services
              </Link>
            </li>

            <li className="nav-item">
              <Link
                className="nav-link active"
                aria-current="page"
                to="/about-us"
              >
                About Us
              </Link>
            </li>
          </ul>
          <ul className="navbar-nav navbar-right">

            {sessionStorage.getItem("role") === "User" ? (
              <Link
              className="nav-link active"
              aria-current="page"
              to="/myorders"
            >
              My Booking
            </Link>
            ) : null}

           {sessionStorage.getItem("role") === "ServiceProvider" ? (
              <Link
              className="nav-link active"
              aria-current="page"
              to="/myorders"
            >
              My Booking
            </Link>
            ) : null}

            {sessionStorage.getItem("userid") === null ? (
              <>
                <li className="nav-item">
                  <Link
                    className="nav-link active"
                    aria-current="page"
                    to="/signup"
                  >
                    Sign Up
                  </Link>
                </li>
                <li className="nav-item">
                  <Link
                    className="nav-link active"
                    aria-current="page"
                    to="/selection"
                  >
                    Sign in
                  </Link>
                </li>
              </>
            ) : (
              <>
                <li className="nav-item">
                  <span
                    style={{ cursor: "pointer" }}
                    className="nav-link active"
                    aria-current="page"
                    onClick={(e) => logout()}
                  >
                    Sign Out
                  </span>
                </li>
              </>
            )}
          </ul>
         
        </div>
      </div>
    </nav>
  );
};

export default Navbar;
