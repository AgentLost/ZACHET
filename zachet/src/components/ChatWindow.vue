<template>
    <div class="all">
    <div class="chatWindow">
        <div class="topbar">
            <p>Чат</p>
        </div>
        <div class="profile">
            <div class="avatar">
                <div class="image"></div>
            </div>
            <div class="name_status_container">
                <div class="name">
                    <p>Олег</p>
                </div>
                <div class="status">
                    <p>Online</p>
                </div>
            </div>
        </div>

            <Chat/>

        <div class="inputMes">

        </div>
    </div>
    </div>
</template>
<script>
import Chat from './Chat.vue';
export default{
    components: {Chat},
}
</script>
<style>
.status{
    padding-left: 6%;
    font-size: 13px;
    font-weight: 300;
}
.image{
    width: 99%;
    height: 99%;
    border: 1px solid black;
    border-radius: 50%;
}
.name{
    height: 50%;
    padding-top: 10px;
    padding-left: 5%;
    font-size: 20px;
    font-weight: 500;
}
.name_status_container{
    display: flex;
    flex-direction: column;
    height: 100%;
    width: 77%;
}
.avatar{
    width: 100px;
    padding: 3px;
    padding-left: 5%;
}
.topbar{
    height: 10%;
    padding-left: 5%;
    padding-top: 10px;
    font-size: 24px;
    font-weight: 600;
}
.profile{
    height: 15%;
    display: flex;
    flex-direction: row;
    max-height: 100px;
}
.chatmini{
    height: 65%;
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
    overflow-y: scroll;
    display: flex;
    flex-direction: column;
    box-shadow: 0 0 10px rgb(126, 189, 225);
}
::-webkit-scrollbar {
  width: 0px;
  background: rgba(255, 255, 255, 0.0);
}

.fix{
    width: 26.2%;
    position: fixed;
    background-color: white;
    margin-top: -10px;
    border-radius: 15px;
}
.scroll{
    padding-top: 10%;
    padding-bottom: 5px;
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