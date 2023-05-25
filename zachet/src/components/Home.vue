<template>
    <Sidebar/>
    <ChatWindow class="chatPlusSide"/>
</template>

<script>
import ChatWindow from './ChatWindow.vue';
import Sidebar from './Sidebar.vue'

export default{
    components: {ChatWindow, Sidebar},
}
</script>

<style>
.chatWindow{
    width: 62% !important;
    height: 85% !important;
    bottom: 11% !important;
    right: 4% !important;
}

.avatar{
    width: 150px !important;
}
</style>