package com.joantolos.tenda;

import java.util.Date;

public class Interest {

    private final Component component;
    private final Date startDate;
    private Date endDate;

    public Interest(Component component, Date startDate, Date endDate) {
        this.component = component;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Component getComponent() {
        return component;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date date) {
        this.endDate = date;
    }
}
