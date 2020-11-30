<#ftl encoding="UTF-8"/>
<#import "layouts/base.ftl" as base>
<@base.main title="Получить подарок" css=["styles.css"]>
    <div class="content">
        <div class="container">
            <div class="row">
                <div class="col-md-7">
                    <div class="row" style="padding-top: 60px">
                        <div class="title">Проходи опрос и забирай подарок</div>
                    </div>
                    <div class="row" style="padding-top: 70px">
                        <div class="gift-text">Пройди опрос и мы подарим тебе <br/> <span class="gift-text-second">+5 обработанных фотографий</span>
                        </div>
                    </div>
                    <div class="row" style="padding-top: 50px">
                        <button class="gift-button">
                            Получить подарок <img src="/static/assets/img/click.png" style="padding-left: 5px"/>
                        </button>
                    </div>
                </div>
                <div class="col-md-5">
                    <img src="/static/assets/img/Phone.png" style="width: 560px">
                </div>
            </div>
        </div>
    </div>
</@base.main>