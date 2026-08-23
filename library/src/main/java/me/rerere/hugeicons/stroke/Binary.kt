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

val HugeIcons.Binary: ImageVector
    get() {
        if (_binary != null) {
            return _binary!!
        }
        _binary = ImageVector.Builder(
            name = "Binary",
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
            moveTo(19f, 7.5f)
            verticalLineTo(5.5f)
            curveTo(19f, 4.11929f, 17.8807f, 3f, 16.5f, 3f)
            curveTo(15.1193f, 3f, 14f, 4.11929f, 14f, 5.5f)
            verticalLineTo(7.5f)
            curveTo(14f, 8.88071f, 15.1193f, 10f, 16.5f, 10f)
            curveTo(17.8807f, 10f, 19f, 8.88071f, 19f, 7.5f)
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
            moveTo(10f, 18.5f)
            verticalLineTo(16.5f)
            curveTo(10f, 15.1193f, 8.88071f, 14f, 7.5f, 14f)
            curveTo(6.11929f, 14f, 5f, 15.1193f, 5f, 16.5f)
            verticalLineTo(18.5f)
            curveTo(5f, 19.8807f, 6.11929f, 21f, 7.5f, 21f)
            curveTo(8.88071f, 21f, 10f, 19.8807f, 10f, 18.5f)
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
            moveTo(7.59961f, 10f)
            verticalLineTo(4.48779f)
            curveTo(7.59961f, 3.61275f, 7.59961f, 3.17523f, 7.32322f, 3.03665f)
            curveTo(7.04682f, 2.89808f, 6.69775f, 3.1606f, 5.99961f, 3.68562f)
            lineTo(5.59961f, 3.98644f)
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
            moveTo(16.5f, 21f)
            verticalLineTo(15.4878f)
            curveTo(16.5f, 14.6127f, 16.5f, 14.1752f, 16.2236f, 14.0367f)
            curveTo(15.9472f, 13.8981f, 15.5981f, 14.1606f, 14.9f, 14.6856f)
            lineTo(14.5f, 14.9864f)
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
            moveTo(5.59961f, 10f)
            horizontalLineTo(9.59961f)
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
            moveTo(14.5f, 21f)
            horizontalLineTo(18.5f)
        }
        }.build()

        return _binary!!
    }

private var _binary: ImageVector? = null
