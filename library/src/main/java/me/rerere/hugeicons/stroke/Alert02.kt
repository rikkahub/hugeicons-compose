package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Alert02: ImageVector
    get() {
        if (_alert02 != null) {
            return _alert02!!
        }
        _alert02 = ImageVector.Builder(
            name = "Alert02",
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
        moveTo(13.9248f, 21f)
        horizontalLineTo(10.0752f)
        curveTo(5.44476f, 21f, 3.12955f, 21f, 2.27636f, 19.4939f)
        curveTo(1.42317f, 17.9879f, 2.60736f, 15.9914f, 4.97574f, 11.9985f)
        lineTo(6.90057f, 8.75333f)
        curveTo(9.17559f, 4.91778f, 10.3131f, 3f, 12f, 3f)
        curveTo(13.6869f, 3f, 14.8244f, 4.91777f, 17.0994f, 8.75332f)
        lineTo(19.0243f, 11.9985f)
        curveTo(21.3926f, 15.9914f, 22.5768f, 17.9879f, 21.7236f, 19.4939f)
        curveTo(20.8704f, 21f, 18.5552f, 21f, 13.9248f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 9f)
        verticalLineTo(13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 16.9922f)
        verticalLineTo(17.0022f)
        }
        }.build()

        return _alert02!!
    }

private var _alert02: ImageVector? = null
