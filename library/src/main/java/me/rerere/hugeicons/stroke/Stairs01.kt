package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Stairs01: ImageVector
    get() {
        if (_stairs01 != null) {
            return _stairs01!!
        }
        _stairs01 = ImageVector.Builder(
            name = "Stairs01",
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
        moveTo(17.5f, 3.5f)
        horizontalLineTo(18.5f)
        curveTo(19.4428f, 3.5f, 19.9142f, 3.5f, 20.2071f, 3.79289f)
        curveTo(20.5f, 4.08579f, 20.5f, 4.55719f, 20.5f, 5.5f)
        verticalLineTo(16.5f)
        curveTo(20.5f, 18.3856f, 20.5f, 19.3284f, 19.9142f, 19.9142f)
        curveTo(19.3284f, 20.5f, 18.3856f, 20.5f, 16.5f, 20.5f)
        horizontalLineTo(5.5f)
        curveTo(4.55719f, 20.5f, 4.08579f, 20.5f, 3.79289f, 20.2071f)
        curveTo(3.5f, 19.9142f, 3.5f, 19.4428f, 3.5f, 18.5f)
        verticalLineTo(17.5f)
        curveTo(3.5f, 16.5572f, 3.5f, 16.0858f, 3.79289f, 15.7929f)
        curveTo(4.08579f, 15.5f, 4.55719f, 15.5f, 5.5f, 15.5f)
        horizontalLineTo(7.5f)
        verticalLineTo(13.5f)
        curveTo(7.5f, 12.5572f, 7.5f, 12.0858f, 7.79289f, 11.7929f)
        curveTo(8.08579f, 11.5f, 8.55719f, 11.5f, 9.5f, 11.5f)
        horizontalLineTo(11.5f)
        verticalLineTo(9.5f)
        curveTo(11.5f, 8.55719f, 11.5f, 8.08579f, 11.7929f, 7.79289f)
        curveTo(12.0858f, 7.5f, 12.5572f, 7.5f, 13.5f, 7.5f)
        horizontalLineTo(15.5f)
        verticalLineTo(5.5f)
        curveTo(15.5f, 4.55719f, 15.5f, 4.08579f, 15.7929f, 3.79289f)
        curveTo(16.0858f, 3.5f, 16.5572f, 3.5f, 17.5f, 3.5f)
        }
        }.build()

        return _stairs01!!
    }

private var _stairs01: ImageVector? = null
