package com.practice.web.command.pages;

import com.practice.service.Service;
import com.practice.web.command.Command;
import com.practice.web.page.Page;

import javax.servlet.http.HttpServletRequest;

import static com.practice.constant.PageConstants.HOME_PAGE;

public class HomeCommand implements Command {
    private static final Service service = new Service();

    @Override
    public Page perform(HttpServletRequest request) {
        request.setAttribute("destinations", service.getDestinations());
        request.setAttribute("last_minute_one", service.getLastMinuteOne());
        request.setAttribute("last_minute_two", service.getLastMinuteTwo());
        return new Page(HOME_PAGE);
    }
}
