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

val HugeIcons.Blinds: ImageVector
    get() {
        if (_blinds != null) {
            return _blinds!!
        }
        _blinds = ImageVector.Builder(
            name = "Blinds",
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
            moveTo(14f, 16f)
            arcTo(2f, 2f, 0f, true, false, 10f, 16f)
            arcTo(2f, 2f, 0f, true, false, 14f, 16f)
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
            moveTo(3.50003f, 6f)
            horizontalLineTo(20.5f)
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
            moveTo(3f, 10f)
            horizontalLineTo(21f)
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
            moveTo(12f, 10f)
            verticalLineTo(14f)
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
            moveTo(3f, 14f)
            verticalLineTo(10f)
            curveTo(3f, 6.22876f, 3f, 4.34315f, 4.17157f, 3.17157f)
            curveTo(5.34315f, 2f, 7.22876f, 2f, 11f, 2f)
            horizontalLineTo(13f)
            curveTo(16.7712f, 2f, 18.6569f, 2f, 19.8284f, 3.17157f)
            curveTo(21f, 4.34315f, 21f, 6.22876f, 21f, 10f)
            verticalLineTo(14f)
            curveTo(21f, 17.7712f, 21f, 19.6569f, 19.8284f, 20.8284f)
            curveTo(18.6569f, 22f, 16.7712f, 22f, 13f, 22f)
            horizontalLineTo(11f)
            curveTo(7.22876f, 22f, 5.34315f, 22f, 4.17157f, 20.8284f)
            curveTo(3f, 19.6569f, 3f, 17.7712f, 3f, 14f)
            close()
        }
        }.build()

        return _blinds!!
    }

private var _blinds: ImageVector? = null
