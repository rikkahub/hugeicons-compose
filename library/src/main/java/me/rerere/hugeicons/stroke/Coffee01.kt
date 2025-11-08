package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Coffee01: ImageVector
    get() {
        if (_coffee01 != null) {
            return _coffee01!!
        }
        _coffee01 = ImageVector.Builder(
            name = "Coffee01",
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
        moveTo(5f, 7f)
        lineTo(6.7602f, 17.4048f)
        curveTo(7.06616f, 19.2134f, 7.21914f, 20.1177f, 7.76007f, 20.7417f)
        curveTo(9.21438f, 22.4194f, 14.7856f, 22.4194f, 16.2399f, 20.7417f)
        curveTo(16.7809f, 20.1177f, 16.9338f, 19.2134f, 17.2398f, 17.4048f)
        lineTo(19f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 7f)
        lineTo(5.74278f, 5.2876f)
        curveTo(6.35168f, 3.88385f, 6.65613f, 3.18197f, 7.29101f, 2.7856f)
        curveTo(8.88049f, 1.79324f, 14.9452f, 1.68444f, 16.709f, 2.7856f)
        curveTo(17.3439f, 3.18197f, 17.6483f, 3.88385f, 18.2572f, 5.2876f)
        lineTo(19f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 7f)
        horizontalLineTo(20f)
        }
        }.build()

        return _coffee01!!
    }

private var _coffee01: ImageVector? = null
