<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container" id="app">
	<div><h3>채팅방 리스트</h3></div>
	<div>
		<div><label>방제목</label></div>
		<div>
			<form method="post" action="/chat/room">
				<input type="text" name="name" />
				<input type="submit" value="채팅방개설" />
			</form>
		</div>
		<div>
			<ul>
				<c:forEach items='${rooms }' var='room'>
					<li><a href="/chat/${room.id }">${room.name }</a></li>
				</c:forEach>
			</ul>
		</div>
	</div>
</div>
</body>
</html>