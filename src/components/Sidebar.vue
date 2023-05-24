<template>
    <div class="sidebar">
        <div class="search">
            <input type="text" placeholder="Поиск по чатам">
        </div>
        <div class="dialogs">
            <div class="title">Активные чаты</div>
            <Dialog v-for="d in dialogs" :dialog="d" />
        </div>
        <div class="dialogs">
            <div>Завершённые чаты</div>
            <Dialog v-for="d in dialogs" :dialog="d" />
        </div>
    </div>
</template>
<script>
import Dialog from '@/components/Dialog.vue'
export default {
    components: { Dialog },
    data() {
        return {
            dialogs: [
                { id: 1, title: "Иван" },
                { id: 1, title: "Олег" },
                { id: 1, title: "Мария" },
                { id: 1, title: "Сергей" },
            ]
        }

    }
}
</script>
<style>
.sidebar {
    display: flex;
    flex-direction: column;
    align-items: center;
    width: 35%;
}

.dialogs {
    background: #FFFFFF;
    border-radius: 25px;
    max-height: 30%;
    width: 80%;
    overflow-y: scroll;

    margin: 20px;
    padding: 20px;
}

.search input {
    text-align: center;
    width: 100%;
    height: 80px;
    border-radius: 20px;
    border: 0;
    box-shadow: 0px 4px 5px 2px rgba(121, 197, 239, 0.38);
}

.search input:focus {
    outline: 0;
}

.search {
    width: 80%;
    margin-bottom: 15px;
}

.title {
    position: relative;
    font-family: 'Noir Pro';
    font-style: normal;
    font-weight: 600;
    margin-bottom: 30px;
    top:0;

}
</style>
