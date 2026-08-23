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

val HugeIcons.ImageDown: ImageVector
    get() {
        if (_imageDown != null) {
            return _imageDown!!
        }
        _imageDown = ImageVector.Builder(
            name = "ImageDown",
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
            moveTo(9.5f, 8f)
            arcTo(1.5f, 1.5f, 0f, true, false, 6.5f, 8f)
            arcTo(1.5f, 1.5f, 0f, true, false, 9.5f, 8f)
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
            moveTo(21.5f, 18.5f)
            curveTo(21.5f, 18.5f, 19.2906f, 21.5f, 18.5f, 21.5f)
            curveTo(17.7094f, 21.5f, 15.5f, 18.5f, 15.5f, 18.5f)
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
            moveTo(18.5f, 20.5f)
            verticalLineTo(14.5f)
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
            moveTo(21.5f, 11.5f)
            curveTo(21.4981f, 7.35301f, 21.4473f, 5.22972f, 20.1088f, 3.89124f)
            curveTo(18.7176f, 2.5f, 16.4784f, 2.5f, 12f, 2.5f)
            curveTo(7.52168f, 2.5f, 5.2825f, 2.5f, 3.89125f, 3.89124f)
            curveTo(2.5f, 5.28249f, 2.5f, 7.52166f, 2.5f, 12f)
            curveTo(2.5f, 16.4783f, 2.5f, 18.7175f, 3.89125f, 20.1088f)
            curveTo(5.2825f, 21.5f, 7.52168f, 21.5f, 12f, 21.5f)
            curveTo(12.3466f, 21.5f, 12.6797f, 21.5f, 13f, 21.4994f)
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
            moveTo(21.5001f, 12f)
            curveTo(21.5001f, 11.8301f, 21.5001f, 11.6635f, 21.5f, 11.5f)
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
            moveTo(15f, 12.2393f)
            curveTo(11.075f, 13.2795f, 7.91953f, 17.511f, 5f, 20.9998f)
        }
        }.build()

        return _imageDown!!
    }

private var _imageDown: ImageVector? = null
