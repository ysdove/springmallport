<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>로그인</title>
  
  <!-- Bootstrap core JavaScript -->
  <%@ include file="/WEB-INF/views/common/bootstrap.jsp" %>
  

  <!-- Bootstrap core CSS -->
  <!-- Custom styles for this template -->
	<%@ include file="/WEB-INF/views/common/Topcss.jsp" %>

</head>

<style>
    body {
        background: #f8f8f8;
        padding: 60px 0;
    }
    
    #login-form > div {
        margin: 15px 0;
    }

</style>

<body>

  <!-- Navigation -->
  <%@ include file="/WEB-INF/views/common/Navigation.jsp" %>
  <!-- Page Content -->
  <div class="container">

    <div class="row">

	  <div class="col-lg-3">
		<!-- 카테고리 -->
      
      </div>
      <!-- /.col-lg-3 -->

      <div class="col-lg-9">


        <div class="row">

	<h1>로그인을 해주세요.</h1>
				<div class="container">
    <div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
        <div class="panel panel-success">
            <div class="panel-heading">
                <div class="panel-title">환영합니다!</div>
            </div>
            <div class="panel-body">
                <form id="login-form">
                    <div>
                        <input type="text" class="form-control" name="username" placeholder="Username" autofocus>
                    </div>
                    <div>
                        <input type="password" class="form-control" name="password" placeholder="Password">
                    </div>
                    <div>
                        <button type="submit" class="form-control btn btn-primary">로그인</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
				
				
        </div>
        <!-- /.row -->

      </div>
      <!-- /.col-lg-9 -->

    </div>
    <!-- /.row -->

  </div>
  <!-- /.container -->

  <!-- Footer -->
  <%@ include file="/WEB-INF/views/common/footer.jsp" %>

  

</body>

</html>