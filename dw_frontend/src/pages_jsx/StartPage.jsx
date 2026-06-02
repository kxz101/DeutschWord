import "./StartPage.css";

import Header from "../components_jsx/Header.jsx";
import ButtonStart from "../components_jsx/ButtonStart.jsx";


function StartPage(){

    return (
        <div className = {"start_page"}>
            <Header />
            <ButtonStart />
        </div>
    );
}

export default StartPage;