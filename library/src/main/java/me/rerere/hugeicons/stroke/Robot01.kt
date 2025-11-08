package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Robot01: ImageVector
    get() {
        if (_robot01 != null) {
            return _robot01!!
        }
        _robot01 = ImageVector.Builder(
            name = "Robot01",
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
        moveTo(12f, 4f)
        verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 22f)
        curveTo(19f, 18.134f, 15.866f, 15f, 12f, 15f)
        curveTo(8.13401f, 15f, 5f, 18.134f, 5f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 7.5f)
        horizontalLineTo(9.50998f)
        moveTo(14.49f, 7.5f)
        horizontalLineTo(14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 6.66667f)
        curveTo(5.5f, 6.04669f, 5.5f, 5.73669f, 5.56815f, 5.48236f)
        curveTo(5.75308f, 4.79218f, 6.29218f, 4.25308f, 6.98236f, 4.06815f)
        curveTo(7.23669f, 4f, 7.54669f, 4f, 8.16667f, 4f)
        horizontalLineTo(15.8333f)
        curveTo(16.4533f, 4f, 16.7633f, 4f, 17.0176f, 4.06815f)
        curveTo(17.7078f, 4.25308f, 18.2469f, 4.79218f, 18.4319f, 5.48236f)
        curveTo(18.5f, 5.73669f, 18.5f, 6.04669f, 18.5f, 6.66667f)
        curveTo(18.5f, 7.90663f, 18.5f, 8.52661f, 18.3637f, 9.03528f)
        curveTo(17.9938f, 10.4156f, 16.9156f, 11.4938f, 15.5353f, 11.8637f)
        curveTo(15.0266f, 12f, 14.4066f, 12f, 13.1667f, 12f)
        horizontalLineTo(10.8333f)
        curveTo(9.59337f, 12f, 8.97339f, 12f, 8.46472f, 11.8637f)
        curveTo(7.08436f, 11.4938f, 6.00617f, 10.4156f, 5.6363f, 9.03528f)
        curveTo(5.5f, 8.52661f, 5.5f, 7.90663f, 5.5f, 6.66667f)
        }
        }.build()

        return _robot01!!
    }

private var _robot01: ImageVector? = null
