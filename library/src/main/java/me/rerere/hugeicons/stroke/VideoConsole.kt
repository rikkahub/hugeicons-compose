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

val HugeIcons.VideoConsole: ImageVector
    get() {
        if (_videoConsole != null) {
            return _videoConsole!!
        }
        _videoConsole = ImageVector.Builder(
            name = "VideoConsole",
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
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(3f, 10f)
            curveTo(3f, 6.22876f, 3f, 4.34315f, 4.17157f, 3.17157f)
            curveTo(5.34315f, 2f, 7.22876f, 2f, 11f, 2f)
            horizontalLineTo(13f)
            curveTo(16.7712f, 2f, 18.6569f, 2f, 19.8284f, 3.17157f)
            curveTo(21f, 4.34315f, 21f, 6.22876f, 21f, 10f)
            verticalLineTo(14f)
            curveTo(21f, 17.7712f, 21f, 19.6569f, 19.8284f, 20.8284f)
            curveTo(18.6569f, 22f, 16.7712f, 22f, 13f, 22f)
            horizontalLineTo(11f)
            curveTo(7.22876f, 22f, 5.34315f, 22f, 4.17157f, 20.8284f)
            curveTo(3f, 19.6569f, 3f, 17.7712f, 3f, 14f)
            verticalLineTo(10f)
            close()
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
            moveTo(10f, 18f)
            lineTo(8.5f, 16.5f)
            moveTo(8.5f, 16.5f)
            lineTo(7f, 15f)
            moveTo(8.5f, 16.5f)
            lineTo(7f, 18f)
            moveTo(8.5f, 16.5f)
            lineTo(10f, 15f)
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
            moveTo(3f, 11f)
            horizontalLineTo(21f)
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
            moveTo(15.125f, 18f)
            horizontalLineTo(15f)
            moveTo(15.25f, 18f)
            curveTo(15.25f, 18.1381f, 15.1381f, 18.25f, 15f, 18.25f)
            curveTo(14.8619f, 18.25f, 14.75f, 18.1381f, 14.75f, 18f)
            curveTo(14.75f, 17.8619f, 14.8619f, 17.75f, 15f, 17.75f)
            curveTo(15.1381f, 17.75f, 15.25f, 17.8619f, 15.25f, 18f)
            close()
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
            moveTo(17.125f, 15f)
            horizontalLineTo(17f)
            moveTo(17.25f, 15f)
            curveTo(17.25f, 15.1381f, 17.1381f, 15.25f, 17f, 15.25f)
            curveTo(16.8619f, 15.25f, 16.75f, 15.1381f, 16.75f, 15f)
            curveTo(16.75f, 14.8619f, 16.8619f, 14.75f, 17f, 14.75f)
            curveTo(17.1381f, 14.75f, 17.25f, 14.8619f, 17.25f, 15f)
            close()
        }
        }.build()

        return _videoConsole!!
    }

private var _videoConsole: ImageVector? = null
