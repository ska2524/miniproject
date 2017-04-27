<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


	<div class="panel panel-default">
		<div class="panel-body">
			REGISTER --------
			<form method="post">
				<div class="form-group1">
					<label for="exampleInputEmail1">title</label> <input type="text"
						class="form-control" name="title" value="title">
				</div>
				<div class="form-group2">
					<label for="exampleInputPassword1">content</label> <input
						type="text" class="form-control" name="content" value="content">
				</div>
				<div class="form-group3">
					<label for="exampleInputPassword1">writer</label> <input
						type="text" class="form-control" name="writer" value="writer">
				</div>
				<div class="form-group4">
					<label for="exampleInputFile">파일 업로드</label> <input type="file"
						name="pname" value="pname">
				</div>
				<button class="btn">제출</button>
			</form>


			<script src="https://code.jquery.com/jquery-3.2.1.min.js"
				integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
				crossorigin="anonymous"></script>


			<script>
				$(document).ready(function(e) {

					$(".btn").on("click", function() {
						e.preventDeafult();

						var files = e.originalEvent.dataTransfer.files;

						console.log(files);
					});

				});
			</script>



		</div>
	</div>