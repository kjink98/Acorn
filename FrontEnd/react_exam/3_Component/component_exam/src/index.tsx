/*
  <h1>Create Element 실습</h1>
  <h2>안녕하세요... 처음 배우고 있습니다.</h2>
*/
import * as React from 'react';
import {createRoot} from 'react-dom/client';

const h1Element = React.createElement('h1', null, 'Create Element 실습');
const h2Element = React.createElement('h2', null, '안녕하세요... 처음 배우고 있습니다.');

const rootNode = document.getElementById('root');
// rootNode! = 절대 null이 될 수 없다.
const reactRoot = createRoot(rootNode!);