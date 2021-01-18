<#ftl encoding="UTF-8"/>
<#import "layouts/base.ftl" as base>
<@base.main title="Наша команда" css=["styles.css"]>
    <div class="content">
        <section class="shop mt-5">
            <div class="container card px-5 pt-5 pb-5 pb-lg-5">
                <div class="row ">
                    <div class="col-lg-3">
                        <div class="shop__sidebar">
                            <div class="shop__sidebar__search">
                                <form action="/members" method="post" id="searh-form" class="search-form">
                                    <div class="autocomplete">
                                        <input style="border-radius: 15px;"
                                               id="search-input" type="text"
                                               name="search-input"
                                               placeholder="Search...">
                                    </div>
                                    <button type="submit" class="search-btn" style="color: #aa4aac"><i
                                                class="fas fa-search">Поиск</i></button>
                                </form>
                            </div>
                            <div class="shop__sidebar__accordion">
                                <div class="accordion" id="accordionExample">

                                    <form action="/members" method="post">
                                        <div id="collapseSix" class="collapse show" data-parent="#accordionExample">
                                            <div class="card-body">
                                                <select name="select-tag" class="shop__product__option__right">
                                                    <option value="chocolateTag">
                                                        фотограф
                                                    </option>
                                                    <option value="nutsTag">
                                                        видеограф
                                                    </option>
                                                    <option value="berriesTag">
                                                        визажист
                                                    </option>
                                                    <option value="cocosTag">
                                                        стилист
                                                    </option>
                                                    <option value="vanillaTag">
                                                        парикмахер
                                                    </option>
                                                </select>
                                                <button type="submit" class="tag-donut">Выбрать</button>
                                            </div>
                                        </div>
                                    </form>

                                </div>
                            </div>
                        </div>
                    </div>
                    <#if members??>
                    <div class="row" style="padding-top: 10px">
                        <!--donuts-->
                        <#list members as member>
                            <div class="col-xs-6 col-sm-4 col-md-4 ">
                                <div class="card border-white">
                                    <div class="card-body text-center ">
                                        <div class="row">
                                            <div class="col-lg-7">
                                                <h5 class="text-left "> ${member.getFirst_name()}</h5>
                                            </div>
                                            <div class="col">
                                                <h5 class="text-right">  role </h5>
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
    </div>
</@base.main>