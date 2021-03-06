SUMMARY = "SELinux GUI tools"
DESCRIPTION = "\
Provide SELinux Management tool (system-config-selinux) and SELinux \
Policy Generation Tool (selinux-polgengui)"
SECTION = "base"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://${S}/COPYING;md5=393a5ca445f6965873eca0259a17f833"

require selinux_common.inc

S = "${WORKDIR}/git/gui"

RDEPENDS_${PN} += "python3-core"

FILES_${PN} += " \
        ${datadir}/system-config-selinux/* \
        ${datadir}/icons/hicolor/* \
        ${datadir}/polkit-1/actions/org.selinux.config.policy \
"
