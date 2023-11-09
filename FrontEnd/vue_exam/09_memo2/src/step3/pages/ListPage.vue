<template>
<header-component title="리스트 페이지"></header-component>
  <div>
    리스트 컨텐츠
    <ul>
        <li v-for="(memo, index) in list" :key="index">{{ index }}. {{ memo }}</li>
    </ul>
  </div>
  <footer-component></footer-component>
</template>

<script>
export default {
  props : {
    list : {
      type: Array,
      default : []
    }
  }
}
</script>

<style scoped>

</style>