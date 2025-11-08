package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WebValidation: ImageVector
    get() {
        if (_webValidation != null) {
            return _webValidation!!
        }
        _webValidation = ImageVector.Builder(
            name = "WebValidation",
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
        moveTo(20.9992f, 10f)
        curveTo(20.9907f, 6.41543f, 20.8861f, 4.52814f, 19.6088f, 3.31802f)
        curveTo(18.2175f, 2f, 15.9783f, 2f, 11.5f, 2f)
        curveTo(7.02166f, 2f, 4.78249f, 2f, 3.39124f, 3.31802f)
        curveTo(2f, 4.63604f, 2f, 6.75736f, 2f, 11f)
        curveTo(2f, 15.2426f, 2f, 17.364f, 3.39124f, 18.682f)
        curveTo(4.61763f, 19.8438f, 6.50289f, 19.9815f, 10f, 19.9978f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 17.5f)
        curveTo(15f, 17.5f, 15.5f, 17.5f, 16f, 18.5f)
        curveTo(16f, 18.5f, 17.5882f, 16f, 19f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 17f)
        curveTo(22f, 19.7614f, 19.7614f, 22f, 17f, 22f)
        curveTo(14.2386f, 22f, 12f, 19.7614f, 12f, 17f)
        curveTo(12f, 14.2386f, 14.2386f, 12f, 17f, 12f)
        curveTo(19.7614f, 12f, 22f, 14.2386f, 22f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 8.5f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.49981f, 5.5f)
        horizontalLineTo(6.50879f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.4998f, 5.5f)
        horizontalLineTo(10.5088f)
        }
        }.build()

        return _webValidation!!
    }

private var _webValidation: ImageVector? = null
