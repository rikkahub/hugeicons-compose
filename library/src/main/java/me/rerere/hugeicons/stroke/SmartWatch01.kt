package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SmartWatch01: ImageVector
    get() {
        if (_smartWatch01 != null) {
            return _smartWatch01!!
        }
        _smartWatch01 = ImageVector.Builder(
            name = "SmartWatch01",
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
        moveTo(8f, 7.5f)
        curveTo(8f, 7.5f, 8.89734f, 5.92822f, 9.06196f, 4.01957f)
        curveTo(9.13851f, 3.13198f, 9.17678f, 2.68819f, 9.42636f, 2.43221f)
        curveTo(9.67594f, 2.17623f, 9.97701f, 2.14256f, 10.5792f, 2.07523f)
        curveTo(10.9774f, 2.03069f, 11.451f, 2f, 12f, 2f)
        curveTo(12.549f, 2f, 13.0226f, 2.03069f, 13.4208f, 2.07523f)
        curveTo(14.023f, 2.14256f, 14.3241f, 2.17623f, 14.5736f, 2.43221f)
        curveTo(14.8232f, 2.68819f, 14.8615f, 3.13198f, 14.938f, 4.01957f)
        curveTo(15.1027f, 5.92822f, 16f, 7.5f, 16f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 16.5f)
        curveTo(16f, 16.5f, 15.1027f, 18.0718f, 14.938f, 19.9804f)
        curveTo(14.8615f, 20.868f, 14.8232f, 21.3118f, 14.5736f, 21.5678f)
        curveTo(14.3241f, 21.8238f, 14.023f, 21.8574f, 13.4208f, 21.9248f)
        curveTo(13.0226f, 21.9693f, 12.549f, 22f, 12f, 22f)
        curveTo(11.451f, 22f, 10.9774f, 21.9693f, 10.5792f, 21.9248f)
        curveTo(9.97701f, 21.8574f, 9.67594f, 21.8238f, 9.42636f, 21.5678f)
        curveTo(9.17678f, 21.3118f, 9.13851f, 20.868f, 9.06196f, 19.9804f)
        curveTo(8.89734f, 18.0718f, 8f, 16.5f, 8f, 16.5f)
        }
        }.build()

        return _smartWatch01!!
    }

private var _smartWatch01: ImageVector? = null
