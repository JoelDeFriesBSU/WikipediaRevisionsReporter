package edu.bsu.cs.view;

import edu.bsu.cs.model.Revision;

import java.time.format.DateTimeFormatter;

public class UserRevisionFormatter implements FormatterInterface {

    public String format(Revision revision) {
        String uglydatetime = DateTimeFormatter.ISO_INSTANT.format(revision.timestamp);

        return String.format("(USER TEST) At %s, a change by %s",
                uglydatetime,
                revision.name);
    }

}
