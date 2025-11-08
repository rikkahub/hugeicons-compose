package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FolderLinks: ImageVector
    get() {
        if (_folderLinks != null) {
            return _folderLinks!!
        }
        _folderLinks = ImageVector.Builder(
            name = "FolderLinks",
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
        moveTo(14f, 21f)
        horizontalLineTo(12f)
        curveTo(7.28595f, 21f, 4.92893f, 21f, 3.46447f, 19.5355f)
        curveTo(2f, 18.0711f, 2f, 15.714f, 2f, 11f)
        verticalLineTo(7.94427f)
        curveTo(2f, 6.1278f, 2f, 5.21956f, 2.38032f, 4.53806f)
        curveTo(2.65142f, 4.05227f, 3.05227f, 3.65142f, 3.53806f, 3.38032f)
        curveTo(4.21956f, 3f, 5.1278f, 3f, 6.94427f, 3f)
        curveTo(8.10802f, 3f, 8.6899f, 3f, 9.19926f, 3.19101f)
        curveTo(10.3622f, 3.62712f, 10.8418f, 4.68358f, 11.3666f, 5.73313f)
        lineTo(12f, 7f)
        moveTo(8f, 7f)
        horizontalLineTo(16.75f)
        curveTo(18.8567f, 7f, 19.91f, 7f, 20.6667f, 7.50559f)
        curveTo(20.9943f, 7.72447f, 21.2755f, 8.00572f, 21.4944f, 8.33329f)
        curveTo(22f, 9.08996f, 22f, 10.1433f, 22f, 12.25f)
        curveTo(22f, 12.8889f, 22f, 13.4697f, 21.9949f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.6863f, 20.4315f)
        curveTo(18.4444f, 21.1895f, 19.6734f, 21.1895f, 20.4315f, 20.4315f)
        curveTo(21.1895f, 19.6734f, 21.1895f, 18.4444f, 20.4315f, 17.6863f)
        lineTo(18.7157f, 15.9705f)
        curveTo(17.9922f, 15.247f, 16.8396f, 15.2141f, 16.077f, 15.8717f)
        moveTo(16.3137f, 13.5685f)
        curveTo(15.5556f, 12.8105f, 14.3266f, 12.8105f, 13.5685f, 13.5685f)
        curveTo(12.8105f, 14.3266f, 12.8105f, 15.5557f, 13.5685f, 16.3137f)
        lineTo(15.2843f, 18.0294f)
        curveTo(16.0078f, 18.753f, 17.1604f, 18.7859f, 17.9231f, 18.1282f)
        }
        }.build()

        return _folderLinks!!
    }

private var _folderLinks: ImageVector? = null
