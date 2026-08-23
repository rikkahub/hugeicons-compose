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

val HugeIcons.TextInitial: ImageVector
    get() {
        if (_textInitial != null) {
            return _textInitial!!
        }
        _textInitial = ImageVector.Builder(
            name = "TextInitial",
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
            moveTo(13.5859f, 3f)
            horizontalLineTo(20.9977f)
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
            moveTo(13.5859f, 9f)
            horizontalLineTo(20.9977f)
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
            moveTo(3f, 15f)
            horizontalLineTo(21f)
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
            moveTo(3f, 21f)
            horizontalLineTo(21f)
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
            moveTo(9f, 9f)
            lineTo(7.71429f, 6f)
            moveTo(7.71429f, 6f)
            lineTo(6.58623f, 3.36786f)
            curveTo(6.55491f, 3.2948f, 6.53926f, 3.25827f, 6.51945f, 3.22724f)
            curveTo(6.44354f, 3.10832f, 6.31395f, 3.027f, 6.16623f, 3.00559f)
            curveTo(6.12769f, 3f, 6.08512f, 3f, 6f, 3f)
            curveTo(5.91488f, 3f, 5.87231f, 3f, 5.83377f, 3.00559f)
            curveTo(5.68605f, 3.027f, 5.55646f, 3.10831f, 5.48055f, 3.22724f)
            curveTo(5.46074f, 3.25826f, 5.44509f, 3.2948f, 5.41377f, 3.36786f)
            lineTo(4.28571f, 6f)
            moveTo(7.71429f, 6f)
            lineTo(4.28571f, 6f)
            moveTo(4.28571f, 6f)
            lineTo(3f, 9f)
        }
        }.build()

        return _textInitial!!
    }

private var _textInitial: ImageVector? = null
