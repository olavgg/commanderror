<%--
  User: olav
  Date: 7/17/15
  Time: 12:57 PM
--%>

<%@ page import="reloading.Message" contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<meta name="layout" content="administration"/>
	<title><g:message code="sometitle" default="somedefaulttitle"/></title>
</head>

<body>
<g:form action="save" method="POST">
	<g:textField name="message" value="test message" />
	<g:textField name="emails" value="" />
	<!--g:textField name="emails" value="" /-->
	<g:submitButton name="submit" value="submit" />
</g:form>

<g:each in="${Message.list()}" var="m">
	<div><g:fieldValue bean="${m}" field="message"/></div>
</g:each>
</body>
</html>