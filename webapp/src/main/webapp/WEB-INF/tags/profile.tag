<%@ tag body-content="empty" %>
<%@ attribute name="user" required="true" type="com.mantiso.User" %>

<table class="table table-condensed">
    <tr>
        <td>Name: </td><td>${user.name}</td>
    </tr>
    <tr>
        <td>EMail: </td><td>${user.email}</td>
    </tr>
    <tr>
        <td>Avatar:</td><td><img src="${user.avatarUrl}"/></td>
    </tr>
</table>