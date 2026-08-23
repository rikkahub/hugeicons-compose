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

val HugeIcons.Idea01: ImageVector
    get() {
        if (_idea01 != null) {
            return _idea01!!
        }
        _idea01 = ImageVector.Builder(
            name = "Idea01",
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
            moveTo(8f, 16.4998f)
            curveTo(6.7725f, 15.4011f, 6f, 13.7768f, 6f, 11.9998f)
            curveTo(6f, 8.68605f, 8.68629f, 5.99976f, 12f, 5.99976f)
            curveTo(15.3137f, 5.99976f, 18f, 8.68605f, 18f, 11.9998f)
            curveTo(18f, 13.7768f, 17.2275f, 15.4011f, 16f, 16.4998f)
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
            moveTo(12f, 11.9998f)
            verticalLineTo(16.4998f)
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
            moveTo(9.5f, 18.9998f)
            horizontalLineTo(14.5f)
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
            moveTo(10.5f, 21.4998f)
            horizontalLineTo(13.5f)
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
            moveTo(3.5f, 11.9998f)
            horizontalLineTo(2.5f)
            moveTo(5.98438f, 5.97632f)
            lineTo(5.23438f, 5.23022f)
            moveTo(18.0195f, 5.97632f)
            lineTo(18.7695f, 5.23022f)
            moveTo(21.5f, 11.9998f)
            horizontalLineTo(20.5f)
            moveTo(12f, 2.49976f)
            verticalLineTo(3.49976f)
        }
        }.build()

        return _idea01!!
    }

private var _idea01: ImageVector? = null
