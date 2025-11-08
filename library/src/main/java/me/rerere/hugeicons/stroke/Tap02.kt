package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tap02: ImageVector
    get() {
        if (_tap02 != null) {
            return _tap02!!
        }
        _tap02 = ImageVector.Builder(
            name = "Tap02",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.2494f, 22.0012f)
        curveTo(16.2798f, 20.1362f, 16.2126f, 20.5213f, 16.3651f, 20.0469f)
        curveTo(16.5177f, 19.5724f, 17.1082f, 18.7482f, 17.4736f, 17.6984f)
        curveTo(18.4962f, 14.7597f, 17.9519f, 13.5537f, 16.4377f, 12.6174f)
        curveTo(14.8423f, 11.6308f, 13.2317f, 11.2482f, 11.8206f, 11.3704f)
        verticalLineTo(6.73351f)
        curveTo(11.8206f, 5.7716f, 11.275f, 5.02918f, 10.3117f, 5.02918f)
        curveTo(9.34833f, 5.02918f, 8.86228f, 5.86682f, 8.86228f, 6.82872f)
        lineTo(8.91294f, 11.6642f)
        moveTo(8.89472f, 22.0012f)
        verticalLineTo(21.3328f)
        curveTo(8.89472f, 20.5476f, 8.63697f, 20.2124f, 7.54691f, 18.6357f)
        curveTo(6.34528f, 16.8976f, 6.35032f, 16.8151f, 6.07506f, 16.0583f)
        curveTo(6.02633f, 15.705f, 5.72775f, 14.8804f, 6.83195f, 13.7301f)
        lineTo(8.91294f, 11.6642f)
        moveTo(8.91294f, 15.1907f)
        verticalLineTo(11.6642f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.49727f, 6.0232f)
        curveTo(6.4315f, 5.10323f, 6.99749f, 3.28328f, 8.55063f, 2.52231f)
        curveTo(9.19108f, 2.13281f, 10.949f, 1.52974f, 12.6304f, 2.60432f)
        curveTo(14.2874f, 3.66333f, 14.3992f, 5.22472f, 14.5035f, 6.01284f)
        }
        }.build()

        return _tap02!!
    }

private var _tap02: ImageVector? = null
