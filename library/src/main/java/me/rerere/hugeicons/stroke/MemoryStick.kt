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

val HugeIcons.MemoryStick: ImageVector
    get() {
        if (_memoryStick != null) {
            return _memoryStick!!
        }
        _memoryStick = ImageVector.Builder(
            name = "MemoryStick",
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
            moveTo(22f, 13f)
            curveTo(20.8954f, 13f, 20f, 12.1046f, 20f, 11f)
            curveTo(20f, 9.89543f, 20.8954f, 9f, 22f, 9f)
            curveTo(22f, 8.07003f, 22f, 7.60504f, 21.8978f, 7.22354f)
            curveTo(21.6204f, 6.18827f, 20.8117f, 5.37962f, 19.7765f, 5.10222f)
            curveTo(19.395f, 5f, 18.93f, 5f, 18f, 5f)
            horizontalLineTo(6f)
            curveTo(5.07003f, 5f, 4.60504f, 5f, 4.22354f, 5.10222f)
            curveTo(3.18827f, 5.37962f, 2.37962f, 6.18827f, 2.10222f, 7.22354f)
            curveTo(2f, 7.60504f, 2f, 8.07003f, 2f, 9f)
            curveTo(3.10457f, 9f, 4f, 9.89543f, 4f, 11f)
            curveTo(4f, 12.1046f, 3.10457f, 13f, 2f, 13f)
            curveTo(2f, 13.93f, 2f, 14.395f, 2.10222f, 14.7765f)
            curveTo(2.37962f, 15.8117f, 3.18827f, 16.6204f, 4.22354f, 16.8978f)
            curveTo(4.60504f, 17f, 5.07003f, 17f, 6f, 17f)
            horizontalLineTo(18f)
            curveTo(18.93f, 17f, 19.395f, 17f, 19.7765f, 16.8978f)
            curveTo(20.8117f, 16.6204f, 21.6204f, 15.8117f, 21.8978f, 14.7765f)
            curveTo(22f, 14.395f, 22f, 13.93f, 22f, 13f)
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
            moveTo(12f, 9f)
            verticalLineTo(13f)
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
            moveTo(16f, 9f)
            verticalLineTo(13f)
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
            moveTo(8f, 9f)
            verticalLineTo(13f)
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
            moveTo(12f, 17f)
            verticalLineTo(19f)
            moveTo(8f, 17f)
            verticalLineTo(19f)
            moveTo(4f, 17f)
            verticalLineTo(19f)
            moveTo(16f, 17f)
            verticalLineTo(19f)
            moveTo(20f, 17f)
            verticalLineTo(19f)
        }
        }.build()

        return _memoryStick!!
    }

private var _memoryStick: ImageVector? = null
