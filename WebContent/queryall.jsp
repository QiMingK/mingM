<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>All the query</title>
	<style>
	   #tab{
	      border:solid 2px;
	      width: 700px;
	      text-align: center;
	      border-color: gold;
	      color: #613613;
	   }
	   #u{
	     background: gold;
	   }
	</style>
<script type="text/javascript" src="${pageContext.request.contextPath }/jquery-3.2.1.js"></script>
	<script type="text/javascript">
	  function add() {
		window.location.href="${pageContext.request.contextPath }/add";
	}
	  function update() {
		window.location.href="${pageContext.request.contextPath }/update";
		}
	  function del(uuid) {
		 
		window.location.href="${pageContext.request.contextPath }/delete?uuid="+uuid;
	}
	
		$(function(){
			$(".sex").each(function(){
				var isex=$(this).html();
				if(isex==1){
					$(this).html("men");
				}else{
					$(this).html("women");
				}
			});
		})
	</script>
</head>
<body>
                <form action="queryall" method="post">
                <table id="tab">
                      <tr>
                          <td>uuid</td>
                          <td> 姓名</td>
                          <td> 性别</td>
                          <td>年龄</td>
                          <td colspan="2"><center>操作</center></td>
                      </tr>
                      <c:forEach items="${list }" var="s">
                         <tr>
                         <td>${s.uuid }</td>
                         <td>${s.name}</td>
                         <td class="sex">${s.sex}</td>
                         <td>${s.age}</td> 
                         <td><input type="button" value="修改" id="u" onclick="update()"></td>
                         <td><input type="button" value="删除" id="u" onclick="del('${s.uuid }')"></td>
                         </tr>
                      </c:forEach> 
                      <tr><td><input type="button" value="add" id="u" onclick="add()"></td></tr>
                </table>
                </form>
</body>
</html>