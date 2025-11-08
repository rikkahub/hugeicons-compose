package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Legal01: ImageVector
    get() {
        if (_legal01 != null) {
            return _legal01!!
        }
        _legal01 = ImageVector.Builder(
            name = "Legal01",
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
        moveTo(10f, 11.6273f)
        lineTo(5.07498f, 17.4215f)
        curveTo(4.41411f, 18.199f, 3.23201f, 18.2464f, 2.51138f, 17.5241f)
        curveTo(1.79074f, 16.8019f, 1.83795f, 15.6172f, 2.61376f, 14.9549f)
        lineTo(8.3953f, 10.019f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 10.0667f)
        lineTo(13.0476f, 15.03f)
        moveTo(9.95238f, 2.00146f)
        lineTo(5f, 6.96472f)
        moveTo(9.33337f, 2.62183f)
        lineTo(5.61908f, 6.34428f)
        curveTo(5.61908f, 6.34428f, 7.47622f, 8.82591f, 9.33337f, 10.6871f)
        curveTo(11.1905f, 12.5484f, 13.6667f, 14.4096f, 13.6667f, 14.4096f)
        lineTo(17.381f, 10.6871f)
        curveTo(17.381f, 10.6871f, 15.5238f, 8.2055f, 13.6667f, 6.34428f)
        curveTo(11.8096f, 4.48306f, 9.33337f, 2.62183f, 9.33337f, 2.62183f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 11.659f)
        lineTo(22f, 10.019f)
        moveTo(20f, 14.9389f)
        lineTo(22f, 16.0322f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.002f, 21.9988f)
        horizontalLineTo(20.9998f)
        moveTo(12.2267f, 21.9988f)
        curveTo(12.7782f, 21.0113f, 13.19f, 19.1216f, 15.142f, 19.0158f)
        curveTo(15.7218f, 18.9843f, 16.3117f, 18.9843f, 16.8914f, 19.0158f)
        curveTo(18.8434f, 19.1216f, 19.2572f, 21.0113f, 19.8087f, 21.9988f)
        }
        }.build()

        return _legal01!!
    }

private var _legal01: ImageVector? = null
