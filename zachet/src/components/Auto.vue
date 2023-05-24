<template>
    <div class="auto_container">
        <div class="auto_form">
            <div class="div_top"></div>
            <div class="div_center">
                <div class="register_text"><p>Вход в Личный кабинет</p></div>
                <div class="input_login"><input type="text" placeholder="логин"></div>
                <div class="input_pass"><input type="text" placeholder="пароль"></div>
                <div class="dop_box"></div>
                <div class="button_next"><button>Продолжить</button></div>
            </div>
            <div class="div_bottom"></div>
        </div>
        <div class="auto_design">
            <figure id="circle1" class="circle"></figure>
            <figure id="circle2" class="circle"></figure>
            <figure id="circle3" class="circle"></figure>
            <div class="auto_design_text">Мы<br> рядом.<br> Все<br> просто.</div>
        </div>
        
    </div>
</template>

<script>
    export default{

    }
</script>

<style scoped>
.button_next{
    display: flex;
    justify-content: center;
    margin-top: 5%;
    height: 10%;
}


.button_next button{
    width: 70%;
    border-radius: 25px;
    padding: 5px 15px;
    border:1px solid #c3c2c2;
    background: linear-gradient(#c27bf8, #f3d3fc);
    color: white;
    font-weight: 600;
}

input::-webkit-input-placeholder { color: #c3c2c2; }

.input_pass{
    display: flex;
    justify-content: center;
    margin-top: 5%;
    height: 11%;
}

.input_login{
    display: flex;
    justify-content: center;
    margin-top: 7%;
    height: 11%;
}

.input_pass input{
    width: 70%;
    border-radius: 15px;
    padding: 5px 25px;
    border:1px solid #c3c2c2;
}

.input_login input{
    width: 70%;
    border-radius: 15px;
    padding: 5px 25px;
    border:1px solid #c3c2c2;
}

.register_text{
    display: flex;
    justify-content: center;
    height: 10%;
    padding-left: 5%;
    padding-top: 10px;
    font-size: 24px;
    font-weight: 600;
    margin-left: -25%;
}

.div_top{
    width: 100%;
    height: 15%;
}

.div_center{
    width: 100%;
    height: 65%;
    display: flex;
    flex-direction: column;
    padding-left: 10%;
    padding-right: 10%;
    padding-top: 10%;
}

.div_bottom{
    width: 100%;
    height: 20%;
}

.auto_design_text{
    position: absolute;
    font-size: 56px;
    color: #7000ff;
    font-weight: 700;
    margin-top: 10%;
    margin-left: 10%;
}

#circle3{
    position: absolute;
height: 300px !important;
  width: 300px !important;
  bottom: 0;
  margin-bottom: -10%;
  margin-left: -2%;
}

#circle2{
    position: absolute;
height: 200px !important;
  width: 200px !important;
  right: 0;
  margin-top: 30%;
  margin-right: -1%;
}

#circle1{
    position: absolute;
right: 0;
margin-right: -10%;
margin-top: -10%;
height: 400px !important;
  width: 400px !important;
}
.auto_design{
    width: 50%;
    height: 100%;
    background: linear-gradient(to top right, #c7d2fe, 10%, #f3d3fc, #c7d2fe);
}
.auto_form{
    width: 50%;
    height: 100%;
}
.auto_container{
    position: absolute;
    overflow: hidden;
    display: flex;
    flex-direction: row;
    width: 100%;
    height: 100%;
}

.circle {
  display: block;
  background: black;
  border-radius: 50%;
  height: 300px;
  width: 300px;
  margin: 0;
  background: radial-gradient(circle at 100px 100px, #e2e3fd, #847ef2);
  box-shadow: -.8em -.3em .9em white;
  filter: blur(10px);
}
</style>