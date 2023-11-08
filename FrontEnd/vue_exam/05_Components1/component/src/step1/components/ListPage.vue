<template>
<div class="test1">
  <list-header></list-header>
  <div>리스트 페이지입니다.</div>
  <list-footer></list-footer>
</div>
</template>

<script>
// 로컬 컴퍼넌트 등록
import ListFooter from "./ListFooter";
import ListHeader from "./ListHeader";
export default {
  components: { ListHeader, ListFooter}

}
</script>

<style>
    .test1 {font-size: 20px;}
</style>