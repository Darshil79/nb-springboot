package com.github.alexfalappa.nbspringboot.projects.initializr;

public class ProjectRequest {
    private String bootVersion;
    private String mvnGroup;
    private String mvnArtifact;
    private String mvnVersion;
    private String mvnName;
    private String mvnDesc;
    private String packaging;
    private String pkg;
    private String lang;
    private String javaVersion;
    private String deps;

    public ProjectRequest(String bootVersion, String mvnGroup, String mvnArtifact, String mvnVersion,
                          String mvnName, String mvnDesc, String packaging, String pkg,
                          String lang, String javaVersion, String deps) {
        this.bootVersion = bootVersion;
        this.mvnGroup = mvnGroup;
        this.mvnArtifact = mvnArtifact;
        this.mvnVersion = mvnVersion;
        this.mvnName = mvnName;
        this.mvnDesc = mvnDesc;
        this.packaging = packaging;
        this.pkg = pkg;
        this.lang = lang;
        this.javaVersion = javaVersion;
        this.deps = deps;
    }

    // Getters
    public String getBootVersion() { return bootVersion; }
    public String getMvnGroup() { return mvnGroup; }
    public String getMvnArtifact() { return mvnArtifact; }
    public String getMvnVersion() { return mvnVersion; }
    public String getMvnName() { return mvnName; }
    public String getMvnDesc() { return mvnDesc; }
    public String getPackaging() { return packaging; }
    public String getPkg() { return pkg; }
    public String getLang() { return lang; }
    public String getJavaVersion() { return javaVersion; }
    public String getDeps() { return deps; }
}
