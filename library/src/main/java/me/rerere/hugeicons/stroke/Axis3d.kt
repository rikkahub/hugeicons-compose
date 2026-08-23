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

val HugeIcons.Axis3d: ImageVector
    get() {
        if (_axis3d != null) {
            return _axis3d!!
        }
        _axis3d = ImageVector.Builder(
            name = "Axis3d",
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
            moveTo(21.5f, 19.5f)
            horizontalLineTo(10.5f)
            curveTo(7.67157f, 19.5f, 6.25736f, 19.5f, 5.37868f, 18.6213f)
            curveTo(4.5f, 17.7426f, 4.5f, 16.3284f, 4.5f, 13.5f)
            verticalLineTo(2.5f)
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
            moveTo(6.5f, 4.49998f)
            curveTo(6.5f, 4.49998f, 5.02702f, 2.5f, 4.49998f, 2.5f)
            curveTo(3.97295f, 2.5f, 2.5f, 4.5f, 2.5f, 4.5f)
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
            moveTo(19.5f, 21.5f)
            curveTo(19.5f, 21.5f, 21.5f, 20.027f, 21.5f, 19.5f)
            curveTo(21.5f, 18.9729f, 19.5f, 17.5f, 19.5f, 17.5f)
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
            moveTo(17.5f, 9.32818f)
            curveTo(17.5f, 9.32818f, 17.8727f, 6.87243f, 17.5f, 6.49976f)
            curveTo(17.1273f, 6.12708f, 14.6716f, 6.49977f, 14.6716f, 6.49977f)
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
            moveTo(5.5f, 18.5f)
            lineTo(16.5f, 7.5f)
        }
        }.build()

        return _axis3d!!
    }

private var _axis3d: ImageVector? = null
