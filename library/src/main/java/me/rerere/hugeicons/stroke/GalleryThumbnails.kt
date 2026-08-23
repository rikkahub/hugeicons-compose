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

val HugeIcons.GalleryThumbnails: ImageVector
    get() {
        if (_galleryThumbnails != null) {
            return _galleryThumbnails!!
        }
        _galleryThumbnails = ImageVector.Builder(
            name = "GalleryThumbnails",
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
            moveTo(3f, 9f)
            verticalLineTo(11f)
            curveTo(3f, 13.357f, 3f, 14.5355f, 3.73223f, 15.2678f)
            curveTo(4.46447f, 16f, 5.64298f, 16f, 8f, 16f)
            horizontalLineTo(16f)
            curveTo(18.357f, 16f, 19.5355f, 16f, 20.2678f, 15.2678f)
            curveTo(21f, 14.5355f, 21f, 13.357f, 21f, 11f)
            verticalLineTo(9f)
            curveTo(21f, 6.64298f, 21f, 5.46447f, 20.2678f, 4.73223f)
            curveTo(19.5355f, 4f, 18.357f, 4f, 16f, 4f)
            horizontalLineTo(8f)
            curveTo(5.64298f, 4f, 4.46447f, 4f, 3.73223f, 4.73223f)
            curveTo(3f, 5.46447f, 3f, 6.64298f, 3f, 9f)
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
            moveTo(4.5f, 20.25f)
            verticalLineTo(20.5f)
            moveTo(5f, 20.5f)
            curveTo(5f, 20.7761f, 4.77614f, 21f, 4.5f, 21f)
            curveTo(4.22386f, 21f, 4f, 20.7761f, 4f, 20.5f)
            curveTo(4f, 20.2239f, 4.22386f, 20f, 4.5f, 20f)
            curveTo(4.77614f, 20f, 5f, 20.2239f, 5f, 20.5f)
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
            moveTo(9.5f, 20.25f)
            verticalLineTo(20.5f)
            moveTo(10f, 20.5f)
            curveTo(10f, 20.7761f, 9.77614f, 21f, 9.5f, 21f)
            curveTo(9.22386f, 21f, 9f, 20.7761f, 9f, 20.5f)
            curveTo(9f, 20.2239f, 9.22386f, 20f, 9.5f, 20f)
            curveTo(9.77614f, 20f, 10f, 20.2239f, 10f, 20.5f)
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
            moveTo(14.5f, 20.25f)
            verticalLineTo(20.5f)
            moveTo(15f, 20.5f)
            curveTo(15f, 20.7761f, 14.7761f, 21f, 14.5f, 21f)
            curveTo(14.2239f, 21f, 14f, 20.7761f, 14f, 20.5f)
            curveTo(14f, 20.2239f, 14.2239f, 20f, 14.5f, 20f)
            curveTo(14.7761f, 20f, 15f, 20.2239f, 15f, 20.5f)
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
            moveTo(19.5f, 20.25f)
            verticalLineTo(20.5f)
            moveTo(20f, 20.5f)
            curveTo(20f, 20.7761f, 19.7761f, 21f, 19.5f, 21f)
            curveTo(19.2239f, 21f, 19f, 20.7761f, 19f, 20.5f)
            curveTo(19f, 20.2239f, 19.2239f, 20f, 19.5f, 20f)
            curveTo(19.7761f, 20f, 20f, 20.2239f, 20f, 20.5f)
            close()
        }
        }.build()

        return _galleryThumbnails!!
    }

private var _galleryThumbnails: ImageVector? = null
