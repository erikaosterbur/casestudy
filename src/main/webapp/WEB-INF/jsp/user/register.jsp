<jsp:include page="../include/header.jsp" />

<h1>Register</h1>

<form action="/user/registerSubmit" method="post">

    Email <input type="email" name="email" id="emailId">
    <br>
    First Name <input type="text" name="firstName" id="firstNameId">
    <br>
    Last Name <input type="text" name="lastName" id="lastNameId">
    <br>
    Password <input type="password" name="password" id="passwordId">
    <br>
    Confirm Password <input type="password" name="confirmPassword" id="confirmPasswordId">
    <br>
    <button type="submit">Submit</button>

</form>

<jsp:include page="../include/footer.jsp" />
