package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Icon24HoursClock: ImageVector
    get() {
        if (_icon24HoursClock != null) {
            return _icon24HoursClock!!
        }
        _icon24HoursClock = ImageVector.Builder(
            name = "Icon24HoursClock",
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
        moveTo(22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 16.4292f, 4.87962f, 20.1859f, 8.86884f, 21.5f)
        moveTo(9f, 14f)
        lineTo(12f, 12f)
        verticalLineTo(6.66702f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 16f)
        horizontalLineTo(15f)
        curveTo(15.5523f, 16f, 16f, 16.4477f, 16f, 17f)
        verticalLineTo(18f)
        curveTo(16f, 18.5523f, 15.5523f, 19f, 15f, 19f)
        horizontalLineTo(14f)
        curveTo(13.4477f, 19f, 13f, 19.4477f, 13f, 20f)
        verticalLineTo(21f)
        curveTo(13f, 21.5523f, 13.4477f, 22f, 14f, 22f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 16f)
        verticalLineTo(19f)
        moveTo(22f, 19f)
        horizontalLineTo(20f)
        curveTo(19.4477f, 19f, 19f, 18.5523f, 19f, 18f)
        verticalLineTo(16f)
        moveTo(22f, 19f)
        verticalLineTo(22f)
        }
        }.build()

        return _icon24HoursClock!!
    }

private var _icon24HoursClock: ImageVector? = null
