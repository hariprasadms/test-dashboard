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
								<th>Created Date</th>
								<th>Updated Date</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${projectService}" var="projects">
								<tr>
									<td>${projects.id}</td>
									<td><a href="project?id=${projects.id}">${projects.name}</a></td>
									<td>${projects.created_at}</td>
									<td>${projects.updated_at}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
<%@include file="footer.jsp"%>
</body>
</html>