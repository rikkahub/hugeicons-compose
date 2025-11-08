package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FolderDetails: ImageVector
    get() {
        if (_folderDetails != null) {
            return _folderDetails!!
        }
        _folderDetails = ImageVector.Builder(
            name = "FolderDetails",
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
        moveTo(12f, 21f)
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
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 15f)
        horizontalLineTo(15f)
        moveTo(22f, 18f)
        horizontalLineTo(15f)
        moveTo(17.5f, 21f)
        horizontalLineTo(15f)
        }
        }.build()

        return _folderDetails!!
    }

private var _folderDetails: ImageVector? = null
