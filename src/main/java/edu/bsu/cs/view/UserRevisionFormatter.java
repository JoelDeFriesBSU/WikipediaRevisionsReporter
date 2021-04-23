package edu.bsu.cs.view;

import edu.bsu.cs.model.Revision;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserRevisionFormatter implements FormatterInterface {

    public String format(Revision revision) {
        String uglydatetime = DateTimeFormatter.ISO_INSTANT.format(revision.timestamp);
        String prettydatetime = uglydatetime
                .replace("T"," at time ")
                .replace("Z","");
        return String.format("At date %s, a change by %s",
                prettydatetime,
                revision.name);
    }

}
