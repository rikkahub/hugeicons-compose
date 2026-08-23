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

val HugeIcons.Pickaxe: ImageVector
    get() {
        if (_pickaxe != null) {
            return _pickaxe!!
        }
        _pickaxe = ImageVector.Builder(
            name = "Pickaxe",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14.3983f, 5.8385f)
            verticalLineTo(5.8385f)
            curveTo(13.7682f, 5.8385f, 13.2612f, 6.34556f, 12.2471f, 7.35969f)
            curveTo(11.2329f, 8.37381f, 10.7259f, 8.88087f, 10.7259f, 9.51097f)
            curveTo(10.7259f, 10.1411f, 11.2329f, 10.6481f, 12.2471f, 11.6623f)
            curveTo(13.2612f, 12.6764f, 13.7682f, 13.1834f, 14.3983f, 13.1834f)
            verticalLineTo(13.1834f)
            moveTo(10.7259f, 9.51097f)
            verticalLineTo(9.51097f)
            close()
            moveTo(14.3983f, 13.1834f)
            curveTo(15.0284f, 13.1834f, 15.5355f, 12.6764f, 16.5496f, 11.6623f)
            curveTo(17.5637f, 10.6481f, 18.0708f, 10.1411f, 18.0708f, 9.51097f)
            moveTo(18.0708f, 9.51097f)
            curveTo(18.0708f, 8.88087f, 17.5637f, 8.37381f, 16.5496f, 7.35969f)
            curveTo(15.5355f, 6.34556f, 15.0284f, 5.8385f, 14.3983f, 5.8385f)
            moveTo(18.0708f, 9.51097f)
            verticalLineTo(9.51097f)
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
            moveTo(11.2745f, 10.6884f)
            lineTo(3.16158f, 18.8014f)
            curveTo(2.6015f, 19.3614f, 2.6015f, 20.2695f, 3.16158f, 20.8296f)
            curveTo(3.72166f, 21.3897f, 4.62973f, 21.3897f, 5.18981f, 20.8296f)
            lineTo(13.3027f, 12.7166f)
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
            moveTo(17.8674f, 11.1949f)
            lineTo(20.4027f, 13.7303f)
            curveTo(21.5229f, 14.8504f, 21.5229f, 16.6666f, 20.4027f, 17.7868f)
            lineTo(15.8392f, 13.2232f)
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
            moveTo(12.7942f, 6.12507f)
            lineTo(10.2589f, 3.58976f)
            curveTo(9.13875f, 2.46959f, 7.32262f, 2.46959f, 6.20245f, 3.58976f)
            lineTo(10.766f, 8.15332f)
        }
        }.build()

        return _pickaxe!!
    }

private var _pickaxe: ImageVector? = null
