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

val HugeIcons.TextToImage: ImageVector
    get() {
        if (_textToImage != null) {
            return _textToImage!!
        }
        _textToImage = ImageVector.Builder(
            name = "TextToImage",
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
            moveTo(4.5f, 16f)
            lineTo(7.96969f, 12.5303f)
            curveTo(8.30925f, 12.1908f, 8.7698f, 12f, 9.25002f, 12f)
            curveTo(9.73023f, 12f, 10.1908f, 12.1908f, 10.5303f, 12.5303f)
            lineTo(12.5858f, 14.5858f)
            curveTo(13.2525f, 15.2525f, 13.5858f, 15.5858f, 14f, 15.5858f)
            curveTo(14.4142f, 15.5858f, 14.7476f, 15.2525f, 15.4142f, 14.5858f)
            lineTo(15.9697f, 14.0303f)
            curveTo(16.3093f, 13.6908f, 16.7698f, 13.5f, 17.25f, 13.5f)
            curveTo(17.7302f, 13.5f, 18.1908f, 13.6908f, 18.5304f, 14.0303f)
            lineTo(20.5f, 16f)
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
            moveTo(16.5f, 9f)
            curveTo(16.7761f, 9f, 17f, 8.77614f, 17f, 8.5f)
            curveTo(17f, 8.22386f, 16.7761f, 8f, 16.5f, 8f)
            moveTo(16.5f, 9f)
            curveTo(16.2239f, 9f, 16f, 8.77614f, 16f, 8.5f)
            curveTo(16f, 8.22386f, 16.2239f, 8f, 16.5f, 8f)
            moveTo(16.5f, 9f)
            verticalLineTo(8f)
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
            curveTo(4f, 16.7712f, 4f, 18.6569f, 5.17157f, 19.8284f)
            curveTo(6.34315f, 21f, 8.22876f, 21f, 12f, 21f)
            horizontalLineTo(13f)
            curveTo(16.7712f, 21f, 18.6569f, 21f, 19.8284f, 19.8284f)
            curveTo(21f, 18.6569f, 21f, 16.7712f, 21f, 13f)
            verticalLineTo(12f)
            curveTo(21f, 8.22876f, 21f, 6.34315f, 19.8284f, 5.17157f)
            curveTo(18.6569f, 4f, 16.7712f, 4f, 13f, 4f)
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
            moveTo(5.5f, 2.5f)
            verticalLineTo(9f)
            moveTo(5.5f, 9f)
            horizontalLineTo(4f)
            moveTo(5.5f, 9f)
            horizontalLineTo(7f)
            moveTo(9f, 3f)
            curveTo(9f, 2.44772f, 8.55228f, 2f, 8f, 2f)
            horizontalLineTo(3f)
            curveTo(2.44772f, 2f, 2f, 2.44772f, 2f, 3f)
        }
        }.build()

        return _textToImage!!
    }

private var _textToImage: ImageVector? = null
