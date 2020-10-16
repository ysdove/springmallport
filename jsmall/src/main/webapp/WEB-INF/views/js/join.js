$(document).ready(function(){
$(function(){
	
		$("#btnjoin").click(function(){
		
		alert("유효성검사");
		
		//유효성검사구문
		
		
		$("#frmjoin").submit();
		
		});

var form = $("#frmjoin");
    //아이디 중복체크 기능 사용여부 확인 변수
    var ischeckId = "false";

   //아이디 중복체크 클릭 시
   $("#btn_checkId").on("click", function(){

    if($("#yjs_id").val()=="" || $("#yjs_id").val()== null){
        $("#id_availability").html("아이디를 먼저 입력해주세요.");
    }

    var yjs_id = $("#yjs_id").val();

    //ajax방식은 제어의 프름이 클라이언트 시작 > 서버요청> 클라이언트 종료
    //ajax방식은 서버요청에 실행되는 코드가 response.redirect, redirect: 주소이동 구문이 사용 안하거나
    //동작되어서는 안된다.
    $.ajax({
        url: '/member/checkId',
        type: 'post',
        dataType: 'text', // /member/checkId 주소에서 넘어오는 리턴값의 형식
        data: {yjs_id : yjs_id}, //javascript object 표현구문
        success : function(data){
            if(data=="success"){
                //사용가능한 아이디
                $("#id_availability").css("color","blue");
                $("#id_availability").html("사용가능한 아이디 입니다.");
                // 아이디를 중복체크하고 나서 아이디 텍스트박스 읽기모드, 중복체크 비활성화
                $("#yjs_id").attr("readonly", true);
                $("#btn_checkId").attr("disabled", true);

                ischeckId = "true"; // 아이디 중복체크를 한 용도
            }else{
                //사용 불가능 - 이미 존재하는 아이디
                $("#id_availability").html("이미 존재하는 아이디 입니다. \n다시 시도해주세요.");

            }
        }
    });
   });
});
   
   
   



});
