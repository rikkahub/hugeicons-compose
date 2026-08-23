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

val HugeIcons.AiAutoRotate: ImageVector
    get() {
        if (_aiAutoRotate != null) {
            return _aiAutoRotate!!
        }
        _aiAutoRotate = ImageVector.Builder(
            name = "AiAutoRotate",
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
            moveTo(21f, 21f)
            verticalLineTo(20f)
            curveTo(21f, 18.1144f, 21f, 17.1716f, 20.4142f, 16.5858f)
            curveTo(19.8284f, 16f, 18.8856f, 16f, 17f, 16f)
            horizontalLineTo(16f)
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
            moveTo(3f, 12f)
            curveTo(3f, 16.9706f, 7.02944f, 21f, 12f, 21f)
            curveTo(15.6737f, 21f, 18.0821f, 19.313f, 20f, 16.7137f)
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
            moveTo(3f, 3f)
            verticalLineTo(4f)
            curveTo(3f, 5.88562f, 3f, 6.82843f, 3.58579f, 7.41421f)
            curveTo(4.17157f, 8f, 5.11438f, 8f, 7f, 8f)
            horizontalLineTo(8f)
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
            moveTo(15f, 3.51212f)
            curveTo(14.0617f, 3.18046f, 13.0519f, 3f, 12f, 3f)
            curveTo(8.32632f, 3f, 5.91788f, 4.68699f, 4f, 7.2863f)
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
            moveTo(19.5f, 5.9375f)
            verticalLineTo(7.5f)
            moveTo(19.5f, 7.5f)
            verticalLineTo(9.0625f)
            moveTo(19.5f, 7.5f)
            horizontalLineTo(18.25f)
            moveTo(19.5f, 7.5f)
            horizontalLineTo(20.75f)
            moveTo(22f, 7.5f)
            lineTo(20.9156f, 7.13852f)
            curveTo(20.4179f, 6.97263f, 20.0274f, 6.58211f, 19.8615f, 6.08443f)
            lineTo(19.5f, 5f)
            lineTo(19.1385f, 6.08443f)
            curveTo(18.9726f, 6.58211f, 18.5821f, 6.97263f, 18.0844f, 7.13852f)
            lineTo(17f, 7.5f)
            lineTo(18.0844f, 7.86148f)
            curveTo(18.5821f, 8.02737f, 18.9726f, 8.41789f, 19.1385f, 8.91557f)
            lineTo(19.5f, 10f)
            lineTo(19.8615f, 8.91557f)
            curveTo(20.0274f, 8.41789f, 20.4179f, 8.02737f, 20.9156f, 7.86148f)
            lineTo(22f, 7.5f)
            close()
        }
        }.build()

        return _aiAutoRotate!!
    }

private var _aiAutoRotate: ImageVector? = null
