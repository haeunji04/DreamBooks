<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/header.jsp" %>
<!-- css -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/bootstrap.css" />
<style>
#content1{
	position:absolute;
	top:50px;
	left:700px;
}
#content1 h1{
	font-weight: 1000;
}
#content1 p {
	font-size: 18px;
}
</style>
<!-- mypage -->
<div class="mypage">
    <div id="page-wrapper">
        <!-- sidebar -->
        <%@ include file="/WEB-INF/views/common/MypageSideBar.jsp" %>
        <!-- /sidebar -->
        <!-- content -->
        <div id="content1">
        	<h1>탈퇴하기</h1>
        	<br /><br />
        	<p>정말 탈퇴하시겠습니까?</p>
        	<p>탈퇴한 계정은 복구되지 않습니다.</p>	
        	<br />
        	<tbody>
        		<tr class="pwck">
        			<th><button class="btn-lg btn-error">취소</button></th>
        			<th><button class="btn-lg btn-secondary">확인</button></th>
        		</tr>
        	</tbody>
        </div>
        <!-- /content -->
    </div>
</div>
<!-- /mypage -->
<%@ include file="/WEB-INF/views/common/footer.jsp" %>