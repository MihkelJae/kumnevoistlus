import { useEffect, useState } from "react";
import { Competitor } from "../models/Competitor";

function HomePage(){
    const[competitors, setCompetitors] = useState<Competitor[]>([]);

    useEffect(() => {
        fetch("http://localhost:8080/competitors")
        .then(res => res.json())
        .then(json => setCompetitors(json));
      }, []);

    return(
        <div>
            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Country</th>
                        <th>Age</th>
                    </tr>
                </thead>
            </table>
            <tbody>
            {competitors.map(competitor =>
            <tr key={competitor.id}>
                <td>{competitor.id}: </td>
                <td>{competitor.name} </td>
                <td>{competitor.country} </td>
                <td>{competitor.age} </td>
            </tr>)}
            </tbody>

        
        </div>
    );
}

export default HomePage;