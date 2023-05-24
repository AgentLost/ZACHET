<template>
    <Auto/>
</template>

<script>
import Auto from './components/Auto.vue';
import ChatWindow from './components/ChatWindow.vue';

export default{
    components: {ChatWindow, Auto},
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
    overflow: hidden;
}

</style>