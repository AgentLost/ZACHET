<template>
</template>

<script>
import Auto from '@/components/Auto.vue';
import ProductList from '@/components/ProductList.vue';
import Search from '@/components/Search.vue'

export default{
    components: {Auto, ProductList, Search},
    data() {
        return{
            products: [
                {id:1, title:'Product1', body: 'Хороший такой'},
                {id:2, title:'Product2', body: 'Хороший такой'},
                {id:3, title:'Product3', body: 'Хороший такой'},
            ],
            title:'',
            body:''
        }
    },
}
</script>

<style>

</style>