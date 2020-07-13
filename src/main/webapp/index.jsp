<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
	<meta charset="UTF-8">
</head>
<body>
<h2>Hello World!</h2>
<%--Spring MVC 上传文件--%>
<form name="form1" action="/manage/product/upload.do" method="post" enctype="multipart/form-data">
	<input type="file" name="upload_file"/>
	<input type="submit" value="Spring MVC上传文件"/>
</form>

<%--富文本图片上传文件--%>
<form name="form1" action="/manage/product/richtext_img_upload.do" method="post" enctype="multipart/form-data" accept-charset="UTF-8">
	<input type="file" name="upload_file"/>
	<input type="submit" value="富文本图片上传文件"/>
</form>
</body>
</html>
