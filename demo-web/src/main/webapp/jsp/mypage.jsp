<%@ page contentType="text/html;charset=UTF-8" %>
<!-- Servlet2.4的描述符的JSP页面默认是解析EL表达式。
Servlet2.3或者更早的描述符的JSP页面默认是忽略EL表达式的。 -->
<%@page isELIgnored="false" %>
<html>
<body>
<h2>Hello World1!</h2>
<%  
out.println(request.getParameter("user"));  
out.println(request.getAttribute("user"));  
out.println(request.getAttribute("user"));  
out.println(session.getAttribute("user"));  
 %>
 姓名：${user.username }<br> 
 账户：${user.account }<br> 
</body>
</html>
