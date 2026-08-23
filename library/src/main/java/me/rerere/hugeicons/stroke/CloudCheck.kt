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

val HugeIcons.CloudCheck: ImageVector
    get() {
        if (_cloudCheck != null) {
            return _cloudCheck!!
        }
        _cloudCheck = ImageVector.Builder(
            name = "CloudCheck",
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
            moveTo(17.4776f, 10.0001f)
            curveTo(17.485f, 10f, 17.4925f, 10f, 17.5f, 10f)
            curveTo(19.9853f, 10f, 22f, 12.0147f, 22f, 14.5f)
            curveTo(22f, 16.4593f, 20.7478f, 18.1262f, 19f, 18.7439f)
            moveTo(17.1251f, 11.5f)
            curveTo(17.3093f, 11.0282f, 17.4303f, 10.5248f, 17.4776f, 10.0001f)
            curveTo(17.4924f, 9.83536f, 17.5f, 9.66856f, 17.5f, 9.5f)
            curveTo(17.5f, 6.46243f, 15.0376f, 4f, 12f, 4f)
            curveTo(9.12324f, 4f, 6.76233f, 6.20862f, 6.52042f, 9.0227f)
            moveTo(6.52042f, 9.0227f)
            curveTo(3.98398f, 9.26407f, 2f, 11.4003f, 2f, 14f)
            curveTo(2f, 16.0503f, 3.2341f, 17.8124f, 5f, 18.584f)
            moveTo(6.52042f, 9.0227f)
            curveTo(6.67826f, 9.00768f, 6.83823f, 9f, 7f, 9f)
            curveTo(7.7111f, 9f, 8.38754f, 9.14845f, 9f, 9.41604f)
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
            moveTo(9.5f, 19f)
            lineTo(11.5f, 21f)
            lineTo(16.5f, 16f)
        }
        }.build()

        return _cloudCheck!!
    }

private var _cloudCheck: ImageVector? = null
