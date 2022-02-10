# Contributing

PR's welcome:

https://github.com/trycourier/courier-java

# Testing

## Code Style/Formatting

## Releasing New Versions

a. Update the version in pom.xml and Courier.java (used to set User-Agent)

b. Prepare the tag

```bash
git tag -a v<VERSION> -m v<VERSION>
git push origin v<VERSION>
```

c. Perform the Release

1. Go to https://oss.sonatype.org/ (Nexus Repository Mangager) and login.
2. Find the artifact in staging area.
3. Hit Close and once the checks pass, Hit Release.
