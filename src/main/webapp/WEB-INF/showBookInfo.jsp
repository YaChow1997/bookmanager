<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Yangchow
  Date: 2021-03-08
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style type="text/css">
    table{
        width: 100%;
        text-align: center;
        border: black 1px solid;
    }
    table td{
        border: black 1px solid;
    }
    span{
        color: red;
    }
    h2{
        text-align: center;
    }
</style>
<body>
<div class="wrap">
    <h2>图书借阅系统</h2>
    <form action="/book/getAllByCondition" method="post">
    <p>图书分类：<select name="book_type">
        <option value="0">--请选择--</option>
        <c:forEach items="${types}" var="type">
            <option value="${type.id}" <c:if test="${book_type==type.id}" >selected</c:if>>${type.type_name}</option>
        </c:forEach>
    </select>
    图书名称：<input type="text" name="book_name" value="${book_name}"/>
    是否借阅：<select name="is_borrow">
            <option value="">-请选择-</option>
            <option value="0" <c:if test="${is_borrow=='0'}" >selected</c:if>>未借阅</option>
            <option value="1" <c:if test="${is_borrow=='1'}" >selected</c:if>>已借阅</option>
        </select>
        <input type="submit" value="查询">
    </p>
        <p>当前用户：${sessionScope.USERNAME}
        <a href="/user/logout">退出</a></p>
    </form>
    <table>
        <tr>
            <td>图书编号</td>
            <td>图书分类</td>
            <td>图书名称</td>
            <td>作者</td>
            <td>出版社</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${books}" var="book">
            <tr>
                <td>${book.book_code}</td>
                <td>${book.type_name}</td>
                <td>${book.book_name}</td>
                <td>${book.book_author}</td>
                <td>${book.publish_press}</td>
                <td>
                    <c:if test="${book.is_borrow=='1'}">
                        <span>已借阅</span>
                    </c:if>
                    <c:if test="${book.is_borrow=='0'}">
                        <a href="/book/updBook?book_id=${book.book_id}">申请借阅</a>
                    </c:if>
                </td>
            </tr>
        </c:forEach>
    </table>
    <p>
        <a href="/book/getAllByCondition?pageNum=${pageInfo.prePage}&book_type=${book_type}&book_name=${book_name}&is_borrow=${is_borrow}">上一页</a>
        <c:forEach items="${pageInfo.navigatepageNums}" var="num">
            <a href="/book/getAllByCondition?pageNum=${num}&book_type=${book_type}&book_name=${book_name}&is_borrow=${is_borrow}">${num}</a>
        </c:forEach>
        <a href="/book/getAllByCondition?pageNum=${pageInfo.nextPage}&book_type=${book_type}&book_name=${book_name}&is_borrow=${is_borrow}">下一页</a>
        共${pageInfo.pages}页
        到第<input type="text" id="myPage"/>页
        <input id="confirmBtn" type="button" value="确定" />
    </p>
</div>
<script type="text/javascript" src="/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript">
    $(function(){
        $("#confirmBtn").click(function () {
            var pageNum = $("#myPage").val();
            var book_type = $("select[name='book_type']").val();
            var is_borrow = $("select[name='is_borrow']").val();
            var book_name = $("select[name='book_name']").val();
            var str = "/book/getAllByCondition?pageNum="+pageNum;
            if(book_type!=null && book_type!=0){
                str+="&book_type="+book_type;
            }
            if(book_name!=null&&book_name!=""){
                str+="&book_name="+book_name;
            }
            if(is_borrow!=null&&is_borrow!=""){
                str+="&is_borrow="+is_borrow;
            }
            console.debug("pageNum:"+pageNum+"book_type:"+book_type+"id_borrow:"+is_borrow+"book_name:"+book_name)
            window.location = str;
        })
    })
</script>
</body>
</html>
