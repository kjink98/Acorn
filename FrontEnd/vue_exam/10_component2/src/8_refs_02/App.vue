<template>
  <h1>참조하기</h1>
  <div>
    <button @click="getCount1">첫 번째 count값 알아내기</button>
    <button @click="getCount2">두 번째 count값 알아내기</button>
    <button @click="getInput1">input1 포커스 이동</button>
  </div>

  <div>
    <sample-component ref="sample1"></sample-component>
    <sample-component></sample-component>
  </div>

  <div>
    <parent-component ref="parent1"></parent-component>
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
      alert(this.$refs.sample1.count)
    },
    getCount2(){
      // 두 번째 샘플컴퍼넌트의 count 값 출력
      alert(this.$refs.parent1.count)
    },
    getInput1(){
      // child 컴퍼넌트의 Text에 focus 주기
      this.$refs.parent1.$refs.child1.$refs.input1.focus();
      alert(this.$refs.parent1.$refs.child1.$refs.input1.value);
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
