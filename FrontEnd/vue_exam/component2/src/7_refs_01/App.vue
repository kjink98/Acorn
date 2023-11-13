<template>
    <!-- <h1 ref="hello">Hello World!</h1> -->
    <hello ref="hello" />
</template>

<script>
import Hello from './components/Hello.vue'
export default {
    name: 'HelloWorld',
    mounted() {
        // const h1El = document.querySelector('#hello')
        // console.log(this.$refs.hello.textContent)
        // console.log(this.$refs.hello)
        // -----------컴퍼넌트 참조
        // console.log(this.$refs.hello.$el)
        console.log(this.$refs.hello.$refs.good)
    },
    components: {
        Hello
    }

}
</script>

<style scoped></style>