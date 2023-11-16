import * as React from 'react';

interface CounterProps {
    title: string;

}

interface CounterState {
    num: number;
    hideCount: boolean;
}

export default class Counter extends React.Component<CounterProps, CounterState> {
    // props: CounterProps: 형태 지정, 반드시 생성자로 주입
    // state: 반드시 생성자에서 처리
    constructor(props: CounterProps) {
        super(props)
        this.state = { num: 10, hideCount:false }
    }
    // setState => state update => render() => element
    // => reconciliation => virtual dom => real dom => 화면 노출
    handleClick = () => {
        // 직접 변수에 값을 넣어 수정하면 안됨
        // 확인
        // this.setState({num:20});
        // console.log("Clicked with count: ", this.state.num)

        // 1씩 증가
        this.setState((prev) => {
            // console.log(prev)
            return {num:prev.num+1};
            }
        )
    }

    handleToggle = () =>{
        this.setState((prev)=>{
            return {hideCount:!prev.hideCount}
        })
    }

    componentDidMount() : void{
        console.log("Mounting : In componentDidMount")
    }

    componentDidUpdate(): void {
        console.log("Updating : In componentDidUpdate")
    }

    render() {
        console.log("Mounting & Updating: In render")
        return (<div>
            <h1>{this.props.title}</h1>
            <h3>Count: {this.state.num}</h3>
            <button onClick={this.handleClick}>Plus</button>
            <button onClick={this.handleToggle}>Toggle Count</button>
        </div>)
    }
}

// export default Counter;