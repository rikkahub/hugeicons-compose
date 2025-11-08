package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Skool: ImageVector
    get() {
        if (_skool != null) {
            return _skool!!
        }
        _skool = ImageVector.Builder(
            name = "Skool",
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
        moveTo(15f, 3f)
        horizontalLineTo(12f)
        verticalLineTo(20f)
        horizontalLineTo(15f)
        verticalLineTo(14.5f)
        horizontalLineTo(15.9064f)
        curveTo(16.2723f, 14.5f, 16.609f, 14.6999f, 16.7843f, 15.0211f)
        lineTo(19.2157f, 19.4789f)
        curveTo(19.391f, 19.8001f, 19.7277f, 20f, 20.0936f, 20f)
        horizontalLineTo(23f)
        lineTo(19f, 13f)
        lineTo(23f, 8f)
        horizontalLineTo(20f)
        curveTo(19.6852f, 8f, 19.3889f, 8.14819f, 19.2f, 8.4f)
        lineTo(16.8f, 11.6f)
        curveTo(16.6111f, 11.8518f, 16.3148f, 12f, 16f, 12f)
        horizontalLineTo(15f)
        verticalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.50063f, 11.0005f)
        curveTo(4.9056f, 9.54528f, 7.66729f, 10.5005f, 8.50063f, 11.0005f)
        lineTo(10.0006f, 9.5f)
        curveTo(10.0006f, 9.5f, 8.73595f, 8f, 6.00085f, 8f)
        curveTo(3.93463f, 8f, 1.35357f, 8.41898f, 1.35357f, 11.919f)
        curveTo(1.35357f, 15.419f, 7.70823f, 14.6943f, 6.70911f, 16.9978f)
        curveTo(6.13523f, 18.321f, 3.15757f, 17.1094f, 2.15757f, 16.4428f)
        lineTo(1f, 18.7185f)
        curveTo(1.83333f, 19.2185f, 3.90085f, 20f, 5.50085f, 20f)
        curveTo(7.29193f, 20f, 10.0006f, 18.9128f, 10.0006f, 15.7212f)
        curveTo(10.0006f, 12.5296f, 3.99014f, 12.8348f, 4.50063f, 11.0005f)
        }
        }.build()

        return _skool!!
    }

private var _skool: ImageVector? = null
