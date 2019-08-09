<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" enctype="multipart/form-data"action="file.do">
		<input type="file" name="gphoto"/>图片
		<input type="text" name="gname"/>名字
		<input type="text" name="gprice">价格
		<button>上传</button>
	</form>
</body>
</html>