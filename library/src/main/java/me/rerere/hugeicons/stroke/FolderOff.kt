package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FolderOff: ImageVector
    get() {
        if (_folderOff != null) {
            return _folderOff!!
        }
        _folderOff = ImageVector.Builder(
            name = "FolderOff",
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
        moveTo(20f, 20.0001f)
        curveTo(19.9275f, 20.0545f, 19.8534f, 20.1069f, 19.7779f, 20.1574f)
        curveTo(18.5167f, 21.0001f, 16.7612f, 21.0001f, 13.25f, 21.0001f)
        horizontalLineTo(12f)
        curveTo(7.28595f, 21.0001f, 4.92893f, 21.0001f, 3.46447f, 19.5356f)
        curveTo(2f, 18.0711f, 2f, 15.7141f, 2f, 11.0001f)
        verticalLineTo(7.94433f)
        curveTo(2f, 6.12785f, 2f, 5.21962f, 2.38032f, 4.53812f)
        curveTo(2.61398f, 4.11941f, 2.94402f, 3.76381f, 3.34177f, 3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 6.999f)
        horizontalLineTo(16.75f)
        curveTo(18.8567f, 6.999f, 19.91f, 6.999f, 20.6667f, 7.50459f)
        curveTo(20.9943f, 7.72347f, 21.2755f, 8.00472f, 21.4944f, 8.33229f)
        curveTo(22f, 9.08896f, 22f, 10.1423f, 22f, 12.249f)
        curveTo(22f, 14.3896f, 22f, 15.8777f, 21.8091f, 16.999f)
        moveTo(12f, 6.999f)
        lineTo(11.3666f, 5.73213f)
        curveTo(10.8418f, 4.68258f, 10.3622f, 3.62612f, 9.19926f, 3.19001f)
        curveTo(8.77825f, 3.03214f, 8.3077f, 3.00475f, 7.5f, 3f)
        horizontalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 2f)
        lineTo(22f, 22f)
        }
        }.build()

        return _folderOff!!
    }

private var _folderOff: ImageVector? = null
