<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>

<!DOCTYPE>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>VRaptor Sample App | <decorator:title default="Vraptor Scaffold"/></title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/stylesheets/application.css"/>
    <decorator:head/>
    <%@include file="shim.jsp" %>
  </head>
  <body>
	<%@include file="header.jsp" %>
    <div class="container">
      <decorator:body/>
      <%@include file="footer.jsp" %>
    </div>
    <script type="text/javascript" src="${pageContext.request.contextPath}/javascripts/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/javascripts/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/javascripts/application.js"></script>
  </body>
</html>