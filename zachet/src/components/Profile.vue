<template>
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
</template>
<script>
export default {
}
</script>
<style scoped>
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

.profile{
    height: 15%;
    display: flex;
    flex-direction: row;
    max-height: 100px;
}
</style>