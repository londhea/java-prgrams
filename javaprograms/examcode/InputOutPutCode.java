//package com.techjivaa.fhirR4JsonConverter.javaprograms.examcode;
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.util.List;
//
//class Comment {
//    @JsonProperty("@id")
//    private String id;
//
//    private String content;
//
//    private ReplyTo replyTo;
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public ReplyTo getReplyTo() {
//        return replyTo;
//    }
//
//    public void setReplyTo(ReplyTo replyTo) {
//        this.replyTo = replyTo;
//    }
//}
//
//class ReplyTo {
//    @JsonProperty("@id")
//    private String id;
//
//    private String content;
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//}
//
//class CommentsWrapper {
//    private List<Comment> input;
//
//    public List<Comment> getInput() {
//        return input;
//    }
//
//    public void setInput(List<Comment> input) {
//        this.input = input;
//    }
//}
//
//public class InputOutPutCode {
//
//    public static void main(String[] args) throws JsonProcessingException {
//
//        String jsonString = "{\"input\": [{\"@id\": \"/api/3/comments/016b9ec6-8fe4-4cc8-92d8-4e67f2496356\",\"content\": \"Test\",\"replyTo\": null},{\"@id\": \"/api/3/comments/d779536d-5295-4c82-adfb-521972399a22\",\"content\": \"Ok\",\"replyTo\": null},{\"@id\": \"/api/3/comments/d779536d-5295-4c82-adfb-521972399a23\",\"content\": \"Postman post\",\"replyTo\": null},{\"@id\": \"/api/3/comments/0bf83bdf-c71c-4cea-a542-1c952b03b0f3\",\"content\": \"Application eighth Post\",\"replyTo\": null},{\"@id\": \"/api/3/comments/1505fd76-99be-4ffe-9aaa-e4e513cd8d91\",\"content\": \"eightth post reply\",\"replyTo\": {\"@id\": \"/api/3/comments/0bf83bdf-c71c-4cea-a542-1c952b03b0f3\",\"content\": \"Application eighth Post\"}},{\"@id\": \"/api/3/comments/1505fd76-99be-4ffe-9aaa-e4e513cd8d92\",\"content\": \"eightth post reply 2\",\"replyTo\": {\"@id\": \"/api/3/comments/0bf83bdf-c71c-4cea-a542-1c952b03b0f3\",\"content\": \"Application eighth Post\"}},{\"@id\": \"/api/3/comments/6cb63f24-60a6-44a1-b8b3-a2ff54da3dd4\",\"content\": \"eighth Post Reply 3\",\"replyTo\": {\"@id\": \"/api/3/comments/0bf83bdf-c71c-4cea-a542-1c952b03b0f3\",\"content\": \"Application eighth Post\"}}]}";
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        CommentsWrapper commentsWrapper = objectMapper.readValue(jsonString, CommentsWrapper.class);
//
//        for (Comment comment : commentsWrapper.getInput()) {
//            System.out.println("Comment ID: " + comment.getId());
//            System.out.println("Content: " + comment.getContent());
//            if (comment.getReplyTo() != null) {
//                System.out.println("Reply To ID: " + comment.getReplyTo().getId());
//                System.out.println("Reply To Content: " + comment.getReplyTo().getContent());
//            } else {
//                System.out.println("No reply");
//            }
//            System.out.println();
//        }
//
//    }
//}
