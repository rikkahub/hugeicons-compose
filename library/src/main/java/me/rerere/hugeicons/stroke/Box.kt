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

val HugeIcons.Box: ImageVector
    get() {
        if (_box != null) {
            return _box!!
        }
        _box = ImageVector.Builder(
            name = "Box",
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
            moveTo(16.2071f, 21.2071f)
            curveTo(16.5f, 20.9142f, 16.5f, 20.4428f, 16.5f, 19.5f)
            verticalLineTo(9.5f)
            curveTo(16.5f, 8.55719f, 16.5f, 8.08579f, 16.2071f, 7.79289f)
            moveTo(16.2071f, 21.2071f)
            curveTo(15.9142f, 21.5f, 15.4428f, 21.5f, 14.5f, 21.5f)
            horizontalLineTo(4.5f)
            curveTo(3.55719f, 21.5f, 3.08579f, 21.5f, 2.79289f, 21.2071f)
            curveTo(2.5f, 20.9142f, 2.5f, 20.4428f, 2.5f, 19.5f)
            verticalLineTo(9.5f)
            curveTo(2.5f, 8.55719f, 2.5f, 8.08579f, 2.79289f, 7.79289f)
            moveTo(16.2071f, 21.2071f)
            lineTo(21.2071f, 16.2071f)
            curveTo(21.5f, 15.9142f, 21.5f, 15.4428f, 21.5f, 14.5f)
            verticalLineTo(4.5f)
            curveTo(21.5f, 3.55719f, 21.5f, 3.08579f, 21.2071f, 2.79289f)
            moveTo(16.2071f, 7.79289f)
            curveTo(15.9142f, 7.5f, 15.4428f, 7.5f, 14.5f, 7.5f)
            horizontalLineTo(4.5f)
            curveTo(3.55719f, 7.5f, 3.08579f, 7.5f, 2.79289f, 7.79289f)
            moveTo(16.2071f, 7.79289f)
            lineTo(21.2071f, 2.79289f)
            moveTo(2.79289f, 7.79289f)
            lineTo(7.79289f, 2.79289f)
            curveTo(8.08579f, 2.5f, 8.55719f, 2.5f, 9.5f, 2.5f)
            horizontalLineTo(19.5f)
            curveTo(20.4428f, 2.5f, 20.9142f, 2.5f, 21.2071f, 2.79289f)
        }
        }.build()

        return _box!!
    }

private var _box: ImageVector? = null
