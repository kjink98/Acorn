<template>
  <header-component title="리스트 페이지"></header-component>
  <div>
    리스트 컨텐츠
    <ul>
      <li v-for="(memo, index) in list" :key="index" @click="setReadMemo(index)">{{ index }}. {{ memo }}</li>
    </ul>
  </div>
  <div>
    <button @click="setMode(MODE.WRITE)">메모 추가</button>
  </div>
  <footer-component></footer-component>
</template>

<script>
import { MODE } from "../common"

export default {
  // 데이터는 App.vue에서 처리
  props: {
    list: {
      type: Array,
      default: []
    },
    setReadMemo: {
      type: Function
    },
    setMode: {
      type: Function,
      default: () => {
        console.log("이 함수는 재설정을 해야 합니다.")
      }
    }
  },
  computed: {
    MODE() {
      return MODE;
    }
  }

}
</script>

<style scoped></style>