<%--
  Created by IntelliJ IDEA.
  User: gantushig
  Date: 5/7/20
  Time: 10:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../include/header.jsp" />

<main>
    <div class="container">
        <div class="my-3">
            <h2 class="my-4" style="font-weight: 400">List of Contact Messages</h2>
            <table class="table table-striped">
                <thead>
                <tr>
                    <th>#</th>
                    <th>Customer Name</th>
                    <th>Gender</th>
                    <th>Category</th>
                    <th>Message</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="customer" items="${customers}" varStatus="loop">
                    <tr>
                        <th>${loop.index + 1}.</th>
                        <td>${customer.name}</td>
                        <td>${customer.gender}</td>
                        <td>${customer.category}</td>
                        <td>${customer.message}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</main>

<jsp:include page="../include/footer.jsp" />