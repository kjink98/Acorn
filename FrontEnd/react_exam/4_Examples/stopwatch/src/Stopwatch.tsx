import * as React from "react";
import Time from "./Time";
import Controllers from "./Controllers";
import Laps from "./Laps";

const Stopwatch:React.FC = () => {
    return (
        <div>
            <Time seconds={100}/>
            <Controllers state={"processing"} record={()=>{}}
                start={()=>{}} stop={()=>{}} reset={()=>{}}/>
            <Laps laps={['l', 'a', 'p', 's']}/>
        </div>
    );
};

export default Stopwatch;