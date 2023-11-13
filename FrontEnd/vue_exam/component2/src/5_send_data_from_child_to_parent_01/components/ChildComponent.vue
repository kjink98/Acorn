<template>
    <div class="child">
        Child 컴포넌트
        <div>
            <ul>
                <li v-for="(memo, index) in list" :key="index" @click="onSelected(memo)">{{ index }}. {{ memo }}</li>
            </ul>
        </div>
        <div>
            <button @select="count++"> 부모로 데이터 보내기 </button>
        </div>
    </div>
</template>

<script>
const ChildComponent = {
    name: "ChildComponent",
    data() {
        return {
            list: ["memo1", "memo2", "memo3"]
        }
    },
    methods: {
        onSelected(memo) {
            this.$emit(ChildComponent.SELECT, memo);
        }
    }
}
ChildComponent.SELECT = "select"

export default ChildComponent;
</script>

<style scoped>
.child {
    border: 1px solid #000000;
    margin: 10px;
}
</style>