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

val HugeIcons.ImagePlus: ImageVector
    get() {
        if (_imagePlus != null) {
            return _imagePlus!!
        }
        _imagePlus = ImageVector.Builder(
            name = "ImagePlus",
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
            moveTo(21.5f, 18.5f)
            horizontalLineTo(18.5f)
            moveTo(18.5f, 18.5f)
            horizontalLineTo(15.5f)
            moveTo(18.5f, 18.5f)
            verticalLineTo(15.5f)
            moveTo(18.5f, 18.5f)
            verticalLineTo(21.5f)
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
            moveTo(9f, 7.5f)
            arcTo(1.5f, 1.5f, 0f, true, false, 6f, 7.5f)
            arcTo(1.5f, 1.5f, 0f, true, false, 9f, 7.5f)
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
            moveTo(11.5f, 21.5f)
            curveTo(7.35301f, 21.4981f, 5.22972f, 21.4473f, 3.89124f, 20.1088f)
            curveTo(2.5f, 18.7176f, 2.5f, 16.4784f, 2.5f, 12f)
            curveTo(2.5f, 7.52168f, 2.5f, 5.2825f, 3.89124f, 3.89125f)
            curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
            curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89125f)
            curveTo(21.5f, 5.2825f, 21.5f, 7.52168f, 21.5f, 12f)
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
            moveTo(13.0018f, 13.0616f)
            curveTo(10.1493f, 14.6467f, 7.70477f, 17.7414f, 5.41797f, 20.5f)
        }
        }.build()

        return _imagePlus!!
    }

private var _imagePlus: ImageVector? = null
