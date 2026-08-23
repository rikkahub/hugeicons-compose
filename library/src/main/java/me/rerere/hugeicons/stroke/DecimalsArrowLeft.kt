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

val HugeIcons.DecimalsArrowLeft: ImageVector
    get() {
        if (_decimalsArrowLeft != null) {
            return _decimalsArrowLeft!!
        }
        _decimalsArrowLeft = ImageVector.Builder(
            name = "DecimalsArrowLeft",
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
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12.998f, 11f)
            verticalLineTo(7f)
            curveTo(12.998f, 5.34315f, 11.6549f, 4f, 9.99805f, 4f)
            curveTo(8.34119f, 4f, 6.99805f, 5.34315f, 6.99805f, 7f)
            verticalLineTo(11f)
            curveTo(6.99805f, 12.6569f, 8.34119f, 14f, 9.99805f, 14f)
            curveTo(11.6549f, 14f, 12.998f, 12.6569f, 12.998f, 11f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(4.24902f, 13.625f)
            verticalLineTo(13.75f)
            moveTo(4.49902f, 13.75f)
            curveTo(4.49902f, 13.8881f, 4.38709f, 14f, 4.24902f, 14f)
            curveTo(4.11095f, 14f, 3.99902f, 13.8881f, 3.99902f, 13.75f)
            curveTo(3.99902f, 13.6119f, 4.11095f, 13.5f, 4.24902f, 13.5f)
            curveTo(4.38709f, 13.5f, 4.49902f, 13.6119f, 4.49902f, 13.75f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(13.908f, 18.5f)
            horizontalLineTo(14.923f)
            moveTo(14.923f, 18.5f)
            horizontalLineTo(19.998f)
            moveTo(14.923f, 18.5f)
            verticalLineTo(17.7748f)
            curveTo(14.923f, 17.3049f, 14.923f, 17.07f, 14.7663f, 17.0115f)
            curveTo(14.6097f, 16.9531f, 14.4253f, 17.1192f, 14.0566f, 17.4514f)
            lineTo(13.2518f, 18.1766f)
            curveTo(13.0826f, 18.3291f, 12.998f, 18.4053f, 12.998f, 18.5f)
            curveTo(12.998f, 18.5947f, 13.0826f, 18.6709f, 13.2518f, 18.8234f)
            lineTo(14.0566f, 19.5486f)
            curveTo(14.4253f, 19.8808f, 14.6097f, 20.0469f, 14.7663f, 19.9885f)
            curveTo(14.923f, 19.93f, 14.923f, 19.6951f, 14.923f, 19.2252f)
            verticalLineTo(18.5f)
            close()
        }
        }.build()

        return _decimalsArrowLeft!!
    }

private var _decimalsArrowLeft: ImageVector? = null
