package com.practice.web.command.common;

import com.practice.web.command.Command;
import com.practice.web.page.Page;

import javax.servlet.http.HttpServletRequest;

import static com.practice.constant.PageConstants.SERVLET_ERROR;

public class ServletErrorCommand implements Command {
    @Override
    public Page perform(HttpServletRequest request) {
        return new Page(SERVLET_ERROR);
    }
}
