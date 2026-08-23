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

val HugeIcons.GalleryHorizontal: ImageVector
    get() {
        if (_galleryHorizontal != null) {
            return _galleryHorizontal!!
        }
        _galleryHorizontal = ImageVector.Builder(
            name = "GalleryHorizontal",
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
            moveTo(2f, 6f)
            verticalLineTo(18f)
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
            moveTo(22f, 6f)
            verticalLineTo(18f)
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
            moveTo(13f, 3f)
            lineTo(11f, 3f)
            curveTo(8.64298f, 3f, 7.46447f, 3f, 6.73223f, 3.73223f)
            curveTo(6f, 4.46447f, 6f, 5.64298f, 6f, 8f)
            lineTo(6f, 16f)
            curveTo(6f, 18.357f, 6f, 19.5355f, 6.73223f, 20.2678f)
            curveTo(7.46447f, 21f, 8.64298f, 21f, 11f, 21f)
            horizontalLineTo(13f)
            curveTo(15.357f, 21f, 16.5355f, 21f, 17.2678f, 20.2678f)
            curveTo(18f, 19.5355f, 18f, 18.357f, 18f, 16f)
            verticalLineTo(8f)
            curveTo(18f, 5.64298f, 18f, 4.46447f, 17.2678f, 3.73223f)
            curveTo(16.5355f, 3f, 15.357f, 3f, 13f, 3f)
            close()
        }
        }.build()

        return _galleryHorizontal!!
    }

private var _galleryHorizontal: ImageVector? = null
