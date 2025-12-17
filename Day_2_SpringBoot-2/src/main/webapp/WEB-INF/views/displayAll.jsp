<h1>displatAll.jsp</h1>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

${data}

<table background="lightpink" border="4px">
<tr bgcolor="orange">
	<th>User Id</th>
	<th>FirstName</th>
	<th>LastName</th>
	<th>User Name</th>
	<th>Action</th>
	</tr>
	<c:forEach var="p" items="${data}">
	<tr> 
	<td>${p.id}</td>
	<td>${p.firstname}</td>
	<td>${p.lastname}</td>
	<td>${p.username }</td>
	
	<td><a href="DeleteUser?id=${p.id}">Delete</a>
	<a href="EditUser?id=${p.id}">Edit</a></td>
</tr></c:forEach>
	
</table> 

