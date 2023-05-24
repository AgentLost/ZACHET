<template>
    <div class="MessageBar">
        <input type="text" placeholder="Напишите что-нибудь здесь">
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
    justify-content: center;
    bottom: 0;
    margin-top: 2%;
}

.MessageBar input {
    width: 75%;
    border-radius: 25px;
    padding: 5px 15px;
    border: 0;
    background-color: #f1f7fc;
}

.MessageBar input:focus{
    outline: 0;
}
</style>