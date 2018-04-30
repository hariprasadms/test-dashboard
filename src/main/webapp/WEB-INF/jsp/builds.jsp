<%@include file="header.jsp"%>
<body>
	<%@include file="nav.jsp"%>
	<div class="py-5">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<table class="table table-sm table-bordered table-striped">
						<tr>
							<th>Build Name</th>
							<th>Build ID</th>
						</tr>
						<c:forEach items="${allbuilds}" var="buildinfo">
							<tr>
								<td>${buildinfo.name}</td>
								<td><a href="sessions?id=${buildinfo.hashed_id}">${buildinfo.hashed_id}</a></td>
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