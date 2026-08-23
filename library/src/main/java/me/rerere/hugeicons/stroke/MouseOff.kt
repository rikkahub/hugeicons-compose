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

val HugeIcons.MouseOff: ImageVector
    get() {
        if (_mouseOff != null) {
            return _mouseOff!!
        }
        _mouseOff = ImageVector.Builder(
            name = "MouseOff",
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
            moveTo(11.9922f, 7f)
            verticalLineTo(5.5f)
        }

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
            moveTo(1.99219f, 2f)
            lineTo(21.9922f, 22f)
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
            moveTo(7.96484f, 2.97169f)
            curveTo(9.00222f, 2.34925f, 10.3234f, 2f, 11.9931f, 2f)
            curveTo(17.9932f, 2f, 19.4932f, 6.50998f, 19.4932f, 12f)
            curveTo(19.4932f, 12.8223f, 19.4595f, 13.6225f, 19.3821f, 14.389f)
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
            moveTo(5.62695f, 5.60645f)
            curveTo(4.78443f, 7.34428f, 4.49219f, 9.57666f, 4.49219f, 12f)
            curveTo(4.49219f, 17.49f, 5.99212f, 22f, 11.9922f, 22f)
            curveTo(15.0244f, 22f, 16.9074f, 20.8481f, 18.0282f, 19f)
        }
        }.build()

        return _mouseOff!!
    }

private var _mouseOff: ImageVector? = null
