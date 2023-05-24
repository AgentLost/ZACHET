<template>
    <div class="message" :class="isClient(message)">
        <div class="message-content">{{ message.content }}</div>
        <div class="time-stamp">{{ message.time }}</div>
    </div>
</template>
<script>
export default {
    props: {
        message: {
            type: Object,
            required: true
        }
    },
    methods: {
        isClient: function (test) {
            if (test.id == 1)
                return "right"
        }
    }

}
</script>
<style>
.message-content {
    padding: 5px;
    background: #e7e7e7;
    color: black;
    border-radius: 25px;
    word-break: normal;
    padding: 5px 15px;
}


.time-stamp {
    font-size: 10px;
    padding-left: 5px;
}

.right {
    align-self: end;
}

.right .message-content{
    background: #7000FF;
    color: white;
}

.message{
    display: flex;
    flex-direction: column;
    max-width: 60%;
    width: fit-content;
}
</style>