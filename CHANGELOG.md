# Changelog

## 4.8.0 (2026-01-27)

Full Changelog: [v4.7.1...v4.8.0](https://github.com/trycourier/courier-java/compare/v4.7.1...v4.8.0)

### Features

* **client:** send `X-Stainless-Kotlin-Version` header ([11e5765](https://github.com/trycourier/courier-java/commit/11e5765a138fa78d8aaf0abc3df4dffd1493d3b4))


### Bug Fixes

* **client:** disallow coercion from float to int ([5263a13](https://github.com/trycourier/courier-java/commit/5263a1385622f70224b69681b7f75661d89107ef))
* **client:** fully respect max retries ([33cdc16](https://github.com/trycourier/courier-java/commit/33cdc16ed453f885b62c996480751a45035e0afd))
* **client:** preserve time zone in lenient date-time parsing ([07887c9](https://github.com/trycourier/courier-java/commit/07887c919084244ae3805068e13aa7c7a6604aec))
* **client:** send retry count header for max retries 0 ([33cdc16](https://github.com/trycourier/courier-java/commit/33cdc16ed453f885b62c996480751a45035e0afd))
* date time deserialization leniency ([fa50329](https://github.com/trycourier/courier-java/commit/fa50329d5f5e1cd2c555d5deb71b4dd4d8a57c4a))


### Chores

* **ci:** upgrade `actions/github-script` ([b428743](https://github.com/trycourier/courier-java/commit/b428743ceed1201f44ca1ae23ddae0c10a323a86))
* **ci:** upgrade `actions/setup-java` ([01049af](https://github.com/trycourier/courier-java/commit/01049af97f49ca7d1ad74d09017838263e24735f))
* **internal:** clean up maven repo artifact script and add html documentation to repo root ([e1937ab](https://github.com/trycourier/courier-java/commit/e1937aba76551a3e486cb8961c3f1e0981d9a57f))
* **internal:** correct cache invalidation for `SKIP_MOCK_TESTS` ([3bc2faa](https://github.com/trycourier/courier-java/commit/3bc2faa7b3d346e8c4466a58039947f2cebe04ca))
* **internal:** depend on packages directly in example ([33cdc16](https://github.com/trycourier/courier-java/commit/33cdc16ed453f885b62c996480751a45035e0afd))
* **internal:** improve maven repo docs ([af0c83b](https://github.com/trycourier/courier-java/commit/af0c83b582d3d26589a0f1176405a365df1e26b5))
* **internal:** update `actions/checkout` version ([337fcd7](https://github.com/trycourier/courier-java/commit/337fcd7a6f5f7d5747ab6f48e74287e58d18eca0))
* **internal:** update maven repo doc to include authentication ([dbf1829](https://github.com/trycourier/courier-java/commit/dbf182983acea01de5784fe9df85f1d43482de5a))
* test on Jackson 2.14.0 to avoid encountering FasterXML/jackson-databind[#3240](https://github.com/trycourier/courier-java/issues/3240) in tests ([fa50329](https://github.com/trycourier/courier-java/commit/fa50329d5f5e1cd2c555d5deb71b4dd4d8a57c4a))


### Documentation

* add comment for arbitrary value fields ([20bc1ec](https://github.com/trycourier/courier-java/commit/20bc1ecfa8818a7f6eb6669352d74306b308cf21))
* clarify version field description in AutomationTemplate ([d853521](https://github.com/trycourier/courier-java/commit/d8535218c37e9315c2bbe6b5161caaa2d66fb603))

## 4.7.1 (2026-01-14)

Full Changelog: [v4.7.0...v4.7.1](https://github.com/trycourier/courier-java/compare/v4.7.0...v4.7.1)

### Chores

* **internal:** regenerate SDK with no functional changes ([227578d](https://github.com/trycourier/courier-java/commit/227578dc96d7114cd01e4cac20567f46008364ec))
* **internal:** regenerate SDK with no functional changes ([49599e7](https://github.com/trycourier/courier-java/commit/49599e729b1ed313141734486e484ca4b88cd8d9))
* **internal:** support uploading Maven repo artifacts to stainless package server ([4a21584](https://github.com/trycourier/courier-java/commit/4a21584ee2daff5c18cf9ca259cce3a9920005ba))

## 4.7.0 (2026-01-12)

Full Changelog: [v4.6.0...v4.7.0](https://github.com/trycourier/courier-java/compare/v4.6.0...v4.7.0)

### Features

* **client:** allow configuring dispatcher executor service ([86008d9](https://github.com/trycourier/courier-java/commit/86008d9281207c5dff33942f841fcf57fe9ac543))


### Bug Fixes

* **types:** change rules type from FilterConfig to Filter in NestedFilterConfig ([49ad2a8](https://github.com/trycourier/courier-java/commit/49ad2a877f281961289abaa1a00e38e52921a825))


### Chores

* **internal:** regenerate SDK with no functional changes ([1267b56](https://github.com/trycourier/courier-java/commit/1267b5646869806f1df16eb24b19ad1c988a0be6))

## 4.6.0 (2026-01-08)

Full Changelog: [v4.5.0...v4.6.0](https://github.com/trycourier/courier-java/compare/v4.5.0...v4.6.0)

### Features

* Add automation list endpoint to API spec ([d325774](https://github.com/trycourier/courier-java/commit/d32577416aac404f5252240814411027720f9b7e))
* **client:** add `HttpRequest#url()` method ([68fea18](https://github.com/trycourier/courier-java/commit/68fea18aaff857c538d86a74f17c3655a7815817))

## 4.5.0 (2025-12-29)

Full Changelog: [v4.4.0...v4.5.0](https://github.com/trycourier/courier-java/compare/v4.4.0...v4.5.0)

### Features

* **api:** add audience/list/slack/msTeams/pagerduty/webhook recipients, restructure to union ([46de0d2](https://github.com/trycourier/courier-java/commit/46de0d2d85f59c4d1d220dc3e3028c7e6760c769))

## 4.4.0 (2025-12-16)

Full Changelog: [v4.3.0...v4.4.0](https://github.com/trycourier/courier-java/compare/v4.3.0...v4.4.0)

### Features

* Add timezone field to Delay schema ([46d1671](https://github.com/trycourier/courier-java/commit/46d16713aeb86a15fe73de9c9e2aea168872a7c0))
* Update bulk API spec: make event required, document profile.email req… ([e436dcd](https://github.com/trycourier/courier-java/commit/e436dcd0a916911f366d3016333b8a6a2cdc947d))

## 4.3.0 (2025-12-08)

Full Changelog: [v4.2.0...v4.3.0](https://github.com/trycourier/courier-java/compare/v4.2.0...v4.3.0)

### Features

* Fix UsersGetAllTokensResponse to return object with tokens property i… ([d714e73](https://github.com/trycourier/courier-java/commit/d714e730131147eeed7f17a7b7732021bfe6b2c2))

## 4.2.0 (2025-12-08)

Full Changelog: [v4.1.1...v4.2.0](https://github.com/trycourier/courier-java/compare/v4.1.1...v4.2.0)

### Features

* Add event_ids field to Notification schema ([7c1f965](https://github.com/trycourier/courier-java/commit/7c1f9658796281d891f340cbe0773a01ea0883d9))


### Bug Fixes

* **client:** fix duplicate Go struct resulting from name derivations schema ([6af2591](https://github.com/trycourier/courier-java/commit/6af25911aa81ad591d3b2a34e77045394abfbf21))


### Documentation

* remove `$` for better copy-pasteabality ([ed4b896](https://github.com/trycourier/courier-java/commit/ed4b8969289ea8559fa436a706b6d5c177e925f5))

## 4.1.1 (2025-12-02)

Full Changelog: [v4.1.0...v4.1.1](https://github.com/trycourier/courier-java/compare/v4.1.0...v4.1.1)

### Bug Fixes

* **client:** cancel okhttp call when future cancelled ([a9dd41b](https://github.com/trycourier/courier-java/commit/a9dd41bced8c09a8c786a53ef000a5eb3d806116))

## 4.1.0 (2025-11-18)

Full Changelog: [v4.0.1...v4.1.0](https://github.com/trycourier/courier-java/compare/v4.0.1...v4.1.0)

### Features

* JWT scope updates ([6b86ae2](https://github.com/trycourier/courier-java/commit/6b86ae2db80aedb1e2659c79d1182f250de5e0ac))
* NPM enabled ([8e4f4d9](https://github.com/trycourier/courier-java/commit/8e4f4d9d89652f1c41867eae9b0048c8ce5c0ad6))
* Test ([849aabb](https://github.com/trycourier/courier-java/commit/849aabb30345aa0f2ee9efcb11242992743934bb))


### Bug Fixes

* **client:** multi-value header serialization ([82763dd](https://github.com/trycourier/courier-java/commit/82763ddd160ebb38c45bf9cdc09fb7b596b77c2e))

## 4.0.1 (2025-11-12)

Full Changelog: [v4.0.0...v4.0.1](https://github.com/trycourier/courier-java/compare/v4.0.0...v4.0.1)

### Chores

* update SDK settings ([b7ac3e7](https://github.com/trycourier/courier-java/commit/b7ac3e7b7af7c54afc7071395db34293cdc356db))

## 4.0.0 (2025-11-08)

Full Changelog: [v3.8.0...v4.0.0](https://github.com/trycourier/courier-java/compare/v3.8.0...v4.0.0)

### Features

* Token Prop Description Change ([7087c01](https://github.com/trycourier/courier-java/commit/7087c010d372844abfab7310aa52e6fa9729ae39))

## 3.8.0 (2025-11-07)

Full Changelog: [v3.7.2...v3.8.0](https://github.com/trycourier/courier-java/compare/v3.7.2...v3.8.0)

### Features

* Spec Comment Change ([4a95534](https://github.com/trycourier/courier-java/commit/4a955346ee45fa23a2db253c750916c879d130c3))

## 3.7.2 (2025-11-07)

Full Changelog: [v3.7.1...v3.7.2](https://github.com/trycourier/courier-java/compare/v3.7.1...v3.7.2)

### Bug Fixes

* Better Python Samples + Updates to naming ([bcfaab7](https://github.com/trycourier/courier-java/commit/bcfaab71bfebcd63089bdc85916d4f493f30479f))

## 3.7.1 (2025-11-04)

Full Changelog: [v3.7.0...v3.7.1](https://github.com/trycourier/courier-java/compare/v3.7.0...v3.7.1)

### Features

* Attempt kick off again ([fadbcb6](https://github.com/trycourier/courier-java/commit/fadbcb687966348aafeafd7d2dec123ecde91260))

## 3.7.0 (2025-11-03)

Full Changelog: [v3.7.0-alpha7...v3.7.0](https://github.com/trycourier/courier-java/compare/v3.7.0-alpha7...v3.7.0)

### Features

* Organization update ([6eb3c51](https://github.com/trycourier/courier-java/commit/6eb3c519ff7c2f7c08fe55a01c57bdf753eb811a))

## 3.7.0-alpha7 (2025-10-31)

Full Changelog: [v3.7.0-alpha6...v3.7.0-alpha7](https://github.com/trycourier/courier-java/compare/v3.7.0-alpha6...v3.7.0-alpha7)

### Bug Fixes

* Courier Reverse Domain for Java ([29df93f](https://github.com/trycourier/courier-java/commit/29df93f9ee88817e62d724d5b5e4755895bb0e29))

## 3.7.0-alpha6 (2025-10-31)

Full Changelog: [v3.7.0-alpha5...v3.7.0-alpha6](https://github.com/trycourier/courier-java/compare/v3.7.0-alpha5...v3.7.0-alpha6)

### Features

* Comment adjustment to kick of build ([fdfd8d5](https://github.com/trycourier/courier-java/commit/fdfd8d5df14451f7abcf5044a2dab0864685c65f))


### Bug Fixes

* Comment to kick off build ([d940d0c](https://github.com/trycourier/courier-java/commit/d940d0cac457f30c85b202eb641d03443e1d5ceb))

## 3.7.0-alpha5 (2025-10-17)

Full Changelog: [v3.7.0-alpha4...v3.7.0-alpha5](https://github.com/trycourier/courier-java/compare/v3.7.0-alpha4...v3.7.0-alpha5)

### Bug Fixes

* Dep Warning ([9f7c1b2](https://github.com/trycourier/courier-java/commit/9f7c1b278685a941c2a37edfc5928610d18c42a3))

## 3.7.0-alpha4 (2025-10-17)

Full Changelog: [v3.7.0-alpha3...v3.7.0-alpha4](https://github.com/trycourier/courier-java/compare/v3.7.0-alpha3...v3.7.0-alpha4)

### Bug Fixes

* Updated paths for each model and go example updates ([175539f](https://github.com/trycourier/courier-java/commit/175539f9d0376f5bd6539c44650ece4c899d84c2))

## 3.7.0-alpha3 (2025-10-17)

Full Changelog: [v3.7.0-alpha2...v3.7.0-alpha3](https://github.com/trycourier/courier-java/compare/v3.7.0-alpha2...v3.7.0-alpha3)

### Features

* More PHP and attempted node automerge ([a034224](https://github.com/trycourier/courier-java/commit/a034224e176fd5cfd303732bf202d19f9c269584))


### Bug Fixes

* **test:** set required field channel ([93525f3](https://github.com/trycourier/courier-java/commit/93525f374fe22c412e473afd0b4f22f649dada8f))

## 3.7.0-alpha2 (2025-10-14)

Full Changelog: [v3.7.0-alpha1...v3.7.0-alpha2](https://github.com/trycourier/courier-java/compare/v3.7.0-alpha1...v3.7.0-alpha2)

### Features

* Feature/java 2 ([699fc18](https://github.com/trycourier/courier-java/commit/699fc187551f2caab3a133bfd247cada53c54526))

## 3.7.0-alpha1 (2025-10-14)

Full Changelog: [v3.7.0-alpha0...v3.7.0-alpha1](https://github.com/trycourier/courier-java/compare/v3.7.0-alpha0...v3.7.0-alpha1)

### Features

* Changes to spec, examples and scripts ([e38bbae](https://github.com/trycourier/courier-java/commit/e38bbaef5f16357b583f56cbc20a4e767be28703))

## 3.7.0-alpha0 (2025-10-14)

Full Changelog: [v0.2.0...v3.7.0-alpha0](https://github.com/trycourier/courier-java/compare/v0.2.0...v3.7.0-alpha0)

### Features

* Kick of merge attempt ([db5f91b](https://github.com/trycourier/courier-java/commit/db5f91ba4ca352805f4367ea8a02cbd636224b7d))
* Model sync ([0e586b9](https://github.com/trycourier/courier-java/commit/0e586b9a81627a68afa4c760a2453e8cc166c667))
* Polish and Kick of Java Kit Gen ([7650a29](https://github.com/trycourier/courier-java/commit/7650a294024eed0a1d074be64ca67d679491ca10))
* Template Id ([150a51a](https://github.com/trycourier/courier-java/commit/150a51add95002f29d1893beec7c4db6890b9aeb))
* Test Github Action ([333fa1a](https://github.com/trycourier/courier-java/commit/333fa1a7398dd84cb98f21af74f305dc6574417a))


### Chores

* **client:** custom java naming to fix List overlap ([c95e9d1](https://github.com/trycourier/courier-java/commit/c95e9d1776c66978bfc891c6fabb8a82b9a09123))

## 0.2.0 (2025-10-08)

Full Changelog: [v0.1.0...v0.2.0](https://github.com/trycourier/courier-java/compare/v0.1.0...v0.2.0)

### Features

* **api:** manual updates ([bea49ba](https://github.com/trycourier/courier-java/commit/bea49ba0584c19e5d94584fa318328f7613b6524))

## 0.1.0 (2025-10-08)

Full Changelog: [v0.0.1...v0.1.0](https://github.com/trycourier/courier-java/compare/v0.0.1...v0.1.0)

### Features

* **api:** manual updates ([9e03ceb](https://github.com/trycourier/courier-java/commit/9e03ceb1c3b1608e25723ba7aff14c35fc0a116a))
* **api:** manual updates ([3e3e01a](https://github.com/trycourier/courier-java/commit/3e3e01adad08e941231a6fcada1ad9460ad2237c))
* **api:** manual updates ([e8d7297](https://github.com/trycourier/courier-java/commit/e8d729759fbbf511e93ab2b0559d718a48cc1ecb))
* **api:** manual updates ([0dfa4cf](https://github.com/trycourier/courier-java/commit/0dfa4cf4dce0a35be9ef30442b70eab98a1fb64d))
* **api:** manual updates ([7f3f0ba](https://github.com/trycourier/courier-java/commit/7f3f0ba34e06bea6f5d847486acdfd0d037da9f2))
* **api:** manual updates ([1e9572f](https://github.com/trycourier/courier-java/commit/1e9572f91eeefbe7536ffb2f0663f9b951d442ff))
* **api:** manual updates ([d18518a](https://github.com/trycourier/courier-java/commit/d18518a50f4f868cdfd3ca90a113d8160aaefa85))
* **api:** manual updates ([2e42d44](https://github.com/trycourier/courier-java/commit/2e42d443e1c5aa64c05fea6dc2c19b173aa223e4))
* **api:** manual updates ([4bedb44](https://github.com/trycourier/courier-java/commit/4bedb44312e4618b9cb16245f032978490a9fa1e))
* **api:** manual updates ([51e1a35](https://github.com/trycourier/courier-java/commit/51e1a35ffcee9de2e8f8eb6b6e5ee443ba3cc1e3))
* **api:** manual updates ([25ea9c2](https://github.com/trycourier/courier-java/commit/25ea9c20e06aaf842128758a136bcf961dcdc707))
* **api:** manual updates ([61a87f9](https://github.com/trycourier/courier-java/commit/61a87f9d18bb355e008a69ab86c578d2763fddcc))
* **api:** manual updates ([822e2a4](https://github.com/trycourier/courier-java/commit/822e2a4a7d93bdc32bfc2c92bd0cc1ac4b3ff359))
* **api:** manual updates ([6bb1fba](https://github.com/trycourier/courier-java/commit/6bb1fbabc235d3cc1eb7489919bbb71b42bc22e9))
* **api:** manual updates ([ead7d7c](https://github.com/trycourier/courier-java/commit/ead7d7cbf54c37a6aed22496051334693aa647ea))
* **api:** manual updates ([e5bfbdb](https://github.com/trycourier/courier-java/commit/e5bfbdb1174fafbc1852694c138e364a98010ef3))
* **api:** manual updates ([0435076](https://github.com/trycourier/courier-java/commit/043507613239e61b8173032071dd91f3b378c514))
* **api:** manual updates ([e6ed828](https://github.com/trycourier/courier-java/commit/e6ed82846b54dea4c15295f1df79439dca3c4875))
* **api:** manual updates ([0ec4d93](https://github.com/trycourier/courier-java/commit/0ec4d9354b7a702a83e9d305ea8a493eda3af820))
* **api:** manual updates ([70aa287](https://github.com/trycourier/courier-java/commit/70aa2874518fd8f48e5cc8927b7abcea60787b7c))
* **api:** manual updates ([998a0c1](https://github.com/trycourier/courier-java/commit/998a0c13140b88e4fba9fbd2374e07b3ec6a4849))
* **api:** manual updates ([1d5dae3](https://github.com/trycourier/courier-java/commit/1d5dae306c780129e17111dae95b55bc600ad6e9))
* **api:** manual updates ([26e335a](https://github.com/trycourier/courier-java/commit/26e335a72dc4aebf9c3b71f440f317ce4409371c))
* **api:** manual updates ([6b9f529](https://github.com/trycourier/courier-java/commit/6b9f5296179dccc64931dd2afe8802cf06b69873))
* **api:** manual updates ([2f68cbe](https://github.com/trycourier/courier-java/commit/2f68cbe54d8ed9f6ae5dc5c060e3067131acf3fb))
* **api:** manual updates ([33a23f3](https://github.com/trycourier/courier-java/commit/33a23f3e6c64100af51e328215bc7d2a93fef331))
* **api:** manual updates ([5c5e618](https://github.com/trycourier/courier-java/commit/5c5e61819a03f950fc01468e21f1aa58b3f9a49a))
* **api:** manual updates ([1a3eab1](https://github.com/trycourier/courier-java/commit/1a3eab10a8b1eba2ed8bbdd82dffb81efae0155f))
* **api:** manual updates ([e4986bc](https://github.com/trycourier/courier-java/commit/e4986bcd194638319398f2375e0a5304cbda49dd))
* **api:** manual updates ([ab3ef5d](https://github.com/trycourier/courier-java/commit/ab3ef5d4292e846a80b39ae7c608305830637f64))
* Examples and ref polish ([da2b50d](https://github.com/trycourier/courier-java/commit/da2b50dcc25a818bb2a02c3d6976083c8522a89c))


### Chores

* sync repo ([166f09d](https://github.com/trycourier/courier-java/commit/166f09d23f53cda5b63b60a9a785bc9e2e430fb7))
* update SDK settings ([a6b8878](https://github.com/trycourier/courier-java/commit/a6b88785330883c72efcef1a178d952f31de4420))
* update SDK settings ([d4cde45](https://github.com/trycourier/courier-java/commit/d4cde450dc82626223aee050c5c848f70fe79382))
