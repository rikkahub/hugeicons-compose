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

val HugeIcons.ALargeSmall: ImageVector
    get() {
        if (_aLargeSmall != null) {
            return _aLargeSmall!!
        }
        _aLargeSmall = ImageVector.Builder(
            name = "ALargeSmall",
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
            moveTo(2f, 17f)
            lineTo(4.62734f, 9.99376f)
            curveTo(5.41378f, 7.89659f, 5.807f, 7f, 6.5f, 7f)
            curveTo(7.193f, 7f, 7.58622f, 7.89659f, 8.37266f, 9.99376f)
            lineTo(11f, 17f)
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
            moveTo(15f, 17.0003f)
            lineTo(16.6123f, 12.3937f)
            curveTo(17.3978f, 10.1495f, 17.7905f, 9.02734f, 18.5f, 9.02734f)
            curveTo(19.2095f, 9.02734f, 19.6022f, 10.1495f, 20.3877f, 12.3937f)
            lineTo(22f, 17.0003f)
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
            moveTo(16.5f, 14f)
            horizontalLineTo(20.5f)
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
            moveTo(4f, 13f)
            horizontalLineTo(9f)
        }
        }.build()

        return _aLargeSmall!!
    }

private var _aLargeSmall: ImageVector? = null
