<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
<!-- css -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/bootstrap.css" />
<style>
        /* 사이드바 래퍼 스타일 */
        
        .mypage {
          height: 700px;
          position: relative;
        }
        #page-wrapper{
            padding-left: 250px;
        }
        #sidebar-wrapper {
          position: absolute;
          width: 300px;
          height: 700px;
          /* margin-left: -250px; */
          background: #999;
          overflow-x: hidden;
          overflow-y: auto;
          background-color: #E0E4E9;
        }
        
        #page-content-wrapper {
          text-align: center;
          width: 100%;
          padding: 20px;
        }
        /* 사이드바 스타일 */
        
        .sidebar-nav {
          width: 300px;
          margin: 0;
          padding: 0;
          list-style: none;
        }
        
        .sidebar-nav li {
          text-indent: 1.5em;
          line-height: 2.8em;
        }
        
        .sidebar-nav li a {
          display: block;
          text-decoration: none;
          color: rgb(5, 5, 5);
        }
        
        .sidebar-nav li a:hover {
          color: #fff;
          background: rgba(255, 255, 255, 0.2);
        }
        
        .sidebar-nav > .sidebar-brand {
          font-size: 1.3em;
          line-height: 3em;
        }
</style>
</head>
<body>
<!-- 사이드바 -->
    <div id="sidebar-wrapper">
        <ul class="sidebar-nav">
             <li class="sidebar-brand">
                  Dream Books
             </li>
             <li><a href="<%=request.getContextPath()%>/mypage/usercheck">개인정보조회/변경</a></li>
             <li><a href="<%=request.getContextPath()%>/mypage/updatePassword">비밀번호 변경</a></li>
             <li><a href="<%=request.getContextPath()%>/mypage/orderList">주문내역</a></li>
        </ul>
     </div>
 <!-- /사이드바 -->
</body>
</html>