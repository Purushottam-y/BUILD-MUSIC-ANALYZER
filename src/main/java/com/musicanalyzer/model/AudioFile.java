package com.musicanalyzer.model;

import java.io.File;
import java.util.List;

/**
 * Model class representing an audio file
 */
public class AudioFile {
    private String fileName;
    private String filePath;
    private long duration; // in milliseconds
    private int sampleRate;
    private int channels;
    private int bitRate;
    private List<MusicalNote> detectedNotes;
    private List<String> detectedInstruments;

    public AudioFile(String filePath) {
        File file = new File(filePath);
        this.filePath = filePath;
        this.fileName = file.getName();
    }

    // Getters and Setters
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public int getSampleRate() {
        return sampleRate;
    }

    public void setSampleRate(int sampleRate) {
        this.sampleRate = sampleRate;
    }

    public int getChannels() {
        return channels;
    }

    public void setChannels(int channels) {
        this.channels = channels;
    }

    public int getBitRate() {
        return bitRate;
    }

    public void setBitRate(int bitRate) {
        this.bitRate = bitRate;
    }

    public List<MusicalNote> getDetectedNotes() {
        return detectedNotes;
    }

    public void setDetectedNotes(List<MusicalNote> detectedNotes) {
        this.detectedNotes = detectedNotes;
    }

    public List<String> getDetectedInstruments() {
        return detectedInstruments;
    }

    public void setDetectedInstruments(List<String> detectedInstruments) {
        this.detectedInstruments = detectedInstruments;
    }

    @Override
    public String toString() {
        return fileName + " (" + formatDuration(duration) + ")";
    }

    private String formatDuration(long millis) {
        long seconds = millis / 1000;
        long minutes = seconds / 60;
        long secs = seconds % 60;
        return String.format("%02d:%02d", minutes, secs);
    }
}