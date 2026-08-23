package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareRadical: ImageVector
    get() {
        if (_squareRadical != null) {
            return _squareRadical!!
        }
        _squareRadical = ImageVector.Builder(
            name = "SquareRadical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(6.98438f, 13.0103f)
            curveTo(7.44812f, 12.7553f, 7.85438f, 12.6633f, 8.05514f, 12.8363f)
            curveTo(8.25591f, 13.0093f, 8.68328f, 13.8017f, 8.85822f, 14.1079f)
            curveTo(9.12591f, 14.5763f, 9.43377f, 15.5133f, 9.96915f, 15.5133f)
            curveTo(10.3305f, 15.5133f, 10.6208f, 14.5348f, 11.0935f, 13.3717f)
            curveTo(11.8133f, 11.6001f, 12.6186f, 9.35756f, 12.7398f, 9.15556f)
            curveTo(12.9405f, 8.82094f, 13.1413f, 8.48633f, 13.6767f, 8.48633f)
            curveTo(14.279f, 8.48633f, 17.0228f, 8.48633f, 17.0228f, 8.48633f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2.49219f, 12f)
            curveTo(2.49219f, 7.52166f, 2.49219f, 5.28249f, 3.88343f, 3.89124f)
            curveTo(5.27468f, 2.5f, 7.51385f, 2.5f, 11.9922f, 2.5f)
            curveTo(16.4705f, 2.5f, 18.7097f, 2.5f, 20.101f, 3.89124f)
            curveTo(21.4922f, 5.28249f, 21.4922f, 7.52166f, 21.4922f, 12f)
            curveTo(21.4922f, 16.4783f, 21.4922f, 18.7175f, 20.101f, 20.1088f)
            curveTo(18.7097f, 21.5f, 16.4705f, 21.5f, 11.9922f, 21.5f)
            curveTo(7.51385f, 21.5f, 5.27468f, 21.5f, 3.88343f, 20.1088f)
            curveTo(2.49219f, 18.7175f, 2.49219f, 16.4783f, 2.49219f, 12f)
            close()
        }
        }.build()

        return _squareRadical!!
    }

private var _squareRadical: ImageVector? = null
