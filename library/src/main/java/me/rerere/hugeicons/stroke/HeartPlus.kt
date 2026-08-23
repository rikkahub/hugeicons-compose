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

val HugeIcons.HeartPlus: ImageVector
    get() {
        if (_heartPlus != null) {
            return _heartPlus!!
        }
        _heartPlus = ImageVector.Builder(
            name = "HeartPlus",
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
            moveTo(15f, 16f)
            horizontalLineTo(21f)
            moveTo(18f, 13f)
            verticalLineTo(19f)
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
            moveTo(14f, 20.1561f)
            curveTo(13.8577f, 20.2656f, 13.7205f, 20.3696f, 13.5893f, 20.4677f)
            curveTo(12.6399f, 21.1776f, 11.3601f, 21.1776f, 10.4107f, 20.4677f)
            curveTo(7.58942f, 18.358f, 2f, 13.5348f, 2f, 9.19444f)
            curveTo(2f, 6.32563f, 4.10526f, 4f, 7f, 4f)
            curveTo(8.5f, 4f, 10f, 4.5f, 12f, 6.5f)
            curveTo(14f, 4.5f, 15.5f, 4f, 17f, 4f)
            curveTo(19.8947f, 4f, 22f, 6.32563f, 22f, 9.19444f)
            curveTo(22f, 9.78996f, 21.8948f, 10.3946f, 21.7059f, 11f)
        }
        }.build()

        return _heartPlus!!
    }

private var _heartPlus: ImageVector? = null
