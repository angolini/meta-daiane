SUMMARY = "My very special movies"
LICENSE = "CLOSED"
#Which license?

FILE1 = "terminator3_mpeg4_480x280_24fps_aac_stereo_48khz_1min_47sec.mp4"
FILE2 = "StarWars_eps1_4.451mbps_30fps_720_L3B2_cut.avi"

SRC_URI = "file://${FILE1} \
           file://${FILE2} \
   "

inherit allarch

do_install() {
	install -d ${D}/movies
	install -m 0644 ${WORKDIR}/${FILE1} ${D}/movies/
  install -m 0644 ${WORKDIR}/${FILE2} ${D}/movies/
}

FILES_${PN} += "/movies"
