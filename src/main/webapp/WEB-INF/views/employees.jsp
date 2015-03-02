<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>React</title>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/react/0.12.2/react.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/react/0.12.2/JSXTransformer.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <script src="<c:url value="/resources/js/employee.js" />"></script>
</head>

<body>
    <h2>All Employees</h2>
    <div id="content"></div>
    <script type="text/jsx">
        var CommentBox = React.createClass({displayName: 'CommentBox',
            render: function() {
                return (
                        React.createElement('div', {className: "commentBox"},
                                "Hello, world! I am a CommentBox."
                        )
                );
            }
        });
        React.render(
                React.createElement(CommentBox, null),
                document.getElementById('content')
        );
    </script>

    <table border="1">
        <tr>
            <th>Employee Id</th>
            <th>Employee First Name</th>
            <th>Employee Last Name</th>
        </tr>
        <c:forEach items="${employees}" var="employee">
            <tr>
                <td>${employee.id}</td>
                <td>${employee.firstName}</td>
                <td>${employee.lastName}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
