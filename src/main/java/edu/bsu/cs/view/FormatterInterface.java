package edu.bsu.cs.view;

import edu.bsu.cs.model.Revision;

import java.io.IOException;

public interface FormatterInterface {
    String format(Revision revision) throws IOException;
}
