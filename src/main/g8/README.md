## Scala.js - Vite project template

----------------

## Usage

This is a sbt project configured specifically for Scala.js and Vite.

### Starting dev server

First thing in order to run this project, is to install vite dependency. To do it run
$if(use_yarn.truthy)$
`yarn install`
$else$
`npm install`
$endif$
To start Scala.js - Vite developement server, you first need to start incremental compilation for code.
It is done by running `sbt ~fastLinkJS` directly from shell of just `~fastLinkJS` from SBT shell instance.
The next step is to start the server. To do it, run `yarn dev` or if you use npm `npm run dev` in your terminal.

### Adding new dependencies

To add new dependencies, do it with 
$if(use_yarn.truthy)$
`yarn add \${dependencyName}`
$else$
`npm install \${dependencyName}`
$endif$

