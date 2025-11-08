package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sun01: ImageVector
    get() {
        if (_sun01 != null) {
            return _sun01!!
        }
        _sun01 = ImageVector.Builder(
            name = "Sun01",
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
        moveTo(17f, 12f)
        curveTo(17f, 14.7614f, 14.7614f, 17f, 12f, 17f)
        curveTo(9.23858f, 17f, 7f, 14.7614f, 7f, 12f)
        curveTo(7f, 9.23858f, 9.23858f, 7f, 12f, 7f)
        curveTo(14.7614f, 7f, 17f, 9.23858f, 17f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9955f, 3f)
        horizontalLineTo(12.0045f)
        moveTo(11.9961f, 21f)
        horizontalLineTo(12.0051f)
        moveTo(18.3588f, 5.63599f)
        horizontalLineTo(18.3678f)
        moveTo(5.63409f, 18.364f)
        horizontalLineTo(5.64307f)
        moveTo(5.63409f, 5.63647f)
        horizontalLineTo(5.64307f)
        moveTo(18.3582f, 18.3645f)
        horizontalLineTo(18.3672f)
        moveTo(20.991f, 12.0006f)
        horizontalLineTo(21f)
        moveTo(3f, 12.0006f)
        horizontalLineTo(3.00898f)
        }
        }.build()

        return _sun01!!
    }

private var _sun01: ImageVector? = null
