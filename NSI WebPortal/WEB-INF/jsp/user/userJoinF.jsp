<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" 		uri="http://java.sun.com/jsp/jstl/functions" %>  
<%@ taglib prefix="c" 		uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" 		uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="f" 		uri="http://www.springframework.org/tags/form" %> 
<%@ taglib prefix="sec" 	uri="http://www.springframework.org/security/tags" %>   
<script type="text/javascript">
	$(document).ready(
		function () {
			$("#headerFrm").find("#logOutDv").find("#loginBT").hide();
		}	
	);

	function confirm() {
		loadConfirm($("#confirmDv"));
	}
	
	function save() {
		if($("#userDTO").find("#idFlag").val() == "1") {
			$("#userDTO").attr("action", "${pageContext.request.contextPath}/user/proc/userJoinIP.do").attr("target", "_proc");
			disableConfirm();
			$("#userDTO").submit();
		} else {
			alert("<s:message code='com.netmng.text.join.msg1' />");
			disableConfirm();
		}
	}
	
	function indexView() {
		location.href="${pageContext.request.contextPath}/index.do";
	}
	
	function idCheck() {
		$("#popContent").find("#_popFrame").width(458);
		$("#popContent").find("#_popFrame").height(420);
		loadPop("${pageContext.request.contextPath}/user/pop/idCheck.do?id=" + encodeURIComponent($("#userDTO").find("#id").val()));
	}
</script>	

<!-- left_column -->
<div id="left_column">
	<!-- left_area  -->
	<div id="left_area">
		<ul class="left_menu">
			<li class="left_tit">
				<img src="${pageContext.request.contextPath}/images/${pageContext.response.locale.language}/member/left_title_menu.gif" alt="">
			</li>                                                                                                                                                  
			<li><a href="${pageContext.request.contextPath}/user/userJoinF.do" ><img src="${pageContext.request.contextPath}/images/${pageContext.response.locale.language}/member/left_menu_member.gif" name="Image23" width="167" height="22" border="0"></a></li>																																								                                                                                                      
		</ul>
	</div>
	<!-- //left_area  -->
</div>
<!-- //left_column -->

<!-- contents -->
<div id="content">	
	<div id="location">
    	<a href="#" class="loc">Home</a> 
        <img src="${pageContext.request.contextPath}/images/${pageContext.response.locale.language}/location.gif" width="3" height="10" align="bottom"> 
        <span class="now"><s:message code='com.netmng.menu.user.join' /></span>
    </div>
    <h2 id="request_h2"><img src="${pageContext.request.contextPath}/images/${pageContext.response.locale.language}/member/title_member.gif" alt=""></h2>
    
	<!-- member_form  -->
    <div id="member_form">
    	<h3><img src="${pageContext.request.contextPath}/images/${pageContext.response.locale.language}/member/member_txt.gif" alt=""></h3>
        <f:form name="userDTO" id="userDTO" action="${pageContext.request.contextPath}/user/proc/userJoinIP.do" modelAttribute="userDTO" method="POST">
    	<table summary="기본정보입력,필수입력" class="tb_member02 mt10" cellpadding="0">
        	<colgroup>
            	<col width="17%">
                <col width="*">
            </colgroup>
            <tbody>
           		<tr>
                	<th><s:message code='com.netmng.text.join.id' /></th>
                    <td class="last">
                    	<input type="hidden" id="idFlag" name="idFlag" value="0" />
	                    <s:bind path="userDTO.id"><f:input path="${status.expression}" title="아이디 입력" cssClass="ipBasic" cssStyle="width:140px;" /></s:bind>
	                    <a onFocus="this.blur()" onClick="idCheck();" class="ml10"><img src="${pageContext.request.contextPath}/images/${pageContext.response.locale.language}/member/btn_id_check.gif" alt="아이디 중복체크"></a>
                    </td>
                </tr>
                <tr>
                	<th><s:message code='com.netmng.text.join.name' /></th>
                    <td class="last"><s:bind path="userDTO.name"><f:input path="${status.expression}" cssStyle="width:140px;" /></s:bind></td>
                </tr>
                <tr>
                  	<th><s:message code='com.netmng.text.join.password' /></th>
                    <td class="last">
                 	  	<s:bind path="userDTO.pass"><f:password path="${status.expression}" cssClass="ipBasic" cssStyle="width:140px;" /></s:bind>
                    	<span class="tbIntxt">* <s:message code='com.netmng.text.join.msg4' /></span>
                    </td>
                </tr>
                <tr>
                	<th><s:message code='com.netmng.text.join.confirmPassword' /></th>
                    <td class="last">
                    	<s:bind path="userDTO.passConfirmed"><f:password path="${status.expression}" cssClass="ipBasic" cssStyle="width:140px;" /></s:bind>
                    </td>
                </tr>
                <tr>
                	<th><s:message code='com.netmng.text.join.organization' /></th>
                    	<td class="last"><s:bind path="userDTO.company"><f:input path="${status.expression}" cssStyle="width:180px;" /></s:bind></td>
                </tr>
                <tr>
                    <th class="bdmember vaTop"><s:message code='com.netmng.text.join.email' /></th>
                    <td class="last bdmember">
                        <s:bind path="userDTO.email"><f:input path="${status.expression}" cssStyle="width:180px;" /></s:bind>
                    </td>
                </tr>
           	</tbody>
        </table>
		</f:form>
        <div class="btn_area6">
			<div class="btn_14">
				<a href="${pageContext.request.contextPath}/"><img src="${pageContext.request.contextPath}/images/${pageContext.response.locale.language}/member/btn_cancel.gif" alt="취소"></a>
			</div>
            <div class="btn_15">
            	<a onClick="confirm();"><img src="${pageContext.request.contextPath}/images/${pageContext.response.locale.language}/member/btn_write.gif" alt="등록"></a>
            </div>
		</div>
    </div>
    <!-- //member_form  -->
    
	<!-- //contents -->
	<iframe id="_proc" name="_proc" frameborder="0" scrolling="no" width="0" height="0" ></iframe>
	<div id="confirmDv" style="display:none;">
		<div class="confirmPop" style="width:418px;height:148px; display:block" id="div_name">
			<form class="confirmform">
				<div class="confirm_member">
					<p><span><b><s:message code='com.netmng.text.join.msg5' /></b></span></p>
				</div>
				<div class="btn_area_con">
					<div class="btn_yes">
						<a onClick="save();"><img src="${pageContext.request.contextPath}/images/${pageContext.response.locale.language}/member/btn_yes.gif" alt="예"></a>
					</div>
					<div class="btn_no">
						<a onClick="disableConfirm();"><img src="${pageContext.request.contextPath}/images/${pageContext.response.locale.language}/member/btn_no.gif" alt="아니오"></a>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>