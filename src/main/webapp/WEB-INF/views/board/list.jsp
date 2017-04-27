<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>${cri}</h2>

<form id="bebe" action="/board/list" method="get">
<input type="hidden" id="rpage" name="page" value="${pageMaker.current}">
<input type="hidden" id="rview" name="rno">

</form>

<c:forEach items="${list}" var="list">
<ul class="list">
<tr>${list.rno}</tr>
<tr><a class="rview" href='${list.rno}'>${list.title}</a></tr>
<tr>${list.content}</tr>
<tr>${list.gubun}</tr>
<tr>${list.writer}</tr>
<tr>${list.regdate}</tr></br>
</c:forEach>
</ul>
${pageMaker }
<ul class="page">
<c:if test="${pageMaker.prev}">
<a href="${pageMaker.start -1}">prev</a>
</c:if>
<c:forEach begin="${pageMaker.start}" end="${pageMaker.end}" var="idx">
<a href="${idx}">${idx}</a>
</c:forEach>
<c:if test="${pageMaker.next}">
<a href="${pageMaker.end +1}">next</a>
</c:if>
</ul>

<form id="f1" action="/board/register" method="get">
<button id="regBtn">등록하기</button>
</form>

<script src="https://code.jquery.com/jquery-3.2.1.min.js"
		integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
		crossorigin="anonymous"></script>
		
<script>

	$(document).ready(function(e){
		
		$(".page a").on("click",function(e){
			e.preventDefault();
			
			$("#rpage").val($(this).attr("href"));
		
			$("#bebe").submit();
			
			
		});
		
		$(".rview").on("click", function(e){
			e.preventDefault();
			
			$("#rview").val($(this).attr("href"));
			
			$("#bebe").attr("action", "/board/view").submit();
			
			
		})
			
			/* $.ajax({
				type:'get',
				url:'/board/list/' +${"#rno"},
				headers:{"Content-Type":"application/json"}
				
				
				
			}); */
			
		
		
	})


</script>



</body>
</html>