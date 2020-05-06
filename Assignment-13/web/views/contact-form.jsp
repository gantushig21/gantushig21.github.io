<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: gantushig
  Date: 5/6/20
  Time: 2:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="../include/header.jsp" />
<main>
    <div class="container my-4">
        <h3 style="font-weight: 400;">Customer Contact Form</h3>
        <div class="mb-2" style="color:red;">
            ${errorMessage}
        </div>
        <form action="process-contact-form" method="post">
            <div class="form-group">
                <label for="name">*Full Name:</label>
                <input type="text" class="form-control" id="name" name="name" value="${param.name}">
                <small class="form-text text-muted">Enter your full name.</small>
            </div>
            <label>*Gender:</label><br>
            <div class="form-group">
                <div class="custom-control custom-radio custom-control-inline">
                    <input type="radio" name="radioGender" id="radioGenderMale" class="custom-control-input" value="male"
                        <c:if test="${param.radioGender eq 'male'}">
                            <c:out value="checked"/>
                        </c:if>
                    >
                    <label for="radioGenderMale" class="custom-control-label">Male</label>
                </div>
                <div class="custom-control custom-radio custom-control-inline">
                    <input type="radio" name="radioGender" id="radioGenderFemale" class="custom-control-input" value="female"
                        <c:if test="${param.radioGender eq 'female'}">
                            <c:out value="checked"/>
                        </c:if>
                    >
                    <label for="radioGenderFemale" class="custom-control-label">Female</label>
                </div>
            </div>
            <div class="form-group">
                <label for="category">*Category:</label>
                <select class="form-control" id="category" name="category">
                    <option value="">Select...</option>
                    <option value="Feedback"
                            <c:if test="${param.category eq 'Feedback'}">
                                <c:out value=" selected"/>
                            </c:if>
                    >Feedback</option>
                    <option value="Inquiry"
                            <c:if test="${param.category eq 'Inquiry'}">
                                <c:out value=" selected"/>
                            </c:if>
                    >Inquiry</option>
                    <option value="Complaint"
                            <c:if test="${param.category eq 'Complaint'}">
                                <c:out value=" selected"/>
                            </c:if>
                    >Complaint</option>
                </select>
            </div>
            <div class="form-group">
                <label for="message">*Message:</label>
                <textarea class="form-control" name="message" id="message" cols="30" rows="3">${param.message}</textarea>
            </div>
            <button class="btn btn-primary btn-block" type="submit">Submit</button>
        </form>
    </div>
    <div class="container my-4" style="display: flex; justify-content: space-between;">
        <span class="text-muted">Hit count for this page: ${hitCounter}</span>
        <span class="text-muted">Total Hit Count for the entire WebApp: ${totalCount}</span>
    </div>
</main>
<jsp:include page="../include/footer.jsp" />