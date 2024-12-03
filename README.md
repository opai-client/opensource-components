# Opai Client extensions open source components

The public client components of the Opai project. Allow you to make your own extensions.

Example implementation: [example-extension](https://github.com/opai-client/example-extension)

**Publish Your Extension on Opai Marketplace™**

Make your extension available for other players to download by publishing it on the [Opai Marketplace™](https://opai.today/marketplace.html). Please follow the steps below:

1. **Join this Organization**: [Join the organization](https://api.cubk.us/github/join).
2. **Create a Public Repository**: Within the organization, create a new public repository for your extension.
3. **Create a Release**: Navigate to your repository's releases section and create a new release.
4. **Upload Your Extension**: Add your extension's JAR file as an asset in the release.
5. **Add Repository Topic**: Include `opai-extension` in your repository's topics.
6. **Wait for Publication**: Allow up to 5 minutes for our server to automatically detect and publish your extension to the [Opai Marketplace™](https://opai.today/marketplace.html).

### Recommend
- **Develop Directly in the Repository**: Push your code to the repository for continuous development and version control.
- **Add a README.md File**: Create a `README.md` file in your repository. Its content will be displayed on the Marketplace to provide users with important details about your extension, such as features, screenshot, and usage examples.
- **Collaborate with Others**: Invite other users in the organization to contribute to your repository.

## Loading an extension

- Put the extension jar into the `%APPDATA%\Opai\extensions` folder
- Re-launch client

## How to create workspace.

- Fork/clone [template workspace](https://github.com/opai-client/example-extension)
- Import to your IDE, sync maven dependencies.

## Features

- Client module, command, widget.
- Player
- Other Entity
- World Client
- Packet Control

## Directly Dependence

You can use the following maven dependencies directly, no need to export to the final jar (included in the client)

```pom
<dependency>
    <groupId>io.netty</groupId>
    <artifactId>netty-all</artifactId>
    <version>4.0.23.Final</version>
</dependency>
<dependency>
    <groupId>com.mojang</groupId>
    <artifactId>patchy</artifactId>
    <version>1.7.7</version>
</dependency>
<dependency>
    <groupId>net.sf.jopt-simple</groupId>
    <artifactId>jopt-simple</artifactId>
    <version>4.6</version>
</dependency>
<dependency>
    <groupId>org.lwjgl</groupId>
    <artifactId>lwjgl</artifactId>
    <version>2.9.4-nightly</version>
</dependency>
<dependency>
    <groupId>org.lwjgl</groupId>
    <artifactId>util</artifactId>
    <version>2.9.4-nightly</version>
</dependency>
<dependency>
    <groupId>net.java.jinput</groupId>
    <artifactId>jinput</artifactId>
    <version>2.0.5</version>
</dependency>
<dependency>
    <groupId>com.mojang</groupId>
    <artifactId>icu4j-core-mojang</artifactId>
    <version>51.2</version>
</dependency>
<dependency>
    <groupId>org.apache.httpcomponents</groupId>
    <artifactId>httpclient</artifactId>
    <version>4.3.3</version>
</dependency>
<dependency>
    <groupId>org.apache.httpcomponents</groupId>
    <artifactId>httpcore</artifactId>
    <version>4.3.2</version>
</dependency>
<dependency>
    <groupId>oshi</groupId>
    <artifactId>oshi-core</artifactId>
    <version>1.1</version>
</dependency>
<dependency>
    <groupId>net.java.dev.jna</groupId>
    <artifactId>jna</artifactId>
    <version>5.10.0</version>
</dependency>
<dependency>
    <groupId>net.java.dev.jna</groupId>
    <artifactId>jna-platform</artifactId>
    <version>5.10.0</version>
</dependency>
<dependency>
    <groupId>net.java.jutils</groupId>
    <artifactId>jutils</artifactId>
    <version>1.0.0</version>
</dependency>
<dependency>
    <groupId>commons-logging</groupId>
    <artifactId>commons-logging</artifactId>
    <version>1.1.3</version>
</dependency>
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-compress</artifactId>
    <version>1.8.1</version>
</dependency>
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-api</artifactId>
    <version>2.0-beta9</version>
</dependency>
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-core</artifactId>
    <version>2.0-beta9</version>
</dependency>
<dependency>
    <groupId>tv.twitch</groupId>
    <artifactId>twitch</artifactId>
    <version>6.5</version>
</dependency>
<dependency>
    <groupId>com.google.guava</groupId>
    <artifactId>guava</artifactId>
    <version>17.0</version>
</dependency>
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-lang3</artifactId>
    <version>3.3.2</version>
</dependency>
<dependency>
    <groupId>commons-io</groupId>
    <artifactId>commons-io</artifactId>
    <version>2.4</version>
</dependency>
<dependency>
    <groupId>commons-codec</groupId>
    <artifactId>commons-codec</artifactId>
    <version>1.9</version>
</dependency>
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.2.4</version>
</dependency>
```

## Contributing

We currently do not accept contributions. But if you have any ideas/issue, please open an issue were happy to discuss
it.
