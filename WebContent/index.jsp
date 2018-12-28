<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<body>
		<h1>Struts2 login Application</h1>
		<s:form action="verify">
			<s:textfield name="uname" label="Enter UserName: "></s:textfield>
			<s:password name="password" label="Enter Password: "></s:password>
			<s:submit value="login" align="center"></s:submit>
		</s:form>
	</body>
</html>