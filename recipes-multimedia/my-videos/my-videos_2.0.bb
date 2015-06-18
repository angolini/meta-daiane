# Copyright (C) 2015, Daiane Angolini <daiane.angolini@freescale.com>
SUMMARY = "My very special movies"
LICENSE = "CLOSED"
#Which license?

# this checksum must be changed for your own checksum when you are using your
# own multimedia files
SRC_URI[md5sum] = "e32c66010170ef5d4d2e2a26815b5f31"
SRC_URI[sha256sum] = "a5462e919ae292f225fca0f09c50a5b7730015aedd61968f487254bca29c9f60"

#FSL_MIRROR does not have multimedia files. Please copy your own
# multimedia.tar.bz2 file on a local directory and use the PREMIRROR line above:
# add on local.conf
#INHERIT += "own-mirrors"
#SOURCE_MIRROR_URL = "file:///your/path/multimedia"



SRC_URI = "${FSL_MIRROR}/multimedia.tar.bz2"

inherit allarch

# the following instalation only copy *.mp4 and *.avi files, double check if you
# need other file type
do_install() {
	install -d ${D}/movies
	install -m 0644 ${WORKDIR}/*.mp4 ${D}/movies/
  install -m 0644 ${WORKDIR}/*.avi ${D}/movies/
}

FILES_${PN} += "/movies"
