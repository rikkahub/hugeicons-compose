package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FolderBlock: ImageVector
    get() {
        if (_folderBlock != null) {
            return _folderBlock!!
        }
        _folderBlock = ImageVector.Builder(
            name = "FolderBlock",
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
        moveTo(13f, 21f)
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
        curveTo(21.9796f, 9.05942f, 21.9992f, 10.0588f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.9749f, 19.9749f)
        curveTo(21.6082f, 19.3415f, 22f, 18.4665f, 22f, 17.5f)
        curveTo(22f, 15.567f, 20.433f, 14f, 18.5f, 14f)
        curveTo(17.5335f, 14f, 16.6585f, 14.3918f, 16.0251f, 15.0251f)
        moveTo(20.9749f, 19.9749f)
        curveTo(20.3415f, 20.6082f, 19.4665f, 21f, 18.5f, 21f)
        curveTo(16.567f, 21f, 15f, 19.433f, 15f, 17.5f)
        curveTo(15f, 16.5335f, 15.3918f, 15.6585f, 16.0251f, 15.0251f)
        moveTo(20.9749f, 19.9749f)
        lineTo(16.0251f, 15.0251f)
        }
        }.build()

        return _folderBlock!!
    }

private var _folderBlock: ImageVector? = null
