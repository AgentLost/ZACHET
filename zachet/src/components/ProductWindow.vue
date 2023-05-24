<template>
    <div class="productWindow">
        <div class="container">
            <div class="app">
                <div class="fix">
                    <Search class="search"></Search>
                </div>
                <div class="scroll">
                    <ProductList :products="products" ></ProductList>
                </div>
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
                {id:6, title:'Product6', body: 'Хороший такой'},
                {id:7, title:'Product7', body: 'Хороший такой'},

            ],
            title:'',
            body:''
        }
    },
}
</script>
<style scoped>
.app{

    margin-top: 10px;
    height: 40%;
}
.productWindow{
    background-color: white;
    position: fixed;
    bottom: 10px;
    right: 10px;
    border: 2px solid black;
    border-radius: 25px;
    width: 28%;
    height: 70%;
    overflow-y: scroll;
    display: flex;
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
</style>