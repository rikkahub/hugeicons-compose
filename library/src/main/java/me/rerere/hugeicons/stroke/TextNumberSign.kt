package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TextNumberSign: ImageVector
    get() {
        if (_textNumberSign != null) {
            return _textNumberSign!!
        }
        _textNumberSign = ImageVector.Builder(
            name = "TextNumberSign",
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
        moveTo(2f, 20f)
        verticalLineTo(7.02172f)
        curveTo(2f, 5.10465f, 2f, 4.00007f, 2.4389f, 4.00007f)
        curveTo(2.95995f, 4.00007f, 3.33531f, 4.66033f, 4.25033f, 6.27292f)
        lineTo(10.7497f, 17.7271f)
        curveTo(11.6647f, 19.3397f, 12.0233f, 20f, 12.5611f, 20f)
        curveTo(13f, 20f, 13f, 18.8954f, 13f, 16.9784f)
        verticalLineTo(4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 13f)
        lineTo(22f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5806f, 4.58081f)
        curveTo(17.3546f, 3.80672f, 20.6454f, 3.80672f, 21.4194f, 4.58081f)
        curveTo(22.1935f, 5.35489f, 22.1935f, 8.6456f, 21.4194f, 9.41968f)
        curveTo(20.6454f, 10.1938f, 17.3546f, 10.1938f, 16.5806f, 9.41968f)
        curveTo(15.8065f, 8.6456f, 15.8065f, 5.35489f, 16.5806f, 4.58081f)
        }
        }.build()

        return _textNumberSign!!
    }

private var _textNumberSign: ImageVector? = null
