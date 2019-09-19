<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<table border="1">
    <tr>
        <td>图书编号</td>
        <td>图书名称</td>
        <td>图书作者</td>
    </tr>
    <#if books ??&&(books?size>0)>
        <#list books as book>
            <tr>
                <td>${book.id}</td>
                <td>${book.name}</td>
                <td>${book.author}</td>
            </tr>
        </#list>
    </#if>
</table>
</body>
</html>