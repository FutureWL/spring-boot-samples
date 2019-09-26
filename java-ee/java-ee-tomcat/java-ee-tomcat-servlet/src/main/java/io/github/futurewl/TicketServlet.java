package io.github.futurewl;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;

@WebServlet(
        name = "tickerServlet",
        urlPatterns = {"/tickeets"},
        loadOnStartup = 1)
@MultipartConfig(
        fileSizeThreshold = 5_242_880,
        maxFileSize = 20_971_520L,
        maxRequestSize = 41_943_040L)
public class TicketServlet extends HttpServlet {

    private volatile int TICKET_ID_SEQUENCE = 1;

    private Map<Integer, Ticket> ticketDatabase = new LinkedHashMap<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    private void createTicket(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Ticket ticket = new Ticket();
        ticket.setCustomerName(request.getParameter("customerName"));
        ticket.setSubject(request.getParameter("subject"));
        ticket.setBody(request.getParameter("body"));

        Part filePart = request.getPart("file1");
        if (filePart != null) {
            Attachment attachment = this.processAttachment(filePart);
            if (attachment != null) {
                ticket.addAttachment(attachment);
            }
            int id;
            synchronized (this) {
                id = this.TICKET_ID_SEQUENCE++;
                this.ticketDatabase.put(id, ticket);
            }
            response.sendRedirect("tickets?action=view&ticketId=" + id);
        }
    }

    private Attachment processAttachment(Part filePart) throws IOException {
        InputStream inputStream = filePart.getInputStream();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        int read;
        final byte[] bytes = new byte[1024];
        while ((read = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, read);
        }
        Attachment attachment = new Attachment();
        attachment.setName(filePart.getSubmittedFileName());
        attachment.setContents(outputStream.toByteArray());
        return attachment;
    }


}
