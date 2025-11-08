package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Van: ImageVector
    get() {
        if (_van != null) {
            return _van!!
        }
        _van = ImageVector.Builder(
            name = "Van",
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
        moveTo(12f, 6f)
        lineTo(12.9536f, 9.85977f)
        curveTo(13.119f, 10.5295f, 13.72f, 11f, 14.4098f, 11f)
        horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 6f)
        horizontalLineTo(13.0689f)
        curveTo(14.6176f, 6f, 15.3919f, 6f, 16.0484f, 6.34597f)
        curveTo(16.705f, 6.69194f, 17.1427f, 7.33069f, 18.0182f, 8.60818f)
        curveTo(18.6321f, 9.50396f, 19.2765f, 10.1542f, 20.1826f, 10.7326f)
        curveTo(21.0949f, 11.315f, 21.5287f, 11.5996f, 21.7694f, 12.0566f)
        curveTo(22f, 12.4942f, 22f, 13.0125f, 22f, 14.049f)
        curveTo(22f, 15.4156f, 22f, 16.0989f, 21.5875f, 16.5331f)
        curveTo(21.5699f, 16.5517f, 21.5517f, 16.5699f, 21.5331f, 16.5875f)
        curveTo(21.0989f, 17f, 20.4156f, 17f, 19.049f, 17f)
        moveTo(5f, 17f)
        curveTo(4.67926f, 17f, 4.38501f, 17f, 4.22939f, 16.9666f)
        curveTo(4.07377f, 16.9332f, 3.92752f, 16.8674f, 3.63503f, 16.7358f)
        lineTo(2f, 16f)
        curveTo(2f, 12.8056f, 2.47904f, 10.9623f, 3.10557f, 9.44992f)
        curveTo(3.5164f, 8.45825f, 3.72182f, 7.96241f, 3.63686f, 7.52064f)
        curveTo(3.5519f, 7.07887f, 2.5f, 6f, 2.5f, 6f)
        moveTo(9f, 17f)
        horizontalLineTo(15f)
        }
        }.build()

        return _van!!
    }

private var _van: ImageVector? = null
