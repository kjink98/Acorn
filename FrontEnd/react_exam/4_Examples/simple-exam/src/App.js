import React, { useReducer, useState } from 'react';
/*
  const initialState = {
    count : 0,
    member : [{name:"", age:"", address:""}]
  }
*/
const uid = () => { 
  let a = new Uint32Array(3)
  window.crypto.getRandomValues(a)
  return (
    performance.now().toString(36) +
    Array.from(a)
      .map(A => A.toString(36))
      .join('')
  ).replace(/\./g, '')
}

const memberReducer = (state, action) => {
  switch (action.type) {
    case 'ADD':
      return {
        ...state,
        member: [...state.member, { ...action.info }],
        count: state.count++
      };
    case 'DELETE':
      let filteredMember = state.member.filter((one) => one.id !== action.idx)
      return {
        ...state,
        member:[...filteredMember],
        count: state.count-1
      };
    default:
      return;
  }
}

const App = () => {
  const [state, dispatcher] = useReducer(memberReducer, { count: 0, member: [] });
  const [info, setInfo] = useState({});

  const addMember = () => {
    dispatcher({ type: "ADD", info: info });
  }

  const delMember = (e) => {
    dispatcher({type: "DELETE", idx:e.target.value})
  }
  const onChangeHandler = (e) => {
    setInfo({ ...info, id:uid(), [e.target.name]: [e.target.value] })
    // console.log(info)
  }

  return (
    <div>
      <div>
        <h1>전체 회원 수 : {state.count}</h1>
        <div>
          <label>이름 : </label>
          <input
            type={'text'}
            name="name"
            autoComplete="off"
            onChange={onChangeHandler}
          ></input>
        </div>
        <div>
          <label>나이 : </label>
          <input
            type={'number'}
            name="age"
            autoComplete="off"
            onChange={onChangeHandler}
          ></input>
        </div>
        <div>
          <label>주소 : </label>
          <input
            type={'text'}
            name="address"
            autoComplete="off"
            onChange={onChangeHandler}
          ></input>
        </div>

        <button onClick={addMember}>추가</button>
      </div>

      <table>
        <thead>
          <tr>
            <th>이름</th>
            <th>나이</th>
            <th>지역</th>
            <th>삭제</th>
          </tr>
        </thead>
        <tbody>
          {state.member.map((mem)=>(
            <tr>
              <td>{mem.name}</td>
              <td>{mem.age}</td>
              <td>{mem.address}</td>
              <td>
                <button onClick={delMember} value={mem.id}>
                  ❌
                </button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>

    </div>
  );
}

export default App;