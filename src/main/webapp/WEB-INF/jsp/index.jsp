<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="users" scope="request" type="java.util.List"/>
<%--<jsp:useBean id="users3" scope="request" type="java.util.List"/>--%>
<jsp:include page="include/header.jsp"/>

        <h1>This is an index page</h1>

        <c:forEach var="user" items="${users}">
            <ul>
                <li>
                    ${user.firstName} ${user.lastName}
                </li>
                <li>
                    ${user.email}
                </li>
            </ul>
        </c:forEach>


<jsp:include page="include/footer.jsp" />
