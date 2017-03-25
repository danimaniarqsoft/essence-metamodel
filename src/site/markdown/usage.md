## Velocity treats double hashes as comments, which messes with markdown files. So $H can be used instead.
#set( $H = '#' )

Usage
-----

Add the plugin to your pom:

    <build>
        <plugins>
            <plugin>
                <groupId>${project.groupId}</groupId>
                <artifactId>${project.artifactId}</artifactId>
                <version>${project.version}</version>
                <configuration>
                    <releaseGoals>
                        <releaseGoal>deploy</releaseGoal>
                    </releaseGoals>
                </configuration>
            </plugin>
        </plugins>
    </build>

And then call the plugin:

	mvn releaser:release

You can also optionally supply your own build numbers if you do not want an automatically incrementing number:

    mvn releaser:release -DbuildNumber=1234

Running a partial release
-------------------------

It is possible to release a single module (and any modules it depends on) by using the `modulesToRelease` parameter.
For example:

	mvn releaser:release -DmodulesToRelease=MyApp

In this case the `MyApp` module will be built, released and tagged. If MyApp depends on another module, than that module will
also be built and released (but there will be no Git tag for this).

Note that this is not generally required as the plugin will only deploy changed modules by default anyway.

Forcing a release
-----------------
It is possible to force the release of one or more specified modules, for example if the changes have not been picked up due to some issue.
To do this, use the `forceRelease` parameter. For example:

	mvn releaser:release -DforceRelease=MyApp

In this case the `MyApp` module will be built, even if there where no changes found.

Specify custom global/user Maven settings for release build
-----------------------------------------------------------

Sometimes it's necessary to specify custom Maven settings for the release build. This can be done with the following
standard maven command line parameters:

	mvn releaser:release -s /path/to/custom/user/settings.xml -gs /path/to/custom/global/settings.xml

SSH authentication
------------------
Currently, only public key authentication is supported. By default, the plugin reads the private key from `~/.ssh/id_rsa`. 
If it's required to use a private key file from another location, you have two opportunities to achieve this:

$H$H$H Add server section to your Maven settings

This is the preferred way. Firstly, add a server section to your Maven settings 
like this (see <https://maven.apache.org/settings.html#Servers> for further information):

	<settings>
		<servers>
			<server>
				<id>my-server</id>
				<privateKey>/path/to/your/private_key</privateKey>
				<passphrase>optional_passphrase</passphrase> <!-- This is optional -->
			</server>
		</servers>
	</settings>
	
If your key is password protected, specify the password within element **passphrase**. Tip: do _not confuse_ this with element **password**.

Secondly, specify the `serverId` in the plugin configuration
	
	<plugin>
		...
		<configuration>
			<serverId>my-server</serverId>
		</configuration>
	</plugin>	


$H$H$H Specify private key and optional passphrase in your POM

This is the insecure way to specify your custom private key. Add following properties to your plugin configuration:

	<plugin>
		...
		<configuration>
			<privateKey>/path/to/your/private_key</privateKey>
			<passphrase>optional_passphrase</passphrase> <!-- This is optional -->
		</configuration>
	</plugin>

Note: POM configuration has precedence over Maven settings.
	
Custom known_hosts
------------------
Per default, the plugin uses `~/.ssh/known_hosts`. You can override this with following property in
your plugin configuration:

	<plugin>
		...
		<configuration>
			<knownHosts>/path/to/your/known_hosts</knownHosts>
		</configuration>
	</plugin>

Note: Maven settings related to `known_hosts` will _not_ be considered by the plugin.