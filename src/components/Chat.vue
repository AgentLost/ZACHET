<template>
    <div class="chat">
        <Message v-for="m in messages" :message="m" />
        <MessageBar />
    </div>
</template>
<script>
import MessageBar from '@/components/MessageBar.vue'
import Message from '@/components/ui/Message.vue'
export default {
    components: { MessageBar, Message },
    data() {
        return {
            messages: [
                { id: 1, from: "Николай Игоревич", content: "Приветствую вас, чем могу быть полезным?", time: "17:00" },
                { id: 2, from: "Николай Игоревич", content: "ам...Эмммм. ну что-то там сломалось, не понимаюю", time: "17:21" },
                { id: 1, from: "Николай Игоревич", content: "Не затруднит ли вас, подробнее рассказать о вашей проблеме?", time: "17:22" },
                { id: 2, from: "Николай Игоревич", content: "Блять!!!! Сука!!! Нихуя ге рбаотет ыыыы", time: "17:31" },
                { id: 1, from: "Николай Игоревич", content: "Прошу прощения, в чем ваша проблема?", time: "17:32" },
                { id: 2, from: "Николай Игоревич", content: "Блять, да я же говорю, НИХУЯ НЕ РАБОТАЕТ", time: "17:40" },
                { id: 1, from: "Николай Игоревич", content: "Приветствую вас, чем могу быть полезным?", time: "17:00" },
                { id: 2, from: "Николай Игоревич", content: "ам...Эмммм. ну что-то там сломалось, не понимаюю", time: "17:21" },
                { id: 1, from: "Николай Игоревич", content: "Не затруднит ли вас, подробнее рассказать о вашей проблеме?", time: "17:22" },
                { id: 2, from: "Николай Игоревич", content: "Блять!!!! Сука!!! Нихуя ге рбаотет ыыыы", time: "17:31" },
                { id: 1, from: "Николай Игоревич", content: "Прошу прощения, в чем ваша проблема?", time: "17:32" },
                { id: 2, from: "Николай Игоревич", content: "Блять, да я же говорю, НИХУЯ НЕ РАБОТАЕТ", time: "17:40" },
                { id: 1, from: "Николай Игоревич", content: "Приветствую вас, чем могу быть полезным?", time: "17:00" },
                { id: 2, from: "Николай Игоревич", content: "ам...Эмммм. ну что-то там сломалось, не понимаюю", time: "17:21" },
                { id: 1, from: "Николай Игоревич", content: "Не затруднит ли вас, подробнее рассказать о вашей проблеме?", time: "17:22" },
                { id: 2, from: "Николай Игоревич", content: "Блять!!!! Сука!!! Нихуя ге рбаотет ыыыы", time: "17:31" },
                { id: 1, from: "Николай Игоревич", content: "Прошу прощения, в чем ваша проблема?", time: "17:32" },
                { id: 2, from: "Николай Игоревич", content: "Блять, да я же говорю, НИХУЯ НЕ РАБОТАЕТ", time: "17:40" },
                { id: 1, from: "Николай Игоревич", content: "Оцените нашу работу от 1 до 10", time: "17:50" },
            ]
        }
    }
}
</script>
<style>
.chat {
    position: relative;
    display: flex;
    flex-direction: column;
    width: 65%;
    overflow-y: scroll;
    margin-bottom: 5%;
}

::-webkit-scrollbar {
    width: 0;
}
</style>
