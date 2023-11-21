import React, {useState} from 'react';

const App = () => {
  const [message, setMessage] = useState({title:'내용없음'});

  const inputHandler = (e) => {
    let copy = {...message, title:e.target.value};
    setMessage(copy);
  }

  const clickHandler = () => {
    alert(message.title);
  }
  return (
    <div>
      <h1 style={message.title !== '내용없음' ? {color:message.color} : null}>{message.title}</h1>
      <hr/>
      <input type="text" placeholder='내용을 입력' onChange={inputHandler} />
      <button onClick={clickHandler}>클릭</button>
    </div>
  );
}

export default App;