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

val HugeIcons.Codepen: ImageVector
    get() {
        if (_codepen != null) {
            return _codepen!!
        }
        _codepen = ImageVector.Builder(
            name = "Codepen",
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
            moveTo(21f, 15f)
            lineTo(12f, 9.5f)
            lineTo(2.5f, 15f)
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
            moveTo(12f, 9.5f)
            verticalLineTo(3f)
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
            moveTo(21f, 9f)
            lineTo(12f, 14.5f)
            lineTo(2.5f, 9f)
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
            moveTo(12f, 14.5f)
            verticalLineTo(21f)
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
            moveTo(19.7249f, 7.03077f)
            lineTo(14.7249f, 3.78702f)
            curveTo(13.4024f, 2.92901f, 12.7411f, 2.5f, 12f, 2.5f)
            curveTo(11.2589f, 2.5f, 10.5976f, 2.92901f, 9.27506f, 3.78702f)
            lineTo(4.27506f, 7.03078f)
            curveTo(3.16196f, 7.7529f, 2.60542f, 8.11396f, 2.30271f, 8.67068f)
            curveTo(2f, 9.22741f, 2f, 9.88992f, 2f, 11.2149f)
            verticalLineTo(12.7851f)
            curveTo(2f, 14.1101f, 2f, 14.7726f, 2.30271f, 15.3293f)
            curveTo(2.60542f, 15.886f, 3.16197f, 16.2471f, 4.27506f, 16.9692f)
            lineTo(9.27506f, 20.213f)
            curveTo(10.5976f, 21.071f, 11.2589f, 21.5f, 12f, 21.5f)
            curveTo(12.7411f, 21.5f, 13.4024f, 21.071f, 14.7249f, 20.213f)
            lineTo(19.7249f, 16.9692f)
            curveTo(20.838f, 16.2471f, 21.3946f, 15.886f, 21.6973f, 15.3293f)
            curveTo(22f, 14.7726f, 22f, 14.1101f, 22f, 12.7851f)
            verticalLineTo(11.2149f)
            curveTo(22f, 9.88992f, 22f, 9.22741f, 21.6973f, 8.67068f)
            curveTo(21.3946f, 8.11396f, 20.838f, 7.7529f, 19.7249f, 7.03077f)
            close()
        }
        }.build()

        return _codepen!!
    }

private var _codepen: ImageVector? = null
