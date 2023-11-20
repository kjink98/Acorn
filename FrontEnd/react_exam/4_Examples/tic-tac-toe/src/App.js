import {Component} from 'react';
import './App.css';
import Board from './components/Board';

class App extends Component {
  render() {
    return (
      <div className='game'>
        <div className='game-board'>
          <Board />
        </div>
        <div className='game-info'>
          Game Infomation 영역
        </div>
      </div>
    );
  }

}

export default App;
