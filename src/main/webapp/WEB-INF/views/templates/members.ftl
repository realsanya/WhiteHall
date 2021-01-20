<#ftl encoding="UTF-8"/>
<#import "layouts/base.ftl" as base>
<@base.main title="Наша команда" css=["styles.css"]>
    <div class="content">
        <div class="row">
            <div class="offset-3 col-md-6 title">Наша команда</div>
        </div>
        <section class="shop mt-5">
            <div class="container card px-5 pt-5 pb-5 pb-lg-5">
                <div class="row ">
                    <div class="col-lg-3">
                        <div class="shop__sidebar">
                            <div class="shop__sidebar__search">
                                <form action="/members" method="post" id="searh-form" class="search-form">
                                    <div class="autocomplete">
                                        <input
                                                id="search-input" type="text"
                                                class="login-input"
                                                style="background-color: #DFDFDF"
                                                name="search-input"
                                                placeholder="Search...">
                                    </div>
                                    <button type="submit" class="login-button"
                                            style="width: 120px; height: 40px; font-size:14px; margin-top: 10px;">
                                        Поиск
                                    </button>
                                </form>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-9 ">
                        <div class="shop__product__option">
                            <div class="row">
                                <div class="col-lg-6 col-md-6 col-sm-6">
                                    <div class="shop__product__option__left">
                                        <p></p>
                                    </div>
                                </div>
                                <div class="col-lg-6 col-md-6 col-sm-6">
                                    <div class="shop__product__option__right">
                                        <form action="/search" method="post">
                                            <select name="select-form" class="login-input">
                                                <option value="priceIncrease">фотограф</option>
                                                <option value="priceDecrease">видеограф</option>
                                                <option value="weightIncrease">визажист</option>
                                                <option value="weightDecrease">стилист</option>
                                                <option value="weightDecrease">парикмахер</option>
                                            </select>
                                            <button type="submit" class="login-button"
                                                    style="width: 100px; height: 40px; font-size:14px; margin-top: 10px">
                                                Выбрать
                                            </button>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <#if members??>
                    <div class="row" style="padding-top: 10px">
                        <!--donuts-->
                        <#list members as member>
                            <div class="col-xs-6 col-sm-4 col-md-4">
                                <div class="card border-white"
                                     style="height: 300px; margin-top: 10px; overflow-y: auto">
                                    <div class="card-body text-center ">
                                        <div class="row" style="display: flex; align-items: center;">
                                            <div class="col-lg-7">
                                                <h5 class="text-left"
                                                    style="color: #6F99E8; font-size: 32px;"> ${member.getFirst_name()}</h5>
                                            </div>
                                            <div class="col">
                                                <span class="text-right"
                                                      style="color: #484D50; font-size: 12px; font-weight: 700;"> ${member.getRole().name} </span>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col text-justify">
                                                <small>
                                                    ${member.getText()}
                                                </small>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </#list>
                        </#if>
                    </div>
                </div>
            </div>
        </section>
    </div>
</@base.main>