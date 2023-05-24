<template>
    <div class="MessageBar">
        <input type="text" placeholder="Введите сообщени...">
    </div>
</template>
<script>

export default {
    data() {
        return {
        }
    }
}
</script>
<style>
.MessageBar {
    display: flex;
    flex-direction: row;
    position: fixed;
    bottom: 0;
}

.MessageBar input {
    width: 100%;
}
</style>
