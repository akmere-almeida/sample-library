#!/bin/bash
set -e
re="(((feat\|fix\|BREAKING CHANGE)(\!\?)|((.*)(\!))): .*)"
GITLOG="$(git log HEAD..."$1")"
HAS_CHANGES=false
if [[ $GITLOG =~ $re ]]; then HAS_CHANGES=true; fi
echo "$GITLOG"
echo "## $1";
echo "$HAS_CHANGES"