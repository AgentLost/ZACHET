<template>
    <div class="container">
            <div class="product" v-for="product in products">
            <div><strong>Название:</strong> {{ product.title }}</div>
            <div><strong>Описание:</strong> {{ product.body }}</div>
            </div>
        </div>
</template>
<script>
    export default{
        props:{
            products:{
                type:Array,
                required: true
            }
        }
    }
</script>
<style scoped>
.product{
    padding: 15px;
    border: 2px solid teal;
    margin-top: 15px;
    border-radius: 20px;
}

</style>