<template>
    <div class="dialog">
        {{ dialog.title }} {{ dialog.id }}
    </div>
</template>
<script>
export default {
    props: {
        dialog: {
            type: Object,
            required: true
        }
    }
}
</script>
<style>
.dialog{
    margin: 5px;
    padding: 5px;
    background: #FFFFFF;
    border-bottom: 1px solid #B4ABAB;
    cursor: pointer;
}
</style>
