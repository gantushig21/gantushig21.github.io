<%--
  Created by IntelliJ IDEA.
  User: gantushig
  Date: 5/7/20
  Time: 1:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ct" uri="/WEB-INF/tlds/ct.tld" %>

<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  <title>CS472 WAP Assignment 13</title>
</head>
<body>
  <main>
    <div class="container" style="height: 100%; display: flex; flex-direction: column; align-items: center; justify-content: center;">
      <c:forEach var="i" begin="12" end="36" step="2">
        <ct:currentDateTime color="blue" size="${i}px" />
      </c:forEach>
    </div>
  </main>
</body>
</html>
