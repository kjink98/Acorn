<template>
  <h1>참조하기</h1>
  <div>
    <button @click="getCount1">첫 번째 count값 알아내기</button>
    <button @click="getCount2">두 번째 count값 알아내기</button>
    <button @click="getInput1">input1 포커스 이동</button>
  </div>

  <div>
    <sample-component></sample-component>
    <sample-component></sample-component>
  </div>

  <div>
    <parent-component></parent-component>
  </div>
</template>

<script>
import ParentComponent from './components/ParentComponent.vue';
import SampleComponent from './components/SampleComponent.vue';
export default {
  name: 'App',
  components: {
    ParentComponent,
    SampleComponent
  },
  data() {
    return {message : ""}
  },
  methods : {
    getCount1(){
      // 첫 번째 샘플컴퍼넌트의 count 값 출력
    },
    getCount2(){
      // 두 번째 샘플컴퍼넌트의 count 값 출력
    },
    getInput1(){
      // child 컴퍼넌트의 Text에 focus 주기
    }
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
