package com.practice.web.command.common;

import com.practice.web.command.Command;
import com.practice.web.page.Page;

import javax.servlet.http.HttpServletRequest;

import static com.practice.constant.PageConstants.NOT_FOUND_PAGE;

public class NotFoundCommand implements Command {
    @Override
    public Page perform(HttpServletRequest request) {
        return new Page(NOT_FOUND_PAGE);
    }
}
