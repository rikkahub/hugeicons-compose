package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BorderTop01: ImageVector
    get() {
        if (_borderTop01 != null) {
            return _borderTop01!!
        }
        _borderTop01 = ImageVector.Builder(
            name = "BorderTop01",
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
        moveTo(21.5001f, 6.50006f)
        curveTo(21.3015f, 5.40612f, 20.9504f, 4.60102f, 20.3293f, 3.96453f)
        curveTo(18.9002f, 2.50006f, 16.6001f, 2.50006f, 12.0001f, 2.50006f)
        curveTo(7.39997f, 2.50006f, 5.09993f, 2.50006f, 3.67086f, 3.96453f)
        curveTo(3.04975f, 4.60102f, 2.6986f, 5.40612f, 2.50006f, 6.50006f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.2486f, 17.6897f)
        curveTo(21.0554f, 18.7318f, 20.7135f, 19.4987f, 20.1088f, 20.105f)
        curveTo(19.5041f, 20.7113f, 18.7393f, 21.0541f, 17.7001f, 21.248f)
        moveTo(21.4951f, 10.0001f)
        curveTo(21.5001f, 10.5861f, 21.5001f, 11.2884f, 21.5001f, 11.9742f)
        curveTo(21.5001f, 12.6599f, 21.5001f, 13.4249f, 21.4951f, 14.011f)
        moveTo(13.9001f, 21.4951f)
        curveTo(13.3156f, 21.5001f, 12.684f, 21.5001f, 12.0001f, 21.5001f)
        curveTo(11.3161f, 21.5001f, 10.6844f, 21.5001f, 10.1f, 21.4951f)
        moveTo(6.30006f, 21.2479f)
        curveTo(5.26082f, 21.0541f, 4.49598f, 20.7113f, 3.8913f, 20.105f)
        curveTo(3.28663f, 19.4987f, 2.94477f, 18.7318f, 2.75149f, 17.6897f)
        moveTo(2.50501f, 10.0001f)
        curveTo(2.50006f, 10.5861f, 2.50006f, 11.2884f, 2.50006f, 11.9742f)
        curveTo(2.50006f, 12.6599f, 2.50006f, 13.425f, 2.50501f, 14.011f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5001f, 12.0001f)
        lineTo(20.0001f, 12.0001f)
        moveTo(4.00006f, 12.0001f)
        lineTo(2.50006f, 12.0001f)
        moveTo(12.0001f, 9.00006f)
        lineTo(12.0001f, 15.0001f)
        moveTo(12.0001f, 19.5313f)
        lineTo(12.0001f, 21.0001f)
        moveTo(15.0001f, 12.0001f)
        lineTo(9.00006f, 12.0001f)
        }
        }.build()

        return _borderTop01!!
    }

private var _borderTop01: ImageVector? = null
