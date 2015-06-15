<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
<head><title></title></head>
<body>
<stripes:form beanclass="stripes.controller.OrdersAction" focus="">
		<tr>
			<c:forEach var="order" items="${actionBean.orders}">
				<td>
					Customer: <c:out value="${order.customer.contactTitle}"/>
				</td>
				<td>
					Employee: <c:out value="${order.employee.title}"/>
				</td>
				<td>
					Order Date:<c:out value="${order.orderDate}"/>
				</td>
				<td>
					Shipped Date:<c:out value="${order.shippedDate}"/>
				</td>
				<td>
					Ship Address:<c:out value="${order.shipAddress}"/>
				</td>
			</c:forEach>
		</tr>
</stripes:form>
</body>
</html>