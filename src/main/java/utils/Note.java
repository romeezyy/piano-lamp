package utils;

import java.util.List;

public class Note {
    private final List<String> keys;
    private final long holdDuration;
    private final List<Object> subNotes;

    public Note(String key, long holdDuration) {
        this.keys = List.of(key);
        this.holdDuration = holdDuration;
        this.subNotes = null;
    }

    public Note(String key, long holdDuration, List<Object> subNotes) {
        this.keys = List.of(key);
        this.holdDuration = holdDuration;
        this.subNotes = subNotes;
    }

    public Note(List<String> keys, long holdDuration) {
        this.keys = keys;
        this.holdDuration = holdDuration;
        this.subNotes = null;
    }

    public Note(List<String> keys, long holdDuration, List<Object> subNotes) {
        this.keys = keys;
        this.holdDuration = holdDuration;
        this.subNotes = subNotes;
    }

    public List<String> getKeys() {
        return keys;
    }

    public long getHoldDuration() {
        return holdDuration;
    }

    public List<Object> getSubNotes() {
        return subNotes;
    }
}
