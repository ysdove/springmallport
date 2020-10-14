<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Shop Homepage - Start Bootstrap Template</title>
  
  <!-- Bootstrap core JavaScript -->
  <%@ include file="/WEB-INF/views/common/bootstrap.jsp" %>

<!-- 회원가입 유효성 검사 -->
	<script src="/js/join.js"></script>  

  <!-- Bootstrap core CSS -->
  <!-- Custom styles for this template -->
	<%@ include file="/WEB-INF/views/common/Topcss.jsp" %>

</head>

<body>

  <!-- Navigation -->
  <%@ include file="/WEB-INF/views/common/Navigation.jsp" %>
  <!-- Page Content -->
  <div class="container">

    <div class="row">

	  <div class="col-lg-3">
		<!-- 카테고리 -->
      <%@ include file="/WEB-INF/views/common/category.jsp" %>
      
      </div>
      <!-- /.col-lg-3 -->

      <div class="col-lg-9">

        <%@ include file="/WEB-INF/views/common/carousel.jsp" %>

        <div class="row">          
              
              <!-- 회원 가입 -->
              <div class="col">
    <h2>회원가입</h2>
    <form id="frmjoin" action="joinOK" method="post">
        <table class="table table-boardered">
            <tr>
                <th>아이디</th>
                <td><input type="text" class="form-control" name="yjs_id" placeholder="id를 넣으세요"></td>        
            </tr>
            <tr>
                <th>패스워드</th>
                <td><input type="password" class="form-control" name="yjs_password" placeholder="비밀번호는 영문만 넣어주세요"></td>      
            </tr>
             
            <tr>
                <th>패스워드확인</th>
                <td><input type="password" class="form-control" name="yjs_password2"></td>        
            </tr>
            
            <tr>
            	<th>닉네임설정</th>
            	<td><input type="text" class="form-control" name="yjs_nickname"></td>
            </tr>
             
            <tr>
                <th>이메일</th>
                <td><input type="email" id="" class="form-control" name="yjs_email"></td>       
            </tr>
            
            <tr>
                <th>우편번호</th>
                <td>
                	<input type="text" id="sample2_postcode" placeholder="우편번호" class="form-control" name="yjs_zipcode">
                	<input type="button" onclick="sample2_execDaumPostcode()" value="우편번호 찾기">
                </td>       
            </tr>
            
            <tr>
                <th>주소</th>
                <td><input type="text" id="sample2_address" placeholder="주소" class="form-control" name="yjs_addr"></td>       
            </tr>
            
            <tr>
                <th>상세주소</th>
                <td>
                	<input type="text" id="sample2_detailAddress" placeholder="상세주소" class="form-control" name="yjs_deaddr">
                	<input type="hidden" id="sample2_extraAddress" placeholder="참고항목">
                </td>       
            </tr>
            
             
            <tr>
                <th>핸드폰번호</th>
                <td><input type="tel" class="form-control" name="yjs_pnumber"></td>       
            </tr>
             
            <tr>
                <th>성별</th>
                <td>
                <input type="checkbox"  name="hobby" value="남성">남성 &nbsp;&nbsp;
                <input type="checkbox"  name="hobby" value="여성">여성 &nbsp;&nbsp;
                </td>     
            </tr>
                  
                        
            <tr>
                <th>당신의 연력은</th>
                <td>
                <input type="radio"  name="age" value="10">10대 &nbsp;&nbsp;
                <input type="radio"  name="age" value="20">20대 &nbsp;&nbsp;
                <input type="radio"  name="age" value="30">30대 &nbsp;&nbsp;
                <input type="radio"  name="age" value="40">40대 &nbsp;&nbsp;
                </td>     
            </tr>
             
            <tr>
                <th>하고 싶은 말</th>
                <td>
                 <textarea rows="5" cols="40" name="info" class="form-control"></textarea>
                </td>     
            </tr>
             
             
            <tr>
                <td colspan="2" class="text-center">
                <input type="button" id="btnjoin" class="btn btn-primary" value="전송">
                <input type="reset" class="btn btn-danger" value="취소">
                </td>
            </tr>
             
             
        </table>
    </form>
              
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