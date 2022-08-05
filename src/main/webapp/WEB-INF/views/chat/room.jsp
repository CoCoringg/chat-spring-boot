<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="/webjars/axios/0.17.1/dist/axios.min.js"></script>
<script src="/webjars/sockjs-client/1.1.2/sockjs.min.js"></script>
<script src="/webjars/stomp-websocket/2.3.3-1/stomp.min.js"></script>
<script type="text/javascript"> 
	const sock = new SockJS("ws/chat");
	const ws = Stomp.over(sock);
	var reconnect = 0;
	
	const data = {
			roomId: '',
			room: {},
			sender: '',
			message: '',
			messages: []
	}
      

</script> 
</head>
<body>
	<div><h3>채팅방: ${roomName }</h3></div>
	<div>
		
		<div>
			<form method="post" action="">
				<label>이름</label>
				<input type="text" name="name" />
				<label>메시지</label>
				<input type="text" name="content" />
				<input type="submit" value="보내기" />
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
	
</body>
</html>