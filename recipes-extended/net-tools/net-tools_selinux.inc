inherit selinux

DEPENDS += "${LIBSELINUX}"

EXTRA_OEMAKE += "${@target_selinux(d, 'HAVE_SELINUX=1', 'HAVE_SELINUX=0')}"
