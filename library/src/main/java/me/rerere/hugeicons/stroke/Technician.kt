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

val HugeIcons.Technician: ImageVector
    get() {
        if (_technician != null) {
            return _technician!!
        }
        _technician = ImageVector.Builder(
            name = "Technician",
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
            moveTo(5f, 7f)
            horizontalLineTo(13f)
            verticalLineTo(8f)
            curveTo(13f, 10.2091f, 11.2091f, 12f, 9f, 12f)
            curveTo(6.79086f, 12f, 5f, 10.2091f, 5f, 8f)
            verticalLineTo(7f)
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
            moveTo(5f, 7f)
            horizontalLineTo(13f)
            verticalLineTo(5f)
            curveTo(13f, 3.34315f, 11.6569f, 2f, 10f, 2f)
            horizontalLineTo(8f)
            curveTo(6.34315f, 2f, 5f, 3.34315f, 5f, 5f)
            verticalLineTo(7f)
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
            moveTo(12f, 21f)
            horizontalLineTo(4f)
            curveTo(2.89543f, 21f, 2f, 20.1046f, 2f, 19f)
            curveTo(2f, 16.7909f, 3.79086f, 15f, 6f, 15f)
            horizontalLineTo(10f)
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
            moveTo(9f, 2f)
            verticalLineTo(4f)
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
            moveTo(3.5f, 7f)
            horizontalLineTo(14.5f)
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
            moveTo(19.5f, 22f)
            verticalLineTo(20.0322f)
            curveTo(20.9817f, 19.2959f, 22f, 17.7669f, 22f, 16f)
            curveTo(22f, 14.2332f, 20.9817f, 12.7364f, 19.5f, 12f)
            verticalLineTo(14.5f)
            curveTo(19.5f, 15.6046f, 18.6046f, 16.5f, 17.5f, 16.5f)
            curveTo(16.3954f, 16.5f, 15.5f, 15.6046f, 15.5f, 14.5f)
            verticalLineTo(12f)
            curveTo(14.0183f, 12.7364f, 13f, 14.2332f, 13f, 16f)
            curveTo(13f, 17.7669f, 14.0183f, 19.2959f, 15.5f, 20.0323f)
            verticalLineTo(22f)
        }
        }.build()

        return _technician!!
    }

private var _technician: ImageVector? = null
