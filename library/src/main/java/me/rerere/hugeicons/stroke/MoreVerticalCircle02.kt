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

val HugeIcons.MoreVerticalCircle02: ImageVector
    get() {
        if (_moreVerticalCircle02 != null) {
            return _moreVerticalCircle02!!
        }
        _moreVerticalCircle02 = ImageVector.Builder(
            name = "MoreVerticalCircle02",
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
            moveTo(22f, 12f)
            curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
            curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
            curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
            curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
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
            moveTo(12f, 12.25f)
            verticalLineTo(12f)
            moveTo(12f, 17.25f)
            verticalLineTo(17f)
            moveTo(12f, 7.25f)
            verticalLineTo(7f)
            moveTo(12f, 12.5f)
            curveTo(11.7239f, 12.5f, 11.5f, 12.2761f, 11.5f, 12f)
            curveTo(11.5f, 11.7239f, 11.7239f, 11.5f, 12f, 11.5f)
            curveTo(12.2761f, 11.5f, 12.5f, 11.7239f, 12.5f, 12f)
            curveTo(12.5f, 12.2761f, 12.2761f, 12.5f, 12f, 12.5f)
            close()
            moveTo(12f, 17.5f)
            curveTo(11.7239f, 17.5f, 11.5f, 17.2761f, 11.5f, 17f)
            curveTo(11.5f, 16.7239f, 11.7239f, 16.5f, 12f, 16.5f)
            curveTo(12.2761f, 16.5f, 12.5f, 16.7239f, 12.5f, 17f)
            curveTo(12.5f, 17.2761f, 12.2761f, 17.5f, 12f, 17.5f)
            close()
            moveTo(12f, 7.5f)
            curveTo(11.7239f, 7.5f, 11.5f, 7.27614f, 11.5f, 7f)
            curveTo(11.5f, 6.72386f, 11.7239f, 6.5f, 12f, 6.5f)
            curveTo(12.2761f, 6.5f, 12.5f, 6.72386f, 12.5f, 7f)
            curveTo(12.5f, 7.27614f, 12.2761f, 7.5f, 12f, 7.5f)
            close()
        }
        }.build()

        return _moreVerticalCircle02!!
    }

private var _moreVerticalCircle02: ImageVector? = null
