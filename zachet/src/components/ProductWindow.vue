<template>
    <div class="productWindow">
        <div class="container">
            <div class="app">
                <Search class="search"></Search>
                <ProductList :products="products"></ProductList>
            </div>
        </div>
    </div>
</template>
<script>
import ProductList from '@/components/ProductList.vue';
import Search from '@/components/Search.vue'
export default{
    components: {ProductList, Search},
    data() {
        return{
            products: [
                {id:1, title:'Product1', body: 'Хороший такой'},
                {id:2, title:'Product2', body: 'Хороший такой'},
                {id:3, title:'Product3', body: 'Хороший такой'},
                {id:4, title:'Product4', body: 'Хороший такой'},
                {id:5, title:'Product5', body: 'Хороший такой'},

            ],
            title:'',
            body:''
        }
    },
}
</script>
<style>
.app{

    margin-top: 10px;
    height: 40%;
}
.search{
    position: sticky;
}
.productWindow{
    position: absolute;
    bottom: 10px;
    right: 10px;
    border: 2px solid black;
    width: 28%;
    height: 70%;
    overflow-y: scroll;
}
::-webkit-scrollbar {
  width: 0px;
  background: rgba(255, 255, 255, 0.0);
}
</style>