package org.ddr.controller;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ddr.model.People;
import org.ddr.model.ResponseData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author Draco
 * @since 2018/7/5
 */
@Api(tags = "Test", description = "Test")
@RestController
public class TestController {
    @ApiIgnore
    @GetMapping("/")
    public void swagger(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 访问根路径自动跳转到API文档页面
        String contextPath = request.getContextPath();
        response.sendRedirect(String.format("%s%sswagger-ui.html", contextPath, contextPath.endsWith("/") ? "" : "/"));
    }

    @ApiOperation(value = "Get people group by city")
    @GetMapping("/test")
    public ResponseData<Map<String, List<People>>> testMap() {
        return ResponseData.success(Collections.singletonMap("New York", Collections.singletonList(new People("John Doe", 20, "New York"))));
    }
}
