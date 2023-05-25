<template>
    <Home/>
</template>

<script>
import Home from './components/Home.vue'

export default{
    components: {Home},
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
    background: linear-gradient(to top right, #c7d2fe, 10%, #f3d3fc, #c7d2fe);
}

</style>