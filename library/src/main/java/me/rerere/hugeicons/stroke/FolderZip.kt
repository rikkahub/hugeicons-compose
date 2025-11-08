package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FolderZip: ImageVector
    get() {
        if (_folderZip != null) {
            return _folderZip!!
        }
        _folderZip = ImageVector.Builder(
            name = "FolderZip",
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
        moveTo(15f, 14.9997f)
        horizontalLineTo(13f)
        moveTo(15f, 14.9997f)
        horizontalLineTo(17f)
        moveTo(15f, 14.9997f)
        verticalLineTo(10.9969f)
        moveTo(15f, 6.99414f)
        verticalLineTo(10.9969f)
        moveTo(15f, 10.9969f)
        horizontalLineTo(13f)
        moveTo(15f, 10.9969f)
        horizontalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 7f)
        horizontalLineTo(15f)
        moveTo(12f, 7f)
        lineTo(11.3666f, 5.73313f)
        curveTo(10.8418f, 4.68358f, 10.3622f, 3.62712f, 9.19926f, 3.19101f)
        curveTo(8.6899f, 3f, 8.10802f, 3f, 6.94427f, 3f)
        curveTo(5.1278f, 3f, 4.21956f, 3f, 3.53806f, 3.38032f)
        curveTo(3.05227f, 3.65142f, 2.65142f, 4.05227f, 2.38032f, 4.53806f)
        curveTo(2f, 5.21956f, 2f, 6.1278f, 2f, 7.94427f)
        verticalLineTo(11f)
        curveTo(2f, 15.714f, 2f, 18.0711f, 3.46447f, 19.5355f)
        curveTo(4.92893f, 21f, 7.28595f, 21f, 12f, 21f)
        horizontalLineTo(13.25f)
        curveTo(16.7612f, 21f, 18.5167f, 21f, 19.7779f, 20.1573f)
        curveTo(20.3238f, 19.7926f, 20.7926f, 19.3238f, 21.1573f, 18.7779f)
        curveTo(22f, 17.5167f, 22f, 15.7612f, 22f, 12.25f)
        curveTo(22f, 10.1433f, 22f, 9.08996f, 21.4944f, 8.33329f)
        curveTo(21.2755f, 8.00572f, 20.9943f, 7.72447f, 20.6667f, 7.50559f)
        curveTo(20.0772f, 7.11168f, 19.3076f, 7.02467f, 18f, 7.00545f)
        }
        }.build()

        return _folderZip!!
    }

private var _folderZip: ImageVector? = null
