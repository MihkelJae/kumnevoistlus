import { useRef } from "react";

function AddCompetitor() {
    const nameRef = useRef<HTMLInputElement>(null);
    const countryRef = useRef<HTMLInputElement>(null);
    const ageRef = useRef<HTMLInputElement>(null);

    function add(){
        if (nameRef.current === null || countryRef.current === null || ageRef.current === null) {
            console.log("mingi REF jäi panemata!");
            return;
        }

        const competitor = {
            "name": nameRef.current.value,
            "country": countryRef.current.value,
            "age": ageRef.current.value
        };

        fetch("http://localhost:8080/competitors", {
            method: "POST",
            body: JSON.stringify(competitor),
            headers: {"Content-Type": "application/json"}
        })
        .then(res => res.json())
        .then();
    }


    return(
        <div>
            <label>Name</label><br />
            <input ref={nameRef} type="text"/><br />
            <label>Country</label><br />
            <input ref={countryRef} type="text"/><br />
            <label>Age</label><br />
            <input ref={ageRef} type="text"/><br />
            <button onClick={add}>Add</button>
        </div>
    );
}
export default AddCompetitor