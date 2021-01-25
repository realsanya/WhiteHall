<#ftl encoding="UTF-8"/>
<#macro main title css=[] scripts=[]>
    <!DOCTYPE html>
    <html lang="ru" xmlns="http://www.w3.org/1999/html">
    <head>
        <meta charset="UTF-8">
        <title>${title}</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" type="text/css" href="/static/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="/static/css/main.css">
        <#list css as style>
            <link rel="stylesheet" type="text/css" href="/static/css/${style}">
        </#list>
    </head>
    <body>
    <#include "header.ftl">
    <#nested>
    <#include "footer.ftl">
    <script src="/static/js/jquery-3.5.1.min.js"></script>
    <script src="/static/js/bootstrap.js"></script>
    <#list scripts as script>
        <script src="/static/js/${script}"></script>
    </#list>
    </body>
    </html>
</#macro>