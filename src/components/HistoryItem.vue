<template>
    <div class="historyItem" v-for="item in historyItems">
        
    </div>
</template>
<script>
    export default {
        components: {},
        data() { },
        props: {
            historyItems: {
                type: Array,
                required: true
            }
        }
    }
</script>
<style>
.historyItem {
    width: 50px;
    height: 50px;
}
</style>