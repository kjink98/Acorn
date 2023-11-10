<template>
    <header-component title="읽기 페이지"></header-component>
      <div>
        <ul>
            <p>선택된 메모 = {{ currentMemo }}</p>
        </ul>
      </div>
      <footer-component></footer-component>
    </template>
    
    <script>
    export default {
      props : {
        currentMemo : {
          type : String,
          default : ""
        }
      }
    }
    </script>
    
    <style scoped>
    
    </style>