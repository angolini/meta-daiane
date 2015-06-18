# Copyright (C) 2015, Daiane Angolini <daiane.angolini@freescale.com>
SUMMARY = "My very special movies"
LICENSE = "CLOSED"
#Which license?

FILE1 = "terminator3_mpeg4_480x280_24fps_aac_stereo_48khz_1min_47sec.mp4"

SRC_URI = "file://${FILE1} \
   "

inherit allarch

do_install() {
	install -d ${D}/movies
	install -m 0644 ${WORKDIR}/${FILE1} ${D}/movies/
}

FILES_${PN} += "/movies"
