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

val HugeIcons.GalleryHorizontalEnd: ImageVector
    get() {
        if (_galleryHorizontalEnd != null) {
            return _galleryHorizontalEnd!!
        }
        _galleryHorizontalEnd = ImageVector.Builder(
            name = "GalleryHorizontalEnd",
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
            moveTo(11f, 15f)
            verticalLineTo(9f)
            curveTo(11f, 7.13077f, 11f, 6.19615f, 11.4019f, 5.5f)
            curveTo(11.6652f, 5.04394f, 12.0439f, 4.66523f, 12.5f, 4.40192f)
            curveTo(13.1962f, 4f, 14.1308f, 4f, 16f, 4f)
            curveTo(17.8692f, 4f, 18.8038f, 4f, 19.5f, 4.40192f)
            curveTo(19.9561f, 4.66523f, 20.3348f, 5.04394f, 20.5981f, 5.5f)
            curveTo(21f, 6.19615f, 21f, 7.13077f, 21f, 9f)
            verticalLineTo(15f)
            curveTo(21f, 16.8692f, 21f, 17.8038f, 20.5981f, 18.5f)
            curveTo(20.3348f, 18.9561f, 19.9561f, 19.3348f, 19.5f, 19.5981f)
            curveTo(18.8038f, 20f, 17.8692f, 20f, 16f, 20f)
            curveTo(14.1308f, 20f, 13.1962f, 20f, 12.5f, 19.5981f)
            curveTo(12.0439f, 19.3348f, 11.6652f, 18.9561f, 11.4019f, 18.5f)
            curveTo(11f, 17.8038f, 11f, 16.8692f, 11f, 15f)
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
            moveTo(7f, 6f)
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
            moveTo(3f, 8f)
            verticalLineTo(16f)
        }
        }.build()

        return _galleryHorizontalEnd!!
    }

private var _galleryHorizontalEnd: ImageVector? = null
