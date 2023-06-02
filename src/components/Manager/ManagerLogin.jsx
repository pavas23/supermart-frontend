/* eslint-disable jsx-a11y/anchor-is-valid */
/* eslint-disable no-unused-vars */
import { Link } from "react-router-dom";
import Navbar from "../Customer/Navbar";

export default function ManagerLogin() {
  return (
    <>
      <Navbar />
      <div class="login_page4">
        <div class="form-box4" style={{ marginTop: "20vh" }}>
          <div class="button-box1">
            <div
              id="btn1"
              style={{
                top: "0",
                left: "0px",
                position: "absolute",
                width: "161px",
                "padding-left": "11%",
                "padding-top": "2%",
                height: "130%",
                background: "linear-gradient(to right, #22db15, #fbff00)",
                "border-radius": "30px",
                transition: "0.5s",
                marginLeft:"-1vw",

              }}
            >
              Log in as Manager
            </div>
            <button
              type="button"
              class="toggle-btn1"
              onclick="login()"
            ></button>
          </div>
          <form method="POST" autoComplete="off" id="login-form">
            <input
              type="email"
              name="email"
              id="input_email"
              required
              placeholder="Enter Manager ID"
              style={{
                width: "75%",
                padding: "10px 0",
                margin: "5px 0",
                "border-left": "0",
                "border-top": "0",
                "border-right": "0",
                "border-bottom": "1px solid #999",
                outline: "none",
                background: "transparent",
                marginTop: "60px",
                marginLeft: "40px",
                marginRight: "40px",
              }}
            />
            <input
              type="password"
              name="password"
              id="input_password"
              required
              placeholder="Enter your password"
              style={{
                width: "75%",
                padding: "10px 0",
                margin: "5px 0",
                "border-left": "0",
                "border-top": "0",
                "border-right": "0",
                "border-bottom": "1px solid #999",
                outline: "none",
                background: "transparent",
                marginLeft: "40px",
              }}
            />
            <input
              type="submit"
              value="Login"
              id="login-btn"
              style={{
                width: "60%",
                padding: "10px 30px",
                cursor: "pointer",
                display: "block",
                margin: "auto",
                background: "linear-gradient(to right, #22db15, #fbff00)",
                border: "0",
                outline: "none",
                "border-radius": "30px",
                marginTop: "20px",
              }}
            />
          </form>
          <Link to="/forgot">
            <a
              class="forgot4"
              style={{ marginLeft: "200px", marginBottom: "30px" }}
            >
              Forgot password?
            </a>
          </Link>
          <Link to="/login">
            <a
              class="user_log4"
              style={{ marginLeft: "80px", marginTop: "190px" }}
            >
              Log in as User
            </a>
          </Link>
          <Link to="/admin_log">
            <a
              class="admin_log4"
              style={{ marginLeft: "200px", marginTop: "190px" }}
            >
              Log in as Admin
            </a>
          </Link>
        </div>
      </div>
    </>
  );
}
