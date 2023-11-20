import * as React from 'react';

interface useCounterReturnType {
    count: number;
    plus: ()=> void;
    minus: ()=> void;
    countLog: ()=> void;
    memoizedNumber: number;
    
}
export function useCounter(): useCounterReturnType{
    const [count, setCount] = React.useState(0);

    // const plus = () => setCount((prev) => prev + 1);
    // const minus = () => setCount((prev) => prev - 1);

    const plus = React.useCallback(() => setCount((prev) => prev + 1), []);
    const minus = React.useCallback(() => setCount((prev) => prev - 1), []);
    const countLog = React.useCallback(()=>console.log(count), []);
    
    const memoizedNumber = React.useMemo(() => {
        let result = count;
        console.log("Calc Start");
        for(let i = 0; i<10000; i++){
            console.log("result:", result);
            result += 1;
        }
        console.log("Calc Ends");
        return result;
    }, [count]);

    return {count, plus, minus, countLog, memoizedNumber};
}