<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: gantushig
  Date: 5/6/20
  Time: 2:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="../include/header.jsp" />

<%--<c:set var="now" value="<%= new java.text.SimpleDateFormat('EEEEE, dd MMMMM yyy').format(new java.util.Date()) %>" />--%>
<c:set var="now" value="<%= new java.util.Date() %>" />

<main>
    <div class="container my-4">
        <p class="text-muted text-right">
            <fmt:formatDate type="both" value="${now}" />
        </p>
        <div class="card">
            <div class="card-header">
                <h3 style="font-weight: 300;">Thank you! Your message has been received as follows:</h3>
            </div>
            <div class="card-body">
                <p class="lead">Name: ${param.name}</p>
                <p class="text-muted">Gender: ${param.gender}</p>
                <p class="text-muted">Category: ${param.category}</p>
                <p>Message: ${param.message}</p><br />
                <p>Please feel free to <a href="/contact">Contact Us</a> again</p>
            </div>
        </div>
    </div>
    <div class="container my-4" style="display: flex; justify-content: space-between;">
        <span class="text-muted">Hit count for this page: ${hitCounter}</span>
        <span class="text-muted">Total Hit Count for the entire WebApp: ${totalCount}</span>
    </div>
</main>

<jsp:include page="../include/footer.jsp" />