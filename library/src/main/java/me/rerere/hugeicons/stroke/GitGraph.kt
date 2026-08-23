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

val HugeIcons.GitGraph: ImageVector
    get() {
        if (_gitGraph != null) {
            return _gitGraph!!
        }
        _gitGraph = ImageVector.Builder(
            name = "GitGraph",
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
            moveTo(5f, 9f)
            curveTo(6.65685f, 9f, 8f, 7.65685f, 8f, 6f)
            curveTo(8f, 4.34315f, 6.65685f, 3f, 5f, 3f)
            curveTo(3.34315f, 3f, 2f, 4.34315f, 2f, 6f)
            curveTo(2f, 7.65685f, 3.34315f, 9f, 5f, 9f)
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
            moveTo(5f, 9f)
            verticalLineTo(15f)
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
            moveTo(5f, 21f)
            curveTo(6.65685f, 21f, 8f, 19.6569f, 8f, 18f)
            curveTo(8f, 16.3431f, 6.65685f, 15f, 5f, 15f)
            curveTo(3.34315f, 15f, 2f, 16.3431f, 2f, 18f)
            curveTo(2f, 19.6569f, 3.34315f, 21f, 5f, 21f)
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
            moveTo(12f, 3f)
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
            moveTo(19f, 9f)
            curveTo(20.6569f, 9f, 22f, 7.65685f, 22f, 6f)
            curveTo(22f, 4.34315f, 20.6569f, 3f, 19f, 3f)
            curveTo(17.3431f, 3f, 16f, 4.34315f, 16f, 6f)
            curveTo(16f, 7.65685f, 17.3431f, 9f, 19f, 9f)
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
            moveTo(16f, 15.7f)
            curveTo(16.9428f, 14.8567f, 17.6972f, 13.8242f, 18.2142f, 12.6698f)
            curveTo(18.7311f, 11.5153f, 18.9988f, 10.2649f, 19f, 9f)
        }
        }.build()

        return _gitGraph!!
    }

private var _gitGraph: ImageVector? = null
