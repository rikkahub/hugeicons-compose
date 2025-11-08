package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChickenThighs: ImageVector
    get() {
        if (_chickenThighs != null) {
            return _chickenThighs!!
        }
        _chickenThighs = ImageVector.Builder(
            name = "ChickenThighs",
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
        moveTo(10f, 15.8446f)
        lineTo(6.68575f, 19.1589f)
        curveTo(7.45757f, 19.7089f, 7.56154f, 20.8655f, 6.88551f, 21.5416f)
        curveTo(6.27426f, 22.1528f, 5.28323f, 22.1528f, 4.67198f, 21.5416f)
        curveTo(4.19008f, 21.0597f, 4.02512f, 20.2787f, 4.30305f, 19.6969f)
        curveTo(3.72125f, 19.9749f, 2.94033f, 19.8099f, 2.45844f, 19.328f)
        curveTo(1.84719f, 18.7168f, 1.84719f, 17.7257f, 2.45844f, 17.1145f)
        curveTo(3.13447f, 16.4385f, 4.29108f, 16.5424f, 4.84114f, 17.3142f)
        lineTo(8.15538f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5368f, 3.68189f)
        curveTo(14.8712f, 1.34751f, 18.1694f, 1.53315f, 20.3181f, 3.68189f)
        curveTo(22.033f, 5.39675f, 22.4975f, 7.8437f, 21.4285f, 9.94858f)
        curveTo(19.6533f, 7.59535f, 15.6579f, 9.39829f, 16.4055f, 12.3559f)
        curveTo(14.7572f, 11.6697f, 13.3426f, 13.7886f, 14.478f, 15.0632f)
        curveTo(12.0982f, 16.0318f, 9.73049f, 16.4381f, 8.64618f, 15.3538f)
        curveTo(6.49743f, 13.2051f, 10.2024f, 6.01628f, 12.5368f, 3.68189f)
        }
        }.build()

        return _chickenThighs!!
    }

private var _chickenThighs: ImageVector? = null
