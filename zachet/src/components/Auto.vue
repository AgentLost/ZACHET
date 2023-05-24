<template>
    <div class="auto_container">
        <div class="auto_form">
            <div class="div_top"><a>Помощь</a></div>
            <div class="div_center">
                <div class="register_text"><p>Вход в Личный кабинет</p></div>
                <div class="input_login"><input type="text" placeholder="логин"></div>
                <div class="input_pass"><input type="text" placeholder="пароль"></div>
                <div class="dop_box">
                    <div class="dop_box_container">
                        <div class="remember_me"><input type="checkbox" ><label>Запомнить меня</label></div>
                        <div class="forgot_pass"><a>Забыли пароль?</a></div>
                    </div>
                </div>
                <div class="button_next"><button>Продолжить</button></div>
                <div class="or"><p>- - - - - - - - - - - - - - - - - - или - - - - - - - - - - - - - - - - - -</p></div>
            </div>
            <div class="div_bottom">
                <div class="google"><img src="https://cdn4.iconfinder.com/data/icons/logos-brands-7/512/google_logo-google_icongoogle-1024.png"></div>
                <div class="yandex"><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/58/Yandex_icon.svg/1200px-Yandex_icon.svg.png"></div>
            </div>
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
.google{
    display: flex;
    justify-content: end;
    width: 50%;
    height: 50%;
    margin-right: 5%;
}

.yandex{
    display: flex;
    justify-content: start;   
    width: 50%;
    height: 53%;
    margin-left: 5%;
}

.or{
    display: flex;
    justify-content: center;
    color: #c3c2c2;
    font-size: 16px;
    margin-top: 2%;
}

input[type="checkbox"] {
  height: 15px;
}

input[type="checkbox"]:focus{
visibility: hidden;
}
.remember_me input{
    margin-top: 1.5%;
    outline: none;
}

label{
    color: #c3c2c2;
    font-size: 14px;
    margin-left: 4%;
}

.forgot_pass{
    display: flex;
    justify-content: end;
    width: 50%;
    height: 100%;
    color: #c3c2c2;
    font-size: 14px;
    margin-right: 3%;
}

.remember_me{
    width: 50%;
    display: flex;
    justify-content: start;
    margin-left: 3%;
}

.dop_box_container{
    width: 70%;
    display: flex;
    flex-direction: row;
}

.dop_box{
    height: 10%;
    display: flex;
    justify-content: center;
    margin-top: 2%;
}

.button_next{
    display: flex;
    justify-content: center;
    margin-top: 3%;
    height: 10%;
}


.button_next button{
    width: 70%;
    border-radius: 25px;
    padding: 5px 15px;
    border:1px solid #c3c2c2;
    background: linear-gradient(#acafff, #f3d3fc);
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
    outline:none;
    width: 70%;
    border-radius: 15px;
    padding: 5px 25px;
    border:1px solid #c3c2c2;
}

.input_login input{
    outline:none;
    width: 70%;
    border-radius: 15px;
    padding: 5px 25px;      
    border:1px solid #c3c2c2;
}

input:focus {
      color: #212529;
      background-color: #fff;
      border-color: #bdbdbd;
      outline: 0;
      box-shadow: 0 0 0 0.2rem rgba(158, 158, 158, 0.25);
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
    color: #c3c2c2;
    font-size: 15px;
    display: flex;
    justify-content: end;
    padding-top: 3%;
    padding-right: 5%;
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
    display: flex;
    flex-direction: row;
    padding-left: 10%;
    padding-right: 10%;
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