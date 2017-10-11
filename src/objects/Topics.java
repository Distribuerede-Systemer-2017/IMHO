package objects;

public class Topics {

    private int idTopic;
    private String topicName;

    public Topics(int idTopic, String topicName) {
        this.idTopic = idTopic;
        this.topicName = topicName;
    }

    public int getIdTopic() {
        return idTopic;
    }

    public void setIdTopic(int idTopic) {
        this.idTopic = idTopic;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }
}
