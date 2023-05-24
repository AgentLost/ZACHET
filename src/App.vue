<template>
  <div class="window">
    <Sidebar />
    <Chat />
  </div>
</template>
<script>

import Sidebar from '@/components/Sidebar.vue'
import Chat from '@/components/Chat.vue'

export default {
  components: { Sidebar, Chat }

}
</script>
<style>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

.window {
  display: flex;
  flex-direction: row;
  position: absolute;
  height: 100%;
  width: 100%;
  background: linear-gradient(to top right, #c7d2fe, 10%, #f3d3fc, #c7d2fe);
}
</style>
