<template>
<div class="test1">
  <list-header></list-header>
  <div>
    <ul>
      <li v-for="memo in list" :key="memo">{{memo}}</li>
    </ul>
  </div>
  <list-footer></list-footer>
</div>
</template>

<script>
// 로컬 컴퍼넌트 등록
import ListFooter from "./ListFooter";
import ListHeader from "./ListHeader";
export default {
  components: { ListHeader, ListFooter},
  data(){
    //return {list: ["memo1", "memo2", "memo3"]}
  },
  props : {
    list : {
      type:Array,
      required:true
    }
  }

}
</script>

<style>
    .test1 {font-size: 20px;}
</style>