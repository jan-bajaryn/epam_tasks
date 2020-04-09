<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="ctg" uri="customtags" %>

<%--TODO replacement--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Footer fragment</title>
</head>
<body>
<footer class="bg-dark">

    <%--    <c:if test="${param.lang == null}">--%>
    <%--        <fmt:setLocale value="ru-RU"/>--%>
    <%--    </c:if>--%>
    <%--    <c:if test="${param.lang != null}">--%>
    <%--        <fmt:setLocale value="${param.lang}"/>--%>
    <%--    </c:if>--%>
    <fmt:setBundle basename="property.text" var="rb"/>


    <div class="container">
        <a href="?">
            <fmt:message key="web.links.aboutus" bundle="${ rb }"/>
        </a>
        <a href="?">
            <fmt:message key="web.links.alllove" bundle="${ rb }"/>
        </a>
        <a href="?">
            <fmt:message key="web.links.outblog" bundle="${ rb }"/>
        </a>
        <a href="?">
            <fmt:message key="web.links.sponsors" bundle="${ rb }"/>
        </a>

        <form method="post" class="footer__element" action="<c:url value="/page/change-language"/>">
            <input type="hidden" value="ru" name="lang">
            <input type="submit" value="<fmt:message key="web.langs.rus" bundle="${ rb }"/>">
        </form>
        <form method="post" class="footer__element" action="<c:url value="/page/change-language"/>">
            <input type="hidden" value="en" name="lang">
            <input type="submit" value="<fmt:message key="web.langs.en" bundle="${ rb }"/>">
        </form>
        <form method="post" class="footer__element" action="<c:url value="/page/change-language"/>">
            <input type="hidden" value="pl" name="lang">
            <input type="submit" value="<fmt:message key="web.langs.pl" bundle="${ rb }"/>">
        </form>
        <a href=""><br><br></a>

        <%--        <a href="?">--%>
        <%--            <ctg:hello role="${param.role}"/>--%>
        <%--        </a>--%>
        <%--        <ctg:table-revenue rows="${ rw.size }" head="Revenue">--%>
        <%--            ${ rw.revenue }--%>
        <%--        </ctg:table-revenue>--%>
        <%--        <a href=""><br><br></a>--%>
        <%--        <ctg:table-revenue>5 rub BulbaComp</ctg:table-revenue>--%>
    </div>

</footer>
</body>
</html>
