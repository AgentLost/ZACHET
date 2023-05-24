<template>
    <div class="all">
        <ChatWindow/>
    </div>
</template>

<script>
import ChatWindow from './components/ChatWindow.vue';

export default{
    components: {ChatWindow},
}
</script>

<style>
*{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}
#app{
    width: 100vw; 
    height: 100vh;
}

.all{
    width: 100%;
    height: 100%;
    background: linear-gradient(to top right, #c7d2fe, 10%, #f3d3fc, #c7d2fe);

}
</style>