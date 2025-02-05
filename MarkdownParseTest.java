import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    
    @Test
    public void testGetLinksSnippets1() throws IOException {
        Path filename = Path.of("snippet-1.md");
        String contents = Files.readString(filename);
        assertEquals(List.of("`google.com", "google.com","ucsd.edu"),
        MarkdownParse.getLinks(contents));
    }

    @Test
    public void testGetLinksSnippets2() throws IOException {
        Path filename = Path.of("snippet-2.md");
        String contents = Files.readString(filename);
        assertEquals(List.of("a.com", "a.com(())", "example.com"),
            MarkdownParse.getLinks(contents));
    }

    @Test
    public void testGetLinksSnippets3() throws IOException {
        Path filename = Path.of("snippet-3.md");
        String contents = Files.readString(filename);
        assertEquals(List.of("https://www.twitter.com", 
        "https://ucsd-cse15l-w22.github.io/", "https://cse.ucsd.edu/"),
        MarkdownParse.getLinks(contents));
    }








        /*
    @Test
    public void testGetLinks() throws IOException {
        Path filename = Path.of("test-file2.md");
        String contents = Files.readString(filename);

        filename = Path.of("test-file.md");
        contents = Files.readString(filename);
        assertEquals(MarkdownParse.getLinks(contents), 
        List.of("https://something.com", "some-page.html", "hello"));

        filename = Path.of("test-file3.md");
        contents = Files.readString(filename);
        assertEquals(MarkdownParse.getLinks(contents), List.of());

        filename = Path.of("test-file4.md");
        contents = Files.readString(filename);
        assertEquals(MarkdownParse.getLinks(contents), List.of("a link on the first line"));

        
        filename = Path.of("test-file7.md");
        contents = Files.readString(filename);
        assertEquals(MarkdownParse.getLinks(contents), List.of());
        
        
        filename = Path.of("test-file8.md");
        contents = Files.readString(filename);
        assertEquals(MarkdownParse.getLinks(contents), List.of("a link on the first line"));

        */
    }

    /*
    @Test
    public void testGetLinks() {
        boolean exceptionThrown = false;
        Path filename = Path.of("test-file2.md");
        String contents;
        try {
            contents = Files.readString(filename);
        } catch (IOException e) {
            exceptionThrown = true;
        }
        assertEquals(false, exceptionThrown);
    }
    */
