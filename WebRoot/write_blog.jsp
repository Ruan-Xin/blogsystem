<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<%@taglib prefix="s" uri="/struts-tags" %>
<title>YingMing Blog System</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="css/layout.css" rel="stylesheet" type="text/css" media="screen" />
<script src="ckeditor/ckeditor.js"></script>

</head>
<body>
<s:include value="user_navigation.jsp" />
<div id="content">
	<div id="page">
		<div id="write_blog">
		  <form id="form1" name="form1" method="post" action="writeJournal">
		    <table width="100%" border="0">
		      <tr>
              	<td width="7%" align="right" valign="top">标题：</td>
		        <td width="93%"><input name="title" type="text" id="textfield" size="111" /></td>
	          </tr>
		      <tr>
              	<td align="right" valign="top"></td>
		        <td>&nbsp;</td>
	          </tr>
		      <tr>
              	<td align="right" valign="top">内容：</td>
		        <td align="left"><textarea class="ckeditor" name="journalContent" id="journalContent" cols="80" rows="10"></textarea></td>
	          </tr>
		      <tr>
              	<td align="right" valign="top"></td>
		        <td><input type="submit" name="button" id="button" value="发布" />
	            <input type="submit" name="button2" id="button2" value="预览" /></td>
	          </tr>
	        </table>
	      </form>
			
		</div>
		
	</div>
	<div style="clear: both;">&nbsp;</div>
</div>
<div id="footer">
	<p>&copy;&nbsp;Copyright 2009. All Rights Reserved. template design by <a href="http://www.cssMoban.com" class="links">cssMoban.com</a> </p>
</div>

</body>
</html>
