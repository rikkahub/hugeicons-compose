package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WindSurf: ImageVector
    get() {
        if (_windSurf != null) {
            return _windSurf!!
        }
        _windSurf = ImageVector.Builder(
            name = "WindSurf",
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
        moveTo(8f, 21f)
        lineTo(7f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 19f)
        horizontalLineTo(2f)
        curveTo(7f, 20.7143f, 12.9751f, 22f, 17f, 22f)
        curveTo(20f, 22f, 22f, 19.7347f, 22f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.0103f, 2f)
        curveTo(18.1781f, 7f, 16.2964f, 16.3438f, 15f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.2029f, 3.91879f)
        curveTo(15.8034f, 3.54155f, 15.0113f, 3.01128f, 14.9351f, 3.00177f)
        curveTo(14.0749f, 2.89451f, 13.9629f, 3.41804f, 12.9641f, 4.88797f)
        curveTo(11.6989f, 6.5487f, 8.80901f, 10.0524f, 7.79688f, 10.911f)
        moveTo(7.79688f, 10.911f)
        curveTo(8.37003f, 12.6904f, 9.3081f, 15.5156f, 15.0929f, 16.9358f)
        moveTo(7.79688f, 10.911f)
        curveTo(9.07691f, 12.6395f, 13.9342f, 13.0313f, 16.2029f, 13.0111f)
        }
        }.build()

        return _windSurf!!
    }

private var _windSurf: ImageVector? = null
