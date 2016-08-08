<!DOCTYPE html>
<html>
	<head>
		<title>Insert title here</title>
	</head>
	<body>
		<div> vermenigvuldigingstafels 1-10</div>
		<table>
			
			<% for(int i=1;i<=100; i++)  { %>
			<tr> <% for(int j=1;j<=100; j++)  { %>
					<td> <%= i*j %>
				<%} %>
				</tr>
			<%} %>
		</table>
	
	
	</body>
</html>