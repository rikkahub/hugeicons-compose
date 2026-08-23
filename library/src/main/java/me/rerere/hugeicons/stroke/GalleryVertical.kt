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

val HugeIcons.GalleryVertical: ImageVector
    get() {
        if (_galleryVertical != null) {
            return _galleryVertical!!
        }
        _galleryVertical = ImageVector.Builder(
            name = "GalleryVertical",
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
            moveTo(6f, 21.9995f)
            lineTo(18f, 21.9995f)
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
            moveTo(6f, 1.99951f)
            lineTo(18f, 1.99951f)
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
            moveTo(3f, 10.9995f)
            verticalLineTo(12.9995f)
            curveTo(3f, 15.3565f, 3f, 16.535f, 3.73223f, 17.2673f)
            curveTo(4.46447f, 17.9995f, 5.64298f, 17.9995f, 8f, 17.9995f)
            horizontalLineTo(16f)
            curveTo(18.357f, 17.9995f, 19.5355f, 17.9995f, 20.2678f, 17.2673f)
            curveTo(21f, 16.535f, 21f, 15.3565f, 21f, 12.9995f)
            verticalLineTo(10.9995f)
            curveTo(21f, 8.64249f, 21f, 7.46398f, 20.2678f, 6.73174f)
            curveTo(19.5355f, 5.99951f, 18.357f, 5.99951f, 16f, 5.99951f)
            lineTo(8f, 5.99951f)
            curveTo(5.64298f, 5.99951f, 4.46447f, 5.99951f, 3.73223f, 6.73174f)
            curveTo(3f, 7.46398f, 3f, 8.64249f, 3f, 10.9995f)
            close()
        }
        }.build()

        return _galleryVertical!!
    }

private var _galleryVertical: ImageVector? = null
