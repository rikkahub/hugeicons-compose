package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Socks: ImageVector
    get() {
        if (_socks != null) {
            return _socks!!
        }
        _socks = ImageVector.Builder(
            name = "Socks",
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
        moveTo(13.5f, 6f)
        verticalLineTo(5f)
        curveTo(13.5f, 4.05719f, 13.5f, 3.58579f, 13.7929f, 3.29289f)
        curveTo(14.0858f, 3f, 14.5572f, 3f, 15.5f, 3f)
        horizontalLineTo(18.5f)
        curveTo(19.4428f, 3f, 19.9142f, 3f, 20.2071f, 3.29289f)
        curveTo(20.5f, 3.58579f, 20.5f, 4.05719f, 20.5f, 5f)
        verticalLineTo(6f)
        horizontalLineTo(13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 6f)
        verticalLineTo(13.3395f)
        curveTo(20.5f, 14.4025f, 20.0769f, 15.4218f, 19.3241f, 16.1723f)
        lineTo(15.5161f, 19.9685f)
        curveTo(14.1398f, 21.3438f, 11.9085f, 21.3438f, 10.5322f, 19.9685f)
        curveTo(9.15593f, 18.5933f, 9.15594f, 16.3635f, 10.5322f, 14.9882f)
        lineTo(13.5f, 12f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 6f)
        horizontalLineTo(7.5f)
        verticalLineTo(5f)
        curveTo(7.5f, 4.05719f, 7.5f, 3.58579f, 7.79289f, 3.29289f)
        curveTo(8.08579f, 3f, 8.55719f, 3f, 9.5f, 3f)
        horizontalLineTo(10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 6f)
        verticalLineTo(12f)
        lineTo(4.5322f, 14.9882f)
        curveTo(3.15594f, 16.3635f, 3.15593f, 18.5933f, 4.5322f, 19.9685f)
        curveTo(5.34165f, 20.7774f, 6.4469f, 21.1105f, 7.5f, 20.9679f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 14.5f)
        lineTo(16f, 19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 14.5f)
        lineTo(7f, 16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 12f)
        curveTo(18.8431f, 12f, 17.5f, 13.3431f, 17.5f, 15f)
        curveTo(17.5f, 15.7684f, 17.7889f, 16.4692f, 18.2639f, 17f)
        }
        }.build()

        return _socks!!
    }

private var _socks: ImageVector? = null
