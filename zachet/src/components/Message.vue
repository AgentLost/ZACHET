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
    position: relative;
    padding: 5px;
    background: #7000FF;
    color: white;
    border-radius: 25px;
    width: max-content;
    max-width: 60%;
    word-break: normal;
}


.time-stamp {
    font-size: 10px;
    padding-left: 5px;
}

.right {
    align-self: end;
}
</style>