<template>
    <header-component title="읽기 페이지"></header-component>
      <div>
        <ul>
            <p>선택된 메모 = {{ currentMemo }}</p>
        </ul>
      </div>
      <div>
        <button @click="setMode(MODE.LIST)">리스트 페이지로 이동</button>
      </div>
      <footer-component></footer-component>
    </template>
    
    <script>
    import {MODE} from "../common"
    export default {
      props : {
        currentMemo : {
          type : String,
          default : ""
        },
        setMode : {
          type : Function,
          default : () =>{
            console.log("이 함수는 재설정을 해야 합니다.")
          }
        }
      },
      computed : {
            MODE(){
                return MODE;
            }
        }
    }
    </script>
    
    <style scoped>
    
    </style>