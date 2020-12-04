<header class="header">
    <nav>
        <div class="container">
            <div class="row">
                <div class="col-md-1" style="padding-top: 40px">
                    <img src="/static/assets/img/Logo.png">
                </div>
                <div class="col-md-3" style="padding-right: 40px; padding-top: 40px">
                    <div class="row" style="padding-top: 10px">
                        <span class="header-title">Ламповая фотостудия Обнинск</span>
                    </div>
                    <div class="row" style="padding-top: 10px">
                        <span class="header-subtitle">Белый зал - вдохновение на съёмки</span>
                    </div>
                </div>
                <div class="offset-1 col-md-3" style="padding-top: 70px">
                    <a href="https://vk.com/id174637822" target="_blank" class="header-icon-link"><img
                                src="/static/assets/img/VkIcon.png"></a>
                    <a href="https://www.instagram.com/morozova.al/" target="_blank" class="header-icon-link"><img
                                src="/static/assets/img/InstagramIcon.png"></a>
                    <a href="" target="_blank"><img src="/static/assets/img/TelegramIcon.png" class="header-icon-link"></a>
                    <a href="" target="_blank"><img src="/static/assets/img/WhatsIcon.png" class="header-icon-link"></a>
                    <a href="" target="_blank"><img src="/static/assets/img/ViberIcon.png" class="header-icon-link"></a>
                </div>
                <div class="offset-1 col-md-3" style="padding-top: 25px">
                    <div class="row">
                        <a href="tel:+79046712346" class="ml-auto phone"> +7 (904) 671-23-46</a>
                    </div>
                    <div class="row" style="padding-top: 15px">
                        <button class="ml-auto order-call-button"><img src="/static/assets/img/phoneIcon.png"/><span
                                    style="padding-left: 10px">Заказать звонок</span></button>
                    </div>
                </div>
            </div>
            <div class="row" style="padding-top: 30px; padding-bottom: 40px">
                <div class="col-md-12">
                    <#if user??>
                        <a class="nav-item" href="/main">Главная</a>
                        <a class="nav-item" href="/advantages">Наши преимущества</a>
                        <a class="nav-item" href="/services">Услуги</a>
                        <a class="nav-item" href="/gift">Получить подарок</a>
                        <a class="nav-item" href="/stages">Этапы работы</a>
                        <a class="nav-item" href="/reviews">Отзывы</a>
                        <a class="nav-item">Наша команда</a>
                        <a class="nav-item" href="/profile">Профиль</a>
                    <#else>
                        <a class="nav-item" href="/main">Главная</a>
                        <a class="nav-item" href="/advantages">Наши преимущества</a>
                        <a class="nav-item" href="/services">Услуги</a>
                        <a class="nav-item" href="/gift">Получить подарок</a>
                        <a class="nav-item" href="/stages">Этапы работы</a>
                        <a class="nav-item" href="/reviews">Отзывы</a>
                        <a class="nav-item">Наша команда</a>
                        <a class="nav-item" href="/login">Войти</a>
                    </#if>
                </div>
            </div>
        </div>
    </nav>
</header>