/*
  <h1>Create Element 실습</h1>
  <h2>안녕하세요... 처음 배우고 있습니다.</h2>
*/
import * as React from 'react';
import {createRoot} from 'react-dom/client';

// const h1Element = React.createElement('h1', {style:{color:"red"}}, 'Create Element 실습');
// const h2Element = React.createElement('h2', {
//   style:{color:"blue", fontWeight:400}
// }, '안녕하세요... 처음 배우고 있습니다.');

const h1Element = React.createElement('h1', null, 'Create Element 실습');
const h2Element = React.createElement('h2', null, '안녕하세요... 처음 배우고 있습니다.');
const divElement = React.createElement("div", {onClick:()=>alert("처음 배웁니다.")}, h1Element, h2Element);

// JSX
const jsxElement = (
  // React.Fragment 흔적을 남가지 않고 묶어 줄 수 있음
  // 빈태그도 가능
  <>
    <div className="test" onClick={()=>alert("jsx")}>
      <h1 className="1">Create Element 실습(JSX)</h1>
      <h2>안녕하세요... 처음 배우고 있습니다.</h2>
    </div>
    <h1>
      Hello~~
    </h1>
  </>
);

const rootNode = document.getElementById('root');
// rootNode! = 절대 null이 될 수 없다.
// virtual dom에 뿌려주기
// reactRoot : virtual dom의 주소
const reactRoot = createRoot(rootNode!);

// real dom에 뿌려주기
// render은 최종적으로 하나만 사용 가능

reactRoot.render(jsxElement);