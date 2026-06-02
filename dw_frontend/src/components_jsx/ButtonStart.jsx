import "./ButtonStart.css";
import { useNavigate } from "react-router-dom";

function ButtonStart(){

    const navigate = useNavigate();

    return (
        <button className={"startBtn"} onClick={() => navigate("/game")}>Start!</button>
    );
}


export default ButtonStart;