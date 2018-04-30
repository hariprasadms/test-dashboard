<%@include file="header.jsp"%>
<body>
	<%@include file="nav.jsp"%>
	<div class="py-5">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<table class="table table-sm table-bordered table-striped">
						<thead>
							<tr>
								<th>Project ID</th>
								<th>Project Name</th>
								<th>Created On</th>
								<th>Updated On</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td><c:out value="${oneproid}"></c:out></td>
								<td><c:out value="${oneproname}"></c:out></td>
								<td><c:out value="${createdon}"></c:out></td>
								<td><c:out value="${updatedon}"></c:out></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
			<div class="container">
			<div class="row">
				<div class="col-md-12">
					<table class="table table-sm table-bordered table-striped">
						<tr>
							<th>Build Name</th>
							<th>Build ID</th>
						</tr>
						<c:forEach items="${buildlist}" var="builds">
							<tr>
								<td>${builds.name}</td>
								<td><a href="sessions?id=${builds.hashed_id}">${builds.hashed_id}</a></td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		</div>
	</div>
	<%@include file="footer.jsp"%>
</body>
</html>