import * as React from 'react';

interface CountDisplayProps{
    count: number;
}

interface CountDisplayState{}

class CountDisplay extends React.Component<CountDisplayProps, CountDisplayState> {
    constructor(props: CountDisplayProps) {
        super(props);
    }

    componentDidUpdate(): void {
        console.log("[Updating] countDisplay / componentDidUpdate")
    }

    componentDidMount(): void {
        console.log("[Mounting] countDisplay / componentDidMount")
    }

    componentWillUnmount(): void {
        console.log("[Unmounting] countDisplay / componentWillUnmount")
    }

    render() {
        return (<div>
            <h3>Count: {this.props.count}</h3>
        </div>)
    }
}

export default CountDisplay;