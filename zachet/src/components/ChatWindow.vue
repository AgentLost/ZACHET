<template>
    <div class="all">
        <div class="chatWindow">
            <Topbar/>
            <Profile/>
            <div class="chatmini">
                <Chat/>
            </div>
            <MessageBar/>
        </div>
    </div>
</template>
<script>
import Chat from './Chat.vue';
import Topbar from './Topbar.vue';
import Profile from './Profile.vue';
import MessageBar from './MessageBar.vue';
export default{
    components: {Chat, Topbar, Profile, MessageBar},
}
</script>
<style scoped>

.chatmini{
    height: 65%;
    padding: 10px;
    overflow-y: scroll;
}
.inputMes{
    height: 10%;
}
.app{

    margin-top: 10px;
    height: 40%;
}
.chatWindow{
    background-color: white;
    position: fixed;
    bottom: 10px;
    right: 10px;
    border-radius: 25px;
    width: 25%;
    height: 70%;
    display: flex;
    flex-direction: column;
    box-shadow: 0 0 10px rgb(126, 189, 225);
}
::-webkit-scrollbar {
  width: 0px;
  background: rgba(255, 255, 255, 0.0);
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