import {useEffect, useState} from "react";

import "./WordTable.css";

function WordTable (){


    const [count, setCount] = useState(1);
    const [table, setTable] = useState([]);

    const API_BASE_URL = import.meta.env.VITE_API_BASE_URL;

    useEffect(() => {
        updateTable(1);
    }, []);

    async function updateTable (id){

         const response = await fetch(`${API_BASE_URL}/api/words/${id}`);
         const data = await response.json();
         setTable(data);
    }
    function scrollToTop() {
        window.scrollTo({
            top: 0,
            behavior: "smooth"
        });
    }

    return (
        <div>

            <div className={"game_head"} >
                <h1>
                    {table.at(0)?.word}
                </h1>
            </div>
            <table className={'word_table'}>
                <thead>
                    <tr>
                        <th>Word</th>
                        <th>Meaning</th>
                        <th>Sentence</th>
                    </tr>
                </thead>

                <tbody>
                    {table.map((row) => (
                        <tr key={row.example}>
                            <td>{row.example}</td>
                            <td>{row.meaning}</td>
                            <td>{row.sentence}</td>
                        </tr>
                    ))}
                </tbody>
            </table>
            <div className={"btnsWrapper"}>
                <button className={"prev_btn"} onClick={() => {
                    let newCount;
                    if(count > 1) {
                        newCount = count - 1;
                    } else {
                        newCount = 150;
                    }
                    setCount(newCount);
                    updateTable(newCount);
                    scrollToTop();

                }}>
                    Previous Word
                </button>
                <button className={"next_btn"} onClick={() => {
                    let newCount;
                    if(count < 150) {
                        newCount = count + 1;
                    } else {
                        newCount = 1;
                    }
                    setCount(newCount);
                    updateTable(newCount);
                    scrollToTop()
                }}>
                    Next Word
                </button>

            </div>
        </div>
    );
}

export default WordTable;