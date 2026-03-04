package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CalendarMortarboard: ImageVector
    get() {
        if (_calendarMortarboard != null) {
            return _calendarMortarboard!!
        }
        _calendarMortarboard = ImageVector.Builder(
            name = "CalendarMortarboard",
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
        moveTo(15f, 2f)
        verticalLineTo(6f)
        moveTo(7f, 2f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 12f)
        curveTo(20f, 8.22876f, 20f, 6.34315f, 18.8284f, 5.17157f)
        curveTo(17.6569f, 4f, 15.7712f, 4f, 12f, 4f)
        horizontalLineTo(10f)
        curveTo(6.22876f, 4f, 4.34315f, 4f, 3.17157f, 5.17157f)
        curveTo(2f, 6.34315f, 2f, 8.22876f, 2f, 12f)
        verticalLineTo(14f)
        curveTo(2f, 17.7712f, 2f, 19.6569f, 3.17157f, 20.8284f)
        curveTo(4.34315f, 22f, 6.22876f, 22f, 10f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 10f)
        horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.4642f, 18.8143f)
        lineTo(21.5358f, 17.1857f)
        curveTo(21.8161f, 17.0735f, 22f, 16.802f, 22f, 16.5f)
        curveTo(22f, 16.198f, 21.8161f, 15.9265f, 21.5358f, 15.8143f)
        lineTo(17.4642f, 14.1857f)
        curveTo(17.1576f, 14.063f, 16.8303f, 14f, 16.5f, 14f)
        curveTo(16.1697f, 14f, 15.8424f, 14.063f, 15.5358f, 14.1857f)
        lineTo(11.4642f, 15.8143f)
        curveTo(11.1839f, 15.9265f, 11f, 16.198f, 11f, 16.5f)
        curveTo(11f, 16.802f, 11.1839f, 17.0735f, 11.4642f, 17.1857f)
        lineTo(15.5358f, 18.8143f)
        curveTo(15.8424f, 18.937f, 16.1697f, 19f, 16.5f, 19f)
        curveTo(16.8303f, 19f, 17.1576f, 18.937f, 17.4642f, 18.8143f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 16.5f)
        verticalLineTo(19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 18f)
        verticalLineTo(20.1538f)
        curveTo(13.5f, 20.6435f, 13.8161f, 21.1131f, 14.3787f, 21.4593f)
        curveTo(14.9413f, 21.8055f, 15.7044f, 22f, 16.5f, 22f)
        curveTo(17.2956f, 22f, 18.0587f, 21.8055f, 18.6213f, 21.4593f)
        curveTo(19.1839f, 21.1131f, 19.5f, 20.6435f, 19.5f, 20.1538f)
        verticalLineTo(18f)
        }
        }.build()

        return _calendarMortarboard!!
    }

private var _calendarMortarboard: ImageVector? = null
