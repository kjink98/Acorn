import React, { useReducer, useState } from 'react';

const priceReducer = (price, action) => {
  switch(action.type) {
    case 'HAMBURGER':
      return price + 4000;
    case 'POTATO':
      return price + 3000;
    case 'COKE':
      return price + 1000;
    default:
      return price;
  }
}
const App = () => {
  const [price, priceDispatcher] = useReducer(priceReducer, 0);

  const clickHamburger = () => {
    priceDispatcher({type:'HAMBURGER'})
  }
  const clickPotato = () => {
    priceDispatcher({type:'POTATO'})
  }
  const clickCoke = () => {
    priceDispatcher({type:'COKE'})
  }
  return (
    <div>
      <h1>햄버거 가게</h1>      
      <h3>지불할 금액 : {price} </h3>
      <hr/>
      <button onClick={clickHamburger}>햄버거(4000원)</button>
      <button onClick={clickPotato}>감자튀김(3000원)</button>
      <button onClick={clickCoke}>콜라(1000원)</button>
    </div>
  );
}

export default App;