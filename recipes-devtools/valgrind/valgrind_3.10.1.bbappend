# Copyright (C) 2015, Daiane Angolini <daiane.angolini@freescale.com>

# Append to backport to fido some valgrind bugfixes from master
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

#http://git.yoctoproject.org/cgit/cgit.cgi/poky/commit/meta/recipes-devtools/valgrind?id=87aedfb11218a5ccf35b980a3d537e685cac7838
EXTRA_OECONF += "${@['--enable-only32bit','--enable-only64bit'][d.getVar('SITEINFO_BITS', True) != '32']}"


#http://git.yoctoproject.org/cgit/cgit.cgi/poky/commit/meta/recipes-devtools/valgrind?id=d1ce219960c031c00b48bf454b740b8bffcfbc43


SRC_URI_append = "file://0001-valgrind-Backport-bugfix.patch \
"
