package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SwimmingCap: ImageVector
    get() {
        if (_swimmingCap != null) {
            return _swimmingCap!!
        }
        _swimmingCap = ImageVector.Builder(
            name = "SwimmingCap",
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
        moveTo(5.2057f, 13.5f)
        curveTo(6.61724f, 10.9057f, 6.10634f, 7.50433f, 4f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.7943f, 13.5f)
        curveTo(17.3828f, 10.9057f, 17.8937f, 7.50433f, 20f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.84563f, 13.5f)
        horizontalLineTo(20.1544f)
        curveTo(21.6152f, 13.5f, 22.1108f, 13.1856f, 21.9799f, 11.6907f)
        curveTo(21.5401f, 6.67031f, 17.2341f, 2.5f, 12f, 2.5f)
        curveTo(6.76593f, 2.5f, 2.45986f, 6.67031f, 2.02015f, 11.6907f)
        curveTo(1.88922f, 13.1856f, 2.38484f, 13.5f, 3.84563f, 13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 19f)
        curveTo(4f, 17.4634f, 6.1186f, 17.1143f, 7.23329f, 16.6688f)
        curveTo(8.80778f, 16.0396f, 10.5f, 17.2472f, 10.5f, 19f)
        curveTo(10.5f, 20.7528f, 8.80778f, 21.9604f, 7.23329f, 21.3312f)
        curveTo(6.1186f, 20.8857f, 4f, 20.5366f, 4f, 19f)
        moveTo(4f, 19f)
        lineTo(2f, 19f)
        moveTo(20f, 19f)
        curveTo(20f, 17.4634f, 17.8814f, 17.1143f, 16.7667f, 16.6688f)
        curveTo(15.1922f, 16.0396f, 13.5f, 17.2472f, 13.5f, 19f)
        curveTo(13.5f, 20.7528f, 15.1922f, 21.9604f, 16.7667f, 21.3312f)
        curveTo(17.8814f, 20.8857f, 20f, 20.5366f, 20f, 19f)
        moveTo(20f, 19f)
        lineTo(22f, 19f)
        moveTo(10.5f, 18.5f)
        curveTo(10.7994f, 17.9022f, 11.359f, 17.5f, 12f, 17.5f)
        curveTo(12.641f, 17.5f, 13.2006f, 17.9022f, 13.5f, 18.5f)
        }
        }.build()

        return _swimmingCap!!
    }

private var _swimmingCap: ImageVector? = null
