package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cube: ImageVector
    get() {
        if (_cube != null) {
            return _cube!!
        }
        _cube = ImageVector.Builder(
            name = "Cube",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.79289f, 21.2071f)
        curveTo(3.08579f, 21.5f, 3.55719f, 21.5f, 4.5f, 21.5f)
        horizontalLineTo(14.5f)
        curveTo(15.4428f, 21.5f, 15.9142f, 21.5f, 16.2071f, 21.2071f)
        moveTo(2.79289f, 21.2071f)
        curveTo(2.5f, 20.9142f, 2.5f, 20.4428f, 2.5f, 19.5f)
        verticalLineTo(9.5f)
        curveTo(2.5f, 8.55719f, 2.5f, 8.08579f, 2.79289f, 7.79289f)
        moveTo(2.79289f, 21.2071f)
        lineTo(8.79289f, 15.2071f)
        moveTo(16.2071f, 21.2071f)
        curveTo(16.5f, 20.9142f, 16.5f, 20.4428f, 16.5f, 19.5f)
        verticalLineTo(9.5f)
        curveTo(16.5f, 8.55719f, 16.5f, 8.08579f, 16.2071f, 7.79289f)
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
        moveTo(8.79289f, 15.2071f)
        curveTo(9.08579f, 15.5f, 9.55719f, 15.5f, 10.5f, 15.5f)
        horizontalLineTo(14f)
        moveTo(8.79289f, 15.2071f)
        curveTo(8.5f, 14.9142f, 8.5f, 14.4428f, 8.5f, 13.5f)
        verticalLineTo(10.5f)
        }
        }.build()

        return _cube!!
    }

private var _cube: ImageVector? = null
