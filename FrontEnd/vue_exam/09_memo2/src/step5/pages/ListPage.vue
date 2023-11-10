<template>
<header-component title="리스트 페이지"></header-component>
  <div>
    리스트 컨텐츠
    <ul>
        <li v-for="(memo, index) in list" :key="index" @click="setReadMemo(index)">{{ index }}. {{ memo }}</li>
    </ul>
  </div>
  <footer-component></footer-component>
</template>

<script>
export default {
  // 데이터는 App.vue에서 처리
  props : {
    list : {
      type: Array,
      default : []
    },
    setReadMemo:{
      type : Function
    }
  }
}
</script>

<style scoped>

</style>