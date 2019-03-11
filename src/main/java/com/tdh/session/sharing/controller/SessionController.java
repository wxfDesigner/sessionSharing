package com.tdh.session.sharing.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @ClassName: SessionController
 * @Description: (session管理Controller)
 * @author wxf
 * @date 2019年2月27日 下午5:54:11
 *
 */
@RestController
@RequestMapping(value = "/session")
public class SessionController {

	@RequestMapping(value = "/first", method = RequestMethod.GET)
	public Map<String, Object> firstResp(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		request.getSession().setAttribute("request Url", request.getRequestURL());
		map.put("request Url", request.getRequestURL());
		return map;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public Object sessions(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("sessionId", request.getSession().getId());
		map.put("message", request.getSession().getAttribute("map"));
		return map;
	}

}
