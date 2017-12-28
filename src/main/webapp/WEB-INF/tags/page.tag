<%@tag pageEncoding="UTF-8" description="分页"%>
<%@ attribute name="page" type="com.sishuok.pageutil.Page"
	required="true" description="分页对象"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
.pagers {
  padding-left: 0;
  margin: 20px 0;
  text-align: center;
  list-style: none;
}
.pagers li {
  display: inline;
}
.pagers li > a,
.pagers li > span {
  display: inline-block;
  padding: 5px 14px;
  background-color: #fff;
  border: 1px solid #ddd;
  border-radius: 15px;
}
.pagers li > a:hover,
.pagers li > a:focus {
  text-decoration: none;
  background-color: #eee;
}
.pagers .next > a,
.pagers .next > span {
  float: right;
}
.pagers .previous > a,
.pagers .previous > span {
  float: left;
}
.pagers .disabled > a,
.pagers .disabled > a:hover,
.pagers .disabled > a:focus,
.pagers .disabled > span {
  color: #777;
  cursor: not-allowed;
  background-color: #fff;
}
</style>
<table>
	<tr>
		<td align="center"><span> [共有记录${page.totalCount }条 /
				共分${page.totalPage }页,当前是第${page.page }页]</span></td>
	</tr>
	<ul class="pagers">
		<li align="center"><c:choose>
				<c:when test="${page.page==1 }">
					<a href="#" title="首页">首页</a>&nbsp;&nbsp;
                    <a href="#" title="上一页">上一页</a>&nbsp;&nbsp;
           </c:when>
				<c:otherwise>
					<a href="#" onclick="turnPage(1);" title="首页">首页</a>&nbsp;&nbsp;
                    <a href="#" onclick="turnPage(${page.page - 1 });"
						title="上一页">上一页</a>&nbsp;&nbsp;
           </c:otherwise>
			</c:choose> <c:choose>
				<c:when test="${page.page==page.totalPage }">
					<a href="#" title="首页">下一页</a>&nbsp;&nbsp;
                    <a href="#" title="上一页">尾页</a>&nbsp;&nbsp;
           </c:when>
				<c:otherwise>
					<a href="#" onclick="turnPage(${page.page + 1 });" title="下一页">下一页</a>&nbsp;&nbsp;
                    <a href="#" onclick="turnPage(${page.totalPage });"
						title="尾页">尾页</a>&nbsp;&nbsp;
           </c:otherwise>
			</c:choose></li>
	</ul>
</table>


