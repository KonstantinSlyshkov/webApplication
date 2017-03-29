<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<style>
	.hidden {
		display: none;
	}
</style>
<stripes:form id="allOrdersForm" beanclass="stripes.controller.OrdersAction" class="hidden">
	<c:if test="${orders!=null}">
	<table class="ordersTable">
		<tr>
			<td>Customer:</td>
			<td>Employee:</td>
			<td>Order Date:</td>
			<td>Shipped Date:</td>
			<td>Ship Address:</td>
		</tr>
		<tr>
			<c:forEach var="order" items="${orders}">
				<td>
					<stripes:text id="customerData" name="order.customer.contactTitle" readonly="true"/>
				</td>
				<td>
					<stripes:text id="emplyeeData" name="order.employee.title" readonly="true"/>
				</td>
				<td>
					<stripes:text id="orderDate" name="order.orderDate" readonly="true"/>
				</td>
				<td>
					<stripes:text id="shippedDate" name="order.shippedDate" readonly="true"/>
				</td>
				<td>
					<stripes:text id="shipAdress" name="order.shipAddress" readonly="true"/>
				</td>
			</c:forEach>
		</tr>
	</table>
	</c:if>
</stripes:form>