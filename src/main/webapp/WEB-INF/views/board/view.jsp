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


<h2>${ReviewVO}</h2>


<div>
<ul  class="reply">


</ul>


</div>
<div>
<ul class="page">

</ul>
</div>





<script src="https://code.jquery.com/jquery-3.2.1.min.js"
		integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
		crossorigin="anonymous"></script>
		
<script>
$(document).ready(function () {

   
            
       
        
        $.ajax({

            url:"/reply",
            type:"get",
            headers:{"Content-Type":"application/json"},
            success:function (result) {
                console.log(result)
                
             var str = "<c:forEach items="${rlist}" var="list"><li><tr>${list.rno}${list.sno}${list.title}${list.content}${list.regdate}${list.updatedate}${list.writer}</tr></li></c:forEach>"
                
               	$(".reply").append(str);
                
                
            }

        })

		
        	$.ajax({
				
				url:"/page",
				type:"get",
				headers:{"Content-Type":"application/json"},
				 success:function (result) {
		                console.log(result)
		                
		             var str1 = "<c:forEach begin="${pageMaker.start}" end="${pageMaker.end}" var="as"><a href='${as}'>${as}</a></c:forEach>";
		             
		            	
		            
		             
		               	$(".page").append(str1);
		                
		                
		            }
				
			})
        
        
		$(".page a").on("click",function(e){
			
			e.preventDefault();
			console.log("aaa")
			
		})


    







})









</script>		
</body>
</html>