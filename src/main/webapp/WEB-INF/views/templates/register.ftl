<#ftl encoding="UTF-8"/>
<#import "layouts/base.ftl" as base>
<@base.main title="Регистрация" css=["styles.css"]>
    <div class="content">
        <div class="container">
            <div class="row">
                <div class="offset-3 col-md-6 title">Регистрация</div>
            </div>

            <div class="container" style="padding-top: 40px; padding-bottom: 100px">
                <form method="post">
                    <div class="offset-3 col-md-6">
                        <div class="row justify-content-center">
                            <input class="login-input" type="text" placeholder="Имя"/>
                        </div>
                        <div class="row justify-content-center" style="padding-top: 20px">
                            <input class="login-input" type="text" placeholder="Фамилия"/>
                        </div>
                        <div class="row justify-content-center" style="padding-top: 20px">
                            <input class="login-input" type="email" placeholder="Почта"/>
                        </div>
                        <div class="row justify-content-center" style="padding-top: 20px">
                            <input class="login-input" type="password" placeholder="Пароль"/>
                        </div>
                        <div class="row justify-content-center" style="padding-top: 20px">
                            <input class="login-input" type="password" placeholder="Повторите пароль"/>
                        </div>

                        <div class="row justify-content-center" style="padding-top: 40px">
                            <button class="register-button">
                                Зарегистрироваться <img src="/static/assets/img/click.png" style="padding-left: 15px"/>
                            </button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</@base.main>