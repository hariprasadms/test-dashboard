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
								<th>Session Name</th>
								<th>Run Status</th>
								<th>Public Link</th>
								<th>Live Log</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${allsessions}" var="sessioninfo">
								<tr>
									<td>${sessioninfo.name}</td>
									<td>${sessioninfo.status}</td>
									<td><a href="${sessioninfo.public_url}" target="_blank">${sessioninfo.hashed_id}</a></td>
									<td><a href="${sessioninfo.logs}" target="_blank">live-log</a></td>
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