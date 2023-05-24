<template>
    <div class="history">
        <HistoyItem :messages="messages" />
        <InputMessage />
    </div>
</template>
<script>
import HistoyItem from "@/components/History.vue"
export default {
    components: { HistoyItem },
    data() {
        return {
            
        }
    }
}
</script>
<style>
.history {}
</style>
