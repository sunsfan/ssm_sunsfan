<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Sunsfan 添加用户</title>

    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="container">
    <h1>Sunsfan 添加用户</h1>
    <hr/>
    <form:form action="/admin/users/addUserPost" method="post" modelAttribute="user" role="form">
        <div class="form-group">
            <label for="departmentid">部门ID:</label>
            <input type="text" class="form-control" id="departmentid" name="departmentid" placeholder="Enter 部门ID:" />
        </div>
        <div class="form-group">
            <label for="name">姓名:</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="Enter 姓名:" />
        </div>
        <div class="form-group">
            <label for="age">年龄:</label>
            <input type="number" class="form-control" id="age" name="age" placeholder="Enter 年龄:" />
        </div>
        <div class="form-group">
            <label for="sex">性别:</label><br>
            <input type="radio" id="sex" name="sex" value="m" />男<br>
            <input type="radio" id="sex" name="sex" value="f" />女<br>
        <div class="form-group">
            <label for="remark">标记:</label>
            <input type="text" class="form-control" id="remark" name="remark" placeholder="Enter 标记:" />
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-sm btn-success">提交</button>
        </div>
    </form:form>
</div>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>