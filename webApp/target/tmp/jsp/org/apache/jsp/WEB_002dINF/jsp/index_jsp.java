package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_stripes_form_id_beanclass;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_stripes_text_readonly_name_id_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_stripes_form_id_beanclass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_stripes_text_readonly_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_stripes_form_id_beanclass.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_stripes_text_readonly_name_id_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head><title></title></head>\n");
      out.write("<body>\n");
      if (_jspx_meth_stripes_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_stripes_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:form
    net.sourceforge.stripes.tag.FormTag _jspx_th_stripes_form_0 = (net.sourceforge.stripes.tag.FormTag) _jspx_tagPool_stripes_form_id_beanclass.get(net.sourceforge.stripes.tag.FormTag.class);
    _jspx_th_stripes_form_0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_form_0.setParent(null);
    _jspx_th_stripes_form_0.setId("allOrdersForm");
    _jspx_th_stripes_form_0.setBeanclass(new String("stripes.controller.OrdersAction"));
    int[] _jspx_push_body_count_stripes_form_0 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_form_0 = _jspx_th_stripes_form_0.doStartTag();
      if (_jspx_eval_stripes_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_stripes_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_stripes_form_0[0]++;
          _jspx_th_stripes_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_stripes_form_0.doInitBody();
        }
        do {
          out.write('\n');
          out.write('	');
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_stripes_form_0, _jspx_page_context, _jspx_push_body_count_stripes_form_0))
            return true;
          out.write('\n');
          int evalDoAfterBody = _jspx_th_stripes_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_stripes_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_stripes_form_0[0]--;
      }
      if (_jspx_th_stripes_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_form_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_form_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_form_0.doFinally();
      _jspx_tagPool_stripes_form_id_beanclass.reuse(_jspx_th_stripes_form_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_form_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orders!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t<table class=\"ordersTable\">\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td>Customer:</td>\n");
        out.write("\t\t\t<td>Employee:</td>\n");
        out.write("\t\t\t<td>Order Date:</td>\n");
        out.write("\t\t\t<td>Shipped Date:</td>\n");
        out.write("\t\t\t<td>Ship Address:</td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context, _jspx_push_body_count_stripes_form_0))
          return true;
        out.write("\n");
        out.write("\t\t</tr>\n");
        out.write("\t</table>\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_0.setVar("order");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orders}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_stripes_text_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_stripes_text_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_stripes_text_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_stripes_text_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_stripes_text_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_stripes_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:text
    net.sourceforge.stripes.tag.InputTextTag _jspx_th_stripes_text_0 = (net.sourceforge.stripes.tag.InputTextTag) _jspx_tagPool_stripes_text_readonly_name_id_nobody.get(net.sourceforge.stripes.tag.InputTextTag.class);
    _jspx_th_stripes_text_0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_stripes_text_0.setId("customerData");
    _jspx_th_stripes_text_0.setName("order.customer.contactTitle");
    _jspx_th_stripes_text_0.setReadonly("true");
    int[] _jspx_push_body_count_stripes_text_0 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_text_0 = _jspx_th_stripes_text_0.doStartTag();
      if (_jspx_th_stripes_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_text_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_text_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_text_0.doFinally();
      _jspx_tagPool_stripes_text_readonly_name_id_nobody.reuse(_jspx_th_stripes_text_0);
    }
    return false;
  }

  private boolean _jspx_meth_stripes_text_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:text
    net.sourceforge.stripes.tag.InputTextTag _jspx_th_stripes_text_1 = (net.sourceforge.stripes.tag.InputTextTag) _jspx_tagPool_stripes_text_readonly_name_id_nobody.get(net.sourceforge.stripes.tag.InputTextTag.class);
    _jspx_th_stripes_text_1.setPageContext(_jspx_page_context);
    _jspx_th_stripes_text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_stripes_text_1.setId("emplyeeData");
    _jspx_th_stripes_text_1.setName("order.employee.title");
    _jspx_th_stripes_text_1.setReadonly("true");
    int[] _jspx_push_body_count_stripes_text_1 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_text_1 = _jspx_th_stripes_text_1.doStartTag();
      if (_jspx_th_stripes_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_text_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_text_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_text_1.doFinally();
      _jspx_tagPool_stripes_text_readonly_name_id_nobody.reuse(_jspx_th_stripes_text_1);
    }
    return false;
  }

  private boolean _jspx_meth_stripes_text_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:text
    net.sourceforge.stripes.tag.InputTextTag _jspx_th_stripes_text_2 = (net.sourceforge.stripes.tag.InputTextTag) _jspx_tagPool_stripes_text_readonly_name_id_nobody.get(net.sourceforge.stripes.tag.InputTextTag.class);
    _jspx_th_stripes_text_2.setPageContext(_jspx_page_context);
    _jspx_th_stripes_text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_stripes_text_2.setId("orderDate");
    _jspx_th_stripes_text_2.setName("order.orderDate");
    _jspx_th_stripes_text_2.setReadonly("true");
    int[] _jspx_push_body_count_stripes_text_2 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_text_2 = _jspx_th_stripes_text_2.doStartTag();
      if (_jspx_th_stripes_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_text_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_text_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_text_2.doFinally();
      _jspx_tagPool_stripes_text_readonly_name_id_nobody.reuse(_jspx_th_stripes_text_2);
    }
    return false;
  }

  private boolean _jspx_meth_stripes_text_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:text
    net.sourceforge.stripes.tag.InputTextTag _jspx_th_stripes_text_3 = (net.sourceforge.stripes.tag.InputTextTag) _jspx_tagPool_stripes_text_readonly_name_id_nobody.get(net.sourceforge.stripes.tag.InputTextTag.class);
    _jspx_th_stripes_text_3.setPageContext(_jspx_page_context);
    _jspx_th_stripes_text_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_stripes_text_3.setId("shippedDate");
    _jspx_th_stripes_text_3.setName("order.shippedDate");
    _jspx_th_stripes_text_3.setReadonly("true");
    int[] _jspx_push_body_count_stripes_text_3 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_text_3 = _jspx_th_stripes_text_3.doStartTag();
      if (_jspx_th_stripes_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_text_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_text_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_text_3.doFinally();
      _jspx_tagPool_stripes_text_readonly_name_id_nobody.reuse(_jspx_th_stripes_text_3);
    }
    return false;
  }

  private boolean _jspx_meth_stripes_text_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:text
    net.sourceforge.stripes.tag.InputTextTag _jspx_th_stripes_text_4 = (net.sourceforge.stripes.tag.InputTextTag) _jspx_tagPool_stripes_text_readonly_name_id_nobody.get(net.sourceforge.stripes.tag.InputTextTag.class);
    _jspx_th_stripes_text_4.setPageContext(_jspx_page_context);
    _jspx_th_stripes_text_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_stripes_text_4.setId("shipAdress");
    _jspx_th_stripes_text_4.setName("order.shipAddress");
    _jspx_th_stripes_text_4.setReadonly("true");
    int[] _jspx_push_body_count_stripes_text_4 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_text_4 = _jspx_th_stripes_text_4.doStartTag();
      if (_jspx_th_stripes_text_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_text_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_text_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_text_4.doFinally();
      _jspx_tagPool_stripes_text_readonly_name_id_nobody.reuse(_jspx_th_stripes_text_4);
    }
    return false;
  }
}