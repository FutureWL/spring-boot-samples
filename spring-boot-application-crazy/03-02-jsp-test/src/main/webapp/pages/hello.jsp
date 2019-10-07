<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" href="${ctx}/css/test.css" type="text/css"/>
    <script type="text/javascript" src="${ctx}/js/test.js"></script>
    <title></title>
</head>
<body>
<div onClick="myClick()" class="main_text">Hello ${name}</div>
</body>
</html>