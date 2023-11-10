<template>
    <header-component title="글쓰기 페이지"></header-component>
    <div>
        <textarea v-model="memo"></textarea>
        <div>
            <button @click="setMode(MODE.LIST)">취소</button>
            <button @click="onAddMemo()">저장</button>
        </div>
    </div>
    <footer-component></footer-component>
</template>
    
<script>
import { MODE } from "../common"

export default {
    data(){
        return { memo : "" }
    },
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
        },
        addMemo : {
            type : Function
        }
    },
    computed: {
        MODE() {
            return MODE;
        }
    },
    methods : {
        onAddMemo(){
            this.addMemo(this.memo)
            this.setMode(MODE.LIST)
        }
    }
}
</script>
    
<style scoped></style>