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

val HugeIcons.GalleryVerticalEnd: ImageVector
    get() {
        if (_galleryVerticalEnd != null) {
            return _galleryVerticalEnd!!
        }
        _galleryVerticalEnd = ImageVector.Builder(
            name = "GalleryVerticalEnd",
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
            moveTo(6f, 1.99756f)
            lineTo(18f, 1.99756f)
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
            moveTo(3f, 16.998f)
            lineTo(3f, 14.998f)
            curveTo(3f, 12.641f, 3f, 11.4625f, 3.73223f, 10.7303f)
            curveTo(4.46447f, 9.99805f, 5.64298f, 9.99805f, 8f, 9.99805f)
            horizontalLineTo(16f)
            curveTo(18.357f, 9.99805f, 19.5355f, 9.99805f, 20.2678f, 10.7303f)
            curveTo(21f, 11.4625f, 21f, 12.641f, 21f, 14.998f)
            verticalLineTo(16.998f)
            curveTo(21f, 19.3551f, 21f, 20.5336f, 20.2678f, 21.2658f)
            curveTo(19.5355f, 21.998f, 18.357f, 21.998f, 16f, 21.998f)
            lineTo(8f, 21.998f)
            curveTo(5.64298f, 21.998f, 4.46447f, 21.998f, 3.73223f, 21.2658f)
            curveTo(3f, 20.5336f, 3f, 19.3551f, 3f, 16.998f)
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
            moveTo(4f, 5.99805f)
            lineTo(20f, 5.99805f)
        }
        }.build()

        return _galleryVerticalEnd!!
    }

private var _galleryVerticalEnd: ImageVector? = null
